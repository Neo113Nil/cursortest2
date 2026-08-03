package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.c0 f3537a;
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r b;
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y c;

    public t(com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.flow.c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.c = yVar;
        this.f3537a = c0Var;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.f3537a, this.b);
    }
}
