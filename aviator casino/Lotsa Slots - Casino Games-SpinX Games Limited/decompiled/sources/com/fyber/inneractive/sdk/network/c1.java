package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public class c1 extends com.fyber.inneractive.sdk.network.t0 {
    public final java.lang.String p;

    public c1(com.fyber.inneractive.sdk.network.f0 f0Var, java.lang.String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(f0Var, com.fyber.inneractive.sdk.network.g0.c.a(), rVar);
        this.p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        try {
            java.io.InputStream inputStream = lVar.c;
            java.util.List list = map != null ? (java.util.List) map.get("Content-Type") : null;
            java.lang.String str = list != null ? (java.lang.String) list.get(0) : null;
            java.lang.String encodeToString = android.util.Base64.encodeToString(com.fyber.inneractive.sdk.util.v.a(inputStream), 0);
            if (str == null) {
                str = androidx.media3.common.MimeTypes.IMAGE_PNG;
            }
            o0Var.f3851a = "data:" + str + ";base64, " + encodeToString;
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed to fetch and encode the image.", new java.lang.Object[0]);
        }
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
