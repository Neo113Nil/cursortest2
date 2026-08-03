package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class h1 extends com.fyber.inneractive.sdk.network.t0 {
    public final java.lang.String p;

    public h1(com.fyber.inneractive.sdk.network.f0 f0Var, java.lang.String str) {
        super(f0Var, com.fyber.inneractive.sdk.network.g0.c.a(), null);
        this.p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        com.fyber.inneractive.sdk.click.c cVar = new com.fyber.inneractive.sdk.click.c();
        if (lVar != null) {
            java.util.ArrayList arrayList = lVar.f;
            cVar.f3571a.clear();
            cVar.f3571a.addAll(arrayList);
            java.io.InputStream inputStream = lVar.c;
            if (inputStream != null) {
                java.lang.String stringBuffer = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
                cVar.b = stringBuffer;
                o0Var.b = stringBuffer;
            }
        }
        o0Var.f3851a = cVar;
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
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
        return false;
    }
}
