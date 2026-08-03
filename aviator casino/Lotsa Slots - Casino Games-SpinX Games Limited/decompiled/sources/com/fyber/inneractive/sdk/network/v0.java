package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public class v0 extends com.fyber.inneractive.sdk.network.t0 {
    public final android.content.Context p;
    public final com.fyber.inneractive.sdk.cache.a q;
    public com.fyber.inneractive.sdk.network.d0 r;

    public v0(com.fyber.inneractive.sdk.network.f0 f0Var, android.content.Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        super(f0Var, com.fyber.inneractive.sdk.network.g0.c.a(), null);
        this.p = context;
        this.q = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        try {
            java.lang.String stringBuffer = com.fyber.inneractive.sdk.util.v.b(lVar.c).toString();
            o0Var.f3851a = this.q.a(stringBuffer);
            o0Var.b = stringBuffer;
            return o0Var;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse cacheable network request", e, new java.lang.Object[0]);
            if (e instanceof com.fyber.inneractive.sdk.external.InvalidAppIdException) {
                throw e;
            }
            throw new com.fyber.inneractive.sdk.network.n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String h() {
        return this.q.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public com.fyber.inneractive.sdk.network.a i() {
        com.fyber.inneractive.sdk.network.d0 d0Var = new com.fyber.inneractive.sdk.network.d0(this.p, this.q);
        this.r = d0Var;
        com.fyber.inneractive.sdk.cache.m a2 = d0Var.a();
        java.lang.String str = a2.b;
        java.lang.Object obj = a2.f3559a;
        this.q.c();
        return new com.fyber.inneractive.sdk.network.a(obj, str);
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
        return this.q.a();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public void a(com.fyber.inneractive.sdk.network.o0 o0Var, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.network.d0 d0Var = this.r;
        if (d0Var != null) {
            d0Var.b(str2);
            if (o0Var == null || o0Var.b.isEmpty() || str.isEmpty()) {
                return;
            }
            if (!this.r.a(str, o0Var.b)) {
                com.fyber.inneractive.sdk.util.IAlog.b("Failed to cache file", new java.lang.Object[0]);
            } else {
                this.q.a(o0Var.f3851a);
            }
        }
    }
}
