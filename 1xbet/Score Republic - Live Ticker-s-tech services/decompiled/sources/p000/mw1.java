package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mw1 {

    /* JADX INFO: renamed from: h */
    public static volatile mw1 f5168h;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f5169a;

    /* JADX INFO: renamed from: b */
    public final AppMeasurementSdk f5170b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5171c;

    /* JADX INFO: renamed from: d */
    public int f5172d;

    /* JADX INFO: renamed from: e */
    public boolean f5173e;

    /* JADX INFO: renamed from: f */
    public volatile ev1 f5174f;

    /* JADX INFO: renamed from: g */
    public volatile long f5175g;

    public mw1(Context context, Bundle bundle) {
        ThreadFactoryC0480mr threadFactoryC0480mr = new ThreadFactoryC0480mr(this);
        int i = 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC0480mr);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5169a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f5170b = new AppMeasurementSdk(this);
        this.f5171c = new ArrayList();
        try {
            if (AbstractC0875xf.m5655q(context, vt1.m5201p(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, mw1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f5173e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        m3434b(new bw1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0414kz(i, this));
        }
    }

    /* JADX INFO: renamed from: d */
    public static mw1 m3432d(Context context, Bundle bundle) {
        p80.m3863h(context);
        if (f5168h == null) {
            synchronized (mw1.class) {
                try {
                    if (f5168h == null) {
                        f5168h = new mw1(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5168h;
    }

    /* JADX INFO: renamed from: a */
    public final int m3433a(String str) {
        bv1 bv1Var = new bv1();
        m3434b(new bw1(this, str, bv1Var));
        Integer num = (Integer) bv1.m783d(bv1Var.m784c(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m3434b(jw1 jw1Var) {
        this.f5169a.execute(jw1Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m3435c(Exception exc, boolean z, boolean z2) {
        this.f5173e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m3434b(new zv1(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    /* JADX INFO: renamed from: e */
    public final List m3436e(String str, String str2) {
        bv1 bv1Var = new bv1();
        m3434b(new aw1(this, str, str2, bv1Var));
        List list = (List) bv1.m783d(bv1Var.m784c(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: f */
    public final long m3437f() {
        bv1 bv1Var = new bv1();
        m3434b(new ew1(this, bv1Var, 2));
        Long l = (Long) bv1.m783d(bv1Var.m784c(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.f5172d + 1;
        this.f5172d = i;
        return jNextLong + ((long) i);
    }
}
