package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class t extends com.fyber.inneractive.sdk.mraid.f {
    public t(java.util.LinkedHashMap linkedHashMap, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        java.util.Map map = this.b;
        this.c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && "false".equals(this.b.get("allowOrientationChange"))) ? false : true, (java.lang.String) this.b.get("forceOrientation"));
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }
}
