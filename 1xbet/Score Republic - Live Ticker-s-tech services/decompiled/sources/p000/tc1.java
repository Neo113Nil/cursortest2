package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tc1 {

    /* JADX INFO: renamed from: a */
    public static final String f7431a;

    /* JADX INFO: renamed from: b */
    public static final long f7432b;

    /* JADX INFO: renamed from: c */
    public static final int f7433c;

    /* JADX INFO: renamed from: d */
    public static final int f7434d;

    /* JADX INFO: renamed from: e */
    public static final long f7435e;

    /* JADX INFO: renamed from: f */
    public static final o31 f7436f;

    static {
        String property;
        int i = lc1.f4761a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7431a = property;
        f7432b = kd0.m3015o("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = lc1.f4761a;
        if (i2 < 2) {
            i2 = 2;
        }
        f7433c = kd0.m3016p(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f7434d = kd0.m3016p(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f7435e = TimeUnit.SECONDS.toNanos(kd0.m3015o("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7436f = o31.f5607o;
    }
}
