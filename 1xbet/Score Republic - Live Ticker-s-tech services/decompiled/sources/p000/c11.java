package p000;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c11 extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d11 f1066a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(long j, d11 d11Var) {
        super(j, 1000L);
        this.f1066a = d11Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f1066a.mo611e();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
