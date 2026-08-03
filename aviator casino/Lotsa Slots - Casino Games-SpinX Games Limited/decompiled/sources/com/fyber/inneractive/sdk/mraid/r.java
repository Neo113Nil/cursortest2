package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class r extends com.fyber.inneractive.sdk.mraid.e {
    public r(java.util.LinkedHashMap linkedHashMap, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        java.lang.String str = (java.lang.String) this.b.get(com.facebook.share.internal.ShareConstants.MEDIA_URI);
        if (android.text.TextUtils.isEmpty(str)) {
            this.c.a(com.fyber.inneractive.sdk.mraid.k.PLAY_VIDEO, "Video can't be played with null or empty URL");
            return;
        }
        com.fyber.inneractive.sdk.web.j1 j1Var = ((com.fyber.inneractive.sdk.ui.IAmraidWebViewController) this.c).g;
        if (j1Var != null) {
            ((com.fyber.inneractive.sdk.web.b0) j1Var).a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final java.lang.String c() {
        return (java.lang.String) this.b.get(com.facebook.share.internal.ShareConstants.MEDIA_URI);
    }
}
