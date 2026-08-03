package com.ironsource;

/* renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3188nc {
    private final com.ironsource.InterfaceC3362x7 b = com.ironsource.Jb.Y().a();

    /* renamed from: a, reason: collision with root package name */
    com.ironsource.Q6 f6499a = new com.ironsource.Q6();

    public void a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            this.f6499a.a(com.ironsource.M6.n, java.lang.Boolean.valueOf(this.b.a((android.app.Activity) context)));
        }
    }

    public void b() {
        java.lang.String controllerConfig = com.ironsource.sdk.utils.SDKUtils.getControllerConfig();
        if (android.text.TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f6499a.a(com.ironsource.M6.i, new org.json.JSONObject(controllerConfig).opt(com.ironsource.X3.a.q));
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c() {
        this.f6499a.a("uxt", java.lang.Boolean.valueOf(com.ironsource.sdk.utils.IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f6499a.a(com.ironsource.M6.V, "9.4.0");
    }

    public void e() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.M6.E, com.ironsource.Fc.f);
        hashMap.put(com.ironsource.M6.D, com.ironsource.Fc.e);
        this.f6499a.a(hashMap);
    }

    public void a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(com.ironsource.sdk.utils.IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f6499a.a("debug", jSONObject);
        }
    }

    public void a(org.json.JSONObject jSONObject) {
        this.f6499a.a(com.ironsource.M6.l, jSONObject);
    }

    public void b(android.content.Context context) {
        this.f6499a.a("gpi", java.lang.Boolean.valueOf(com.ironsource.C2974bd.e(context)));
    }

    public void a(com.ironsource.C3202o8.c cVar) {
        this.f6499a.a(com.ironsource.M6.A1, java.lang.Integer.valueOf(cVar.ordinal()));
    }

    public void a(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        for (java.util.Map.Entry<java.lang.String, org.json.JSONObject> entry : map.entrySet()) {
            this.f6499a.a(entry.getKey(), (java.lang.Object) entry.getValue());
        }
    }

    public void a(java.util.List<java.lang.String> list) {
        this.f6499a.a(com.ironsource.M6.D1, list);
    }

    public void a(boolean z) {
        this.f6499a.a(com.ironsource.M6.U0, java.lang.Boolean.valueOf(z));
    }
}
