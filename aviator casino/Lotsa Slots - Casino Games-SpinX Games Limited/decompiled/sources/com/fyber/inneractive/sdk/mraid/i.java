package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class i extends com.fyber.inneractive.sdk.mraid.e {
    public i(java.util.LinkedHashMap linkedHashMap, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        int a2 = a("w");
        int a3 = a(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);
        this.c.a((java.lang.String) this.b.get("url"), a2 <= 0 ? -1 : a2, a3 <= 0 ? -1 : a3, "true".equals(this.b.get("shouldUseCustomClose")), "true".equals(this.b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final java.lang.String c() {
        return (java.lang.String) this.b.get("url");
    }
}
