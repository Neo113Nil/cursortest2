package y3;

import A0.J0;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import game.betting133.sports1xbet.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.ThreadFactoryC2192b;
import q3.C2308a;

/* loaded from: classes.dex */
public final class r {
    public static volatile r i;

    /* renamed from: a, reason: collision with root package name */
    public final String f21270a;

    /* renamed from: b, reason: collision with root package name */
    public final C2308a f21271b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f21272c;

    /* renamed from: d, reason: collision with root package name */
    public final J0 f21273d;

    /* renamed from: e, reason: collision with root package name */
    public int f21274e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21275g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC2669e f21276h;

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, String str, Bundle bundle) {
        String packageName;
        Application application;
        String packageName2;
        String string;
        if (str != null) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            } catch (ClassNotFoundException unused) {
                this.f21270a = "FA-Ads";
            }
        }
        this.f21270a = "FA";
        this.f21271b = C2308a.f18886a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2192b(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f21272c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f21273d = new J0(this);
        new ArrayList();
        try {
            try {
                packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (IllegalStateException unused2) {
            }
        } catch (Resources.NotFoundException unused3) {
            packageName = context.getPackageName();
        }
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(packageName)) {
            try {
                packageName2 = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (Resources.NotFoundException unused4) {
                packageName2 = context.getPackageName();
            }
            packageName = packageName2;
        }
        int identifier = resources.getIdentifier("google_app_id", "string", packageName);
        if (identifier != 0) {
            try {
                string = resources.getString(identifier);
            } catch (Resources.NotFoundException unused5) {
            }
            if (string != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused6) {
                    this.f21275g = null;
                    this.f = true;
                    Log.w(this.f21270a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
            if (str != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused7) {
                    this.f21275g = "am";
                }
            }
            this.f21275g = "fa";
            if (str == null) {
                Log.v(this.f21270a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            } else {
                if (str == null) {
                    Log.w(this.f21270a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
            b(new j(this, str, context, bundle, 2));
            application = (Application) context.getApplicationContext();
            if (application != null) {
                Log.w(this.f21270a, "Unable to register lifecycle notifications. Application null.");
                return;
            } else {
                application.registerActivityLifecycleCallbacks(new q(this));
                return;
            }
        }
        string = null;
        if (string != null) {
        }
        if (str != null) {
        }
        this.f21275g = "fa";
        if (str == null) {
        }
        b(new j(this, str, context, bundle, 2));
        application = (Application) context.getApplicationContext();
        if (application != null) {
        }
    }

    public final void a(Exception exc, boolean z3, boolean z5) {
        this.f |= z3;
        String str = this.f21270a;
        if (z3) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z5) {
            b(new C2672h(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void b(o oVar) {
        this.f21272c.execute(oVar);
    }
}
