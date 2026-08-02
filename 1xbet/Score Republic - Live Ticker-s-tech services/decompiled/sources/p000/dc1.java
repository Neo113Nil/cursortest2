package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1623j = 0;

    /* JADX INFO: renamed from: k */
    public final long f1624k;

    /* JADX INFO: renamed from: l */
    public final Object f1625l;

    /* JADX INFO: renamed from: m */
    public final Object f1626m;

    public dc1(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hr0("firebase-iid-executor"));
        this.f1626m = firebaseMessaging;
        this.f1624k = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f1387b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f1625l = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1156a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f1626m).f1387b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: b */
    public boolean m1157b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f1626m).m1008a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1623j) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f1625l;
                f71 f71VarM1647o = f71.m1647o();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1626m;
                if (f71VarM1647o.m1670q(firebaseMessaging.f1387b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f1394i = true;
                        }
                        if (!firebaseMessaging.f1393h.m3403j()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f1394i = false;
                            }
                            if (!f71.m1647o().m1670q(firebaseMessaging.f1387b)) {
                                return;
                            }
                        } else if (!f71.m1647o().m1669p(firebaseMessaging.f1387b) || m1156a()) {
                            if (m1157b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f1394i = false;
                                }
                            } else {
                                firebaseMessaging.m1012g(this.f1624k);
                            }
                            if (!f71.m1647o().m1670q(firebaseMessaging.f1387b)) {
                                return;
                            }
                        } else {
                            cc1 cc1Var = new cc1();
                            cc1Var.f1218c = this;
                            cc1Var.m917a();
                            if (!f71.m1647o().m1670q(firebaseMessaging.f1387b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f1394i = false;
                            if (!f71.m1647o().m1670q(firebaseMessaging.f1387b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (f71.m1647o().m1670q(firebaseMessaging.f1387b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            case 1:
                l32 l32Var = (l32) this.f1626m;
                l32Var.m3165J((f32) this.f1625l, false, this.f1624k);
                l32Var.f4660n = null;
                v42 v42VarM1573p = ((f02) l32Var.f7192j).m1573p();
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                v42VarM1573p.m5067O(new f31(v42VarM1573p, (f32) null));
                return;
            default:
                ((cm1) this.f1625l).run();
                long j = this.f1624k;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                mq0 mq0Var = (mq0) this.f1626m;
                mq0Var.getClass();
                ve1 ve1Var = new ve1(Executors.callable(this, null));
                kq0 kq0Var = new kq0(ve1Var, mq0Var.f5130k.schedule(ve1Var, j, timeUnit));
                kq0Var.mo995c(new cm1(11, kq0Var), EnumC0113ct.f1449j);
                return;
        }
    }

    public dc1(q72 q72Var, cm1 cm1Var, mq0 mq0Var, long j) {
        this.f1625l = cm1Var;
        this.f1626m = mq0Var;
        this.f1624k = j;
    }

    public dc1(l32 l32Var, f32 f32Var, long j) {
        this.f1625l = f32Var;
        this.f1624k = j;
        Objects.requireNonNull(l32Var);
        this.f1626m = l32Var;
    }
}
