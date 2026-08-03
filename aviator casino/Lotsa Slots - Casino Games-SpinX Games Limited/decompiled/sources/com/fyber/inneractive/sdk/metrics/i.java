package com.fyber.inneractive.sdk.metrics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f3797a = new java.util.LinkedHashMap();
    public final java.util.LinkedHashMap b = new java.util.LinkedHashMap();
    public long c;
    public long d;

    public static org.json.JSONArray a(java.util.LinkedHashMap linkedHashMap) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.fyber.inneractive.sdk.metrics.h hVar : linkedHashMap.keySet()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.putOpt("outcome", hVar.b);
                jSONObject.putOpt("time", linkedHashMap.get(hVar));
                jSONObject.putOpt("idx", java.lang.Integer.valueOf(jSONArray.length()));
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
