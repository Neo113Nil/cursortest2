package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public final class BidTokenProvider {
    public static java.lang.String getBidderToken() {
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized()) {
            com.fyber.inneractive.sdk.util.IAlog.b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new java.lang.Object[0]);
            return null;
        }
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.h;
        bVar.getClass();
        if (com.fyber.inneractive.sdk.config.IAConfigManager.c()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sTCF purpose 1 disabled, returning null", com.fyber.inneractive.sdk.util.IAlog.a(bVar));
            return null;
        }
        if (bVar.e.get() == null) {
            synchronized (bVar.g) {
                bVar.b();
            }
        } else {
            bVar.d();
        }
        java.lang.String str = (java.lang.String) bVar.e.get();
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        java.lang.String str2 = iAConfigManager.l;
        com.fyber.inneractive.sdk.config.o oVar = iAConfigManager.t.b;
        java.lang.String str3 = "token_size_limit";
        int a2 = oVar.a("token_size_limit", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 1);
        if (!android.text.TextUtils.isEmpty(str2)) {
            str3 = "token_size_limit_" + str2.toLowerCase(java.util.Locale.US);
        }
        int a3 = oVar.a(str3, a2, 1);
        if (str == null || str.getBytes().length <= a3) {
            com.fyber.inneractive.sdk.util.IAlog.c("token = %s", str);
            return str;
        }
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.TOKEN_EXCEEDS_LIMIT);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        try {
            jSONObject.put(com.moloco.sdk.acm.recorder.b.f6913a, str2);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", com.moloco.sdk.acm.recorder.b.f6913a, str2);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(str.getBytes().length);
        try {
            jSONObject.put("token_size", valueOf);
        } catch (java.lang.Exception unused2) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "token_size", valueOf);
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(a3);
        try {
            jSONObject.put("token_limit", valueOf2);
        } catch (java.lang.Exception unused3) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "token_limit", valueOf2);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
        com.fyber.inneractive.sdk.util.IAlog.c("token exceeds the limit, returning null", new java.lang.Object[0]);
        return null;
    }
}
