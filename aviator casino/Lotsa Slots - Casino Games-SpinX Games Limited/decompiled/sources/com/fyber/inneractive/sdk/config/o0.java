package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class o0 implements com.fyber.inneractive.sdk.util.b1 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f3623a = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Set set = this.f3623a;
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                jSONArray.put((com.fyber.inneractive.sdk.config.enums.Track) it.next());
            }
        }
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
