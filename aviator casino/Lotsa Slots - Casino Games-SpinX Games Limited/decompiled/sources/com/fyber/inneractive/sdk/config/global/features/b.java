package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes3.dex */
public final class b extends com.fyber.inneractive.sdk.config.global.features.i {
    public static final com.fyber.inneractive.sdk.config.global.features.a e = com.fyber.inneractive.sdk.config.global.features.a.OPEN;

    public b() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final com.fyber.inneractive.sdk.config.global.features.i b() {
        com.fyber.inneractive.sdk.config.global.features.b bVar = new com.fyber.inneractive.sdk.config.global.features.b();
        a(bVar);
        return bVar;
    }

    public final com.fyber.inneractive.sdk.config.global.features.a c() {
        java.lang.String a2 = a("identifier_click_action", e.mKey);
        for (com.fyber.inneractive.sdk.config.global.features.a aVar : com.fyber.inneractive.sdk.config.global.features.a.values()) {
            if (a2.equalsIgnoreCase(aVar.mKey)) {
                return aVar;
            }
        }
        return com.fyber.inneractive.sdk.config.global.features.a.NONE;
    }
}
