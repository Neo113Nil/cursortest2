package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.c0 f3538a;
    public final /* synthetic */ java.lang.Exception b;

    public u(com.fyber.inneractive.sdk.flow.c0 c0Var, java.lang.Exception exc) {
        this.f3538a = c0Var;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.c0 c0Var = this.f3538a;
        if (c0Var != null) {
            c0Var.a(this.b, com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
