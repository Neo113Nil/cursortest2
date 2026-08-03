package com.ironsource.mediationsdk.logger;

/* loaded from: classes5.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag f6448a;
    private java.lang.String b;
    private java.lang.String c;
    private int d;

    public b(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.String str2, int i) {
        this.f6448a = ironSourceTag;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.C4.a.d, this.b);
            jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, this.f6448a);
            jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, this.d);
            jSONObject.put("message", this.c);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
