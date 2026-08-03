package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.a0 f3645a;

    public z(com.fyber.inneractive.sdk.config.a0 a0Var) {
        this.f3645a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3645a.f3583a.J = new com.fyber.inneractive.sdk.measurement.e();
        com.fyber.inneractive.sdk.config.a0 a0Var = this.f3645a;
        com.fyber.inneractive.sdk.measurement.e eVar = a0Var.f3583a.J;
        android.content.Context context = a0Var.b;
        if (eVar.f3786a) {
            return;
        }
        eVar.f3786a = true;
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
