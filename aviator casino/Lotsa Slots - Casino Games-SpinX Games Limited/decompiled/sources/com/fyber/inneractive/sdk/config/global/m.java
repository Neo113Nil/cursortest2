package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class m implements com.fyber.inneractive.sdk.cache.a {
    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return "IALastModifiedFromHeader.remote";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return "ia-remote.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.Object a(java.lang.String str) {
        try {
            return com.fyber.inneractive.sdk.config.global.l.a(new org.json.JSONObject(str));
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.b("internal error while parsing remote features config file", new java.lang.Object[0]);
            if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        if (java.lang.System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") == null) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            return "https://cdn2.inner-active.mobi/ia-sdk-config/features_config.json";
        }
        return java.lang.System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
    }
}
