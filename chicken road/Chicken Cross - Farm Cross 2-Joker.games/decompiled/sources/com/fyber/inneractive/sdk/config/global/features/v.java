package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes4.dex */
public final class v extends i {
    public static final u e = u.NONE;

    public v() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        v vVar = new v();
        a(vVar);
        return vVar;
    }

    public final u c() {
        String a2 = a("click_action", e.mKey);
        for (u uVar : u.values()) {
            if (a2.equalsIgnoreCase(uVar.mKey)) {
                return uVar;
            }
        }
        return u.NONE;
    }
}
