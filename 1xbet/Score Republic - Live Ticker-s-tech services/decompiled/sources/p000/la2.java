package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class la2 {

    /* JADX INFO: renamed from: a */
    public static final kd1 f4747a;

    static {
        ka2 ka2Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            ka2Var = new ka2(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ka2Var = new ka2(1);
        }
        f4747a = ka2Var;
    }
}
