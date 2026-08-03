package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class u0 implements com.fyber.inneractive.sdk.util.b1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f3640a = 50;
    public java.lang.Integer b = 50;
    public java.util.Set c = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "pausePct", this.f3640a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "playPct", this.b);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> set = this.c;
        if (set != null) {
            for (com.fyber.inneractive.sdk.config.enums.Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }
}
