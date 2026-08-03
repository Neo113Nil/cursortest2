package com.fyber.inneractive.sdk.cache;

/* loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.cache.a {
    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return "IALastModifiedFromHeader.global";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return "ia-global.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.Object a(java.lang.String str) {
        try {
            return com.fyber.inneractive.sdk.config.o.a(new org.json.JSONObject(str));
        } catch (org.json.JSONException e) {
            com.fyber.inneractive.sdk.util.IAlog.b("internal error while parsing global config file", new java.lang.Object[0]);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        if (java.lang.System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null) {
            return "https://cdn2.inner-active.mobi/ia-sdk-config/config_android.json";
        }
        return java.lang.System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }
}
