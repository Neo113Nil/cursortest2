package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class s extends com.fyber.inneractive.sdk.network.m {
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest e;
    public final com.fyber.inneractive.sdk.network.q0 f;

    public s(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, java.lang.String str, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.flow.o oVar) {
        super(rVar, str, oVar);
        this.e = inneractiveAdRequest;
        com.fyber.inneractive.sdk.network.q0 q0Var = new com.fyber.inneractive.sdk.network.q0(new com.fyber.inneractive.sdk.network.q(this), inneractiveAdRequest, rVar);
        this.f = q0Var;
        q0Var.d = new com.fyber.inneractive.sdk.network.r(this);
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final void a() {
        this.b = true;
        this.f3848a = null;
        this.f.f3857a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final java.lang.String b() {
        return this.f.r();
    }
}
