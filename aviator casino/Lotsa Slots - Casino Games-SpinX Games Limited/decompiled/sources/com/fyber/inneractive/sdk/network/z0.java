package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class z0 extends com.fyber.inneractive.sdk.network.t0 {
    public final java.lang.String p;
    public final java.util.concurrent.atomic.AtomicInteger q;

    public z0(com.fyber.inneractive.sdk.network.f0 f0Var, java.lang.String str) {
        super(f0Var, com.fyber.inneractive.sdk.network.g0.c.a(), null);
        this.q = new java.util.concurrent.atomic.AtomicInteger();
        this.p = str;
    }

    public static void b(java.lang.String str) {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.z0(new com.fyber.inneractive.sdk.network.y0(str, java.lang.System.currentTimeMillis()), str));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        try {
            com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
            o0Var.f3851a = java.lang.String.valueOf(i);
            java.io.InputStream inputStream = lVar.c;
            if (inputStream != null) {
                o0Var.b = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
            }
            return o0Var;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse hit network request", e, new java.lang.Object[0]);
            throw new com.fyber.inneractive.sdk.network.n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) java.lang.Math.pow(2.0d, this.q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.m0 m() {
        return com.fyber.inneractive.sdk.network.m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.g1 o() {
        return com.fyber.inneractive.sdk.network.g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String r() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.q.getAndIncrement() < 4;
    }
}
