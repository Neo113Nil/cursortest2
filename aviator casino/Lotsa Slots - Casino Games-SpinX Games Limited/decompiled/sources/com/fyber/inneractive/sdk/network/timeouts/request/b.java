package com.fyber.inneractive.sdk.network.timeouts.request;

/* loaded from: classes3.dex */
public final class b extends com.fyber.inneractive.sdk.network.timeouts.request.a {
    public b(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        super(str, kVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        kVar.getClass();
        java.lang.String str2 = str + "_global_timeout";
        int i = com.fyber.inneractive.sdk.config.global.features.k.d(str) ? 30000 : 10000;
        java.lang.Integer a2 = kVar.a(str2);
        return a2 != null ? a2.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        java.lang.Integer a3 = kVar.a(a2);
        if (a3 != null) {
            return a3.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "rat_perc");
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        java.lang.Integer a3 = kVar.a(a2);
        return a3 != null ? a3.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(com.fyber.inneractive.sdk.config.global.features.k kVar) {
        kVar.getClass();
        java.lang.Integer a2 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold"));
        return a2 != null ? a2.intValue() : androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
    }
}
