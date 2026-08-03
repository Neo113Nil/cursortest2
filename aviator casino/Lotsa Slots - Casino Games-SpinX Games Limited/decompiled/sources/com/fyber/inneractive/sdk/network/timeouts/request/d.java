package com.fyber.inneractive.sdk.network.timeouts.request;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.network.timeouts.request.a {
    public d(java.lang.String str, com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str2) {
        super(str, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        return kVar.c(str, this.l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        java.lang.String str2 = this.l;
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "min", "rat", com.fyber.inneractive.sdk.config.global.features.k.e(str2));
        "read".equalsIgnoreCase(str);
        java.lang.Integer a3 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a(str, "min", "rat", "all_mediators"));
        int intValue = a3 != null ? a3.intValue() : 5000;
        java.lang.Integer a4 = kVar.a(a2);
        return a4 != null ? a4.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        java.lang.String str2 = this.l;
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "rat", "perc", com.fyber.inneractive.sdk.config.global.features.k.e(str2));
        java.lang.String a3 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "rat", "perc", "all_mediators");
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        java.lang.Integer a4 = kVar.a(a3);
        if (a4 != null) {
            i = a4.intValue();
        }
        java.lang.Integer a5 = kVar.a(a2);
        return a5 != null ? a5.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(com.fyber.inneractive.sdk.config.global.features.k kVar) {
        java.lang.String str = this.l;
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold", com.fyber.inneractive.sdk.config.global.features.k.e(str));
        java.lang.Integer a3 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold", "all_mediators"));
        int intValue = a3 != null ? a3.intValue() : androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
        java.lang.Integer a4 = kVar.a(a2);
        return a4 != null ? a4.intValue() : intValue;
    }
}
