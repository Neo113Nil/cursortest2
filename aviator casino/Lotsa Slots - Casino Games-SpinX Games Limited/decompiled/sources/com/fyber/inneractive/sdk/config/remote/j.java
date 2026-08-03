package com.fyber.inneractive.sdk.config.remote;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f3634a;
    public java.lang.Integer b;
    public java.lang.Integer c;
    public com.fyber.inneractive.sdk.config.enums.Skip d;
    public java.lang.Boolean e;
    public com.fyber.inneractive.sdk.config.enums.TapAction f;
    public com.fyber.inneractive.sdk.config.enums.Orientation g;
    public java.lang.Integer h;
    public java.lang.Integer i;
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType j;
    public final java.util.ArrayList k = new java.util.ArrayList();

    public static com.fyber.inneractive.sdk.config.remote.j a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.fyber.inneractive.sdk.config.remote.j jVar = new com.fyber.inneractive.sdk.config.remote.j();
        int optInt = jSONObject.optInt("maxBitrate", Integer.MIN_VALUE);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt("minBitrate", Integer.MIN_VALUE);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(optInt2);
        int optInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(optInt3);
        int optInt4 = jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.PADDING, Integer.MIN_VALUE);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(optInt4);
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.b = valueOf;
        if (optInt2 == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.c = valueOf2;
        jVar.d = com.fyber.inneractive.sdk.config.enums.Skip.fromValue(java.lang.Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.e = jSONObject.has("muted") ? java.lang.Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f3634a = jSONObject.has("autoPlay") ? java.lang.Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.g = com.fyber.inneractive.sdk.config.enums.Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f = com.fyber.inneractive.sdk.config.enums.TapAction.fromValue(jSONObject.optString("tap"));
        if (optInt3 == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        jVar.h = valueOf3;
        jVar.i = optInt4 != Integer.MIN_VALUE ? valueOf4 : null;
        jVar.j = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt5 = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt5 != Integer.MIN_VALUE) {
                    jVar.k.add(java.lang.Integer.valueOf(optInt5));
                }
            }
        }
        return jVar;
    }
}
