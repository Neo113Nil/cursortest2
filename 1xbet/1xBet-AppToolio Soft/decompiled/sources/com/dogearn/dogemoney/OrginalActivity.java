package com.dogearn.dogemoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes.dex */
public class OrginalActivity extends AppCompatActivity {
    private Button freeincomeid;
    private AdView mAdView;
    private Button websiteid;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_orginal);
        this.websiteid = (Button) findViewById(R.id.websiteID);
        this.freeincomeid = (Button) findViewById(R.id.freeincomeID);
        MobileAds.initialize(this, "ca-app-pub-7300440519666493~2860439544");
        this.mAdView = (AdView) findViewById(R.id.homeadView);
        this.mAdView.loadAd(new AdRequest.Builder().build());
        this.websiteid.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.OrginalActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OrginalActivity orginalActivity = OrginalActivity.this;
                orginalActivity.startActivity(new Intent(orginalActivity, (Class<?>) WebsiteActivity.class));
            }
        });
        this.freeincomeid.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.OrginalActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OrginalActivity orginalActivity = OrginalActivity.this;
                orginalActivity.startActivity(new Intent(orginalActivity, (Class<?>) SplashActivity.class));
            }
        });
    }
}
