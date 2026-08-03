package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class u0 extends com.fyber.inneractive.sdk.network.v0 {
    public static final java.lang.String s = com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.network.u0.class);

    public u0(com.fyber.inneractive.sdk.flow.nativead.t tVar, android.content.Context context, com.fyber.inneractive.sdk.cache.d dVar) {
        super(tVar, context, dVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final void a(com.fyber.inneractive.sdk.network.o0 o0Var, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.network.d0 d0Var = this.r;
        if (d0Var == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s: failed to cache file: no cache helper", s);
            return;
        }
        d0Var.b(str2);
        if (o0Var == null || android.text.TextUtils.isEmpty(o0Var.b) || android.text.TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s: failed to cache file: empty result", s);
            return;
        }
        boolean a2 = this.r.a(str, o0Var.b);
        android.net.Uri uri = (android.net.Uri) this.r.a().f3559a;
        o0Var.f3851a = uri;
        if (a2) {
            this.q.a(uri);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.b("%s: Failed to cache file", s);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c() {
        this.f3857a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.a i() {
        com.fyber.inneractive.sdk.network.e0 e0Var = new com.fyber.inneractive.sdk.network.e0(this.p, this.q, com.fyber.inneractive.sdk.nativead.b.f.b);
        this.r = e0Var;
        com.fyber.inneractive.sdk.cache.m a2 = e0Var.a();
        java.lang.String str = a2.b;
        android.net.Uri uri = (android.net.Uri) a2.f3559a;
        this.q.c();
        return new com.fyber.inneractive.sdk.network.a(uri, str);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        try {
            o0Var.b = new java.lang.String(android.util.Base64.encode(com.fyber.inneractive.sdk.util.v.a(lVar.c), 0));
            return o0Var;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.b("%s : failed parse cacheable network request", s, e);
            throw new com.fyber.inneractive.sdk.network.n0(e);
        }
    }
}
