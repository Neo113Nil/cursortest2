package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class m0 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.p0 f3709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.fyber.inneractive.sdk.flow.p0 p0Var, long j) {
        super(j, 1000L);
        this.f3709a = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        com.fyber.inneractive.sdk.flow.m0 m0Var = this.f3709a.w;
        if (m0Var != null) {
            m0Var.cancel();
        }
        this.f3709a.e(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i = ((int) j) / 1000;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f3709a.k;
        if (eVar != null) {
            eVar.updateCloseCountdown(i);
        }
    }
}
