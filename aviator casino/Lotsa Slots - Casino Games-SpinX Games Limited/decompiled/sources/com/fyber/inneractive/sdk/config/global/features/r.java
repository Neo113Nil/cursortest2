package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes3.dex */
public final class r extends com.fyber.inneractive.sdk.config.global.features.i {
    public r() {
        super("store_webpage");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final com.fyber.inneractive.sdk.config.global.features.i b() {
        com.fyber.inneractive.sdk.config.global.features.r rVar = new com.fyber.inneractive.sdk.config.global.features.r();
        a(rVar);
        return rVar;
    }

    public final com.fyber.inneractive.sdk.config.global.features.q c() {
        java.lang.String a2 = a("presentation_mode", null);
        if (a2 != null) {
            for (com.fyber.inneractive.sdk.config.global.features.q qVar : com.fyber.inneractive.sdk.config.global.features.q.values()) {
                java.util.Locale locale = java.util.Locale.US;
                if (a2.toLowerCase(locale).equals(qVar.value.toLowerCase(locale))) {
                    return qVar;
                }
            }
        }
        return com.fyber.inneractive.sdk.config.global.features.q.FullScreen;
    }
}
