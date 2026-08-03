package com.ironsource;

/* renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3184n8 implements com.ironsource.InterfaceC3166m8, com.ironsource.InterfaceC3166m8.a {

    /* renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f6493a = new org.json.JSONObject();
    private org.json.JSONObject b = new org.json.JSONObject();
    private org.json.JSONObject c = new org.json.JSONObject();

    private final java.lang.Object e(java.lang.String str) {
        if (this.c.has(str)) {
            return this.c.get(str);
        }
        if (this.b.has(str)) {
            return this.b.get(str);
        }
        if (this.f6493a.has(str)) {
            return this.f6493a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3166m8
    public org.json.JSONObject a(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object e = e(configKey);
        if (e instanceof org.json.JSONObject) {
            return (org.json.JSONObject) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3166m8
    public java.lang.Integer b(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object e = e(configKey);
        if (e instanceof java.lang.Integer) {
            return (java.lang.Integer) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3166m8
    public java.lang.Boolean c(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object e = e(configKey);
        if (e instanceof java.lang.Boolean) {
            return (java.lang.Boolean) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3166m8
    public java.lang.String d(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object e = e(configKey);
        if (e instanceof java.lang.String) {
            return (java.lang.String) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3166m8.a
    public void a(org.json.JSONObject controllerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.f6493a = controllerConfig;
        org.json.JSONObject optJSONObject = controllerConfig.optJSONObject(com.ironsource.X3.a.b);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        this.b = optJSONObject;
        org.json.JSONObject optJSONObject2 = this.f6493a.optJSONObject(com.ironsource.X3.a.c);
        if (optJSONObject2 == null) {
            optJSONObject2 = new org.json.JSONObject();
        }
        this.c = optJSONObject2;
    }
}
