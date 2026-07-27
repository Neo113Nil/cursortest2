package com.fyber.inneractive.sdk.flow;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class m0 extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f5362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, long j) {
        super(j, 1000L);
        this.f5362a = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        m0 m0Var = this.f5362a.w;
        if (m0Var != null) {
            m0Var.cancel();
        }
        this.f5362a.e(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i = ((int) j) / 1000;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f5362a.k;
        if (eVar != null) {
            eVar.updateCloseCountdown(i);
        }
    }
}
