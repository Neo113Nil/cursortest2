package com.dogearn.dogemoney;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/* loaded from: classes.dex */
public class ContactActivity extends AppCompatActivity {
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_contact);
    }

    public void dogEarn(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.dogearn.info/")));
    }

    public void faceBook(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.dogearn.info/")));
    }

    public void telegram(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/dogearn_info")));
    }

    public void liveSupport(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.dogearn.info/")));
    }
}
