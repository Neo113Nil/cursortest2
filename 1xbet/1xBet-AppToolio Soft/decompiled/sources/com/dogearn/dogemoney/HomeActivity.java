package com.dogearn.dogemoney;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public class HomeActivity extends AppCompatActivity {
    private static final int TIME_INTERVAL = 2000;
    private Button button;
    private TextView countDown;
    private TextView countdownone;
    DatabaseReference databaseReference;
    ProgressDialog dialog;
    SharedPreferences.Editor editor;
    private InterstitialAd interstitialAd;
    long lastclick;
    private AdView mAdView;
    private long mBackPressed;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    SharedPreferences preferences;
    private Button profilebtn;
    private TextView sample;
    String scores;
    private TextView scorewalet;
    private LinearLayout taskfour;
    private LinearLayout taskone;
    private LinearLayout taskthree;
    private LinearLayout tasktwo;
    String user_id;
    DatabaseReference user_id_child;
    Date internetDate = null;
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference root = this.db.getReference();
    DatabaseReference userRef = this.root.child("users");

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home);
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.user_id_child = this.databaseReference.child(this.user_id);
        this.taskone = (LinearLayout) findViewById(R.id.taskOneID);
        this.tasktwo = (LinearLayout) findViewById(R.id.taskTwoID);
        this.taskthree = (LinearLayout) findViewById(R.id.taskThreeID);
        this.taskfour = (LinearLayout) findViewById(R.id.taskFourID);
        this.scorewalet = (TextView) findViewById(R.id.scoreWallet);
        this.button = (Button) findViewById(R.id.withbtn);
        this.profilebtn = (Button) findViewById(R.id.profileBTN);
        SharedPreferences sharedPreferences = getSharedPreferences("mypref", 0);
        sharedPreferences.edit();
        String string = sharedPreferences.getString("lastclicktime", "");
        if (!string.isEmpty()) {
            try {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                this.lastclick = Long.parseLong(string);
                if (timeInMillis < this.lastclick + 30000) {
                    this.taskone.setClickable(false);
                    this.taskone.setEnabled(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Utilies.showAlertDialogue("Warning!", "Using VPN while using this app is strictly prohibited. Your account can be suspended if found so.", this);
        this.preferences = getSharedPreferences(StaticNames.sharedTableName, 0);
        MobileAds.initialize(this, "ca-app-pub-7300440519666493~2860439544");
        this.mAdView = (AdView) findViewById(R.id.homebanneradView);
        this.mAdView.loadAd(new AdRequest.Builder().build());
        this.mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        this.mPublisherInterstitialAd.setAdUnitId("ca-app-pub-7300440519666493/9754025691");
        this.mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        this.profilebtn.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.HomeActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HomeActivity.this.mPublisherInterstitialAd.isLoaded()) {
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) ProfileActivity.class));
                    HomeActivity.this.mPublisherInterstitialAd.show();
                } else {
                    HomeActivity homeActivity2 = HomeActivity.this;
                    homeActivity2.startActivity(new Intent(homeActivity2, (Class<?>) ProfileActivity.class));
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.button.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.HomeActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HomeActivity.this.mPublisherInterstitialAd.isLoaded()) {
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) WithdrawActivity.class));
                    HomeActivity.this.mPublisherInterstitialAd.show();
                } else {
                    HomeActivity homeActivity2 = HomeActivity.this;
                    homeActivity2.startActivity(new Intent(homeActivity2, (Class<?>) WithdrawActivity.class));
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        new Handler();
        new Runnable() { // from class: com.dogearn.dogemoney.HomeActivity.3
            @Override // java.lang.Runnable
            public void run() {
                HomeActivity.this.taskthree.setEnabled(false);
            }
        };
        this.taskthree.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.HomeActivity.4
            /* JADX WARN: Type inference failed for: r10v11, types: [com.dogearn.dogemoney.HomeActivity$4$2] */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HomeActivity.this.taskone.isClickable()) {
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) ClaimActivity.class));
                    HomeActivity.this.taskone.setVisibility(8);
                    HomeActivity.this.taskone.postDelayed(new Runnable() { // from class: com.dogearn.dogemoney.HomeActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HomeActivity.this.taskone.setVisibility(0);
                        }
                    }, 12000000L);
                    new CountDownTimer(12000000L, 1000L) { // from class: com.dogearn.dogemoney.HomeActivity.4.2
                        @Override // android.os.CountDownTimer
                        public void onTick(long j) {
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            ((Vibrator) HomeActivity.this.getSystemService("vibrator")).vibrate(200L);
                        }
                    }.start();
                    return;
                }
                Toast.makeText(HomeActivity.this, "Try After One hour", 0).show();
            }
        });
        this.taskone.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.HomeActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HomeActivity.this.taskone.isClickable()) {
                    SharedPreferences.Editor edit = HomeActivity.this.getSharedPreferences("mypref", 0).edit();
                    edit.putString("lastclicktime", String.valueOf(Calendar.getInstance().getTimeInMillis()));
                    edit.apply();
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) ClaimActivity.class));
                }
            }
        });
        this.tasktwo.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.HomeActivity.6
            /* JADX WARN: Type inference failed for: r10v9, types: [com.dogearn.dogemoney.HomeActivity$6$2] */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HomeActivity.this.tasktwo.isClickable()) {
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) VideoRewardActivity.class));
                    HomeActivity.this.tasktwo.setVisibility(8);
                    HomeActivity.this.tasktwo.postDelayed(new Runnable() { // from class: com.dogearn.dogemoney.HomeActivity.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HomeActivity.this.tasktwo.setVisibility(0);
                        }
                    }, 1200000L);
                    new CountDownTimer(1200000L, 1000L) { // from class: com.dogearn.dogemoney.HomeActivity.6.2
                        @Override // android.os.CountDownTimer
                        public void onTick(long j) {
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            ((Vibrator) HomeActivity.this.getSystemService("vibrator")).vibrate(200L);
                        }
                    }.start();
                }
            }
        });
        this.taskfour.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.HomeActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this, (Class<?>) ContactActivity.class));
            }
        });
        FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() { // from class: com.dogearn.dogemoney.HomeActivity.8
            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
                        String obj = dataSnapshot.child("News").getValue().toString();
                        HomeActivity.this.scorewalet.setText("Notice:" + obj);
                    }
                }
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(HomeActivity.this, "Please earn atleast 1 points", 0).show();
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mBackPressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(getBaseContext(), "Tap back button in order to exit", 0).show();
            this.mBackPressed = System.currentTimeMillis();
        }
    }
}
