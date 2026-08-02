package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ka2 extends kd1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4333b;

    @Override // p000.kd1
    /* JADX INFO: renamed from: a */
    public final long mo2848a() {
        switch (this.f4333b) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
