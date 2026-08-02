package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hk0 {

    /* JADX INFO: renamed from: a */
    public static final double f3251a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3252b = 0;

    /* JADX INFO: renamed from: a */
    public static double m2289a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f3251a;
    }
}
