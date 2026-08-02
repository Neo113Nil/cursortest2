package com.neptunesoft.bacdz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Insets;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.neptunesoft.bacdz.adapter.ResourcesAdapter;
import com.neptunesoft.bacdz.classobjects.Resources;
import com.neptunesoft.bacdz.listeners.ResourcesListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ResourcesActivity extends AppCompatActivity implements ResourcesListener {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.ResourcesActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ResourcesActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Resources("الموقع الرسمي لوزارة التربية", null, "http://www.education.gov.dz/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("الديوان الوطني للإمتحانات و المسابقات", null, "http://www.onec.dz/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("موقع الدراسة الجزائري", null, "https://eddirasa.com/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("قناة موقع الدراسة الجزائري", null, "https://www.youtube.com/c/EddirasaSite", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("الموقع الأول لدراسة في الجزائر", null, "https://www.ency-education.com/secondaire.html", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("موقع التعليم الجزائري", null, "https://www.dzetude.com/category/secondaire/3as/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("موقع بكالوريا الجزائر", null, "https://www.bacalgeria.com/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("قناة كليك باك Clicbac", null, "https://www.youtube.com/c/clicbac", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("صفحة كليك باك Clicbac", null, "https://www.facebook.com/clicbac", "facebook", SplashScreen.darkmode));
        arrayList.add(new Resources("قناة cours dz", null, "https://www.youtube.com/c/coursdz19", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("صفحة cours dz", null, "https://www.facebook.com/coursdz2019", "facebook", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة الرياضيات", "الأستاذ نورالدين", "https://www.youtube.com/user/noureddine2013", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة العلوم الفيزيائية", "الأستاذ عمار مولاي", "https://www.youtube.com/c/MoulaiAmar", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة العلوم الطبيعية و الحياة", "الأستاذ شاوش", "https://www.youtube.com/channel/UC0BE1aNXDWxcJqIVCBqN3rg", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة العلوم الطبيعية و الحياة", "الأستاذ شاوش", "https://www.facebook.com/professeur.chaouch", "facebook", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة العلوم الطبيعية و الحياة", "الأستاذ شاوش", "https://www.instagram.com/professeur_chaouch/", "instagram", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة الفلسفة", "الأستاذ خليل سعيداني", "https://www.youtube.com/channel/UCwy5nzYHV06XfP9iixv_BZA", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة الإجتماعيات", "الأستاذ بورنان", "https://www.youtube.com/channel/UCeyN7ipOQs6Ld4jEIMFAaKw", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة العربية", "الأستاذ حيقون أسامة", "https://www.youtube.com/channel/UCTiFoJXhyBE1QYL4ClQVprQ", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة الإنجليزية", "بلال", "https://www.youtube.com/channel/UCIkWp4PLYRfSKOYzOzPy4Fg", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة الإنجليزية", "بلال", "https://www.facebook.com/Anglais.b/", "facebook", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة الإنجليزية", "بلال", "https://www.instagram.com/belalmalii/", "instagram", SplashScreen.darkmode));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.resourcesRecyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        ResourcesAdapter resourcesAdapter = new ResourcesAdapter(arrayList, this, this);
        recyclerView.setAdapter(resourcesAdapter);
        resourcesAdapter.notifyDataSetChanged();
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

    @Override // com.neptunesoft.bacdz.listeners.ResourcesListener
    public void onResourcesClick(Resources resources, int position) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        if (resources.getType().equals("web")) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
                return;
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت أي متصفح لكي تتمكن من فتح رابط الموقع", 0).show();
                return;
            }
        }
        if (resources.getType().equals("facebook")) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
                return;
            } catch (ActivityNotFoundException unused2) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق الفايس بوك أو أي متصفح لكي تتمكن من فتح رابط الصفحة", 0).show();
                return;
            }
        }
        if (resources.getType().equals("instagram")) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink()));
            intent.setPackage("com.instagram.android");
            try {
                try {
                    startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused3) {
                    Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق الانستقرام أو أي متصفح لكي تتمكن من فتح رابط الصفحة", 0).show();
                    return;
                }
            } catch (ActivityNotFoundException unused4) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
                return;
            }
        }
        if (launchIntentForPackage != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(resources.getLink()));
            intent2.setPackage("com.google.android.youtube");
            startActivity(intent2);
            return;
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
        } catch (ActivityNotFoundException unused5) {
            Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق اليوتيوب أو أي متصفح لكي تتمكن من فتح رابط القناة", 0).show();
        }
    }
}
