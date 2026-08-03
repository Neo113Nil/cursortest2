package com.ironsource;

/* loaded from: classes5.dex */
public class K9 {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f5802a;
    private java.lang.String e;
    private java.util.Map<java.lang.String, java.lang.String> f;
    private final com.ironsource.Gc g;
    private boolean h;
    private boolean b = false;
    private boolean c = false;
    private com.ironsource.C3005d8 d = null;
    protected boolean i = false;
    protected java.lang.String j = null;

    public K9(java.lang.String str, com.ironsource.Gc gc) throws java.lang.NullPointerException {
        this.f5802a = com.ironsource.sdk.utils.SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (com.ironsource.Gc) com.ironsource.sdk.utils.SDKUtils.requireNonNull(gc, "AdListener name can't be null");
    }

    public com.ironsource.K9 a(boolean z) {
        this.c = z;
        return this;
    }

    public com.ironsource.K9 b(boolean z) {
        this.i = z;
        return this;
    }

    public com.ironsource.K9 c() {
        this.b = true;
        return this;
    }

    public com.ironsource.K9 a(com.ironsource.C3005d8 c3005d8) {
        this.d = c3005d8;
        return this;
    }

    public com.ironsource.K9 b(java.lang.String str) {
        this.j = str;
        return this;
    }

    public com.ironsource.K9 c(boolean z) {
        this.h = z;
        return this;
    }

    public com.ironsource.K9 a(java.lang.String str) {
        this.e = str;
        return this;
    }

    public java.lang.String b() {
        java.lang.String str = this.e;
        if (str != null) {
            return str;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", this.f5802a);
            jSONObject.put("rewarded", this.b);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return (this.c || this.h) ? com.ironsource.V9.a() : com.ironsource.V9.a(jSONObject);
    }

    public com.ironsource.K9 a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f = map;
        return this;
    }

    public com.ironsource.J9 a() {
        return new com.ironsource.J9(b(), this.f5802a, this.b, this.c, this.h, this.i, this.j, this.f, this.g, this.d);
    }
}
