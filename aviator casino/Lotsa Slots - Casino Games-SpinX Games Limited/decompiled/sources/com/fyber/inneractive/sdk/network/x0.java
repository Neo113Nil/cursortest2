package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class x0 extends com.fyber.inneractive.sdk.network.t0 {
    public final java.lang.String p;
    public final java.lang.String q;
    public final java.util.concurrent.atomic.AtomicInteger r;

    public x0(com.fyber.inneractive.sdk.network.e eVar, java.lang.String str, java.lang.String str2) {
        super(eVar, com.fyber.inneractive.sdk.network.g0.c.a(), null);
        this.r = new java.util.concurrent.atomic.AtomicInteger();
        this.q = str;
        this.p = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        try {
            com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
            o0Var.f3851a = java.lang.String.valueOf(i);
            return o0Var;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse event network request", e, new java.lang.Object[0]);
            throw new com.fyber.inneractive.sdk.network.n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        byte[] bArr = new byte[0];
        try {
            com.fyber.inneractive.sdk.util.IAlog.a("NetworkRequestEvent: network request body %s", this.p);
            return this.p.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        } catch (java.lang.Exception unused) {
            return bArr;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) java.lang.Math.pow(2.0d, this.r.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.m0 m() {
        return com.fyber.inneractive.sdk.network.m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.g1 o() {
        return com.fyber.inneractive.sdk.network.g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String r() {
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.r.getAndIncrement() < 4;
    }
}
