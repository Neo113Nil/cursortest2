package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes3.dex */
public final class v extends com.fyber.inneractive.sdk.config.global.features.i {
    public static final com.fyber.inneractive.sdk.config.global.features.u e = com.fyber.inneractive.sdk.config.global.features.u.NONE;

    public v() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final com.fyber.inneractive.sdk.config.global.features.i b() {
        com.fyber.inneractive.sdk.config.global.features.v vVar = new com.fyber.inneractive.sdk.config.global.features.v();
        a(vVar);
        return vVar;
    }

    public final com.fyber.inneractive.sdk.config.global.features.u c() {
        java.lang.String a2 = a("click_action", e.mKey);
        for (com.fyber.inneractive.sdk.config.global.features.u uVar : com.fyber.inneractive.sdk.config.global.features.u.values()) {
            if (a2.equalsIgnoreCase(uVar.mKey)) {
                return uVar;
            }
        }
        return com.fyber.inneractive.sdk.config.global.features.u.NONE;
    }
}
