package com.fyber.inneractive.sdk.config.remote;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType f3629a;
    public java.lang.Boolean b;
    public java.lang.Integer c;
    public java.lang.Integer d;

    public static com.fyber.inneractive.sdk.config.remote.b a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.fyber.inneractive.sdk.config.remote.b bVar = new com.fyber.inneractive.sdk.config.remote.b();
        int optInt = jSONObject.optInt("hide", Integer.MIN_VALUE);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt("refresh", Integer.MIN_VALUE);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(optInt2);
        bVar.f3629a = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.b = jSONObject.has("close") ? java.lang.Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.d = valueOf;
        bVar.c = optInt2 != Integer.MIN_VALUE ? valueOf2 : null;
        return bVar;
    }
}
