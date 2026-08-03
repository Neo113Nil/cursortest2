package com.ironsource;

/* loaded from: classes5.dex */
public final class B1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Fb f5621a;
    private final com.ironsource.I1 b;
    private final boolean c;
    private final com.ironsource.F1 d;
    private final com.ironsource.M1 e;
    private final com.ironsource.C3392z1 f;

    public B1(org.json.JSONObject applicationConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        org.json.JSONObject optJSONObject = applicationConfigurations.optJSONObject(com.ironsource.D1.f5664a);
        this.f5621a = new com.ironsource.Fb(optJSONObject == null ? new org.json.JSONObject() : optJSONObject);
        org.json.JSONObject optJSONObject2 = applicationConfigurations.optJSONObject("events");
        this.b = new com.ironsource.I1(optJSONObject2 == null ? new org.json.JSONObject() : optJSONObject2);
        this.c = applicationConfigurations.optBoolean(com.ironsource.D1.g, false);
        org.json.JSONObject optJSONObject3 = applicationConfigurations.optJSONObject(com.ironsource.D1.h);
        this.d = new com.ironsource.F1(optJSONObject3 == null ? new org.json.JSONObject() : optJSONObject3);
        org.json.JSONObject optJSONObject4 = applicationConfigurations.optJSONObject("settings");
        this.e = new com.ironsource.M1(optJSONObject4 == null ? new org.json.JSONObject() : optJSONObject4);
        org.json.JSONObject optJSONObject5 = applicationConfigurations.optJSONObject(com.ironsource.D1.f);
        this.f = new com.ironsource.C3392z1(optJSONObject5 == null ? new org.json.JSONObject() : optJSONObject5);
    }

    public final com.ironsource.C3392z1 a() {
        return this.f;
    }

    public final com.ironsource.F1 b() {
        return this.d;
    }

    public final com.ironsource.I1 c() {
        return this.b;
    }

    public final com.ironsource.M1 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public final com.ironsource.Fb f() {
        return this.f5621a;
    }
}
