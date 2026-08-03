package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class a1 extends com.fyber.inneractive.sdk.network.t0 {
    public final byte[] p;
    public final java.util.concurrent.atomic.AtomicInteger q;

    public a1(com.fyber.inneractive.sdk.ignite.b bVar, byte[] bArr, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(bVar, com.fyber.inneractive.sdk.network.g0.c.a(), rVar);
        this.q = new java.util.concurrent.atomic.AtomicInteger();
        this.p = bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        try {
            com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
            java.io.InputStream inputStream = lVar.c;
            if (inputStream != null) {
                java.lang.String str = new java.lang.String(com.fyber.inneractive.sdk.util.v.a(inputStream), "UTF-8");
                com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom = com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse.parseFrom(str.getBytes());
                o0Var.b = str;
                o0Var.f3851a = parseFrom;
            }
            return o0Var;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse ignite network request", e, new java.lang.Object[0]);
            throw new com.fyber.inneractive.sdk.network.n0(e);
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse ignite network request", th, new java.lang.Object[0]);
            throw new com.fyber.inneractive.sdk.network.n0("failed to parse ignite network request");
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) java.lang.Math.pow(2.0d, this.q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.m0 m() {
        return com.fyber.inneractive.sdk.network.m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String n() {
        return "application/x-protobuf; messageType=IgniteRequest";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.g1 o() {
        return com.fyber.inneractive.sdk.network.g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String r() {
        return "https://init-mp.fyber.com/init";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.q.getAndIncrement() < 4;
    }
}
