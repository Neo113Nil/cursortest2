package com.ironsource;

/* renamed from: com.ironsource.e1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3016e1 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.mediationsdk.model.NetworkSettings f6208a;
    private org.json.JSONObject b;
    private com.ironsource.mediationsdk.IronSource.a c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public C3016e1(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.a aVar) {
        this.f6208a = networkSettings;
        this.b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f = optInt;
        this.d = optInt == 2;
        this.e = jSONObject.optBoolean(com.ironsource.mediationsdk.utils.IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.c = aVar;
    }

    public java.lang.String a() {
        return this.f6208a.getAdSourceNameForEvents();
    }

    public com.ironsource.mediationsdk.IronSource.a b() {
        return this.c;
    }

    public org.json.JSONObject c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public java.lang.String f() {
        return this.f6208a.getProviderName();
    }

    public java.lang.String g() {
        return this.f6208a.getProviderTypeForReflection();
    }

    public com.ironsource.mediationsdk.model.NetworkSettings h() {
        return this.f6208a;
    }

    public java.lang.String i() {
        return this.f6208a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
