package com.ironsource;

/* renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3014e {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6207a = "eventId";
    private final java.lang.String b = com.ironsource.C4.a.d;
    private final java.lang.String c = "InterstitialEvents";
    private final java.lang.String d = "events";
    private final java.lang.String e = "events";
    org.json.JSONObject f;
    int g;
    private java.lang.String h;

    AbstractC3014e() {
    }

    private java.lang.String a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    protected abstract java.lang.String a();

    public abstract java.lang.String a(java.util.ArrayList<com.ironsource.C3360x5> arrayList, org.json.JSONObject jSONObject);

    java.lang.String b() {
        return android.text.TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public abstract java.lang.String c();

    org.json.JSONObject a(com.ironsource.C3360x5 c3360x5) {
        org.json.JSONObject jSONObject;
        try {
            java.lang.String a2 = c3360x5.a();
            if (!android.text.TextUtils.isEmpty(a2)) {
                jSONObject = new org.json.JSONObject(a2);
            } else {
                jSONObject = new org.json.JSONObject();
            }
            jSONObject.put("eventId", c3360x5.c());
            jSONObject.put(com.ironsource.C4.a.d, c3360x5.d());
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    java.lang.String a(org.json.JSONArray jSONArray) {
        try {
            if (this.f != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f.toString());
                jSONObject.put(com.ironsource.C4.a.d, com.ironsource.mediationsdk.utils.IronSourceUtils.e());
                jSONObject.put(a(this.g), jSONArray);
                return jSONObject.toString();
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
        return "";
    }

    void a(java.lang.String str) {
        this.h = str;
    }
}
