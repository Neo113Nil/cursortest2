package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class n0 implements com.fyber.inneractive.sdk.util.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.p0 f3710a;

    public n0(com.fyber.inneractive.sdk.flow.p0 p0Var) {
        this.f3710a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.b.post(this.f3710a.l);
        com.fyber.inneractive.sdk.flow.p0 p0Var = this.f3710a;
        com.fyber.inneractive.sdk.util.v1 v1Var = p0Var.m;
        if (v1Var != null) {
            v1Var.e = null;
            p0Var.m = null;
        }
        p0Var.q = false;
    }
}
