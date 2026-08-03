package com.ironsource;

/* loaded from: classes5.dex */
public final class O3 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3300u f5867a;
    private final com.ironsource.C3300u b;
    private final com.ironsource.T2 c;
    private final com.ironsource.Qb d;
    private final com.ironsource.B1 e;
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u> f;

    public O3(org.json.JSONObject configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        com.ironsource.C3300u c3300u = new com.ironsource.C3300u(a(configurations, "rewarded"));
        this.f5867a = c3300u;
        com.ironsource.C3300u c3300u2 = new com.ironsource.C3300u(a(configurations, "interstitial"));
        this.b = c3300u2;
        this.c = new com.ironsource.T2(a(configurations, "banner"));
        this.d = new com.ironsource.Qb(a(configurations, "nativeAd"));
        org.json.JSONObject optJSONObject = configurations.optJSONObject("application");
        this.e = new com.ironsource.B1(optJSONObject == null ? new org.json.JSONObject() : optJSONObject);
        this.f = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, c3300u2), kotlin.TuplesKt.to(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, c3300u));
    }

    public final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u> a() {
        return this.f;
    }

    public final com.ironsource.B1 b() {
        return this.e;
    }

    public final com.ironsource.T2 c() {
        return this.c;
    }

    public final com.ironsource.Qb d() {
        return this.d;
    }

    private final org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        org.json.JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? new org.json.JSONObject() : optJSONObject2;
    }
}
