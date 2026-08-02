package com.dogearn.dogemoney;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
public class AdsfifteenActivity extends AppCompatActivity {
    DatabaseReference databaseReference;
    private Button finish;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    int myIntValue;
    String user_id;
    DatabaseReference user_id_child;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_adsfifteen);
        this.finish = (Button) findViewById(R.id.finishBtn);
        Utilies.showAlertDialogue("Tips", "You have to click this ads and wait here 1 minute", this);
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.user_id_child = this.databaseReference.child(this.user_id);
        this.myIntValue = getSharedPreferences("your_prefs", 0).getInt("your_int_key", 0);
        MobileAds.initialize(this, "ca-app-pub-9062980565707854~1156398682");
        this.mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        this.mPublisherInterstitialAd.setAdUnitId("ca-app-pub-9062980565707854/8629058978");
        this.mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        this.finish.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.AdsfifteenActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdsfifteenActivity adsfifteenActivity = AdsfifteenActivity.this;
                adsfifteenActivity.startActivity(new Intent(adsfifteenActivity, (Class<?>) HomeActivity.class));
            }
        });
        this.mPublisherInterstitialAd.setAdListener(new AdListener() { // from class: com.dogearn.dogemoney.AdsfifteenActivity.2
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                AdsfifteenActivity.this.mPublisherInterstitialAd.show();
                Toast.makeText(AdsfifteenActivity.this, "Click this ads now ", 0).show();
                Toast.makeText(AdsfifteenActivity.this, "Wait 20 second here", 0).show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                Toast.makeText(AdsfifteenActivity.this, "Please try again after few minutes", 0).show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                Toast.makeText(AdsfifteenActivity.this, "Click This Ads", 0).show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLeftApplication() {
                Toast.makeText(AdsfifteenActivity.this, "Congratulations, you  earn 10 points", 0).show();
                SharedPreferences.Editor edit = AdsfifteenActivity.this.getSharedPreferences("your_prefs", 0).edit();
                int i = AdsfifteenActivity.this.myIntValue + 10;
                edit.putInt("your_int_key", i);
                edit.commit();
                AdsfifteenActivity.this.user_id_child.child("scores").setValue(Integer.valueOf(i));
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                Toast.makeText(AdsfifteenActivity.this, "You have to click this ads", 0).show();
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
