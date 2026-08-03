package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class w extends com.fyber.inneractive.sdk.mraid.f {
    public w(java.util.LinkedHashMap linkedHashMap, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        boolean equals = "true".equals(this.b.get("shouldUseCustomClose"));
        if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            equals = false;
        }
        com.fyber.inneractive.sdk.web.i0 i0Var = this.c;
        i0Var.X = equals;
        com.fyber.inneractive.sdk.web.j1 j1Var = i0Var.g;
        if (j1Var != null) {
            ((com.fyber.inneractive.sdk.web.b0) j1Var).b(equals);
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }
}
