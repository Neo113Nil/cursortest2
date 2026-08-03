package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.c0 f3541a;

    public x(com.fyber.inneractive.sdk.flow.c0 c0Var) {
        this.f3541a = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.c0 c0Var = this.f3541a;
        if (c0Var != null) {
            c0Var.a(new java.lang.Exception("adm payload must contain ad url"), com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
