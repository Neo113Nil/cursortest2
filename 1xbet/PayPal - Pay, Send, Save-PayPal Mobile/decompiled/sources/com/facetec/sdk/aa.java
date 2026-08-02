package com.facetec.sdk;

/* loaded from: classes8.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    int f3374a = -1;
    int d = -1;
    int b = -1;
    private long c = new java.util.Date().getTime();
    byte[] e = new byte[0];

    aa() {
    }

    final org.json.JSONObject d() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("i", this.f3374a);
            jSONObject.put("sid", this.d);
            jSONObject.put("ct", this.c);
            jSONObject.put("h", this.b);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}
