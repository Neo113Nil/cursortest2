package live.football.scorerepublic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import live.football.scorerepublic.MainActivity;
import p000.AbstractActivityC0790v4;
import p000.AbstractC0024an;
import p000.AbstractC0875xf;
import p000.C0086c5;
import p000.C0270h1;
import p000.C0716t4;
import p000.C0753u4;
import p000.RunnableC0195f1;
import p000.a81;
import p000.c50;
import p000.dd0;
import p000.e50;
import p000.n91;
import p000.o91;
import p000.qc1;
import p000.rc1;
import p000.v92;
import p000.vy1;
import p000.w00;
import p000.xe1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0790v4 {

    /* JADX INFO: renamed from: L */
    public static String f4805L = "";

    /* JADX INFO: renamed from: J */
    public final AtomicBoolean f4806J;

    /* JADX INFO: renamed from: K */
    public long f4807K;

    public MainActivity() {
        ((C0086c5) this.f2777m.f5011m).m851e("androidx:appcompat", new C0716t4(this));
        m2117g(new C0753u4(this));
        this.f4806J = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [tk0] */
    @Override // p000.AbstractActivityC0790v4, p000.AbstractActivityC0252gk, p000.AbstractActivityC0214fk, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FirebaseMessaging firebaseMessaging;
        a81 n91Var = Build.VERSION.SDK_INT >= 31 ? new n91(this) : new a81(this);
        n91Var.mo85i();
        this.f4807K = System.currentTimeMillis();
        n91Var.mo88l(new o91() { // from class: tk0
            @Override // p000.o91
            /* JADX INFO: renamed from: a */
            public final boolean mo3000a() {
                String str = MainActivity.f4805L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                MainActivity mainActivity = this.f7458a;
                long j = jCurrentTimeMillis - mainActivity.f4807K;
                AtomicBoolean atomicBoolean = mainActivity.f4806J;
                boolean z = !atomicBoolean.get() && j < 3000;
                if (j >= 3000 && !atomicBoolean.get()) {
                    Log.d("MainActivity", "Splash screen timeout reached (" + j + "ms), dismissing splash");
                }
                return z;
            }

            /* JADX INFO: renamed from: b */
            public final g70 m4791b() {
                return new g70(0, this.f7458a, MainActivity.class, "keepSplashOnScreen", "keepSplashOnScreen()Z", 0, 0);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof o91) && (obj instanceof tk0)) {
                    return m4791b().equals(((tk0) obj).m4791b());
                }
                return false;
            }

            public final int hashCode() {
                return m4791b().hashCode();
            }
        });
        super.onCreate(bundle);
        String string = getString(R.string.base_url);
        string.getClass();
        f4805L = string;
        if (AbstractC0875xf.f8939a == null) {
            synchronized (AbstractC0875xf.f8940b) {
                if (AbstractC0875xf.f8939a == null) {
                    w00 w00VarM5221b = w00.m5221b();
                    w00VarM5221b.m5224a();
                    AbstractC0875xf.f8939a = FirebaseAnalytics.getInstance(w00VarM5221b.f8318a);
                }
            }
        }
        AbstractC0875xf.f8939a.getClass();
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        Log.d("MainActivity", "Got URL in intent: " + data);
        if (data != null) {
            String string2 = data.toString();
            string2.getClass();
            f4805L = string2;
        }
        View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        if (childAt == null) {
            C0270h1.m2192h("rootView");
            return;
        }
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(w00.m5221b());
        }
        firebaseMessaging.getClass();
        qc1 qc1Var = new qc1();
        int i = 9;
        firebaseMessaging.f1391f.execute(new RunnableC0195f1(i, firebaseMessaging, qc1Var));
        v92 v92Var = qc1Var.f6465a;
        dd0 dd0Var = new dd0(i);
        v92Var.getClass();
        v92Var.f8141b.m3364n(new vy1(rc1.f6820a, dd0Var));
        v92Var.m5139o();
    }

    @Override // p000.AbstractActivityC0252gk, android.app.Activity
    public final void onNewIntent(Intent intent) {
        WebView webView;
        intent.getClass();
        super.onNewIntent(intent);
        Uri data = intent.getData();
        Log.d("MainActivity", "Got URL in onNewIntent: " + data);
        if (data != null) {
            String string = data.toString();
            string.getClass();
            f4805L = string;
        } else {
            String string2 = getString(R.string.base_url);
            string2.getClass();
            f4805L = string2;
        }
        List<c50> listM1668n = ((e50) this.f8056D.f793k).f1954q.f7299c.m1668n();
        listM1668n.getClass();
        for (c50 c50Var : listM1668n) {
            if ((c50Var instanceof WebViewFragment) && (webView = ((WebViewFragment) c50Var).f4813h0) != null) {
                webView.loadUrl(f4805L);
            }
        }
    }

    @Override // p000.AbstractActivityC0790v4, p000.AbstractActivityC0252gk, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length != 0 && i == 111) {
            SharedPreferences preferences = getPreferences(0);
            preferences.getClass();
            SharedPreferences.Editor editorEdit = preferences.edit();
            editorEdit.putBoolean("notification_permission_denied", iArr[0] != 0);
            editorEdit.apply();
        }
    }

    @Override // p000.AbstractActivityC0790v4, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z = getPreferences(0).getBoolean("notification_permission_denied", false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && xe1.m5635c(this, "android.permission.POST_NOTIFICATIONS") != 0 && !z && i >= 33 && i >= 33 && xe1.m5635c(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (TextUtils.isEmpty(strArr[i2])) {
                    C0270h1.m2190f(AbstractC0024an.m285h(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            }
            requestPermissions(strArr, 111);
        }
    }
}
