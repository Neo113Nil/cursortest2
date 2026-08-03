package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class o0 implements com.fyber.inneractive.sdk.util.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.p0 f3729a;

    public o0(com.fyber.inneractive.sdk.flow.p0 p0Var) {
        this.f3729a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        java.lang.Runnable runnable = this.f3729a.n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.post(runnable);
        }
        com.fyber.inneractive.sdk.flow.p0 p0Var = this.f3729a;
        com.fyber.inneractive.sdk.util.v1 v1Var = p0Var.o;
        if (v1Var != null) {
            v1Var.e = null;
            p0Var.o = null;
        }
    }
}
