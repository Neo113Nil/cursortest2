package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class l0 implements com.fyber.inneractive.sdk.util.b1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f3619a = null;
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType b;
    public java.lang.Boolean c;
    public java.lang.Integer d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "refresh", this.f3619a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "unitDisplayType", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "close", this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "hideDelay", this.d);
        return jSONObject;
    }
}
