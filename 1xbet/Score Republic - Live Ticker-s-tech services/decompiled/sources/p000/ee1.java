package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 implements Runnable {

    /* JADX INFO: renamed from: p */
    public static final Object f2075p = new Object();

    /* JADX INFO: renamed from: q */
    public static Boolean f2076q;

    /* JADX INFO: renamed from: r */
    public static Boolean f2077r;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2078j;

    /* JADX INFO: renamed from: k */
    public final long f2079k;

    /* JADX INFO: renamed from: l */
    public final Object f2080l;

    /* JADX INFO: renamed from: m */
    public final Object f2081m;

    /* JADX INFO: renamed from: n */
    public final Object f2082n;

    /* JADX INFO: renamed from: o */
    public final Object f2083o;

    public ee1(ce1 ce1Var, Context context, C0475mm c0475mm, long j) {
        this.f2078j = 0;
        this.f2083o = ce1Var;
        this.f2080l = context;
        this.f2079k = j;
        this.f2081m = c0475mm;
        this.f2082n = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1406a(Context context) {
        boolean zBooleanValue;
        synchronized (f2075p) {
            try {
                Boolean bool = f2077r;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m1407b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f2077r = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1407b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1408c(Context context) {
        boolean zBooleanValue;
        synchronized (f2075p) {
            try {
                Boolean bool = f2076q;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m1407b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f2076q = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m1409d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.f2080l).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM1408c;
        int i = this.f2078j;
        long j = this.f2079k;
        Object obj = this.f2082n;
        Object obj2 = this.f2081m;
        Object obj3 = this.f2083o;
        Object obj4 = this.f2080l;
        switch (i) {
            case 0:
                ce1 ce1Var = (ce1) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (m1408c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    ce1Var.m925d(true);
                    if (!((C0475mm) obj2).m3403j()) {
                        ce1Var.m925d(false);
                        if (!zM1408c) {
                            return;
                        }
                    } else if (!m1406a(context) || m1409d()) {
                        if (ce1Var.m926e()) {
                            ce1Var.m925d(false);
                        } else {
                            ce1Var.m927f(j);
                        }
                        if (!zM1408c) {
                            return;
                        }
                    } else {
                        new de1(this, this).m1172a();
                        if (!zM1408c) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    ce1Var.m925d(false);
                    if (!zM1408c) {
                        return;
                    }
                } finally {
                    if (m1408c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                        break;
                    }
                }
                try {
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            case 1:
                String str = (String) obj2;
                b12 b12Var = (b12) obj3;
                String str2 = (String) obj4;
                if (str2 == null) {
                    x62 x62Var = b12Var.f681b;
                    x62Var.mo1564c().mo11z();
                    String str3 = x62Var.f8817P;
                    if (str3 == null || str3.equals(str)) {
                        x62Var.f8817P = str;
                        x62Var.f8816O = null;
                        return;
                    }
                    return;
                }
                f32 f32Var = new f32(j, (String) obj, str2);
                x62 x62Var2 = b12Var.f681b;
                x62Var2.mo1564c().mo11z();
                String str4 = x62Var2.f8817P;
                if (str4 != null) {
                    str4.equals(str);
                }
                x62Var2.f8817P = str;
                x62Var2.f8816O = f32Var;
                return;
            case 2:
                ((v22) obj3).m5030L(this.f2079k, this.f2082n, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                l32 l32Var = (l32) obj3;
                f72 f72Var = ((f02) l32Var.f7192j).f2250r;
                f02.m1558k(f72Var);
                l32Var.m3162G((f32) obj2, (f32) obj, this.f2079k, true, f72Var.m1710K("screen_view", bundle, null, false));
                return;
        }
    }

    public ee1(l32 l32Var, Bundle bundle, f32 f32Var, f32 f32Var2, long j) {
        this.f2078j = 3;
        this.f2080l = bundle;
        this.f2081m = f32Var;
        this.f2082n = f32Var2;
        this.f2079k = j;
        Objects.requireNonNull(l32Var);
        this.f2083o = l32Var;
    }

    public /* synthetic */ ee1(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.f2078j = i;
        this.f2080l = str;
        this.f2081m = str2;
        this.f2082n = obj2;
        this.f2079k = j;
        this.f2083o = obj;
    }
}
