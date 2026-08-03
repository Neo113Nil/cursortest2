package com.fyber.inneractive.sdk.network.events;

/* loaded from: classes3.dex */
public abstract class a {
    public static void a(com.fyber.inneractive.sdk.network.t tVar, java.lang.String str, java.lang.String str2, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, java.util.HashMap hashMap, java.lang.Boolean bool) {
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(tVar, inneractiveAdRequest, eVar);
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        if (bool != null) {
            xVar.a(bool, "loaded_from_cache");
        }
        xVar.a(str, "errorCode").a(str2, "templateURL");
        if (hashMap != null && !hashMap.isEmpty()) {
            for (java.lang.String str3 : hashMap.keySet()) {
                java.lang.String str4 = (java.lang.String) hashMap.get(str3);
                if (!android.text.TextUtils.isEmpty(str4)) {
                    xVar.a(str4, str3);
                }
            }
        }
        wVar.f.put(xVar.f3861a);
        wVar.a((java.lang.String) null);
    }

    public static void a(com.fyber.inneractive.sdk.network.t tVar, com.fyber.inneractive.sdk.network.events.b bVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(tVar, inneractiveAdRequest, eVar);
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        xVar.a(bVar.name(), "errorCode");
        if (!android.text.TextUtils.isEmpty(str2)) {
            xVar.a(str2, "templateURL");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            xVar.a(str, "error");
        }
        if (bool != null) {
            xVar.a(bool, "loaded_from_cache");
        }
        wVar.f.put(xVar.f3861a);
        wVar.a((java.lang.String) null);
    }
}
