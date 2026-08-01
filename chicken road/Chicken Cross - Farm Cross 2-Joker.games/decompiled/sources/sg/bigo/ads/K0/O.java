package sg.bigo.ads.K0;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static N f12347a;

    public static long a() {
        N n = f12347a;
        if (n == null) {
            return System.currentTimeMillis();
        }
        return (SystemClock.elapsedRealtime() - n.b) + n.f12346a;
    }

    public static long b() {
        long currentTimeMillis = System.currentTimeMillis() - ((Long) sg.bigo.ads.F0.b.a("sp_ads", "sp_fix_ts_diff", (Object) 0L, 1)).longValue();
        if (currentTimeMillis > 0) {
            return currentTimeMillis;
        }
        sg.bigo.ads.F0.b.b("sp_ads", "sp_fix_ts_diff", 0L, 1);
        return System.currentTimeMillis();
    }
}
