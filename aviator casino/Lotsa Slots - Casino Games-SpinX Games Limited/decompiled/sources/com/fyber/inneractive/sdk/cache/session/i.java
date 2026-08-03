package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.session.h f3568a = new com.fyber.inneractive.sdk.cache.session.h();

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.util.Map.Entry entry : this.f3568a.entrySet()) {
                com.fyber.inneractive.sdk.cache.session.enums.c cVar = (com.fyber.inneractive.sdk.cache.session.enums.c) entry.getKey();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("type", cVar.a().value());
                    jSONObject2.put("subType", cVar.name().toLowerCase(java.util.Locale.US).contains("video") ? "video" : "display");
                    jSONObject2.put("session_data", ((com.fyber.inneractive.sdk.cache.session.g) entry.getValue()).a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (java.lang.Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (java.lang.Exception unused2) {
        }
        return jSONObject;
    }
}
