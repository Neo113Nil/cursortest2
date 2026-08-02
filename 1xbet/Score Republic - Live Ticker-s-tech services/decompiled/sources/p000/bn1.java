package p000;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends sq1 {

    /* JADX INFO: renamed from: l */
    public static final boolean f925l;

    /* JADX INFO: renamed from: m */
    public static final boolean f926m;

    /* JADX INFO: renamed from: n */
    public static final boolean f927n;

    /* JADX INFO: renamed from: o */
    public static final AtomicReference f928o;

    /* JADX INFO: renamed from: p */
    public static final AtomicLong f929p;

    /* JADX INFO: renamed from: q */
    public static final ConcurrentLinkedQueue f930q;

    /* JADX INFO: renamed from: k */
    public volatile sq1 f931k;

    static {
        String str = Build.FINGERPRINT;
        f925l = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f926m = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f927n = "eng".equals(str3) || "userdebug".equals(str3);
        f928o = new AtomicReference();
        f929p = new AtomicLong();
        f930q = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: B */
    public static void m726B() {
        while (true) {
            an1 an1Var = (an1) f930q.poll();
            if (an1Var == null) {
                return;
            }
            f929p.getAndDecrement();
            bn1 bn1Var = an1Var.f255a;
            ra2 ra2Var = an1Var.f256b;
            va2 va2Var = ra2Var.f6772c;
            if ((va2Var != null && Boolean.TRUE.equals(va2Var.mo1129x(ua2.f7743g))) || bn1Var.mo727r(ra2Var.f6770a)) {
                bn1Var.mo728u(ra2Var);
            }
        }
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: r */
    public final boolean mo727r(Level level) {
        return this.f931k == null || this.f931k.mo727r(level);
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: u */
    public final void mo728u(ra2 ra2Var) {
        if (this.f931k != null) {
            this.f931k.mo728u(ra2Var);
            return;
        }
        if (f929p.incrementAndGet() > 20) {
            f930q.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f930q.offer(new an1(this, ra2Var));
        if (this.f931k != null) {
            m726B();
        }
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: w */
    public final void mo729w(RuntimeException runtimeException, ra2 ra2Var) {
        if (this.f931k != null) {
            this.f931k.mo729w(runtimeException, ra2Var);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
