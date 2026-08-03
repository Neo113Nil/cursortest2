package com.ironsource;

/* renamed from: com.ironsource.na, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3186na {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6496a;
    private org.json.JSONObject b;
    private java.lang.String c;
    private java.lang.String d;

    public C3186na(org.json.JSONObject jSONObject) {
        this.f6496a = jSONObject.optString(com.ironsource.X3.g.b);
        this.b = jSONObject.optJSONObject(com.ironsource.X3.g.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(com.ironsource.X3.g.e);
    }

    public java.lang.String a() {
        return this.d;
    }

    public java.lang.String b() {
        return this.f6496a;
    }

    public org.json.JSONObject c() {
        return this.b;
    }

    public java.lang.String d() {
        return this.c;
    }

    public org.json.JSONObject e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.X3.g.b, this.f6496a);
            jSONObject.put(com.ironsource.X3.g.c, this.b);
            jSONObject.put("success", this.c);
            jSONObject.put(com.ironsource.X3.g.e, this.d);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
