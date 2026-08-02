package com.neptunesoft.bacdz;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Insets;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.neptunesoft.bacdz.adapter.AdapterTutorials;
import com.neptunesoft.bacdz.classobjects.Tutorials;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* loaded from: classes4.dex */
public class SciencesActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DIALOG_DOWNLOAD_PROGRESSE = 1;
    static AdapterTutorials adapterTutorials;
    public static String file_Name;
    public static Handler handler = new Handler();
    static SciencesActivity instance;
    static boolean isCancelled;
    public static List<Object> list;
    static RecyclerView sciencesRecyclerView;
    boolean ad_showing;
    private AlertDialog dialog_connect_internet;
    private AlertDialog dialog_download_files;
    private AlertDialog dialog_internet_low;
    private AlertDialog dialog_nointernet;
    private ProgressDialog dialog_wait_check;
    int lengthofFileDownload;
    InterstitialAd mInterstitialAd;
    private ProgressDialog progressDialog;
    StorageReference storageRef;
    StorageReference storageReference;
    PowerManager.WakeLock wakeLock;
    private final String[] cours_science = {"sciences_science_1.pdf", "sciences_science_2.pdf", "sciences_science_3.pdf", "sciences_science_4.pdf", "sciences_science_5.pdf", "sciences_science_6.pdf", "sciences_science_7.pdf", "sciences_science_8.pdf", "sciences_science_9.pdf", "sciences_science_10.pdf", "sciences_science_11.pdf", "sciences_science_12.pdf", "sciences_science_13.pdf", "sciences_science_14.pdf", "sciences_science_15.pdf", "sciences_science_16.pdf", "sciences_science_17.pdf", "sciences_science_18.pdf", "sciences_science_19.pdf", "sciences_science_20.pdf", "sciences_science_21.pdf", "sciences_science_22.pdf", "sciences_science_23.pdf", "sciences_science_24.pdf", "sciences_science_25.pdf", "sciences_science_26.pdf", "sciences_science_27.pdf", "sciences_science_28.pdf", "sciences_science_29.pdf", "sciences_science_30.pdf", "sciences_science_31.pdf", "sciences_science_32.pdf", "sciences_science_33.pdf", "sciences_science_34.pdf", "sciences_science_35.pdf", "sciences_science_36.pdf", "sciences_science_37.pdf", "sciences_science_38.pdf", "sciences_science_39.pdf", "sciences_science_40.pdf", "sciences_science_41.pdf", "sciences_science_42.pdf", "sciences_science_43.pdf", "sciences_science_44.pdf", "sciences_science_45.pdf", "sciences_science_46.pdf", "sciences_science_47.pdf", "sciences_science_48.pdf", "sciences_science_49.pdf", "sciences_science_50.pdf", "sciences_science_51.pdf", "sciences_science_52.pdf", "sciences_science_53.pdf", "sciences_science_54.pdf", "sciences_science_55.pdf", "sciences_science_56.pdf", "sciences_science_57.pdf", "sciences_science_58.pdf", "sciences_science_59.pdf"};
    int count_time_wait = -1;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.bacdz.SciencesActivity.3
        @Override // java.lang.Runnable
        public void run() {
            if (SciencesActivity.this.count_time_wait < 15) {
                SciencesActivity.this.count_time_wait++;
                SciencesActivity.handler.postDelayed(SciencesActivity.this.time_wait_out, 1000L);
                return;
            }
            if (!SciencesActivity.this.test_connection()) {
                SciencesActivity.this.no_connection();
            } else if (!SciencesActivity.this.ad_showing) {
                SciencesActivity.this.connection_low();
            }
            SciencesActivity.this.count_time_wait = -1;
            SciencesActivity.this.getWindow().clearFlags(128);
            SciencesActivity.handler.removeCallbacks(SciencesActivity.this.time_wait_out);
        }
    };
    Runnable buffer_onPostExecute = new Runnable() { // from class: com.neptunesoft.bacdz.SciencesActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (SciencesActivity.this.progressDialog != null) {
                SciencesActivity.this.progressDialog.setProgress(0);
            }
            SciencesActivity.this.write_file_download("file_download_sciences.txt", "");
            String read_file_download = SciencesActivity.this.read_file_download("file_download_sciences.txt");
            if (read_file_download != null) {
                SciencesActivity.this.delete_file(read_file_download);
                SciencesActivity.this.write_file_download("file_download_sciences.txt", "");
            }
            try {
                SciencesActivity.handler.removeCallbacks(SciencesActivity.this.time_wait_out);
                SciencesActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                SciencesActivity.this.close_dialog();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (new File(SciencesActivity.this.getFilesDir().getAbsoluteFile() + "/" + SciencesActivity.file_Name).length() == SciencesActivity.this.lengthofFileDownload) {
                AdapterTutorials.changeSciences();
                Toast.makeText(SciencesActivity.this, "تم تحميل الملف بنجاح.", 1).show();
            } else {
                SciencesActivity.this.delete_file(SciencesActivity.file_Name);
                Toast.makeText(SciencesActivity.this, "تعذر عملية تحميل الملف '" + SciencesActivity.file_Name + "' تحقق من إتصال الجهاز بالشبكة !.", 1).show();
            }
            SciencesActivity.this.dismissDialog(1);
            SciencesActivity.this.getWindow().clearFlags(128);
            SciencesActivity.handler.removeCallbacks(SciencesActivity.this.buffer_onPostExecute);
        }
    };
    Runnable write_file_download = new Runnable() { // from class: com.neptunesoft.bacdz.SciencesActivity.5
        @Override // java.lang.Runnable
        public void run() {
            SciencesActivity.this.write_file_download("file_download_sciences.txt", SciencesActivity.file_Name);
            SciencesActivity.handler.removeCallbacks(SciencesActivity.this.write_file_download);
        }
    };
    Runnable delete_file = new Runnable() { // from class: com.neptunesoft.bacdz.SciencesActivity.6
        @Override // java.lang.Runnable
        public void run() {
            if (SciencesActivity.this.files_exist(SciencesActivity.file_Name)) {
                SciencesActivity.this.delete_file(SciencesActivity.file_Name);
            }
            SciencesActivity.this.write_file_download("file_download_sciences.txt", "");
            SciencesActivity.handler.removeCallbacks(SciencesActivity.this.delete_file);
        }
    };
    Runnable write_file_download_null = new Runnable() { // from class: com.neptunesoft.bacdz.SciencesActivity.7
        @Override // java.lang.Runnable
        public void run() {
            SciencesActivity.this.write_file_download("file_download_sciences.txt", "");
            SciencesActivity.handler.removeCallbacks(SciencesActivity.this.write_file_download_null);
        }
    };

    public static SciencesActivity getInstance() {
        return instance;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_sciences);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SciencesActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        String read_file_download = read_file_download("file_download_sciences.txt");
        if (read_file_download != null) {
            delete_file(read_file_download);
            write_file_download("file_download_sciences.txt", "");
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                SciencesActivity.this.m741lambda$onCreate$1$comneptunesoftbacdzSciencesActivity(initializationStatus);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sciencesRecyclerView);
        sciencesRecyclerView = recyclerView;
        recyclerView.setHasFixedSize(false);
        sciencesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList();
        refreshRecyclerView();
        AdapterTutorials adapterTutorials2 = new AdapterTutorials(list, "sciences");
        adapterTutorials = adapterTutorials2;
        sciencesRecyclerView.setAdapter(adapterTutorials2);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m741lambda$onCreate$1$comneptunesoftbacdzSciencesActivity(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.bacdz.SciencesActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                SciencesActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                SciencesActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds(final String url) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.bacdz.SciencesActivity.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    SciencesActivity.this.ad_showing = true;
                    SciencesActivity.this.mInterstitialAd = null;
                    SciencesActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    SciencesActivity.this.ad_showing = false;
                    SciencesActivity.this.download(url);
                }
            });
        } else {
            download(url);
            loadAdMobInterstitialAds();
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        if (id != 1) {
            return null;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog = progressDialog;
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SciencesActivity.this.m742lambda$onCreateDialog$2$comneptunesoftbacdzSciencesActivity(dialogInterface);
            }
        });
        this.progressDialog.setProgressNumberFormat(null);
        this.progressDialog.setTitle("Download...");
        StringBuilder sb = new StringBuilder();
        if (file_Name.length() < 16) {
            sb = new StringBuilder(file_Name);
        } else {
            for (int i = 0; i < 12; i++) {
                sb.append(file_Name.charAt(i));
            }
            sb.insert(0, "...");
        }
        ProgressDialog progressDialog2 = this.progressDialog;
        progressDialog2.setMessage(("إسم الملف : " + ((Object) sb)) + "\nحجم الملف : جاري حساب حجم الملف");
        this.progressDialog.setMax(100);
        this.progressDialog.setProgressStyle(1);
        this.progressDialog.setCancelable(false);
        this.progressDialog.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SciencesActivity.lambda$onCreateDialog$3(dialogInterface, i2);
            }
        });
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        getWindow().addFlags(128);
        this.progressDialog.show();
        return this.progressDialog;
    }

    /* renamed from: lambda$onCreateDialog$2$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m742lambda$onCreateDialog$2$comneptunesoftbacdzSciencesActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.progressDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    static /* synthetic */ void lambda$onCreateDialog$3(DialogInterface dialogInterface, int i) {
        isCancelled = true;
        dialogInterface.dismiss();
    }

    private void refreshRecyclerView() {
        String str;
        String str2;
        String str3;
        String str4;
        if (SplashScreen.darkmode) {
            if (files_exist(this.cours_science[0])) {
                str3 = "03 تأثير الـ pH على نشاط الإنزيم";
                str4 = "03 نشاط الإنزيم و علاقته ببنية الإنزيم";
                list.add(new Tutorials("01 مقر تركيب البروتين", R.drawable.ic_briefcase_dark));
            } else {
                str3 = "03 تأثير الـ pH على نشاط الإنزيم";
                str4 = "03 نشاط الإنزيم و علاقته ببنية الإنزيم";
                list.add(new Tutorials("01 مقر تركيب البروتين", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[1])) {
                list.add(new Tutorials("01 استنساخ المعلومات الوراثية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("01 استنساخ المعلومات الوراثية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[2])) {
                list.add(new Tutorials("01 الترجمة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("01 الترجمة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[3])) {
                list.add(new Tutorials("01 مراحل الترجمة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("01 مراحل الترجمة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[4])) {
                list.add(new Tutorials("01 ملخص رقم 1", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("01 ملخص رقم 1", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[5])) {
                list.add(new Tutorials("01 ملخص رقم 2", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("01 ملخص رقم 2", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[6])) {
                list.add(new Tutorials("01 ملخص رقم 3", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("01 ملخص رقم 3", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[7])) {
                list.add(new Tutorials("02 تمثيل البنية الفراغية للبروتين", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("02 تمثيل البنية الفراغية للبروتين", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[8])) {
                list.add(new Tutorials("02 ملخص رقم 1", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("02 ملخص رقم 1", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[9])) {
                list.add(new Tutorials("02 ملخص رقم 2", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("02 ملخص رقم 2", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[10])) {
                list.add(new Tutorials("02 ملخص رقم 3", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("02 ملخص رقم 3", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[11])) {
                list.add(new Tutorials("03 مفهوم الإنزيم و أهميته", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("03 مفهوم الإنزيم و أهميته", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[12])) {
                list.add(new Tutorials(str4, R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials(str4, R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[13])) {
                list.add(new Tutorials(str3, R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials(str3, R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[14])) {
                list.add(new Tutorials("03 تأثير درجة الحرارة على نشاط الإنزيم", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("03 تأثير درجة الحرارة على نشاط الإنزيم", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[15])) {
                list.add(new Tutorials("03 ملخص رقم 1", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("03 ملخص رقم 1", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[16])) {
                list.add(new Tutorials("03 ملخص رقم 2", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("03 ملخص رقم 2", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[17])) {
                list.add(new Tutorials("03 ملخص رقم 3", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("03 ملخص رقم 3", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[18])) {
                list.add(new Tutorials("04 الإستجابة المناعية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 الإستجابة المناعية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[19])) {
                list.add(new Tutorials("04 الذات و اللاذات", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 الذات و اللاذات", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[20])) {
                list.add(new Tutorials("04 طرق التعرف على محددات المستضد", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 طرق التعرف على محددات المستضد", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[21])) {
                list.add(new Tutorials("04 المعقد المناعـي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 المعقد المناعـي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[22])) {
                list.add(new Tutorials("04 مصدر الأجسام المضادة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 مصدر الأجسام المضادة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[23])) {
                list.add(new Tutorials("04 العناصر الدفاعية في الحالة الثانية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 العناصر الدفاعية في الحالة الثانية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[24])) {
                list.add(new Tutorials("04 طرق تأثير اللمفاويات LT", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 طرق تأثير اللمفاويات LT", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[25])) {
                list.add(new Tutorials("04 مصدر اللمفاويات LT", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 مصدر اللمفاويات LT", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[26])) {
                list.add(new Tutorials("04 سبب فقدان المناعة المكتسبة SIDA", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("04 سبب فقدان المناعة المكتسبة SIDA", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[27])) {
                list.add(new Tutorials("04 ملخص رقم 1", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("04 ملخص رقم 1", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[28])) {
                list.add(new Tutorials("04 ملخص رقم 2", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("04 ملخص رقم 2", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[29])) {
                list.add(new Tutorials("04 ملخص رقم 3", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("04 ملخص رقم 3", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[30])) {
                list.add(new Tutorials("05 النقل المشبكي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("05 النقل المشبكي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[31])) {
                list.add(new Tutorials("05 آلية النقل المشبكي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("05 آلية النقل المشبكي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[32])) {
                list.add(new Tutorials("05 كمون الراحة", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("05 كمون الراحة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[33])) {
                list.add(new Tutorials("05 كمون العمل", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("05 كمون العمل", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[34])) {
                list.add(new Tutorials("05 آلية الإدماج العصبي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("05 آلية الإدماج العصبي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[35])) {
                list.add(new Tutorials("05 تأثير المخدرات على مستوى المشابك", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("05 تأثير المخدرات على مستوى المشابك", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[36])) {
                list.add(new Tutorials("05 ملخص رقم 1", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("05 ملخص رقم 1", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[37])) {
                list.add(new Tutorials("05 ملخص رقم 2", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("05 ملخص رقم 2", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[38])) {
                list.add(new Tutorials("05 ملخص رقم 3", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("05 ملخص رقم 3", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[39])) {
                list.add(new Tutorials("06 شروط عملية التركيب الضوئي و مظاهره", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("06 شروط عملية التركيب الضوئي و مظاهره", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[40])) {
                list.add(new Tutorials("06 مقر عملية التركيب الضوئي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("06 مقر عملية التركيب الضوئي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[41])) {
                list.add(new Tutorials("06 تفاعلات المرحلة الكيمو ضوئية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("06 تفاعلات المرحلة الكيمو ضوئية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[42])) {
                list.add(new Tutorials("06 تفاعلات المرحلة الكيمو حيوية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("06 تفاعلات المرحلة الكيمو حيوية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[43])) {
                list.add(new Tutorials("06 ملخص رقم 1", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("06 ملخص رقم 1", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[44])) {
                list.add(new Tutorials("06 ملخص رقم 2", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("06 ملخص رقم 2", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[45])) {
                list.add(new Tutorials("07 آليات تحويل الطاقة الكامنة في الوسط الهوائي", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("07 آليات تحويل الطاقة الكامنة في الوسط الهوائي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[46])) {
                list.add(new Tutorials("07 مقر الأكسدة التنفسية", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("07 مقر الأكسدة التنفسية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[47])) {
                list.add(new Tutorials("07 ملخص رقم 1", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("07 ملخص رقم 1", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[48])) {
                list.add(new Tutorials("07 ملخص رقم 2", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("07 ملخص رقم 2", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[49])) {
                list.add(new Tutorials("08 النشاط التكتوني للصفائح", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("08 النشاط التكتوني للصفائح", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[50])) {
                list.add(new Tutorials("08 النشاط التكتوني و البنيات الجيولوجية المرتبطة به", R.drawable.ic_briefcase_dark));
            } else {
                list.add(new Tutorials("08 النشاط التكتوني و البنيات الجيولوجية المرتبطة به", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[51])) {
                list.add(new Tutorials("ملخص كل الدروس", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("ملخص كل الدروس", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[52])) {
                list.add(new Tutorials("ملخص هام لجميع الوحدات التعلمية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("ملخص هام لجميع الوحدات التعلمية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[53])) {
                list.add(new Tutorials("أهم الأسئلة في البكالوريا و أجوبتها", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("أهم الأسئلة في البكالوريا و أجوبتها", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[54])) {
                list.add(new Tutorials("نصائح منهجية حول الفروض والاختبارات", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("نصائح منهجية حول الفروض والاختبارات", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[55])) {
                list.add(new Tutorials("منهجية الإجابة على الأسئلة", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("منهجية الإجابة على الأسئلة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[56])) {
                list.add(new Tutorials("منهجية الاجابة على أسئلة التحليل والاستنتاج", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("منهجية الاجابة على أسئلة التحليل والاستنتاج", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[57])) {
                list.add(new Tutorials("الأخطاء الشائعة و كيفية تفاديها", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("الأخطاء الشائعة و كيفية تفاديها", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_science[58])) {
                list.add(new Tutorials("الأخطاء الشائعة في إجابات البكالوريا", R.drawable.ic_plus_dark));
                return;
            } else {
                list.add(new Tutorials("الأخطاء الشائعة في إجابات البكالوريا", R.drawable.ic_download_dark));
                return;
            }
        }
        if (files_exist(this.cours_science[0])) {
            str2 = "03 تأثير الـ pH على نشاط الإنزيم";
            str = "03 نشاط الإنزيم و علاقته ببنية الإنزيم";
            list.add(new Tutorials("01 مقر تركيب البروتين", R.drawable.ic_briefcase));
        } else {
            str = "03 نشاط الإنزيم و علاقته ببنية الإنزيم";
            str2 = "03 تأثير الـ pH على نشاط الإنزيم";
            list.add(new Tutorials("01 مقر تركيب البروتين", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[1])) {
            list.add(new Tutorials("01 استنساخ المعلومات الوراثية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("01 استنساخ المعلومات الوراثية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[2])) {
            list.add(new Tutorials("01 الترجمة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("01 الترجمة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[3])) {
            list.add(new Tutorials("01 مراحل الترجمة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("01 مراحل الترجمة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[4])) {
            list.add(new Tutorials("01 ملخص رقم 1", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("01 ملخص رقم 1", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[5])) {
            list.add(new Tutorials("01 ملخص رقم 2", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("01 ملخص رقم 2", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[6])) {
            list.add(new Tutorials("01 ملخص رقم 3", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("01 ملخص رقم 3", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[7])) {
            list.add(new Tutorials("02 تمثيل البنية الفراغية للبروتين", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("02 تمثيل البنية الفراغية للبروتين", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[8])) {
            list.add(new Tutorials("02 ملخص رقم 1", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("02 ملخص رقم 1", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[9])) {
            list.add(new Tutorials("02 ملخص رقم 2", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("02 ملخص رقم 2", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[10])) {
            list.add(new Tutorials("02 ملخص رقم 3", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("02 ملخص رقم 3", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[11])) {
            list.add(new Tutorials("03 مفهوم الإنزيم و أهميته", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("03 مفهوم الإنزيم و أهميته", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[12])) {
            list.add(new Tutorials(str, R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials(str, R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[13])) {
            list.add(new Tutorials(str2, R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials(str2, R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[14])) {
            list.add(new Tutorials("03 تأثير درجة الحرارة على نشاط الإنزيم", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("03 تأثير درجة الحرارة على نشاط الإنزيم", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[15])) {
            list.add(new Tutorials("03 ملخص رقم 1", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("03 ملخص رقم 1", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[16])) {
            list.add(new Tutorials("03 ملخص رقم 2", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("03 ملخص رقم 2", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[17])) {
            list.add(new Tutorials("03 ملخص رقم 3", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("03 ملخص رقم 3", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[18])) {
            list.add(new Tutorials("04 الإستجابة المناعية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 الإستجابة المناعية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[19])) {
            list.add(new Tutorials("04 الذات و اللاذات", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 الذات و اللاذات", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[20])) {
            list.add(new Tutorials("04 طرق التعرف على محددات المستضد", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 طرق التعرف على محددات المستضد", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[21])) {
            list.add(new Tutorials("04 المعقد المناعـي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 المعقد المناعـي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[22])) {
            list.add(new Tutorials("04 مصدر الأجسام المضادة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 مصدر الأجسام المضادة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[23])) {
            list.add(new Tutorials("04 العناصر الدفاعية في الحالة الثانية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 العناصر الدفاعية في الحالة الثانية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[24])) {
            list.add(new Tutorials("04 طرق تأثير اللمفاويات LT", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 طرق تأثير اللمفاويات LT", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[25])) {
            list.add(new Tutorials("04 مصدر اللمفاويات LT", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 مصدر اللمفاويات LT", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[26])) {
            list.add(new Tutorials("04 سبب فقدان المناعة المكتسبة SIDA", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("04 سبب فقدان المناعة المكتسبة SIDA", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[27])) {
            list.add(new Tutorials("04 ملخص رقم 1", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("04 ملخص رقم 1", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[28])) {
            list.add(new Tutorials("04 ملخص رقم 2", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("04 ملخص رقم 2", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[29])) {
            list.add(new Tutorials("04 ملخص رقم 3", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("04 ملخص رقم 3", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[30])) {
            list.add(new Tutorials("05 النقل المشبكي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("05 النقل المشبكي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[31])) {
            list.add(new Tutorials("05 آلية النقل المشبكي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("05 آلية النقل المشبكي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[32])) {
            list.add(new Tutorials("05 كمون الراحة", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("05 كمون الراحة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[33])) {
            list.add(new Tutorials("05 كمون العمل", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("05 كمون العمل", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[34])) {
            list.add(new Tutorials("05 آلية الإدماج العصبي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("05 آلية الإدماج العصبي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[35])) {
            list.add(new Tutorials("05 تأثير المخدرات على مستوى المشابك", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("05 تأثير المخدرات على مستوى المشابك", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[36])) {
            list.add(new Tutorials("05 ملخص رقم 1", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("05 ملخص رقم 1", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[37])) {
            list.add(new Tutorials("05 ملخص رقم 2", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("05 ملخص رقم 2", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[38])) {
            list.add(new Tutorials("05 ملخص رقم 3", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("05 ملخص رقم 3", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[39])) {
            list.add(new Tutorials("06 شروط عملية التركيب الضوئي و مظاهره", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("06 شروط عملية التركيب الضوئي و مظاهره", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[40])) {
            list.add(new Tutorials("06 مقر عملية التركيب الضوئي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("06 مقر عملية التركيب الضوئي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[41])) {
            list.add(new Tutorials("06 تفاعلات المرحلة الكيمو ضوئية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("06 تفاعلات المرحلة الكيمو ضوئية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[42])) {
            list.add(new Tutorials("06 تفاعلات المرحلة الكيمو حيوية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("06 تفاعلات المرحلة الكيمو حيوية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[43])) {
            list.add(new Tutorials("06 ملخص رقم 1", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("06 ملخص رقم 1", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[44])) {
            list.add(new Tutorials("06 ملخص رقم 2", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("06 ملخص رقم 2", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[45])) {
            list.add(new Tutorials("07 آليات تحويل الطاقة الكامنة في الوسط الهوائي", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("07 آليات تحويل الطاقة الكامنة في الوسط الهوائي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[46])) {
            list.add(new Tutorials("07 مقر الأكسدة التنفسية", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("07 مقر الأكسدة التنفسية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[47])) {
            list.add(new Tutorials("07 ملخص رقم 1", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("07 ملخص رقم 1", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[48])) {
            list.add(new Tutorials("07 ملخص رقم 2", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("07 ملخص رقم 2", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[49])) {
            list.add(new Tutorials("08 النشاط التكتوني للصفائح", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("08 النشاط التكتوني للصفائح", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[50])) {
            list.add(new Tutorials("08 النشاط التكتوني و البنيات الجيولوجية المرتبطة به", R.drawable.ic_briefcase));
        } else {
            list.add(new Tutorials("08 النشاط التكتوني و البنيات الجيولوجية المرتبطة به", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[51])) {
            list.add(new Tutorials("ملخص كل الدروس", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("ملخص كل الدروس", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[52])) {
            list.add(new Tutorials("ملخص هام لجميع الوحدات التعلمية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("ملخص هام لجميع الوحدات التعلمية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[53])) {
            list.add(new Tutorials("أهم الأسئلة في البكالوريا و أجوبتها", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("أهم الأسئلة في البكالوريا و أجوبتها", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[54])) {
            list.add(new Tutorials("نصائح منهجية حول الفروض والاختبارات", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("نصائح منهجية حول الفروض والاختبارات", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[55])) {
            list.add(new Tutorials("منهجية الإجابة على الأسئلة", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("منهجية الإجابة على الأسئلة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[56])) {
            list.add(new Tutorials("منهجية الاجابة على أسئلة التحليل والاستنتاج", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("منهجية الاجابة على أسئلة التحليل والاستنتاج", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[57])) {
            list.add(new Tutorials("الأخطاء الشائعة و كيفية تفاديها", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("الأخطاء الشائعة و كيفية تفاديها", R.drawable.ic_download));
        }
        if (files_exist(this.cours_science[58])) {
            list.add(new Tutorials("الأخطاء الشائعة في إجابات البكالوريا", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("الأخطاء الشائعة في إجابات البكالوريا", R.drawable.ic_download));
        }
    }

    public void connection_low() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_internet_low = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SciencesActivity.this.m733lambda$connection_low$4$comneptunesoftbacdzSciencesActivity(dialogInterface);
            }
        });
        this.dialog_internet_low.setCancelable(false);
        this.dialog_internet_low.setMessage("تعذر عملية الإتصال بالخادم, حاول مرة أخرى !.");
        this.dialog_internet_low.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_internet_low.show();
    }

    /* renamed from: lambda$connection_low$4$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m733lambda$connection_low$4$comneptunesoftbacdzSciencesActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_internet_low.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void no_connection() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_nointernet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SciencesActivity.this.m740lambda$no_connection$6$comneptunesoftbacdzSciencesActivity(dialogInterface);
            }
        });
        this.dialog_nointernet.setCancelable(false);
        this.dialog_nointernet.setMessage("لا يوجد إتصال بالشبكة !.");
        this.dialog_nointernet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda12
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_nointernet.show();
    }

    /* renamed from: lambda$no_connection$6$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m740lambda$no_connection$6$comneptunesoftbacdzSciencesActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_nointernet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    private void dialog_wait() {
        getWindow().addFlags(128);
        close_dialog();
        this.count_time_wait = 0;
        handler.postDelayed(this.time_wait_out, 1000L);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog_wait_check = progressDialog;
        progressDialog.setCancelable(false);
        this.dialog_wait_check.show();
        this.dialog_wait_check.setContentView(R.layout.progressdialogdownloadfiles);
    }

    private void download_files(final String fileName) {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_download_files = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda15
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SciencesActivity.this.m735lambda$download_files$8$comneptunesoftbacdzSciencesActivity(dialogInterface);
            }
        });
        this.dialog_download_files.setCancelable(false);
        this.dialog_download_files.setMessage("هل تريد تحميل الملف ؟.");
        this.dialog_download_files.setButton(-1, "تحميل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda16
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SciencesActivity.this.m736lambda$download_files$9$comneptunesoftbacdzSciencesActivity(fileName, dialogInterface, i);
            }
        });
        this.dialog_download_files.setButton(-2, "رفض", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SciencesActivity.this.m734lambda$download_files$10$comneptunesoftbacdzSciencesActivity(dialogInterface, i);
            }
        });
        this.dialog_download_files.show();
    }

    /* renamed from: lambda$download_files$8$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m735lambda$download_files$8$comneptunesoftbacdzSciencesActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_download_files.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialog_download_files.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$download_files$9$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m736lambda$download_files$9$comneptunesoftbacdzSciencesActivity(String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (test_connection()) {
            dialog_wait();
            getWindow().addFlags(128);
            geturl_download(str);
            return;
        }
        no_connection();
    }

    /* renamed from: lambda$download_files$10$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m734lambda$download_files$10$comneptunesoftbacdzSciencesActivity(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void download(String url_file) {
        isCancelled = false;
        StringBuilder sb = new StringBuilder();
        if (file_Name.length() < 16) {
            sb = new StringBuilder(file_Name);
        } else {
            for (int i = 0; i < 12; i++) {
                sb.append(file_Name.charAt(i));
            }
            sb.insert(0, "...");
        }
        String str = "إسم الملف : " + ((Object) sb);
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            progressDialog.setMessage(str + "\nحجم الملف : جاري حساب حجم الملف");
        }
        new DownloadFileAsync().execute(url_file);
    }

    public void geturl_download(String fileName) {
        file_Name = fileName;
        StorageReference reference = FirebaseStorage.getInstance().getReference();
        this.storageReference = reference;
        this.storageRef = reference.child(fileName);
        write_file_download("file_download_sciences.txt", fileName);
        this.storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda13
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SciencesActivity.this.m737lambda$geturl_download$11$comneptunesoftbacdzSciencesActivity((Uri) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda14
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SciencesActivity.this.m739lambda$geturl_download$14$comneptunesoftbacdzSciencesActivity(exc);
            }
        });
    }

    /* renamed from: lambda$geturl_download$11$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m737lambda$geturl_download$11$comneptunesoftbacdzSciencesActivity(Uri uri) {
        if (this.count_time_wait != -1) {
            showInterstitialAds(uri.toString());
        }
    }

    /* renamed from: lambda$geturl_download$14$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m739lambda$geturl_download$14$comneptunesoftbacdzSciencesActivity(Exception exc) {
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SciencesActivity.this.m738lambda$geturl_download$12$comneptunesoftbacdzSciencesActivity(create, dialogInterface);
            }
        });
        create.setTitle("Error !.");
        create.setMessage("عذرا هناك خطأ في الحصول على رابط تحميل الملف من الخادم, و ذلك بسبب كمية البيانات المحدودة و الخاصة بتحميل ملفات التطبيق على هواتفكم نحن نعمل على توسيع خدماتنا على مستوى الخوادم الخاصة بـ Firebase نتمنى أن تتفهم المشكلة كما يمكنك المحاولة من حين إلى آخر في مدة أقصاها 24 ساعة .");
        create.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$geturl_download$12$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m738lambda$geturl_download$12$comneptunesoftbacdzSciencesActivity(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    public String read_file_download(String file_name_read) {
        FileInputStream fileInputStream = null;
        try {
            try {
                fileInputStream = openFileInput(file_name_read);
                String readLine = new BufferedReader(new InputStreamReader(fileInputStream)).readLine();
                if (fileInputStream == null) {
                    return readLine;
                }
                try {
                    fileInputStream.close();
                    return readLine;
                } catch (IOException e) {
                    e.printStackTrace();
                    return readLine;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return "";
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void delete_file(String FILE_NAME) {
        File file = new File(getFilesDir(), FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    public void write_file_download(String file, String file_name_download) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    PrintWriter printWriter = new PrintWriter(openFileOutput(file, 0));
                    printWriter.print("");
                    printWriter.close();
                    fileOutputStream = openFileOutput(file, 0);
                    fileOutputStream.write(file_name_download.getBytes());
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public boolean files_exist(String fileName) {
        return new File(getFilesDir(), fileName).exists();
    }

    public void openContent(String fileName) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PdfGalleryActivity.class);
        intent.putExtra("ViewType", "assets");
        if (files_exist(fileName)) {
            PdfGalleryActivity.setDir_file(fileName);
            startActivity(intent);
        } else if (test_connection()) {
            download_files(fileName);
        } else {
            connect_internet();
        }
    }

    public boolean test_connection() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    private void connect_internet() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_connect_internet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SciencesActivity.this.m732x59ae0f1e(dialogInterface);
            }
        });
        this.dialog_connect_internet.setCancelable(false);
        this.dialog_connect_internet.setMessage("قم بالإتصال بالشبكة لتحميل الملف");
        this.dialog_connect_internet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.SciencesActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_connect_internet.show();
    }

    /* renamed from: lambda$connect_internet$15$com-neptunesoft-bacdz-SciencesActivity, reason: not valid java name */
    /* synthetic */ void m732x59ae0f1e(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_connect_internet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    public void close_dialog() {
        AlertDialog alertDialog = this.dialog_download_files;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.dialog_download_files.cancel();
        }
        AlertDialog alertDialog2 = this.dialog_internet_low;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.dialog_internet_low.cancel();
        }
        AlertDialog alertDialog3 = this.dialog_nointernet;
        if (alertDialog3 != null && alertDialog3.isShowing()) {
            this.dialog_nointernet.cancel();
        }
        ProgressDialog progressDialog = this.dialog_wait_check;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.dialog_wait_check.cancel();
        }
        AlertDialog alertDialog4 = this.dialog_connect_internet;
        if (alertDialog4 != null && alertDialog4.isShowing()) {
            this.dialog_connect_internet.cancel();
        }
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.progressDialog.cancel();
        }
        getWindow().clearFlags(128);
    }

    public class DownloadFileAsync extends AsyncTask<String, String, String> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public DownloadFileAsync() {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            try {
                SciencesActivity.handler.removeCallbacks(SciencesActivity.this.time_wait_out);
                SciencesActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                SciencesActivity.this.dialog_wait_check.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (SciencesActivity.this.progressDialog != null) {
                SciencesActivity.this.progressDialog.setProgress(0);
            }
            SciencesActivity.this.showDialog(1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String s) {
            SciencesActivity.handler.postDelayed(SciencesActivity.this.buffer_onPostExecute, 100L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(String... values) {
            super.onProgressUpdate((Object[]) values);
            Log.d("ANDRO_ASYNC", values[0]);
            SciencesActivity.this.progressDialog.setProgress(Integer.parseInt(values[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strings) {
            try {
                SciencesActivity.this.wakeLock.acquire(500000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                URL url = new URL(strings[0]);
                int contentLength = url.openConnection().getContentLength();
                SciencesActivity.this.lengthofFileDownload = contentLength;
                publishProgress("0");
                String format = new DecimalFormat("##.##").format(r0.getContentLength() / 1048576.0f);
                StringBuilder sb = new StringBuilder();
                if (SciencesActivity.file_Name.length() < 16) {
                    sb = new StringBuilder(SciencesActivity.file_Name);
                } else {
                    for (int i = 0; i < 12; i++) {
                        sb.append(SciencesActivity.file_Name.charAt(i));
                    }
                    sb.insert(0, "...");
                }
                String str = "إسم الملف : " + ((Object) sb);
                String str2 = "حجم الملف : " + format + " م.ب";
                try {
                    SciencesActivity.this.progressDialog.setMessage(str + IOUtils.LINE_SEPARATOR_UNIX + str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                SciencesActivity.this.progressDialog.setMax(100);
                SciencesActivity.handler.postDelayed(SciencesActivity.this.write_file_download, 0L);
                FileOutputStream openFileOutput = SciencesActivity.this.openFileOutput(SciencesActivity.file_Name, 0);
                Log.d("ANDRO_ASYNC", "Length of file: " + contentLength);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(openFileOutput.getFD());
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1 || SciencesActivity.isCancelled) {
                        break;
                    }
                    j += read;
                    publishProgress("" + ((int) ((100 * j) / contentLength)));
                    fileOutputStream.write(bArr, 0, read);
                }
                if (SciencesActivity.isCancelled) {
                    cancel(true);
                    SciencesActivity.handler.postDelayed(SciencesActivity.this.delete_file, 0L);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                openFileOutput.close();
                SciencesActivity.handler.postDelayed(SciencesActivity.this.write_file_download_null, 0L);
            } catch (Exception e3) {
                SciencesActivity.this.dismissDialog(1);
                e3.printStackTrace();
            }
            try {
                SciencesActivity.this.wakeLock.release();
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }
}
