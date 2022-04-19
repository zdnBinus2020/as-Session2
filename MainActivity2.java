package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this,"Selamat Datang Budi", Toast.LENGTH_LONG).show(); // menampilkan pop up atau alert dialog sebagai info setelah sebuah aksi telah terjadi atau berhasil
    }
}
