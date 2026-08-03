package com.ironsource;

/* loaded from: classes5.dex */
public class V9 {

    /* renamed from: a, reason: collision with root package name */
    static java.lang.String f6024a = "ManRewInst_";

    public static java.lang.String a(org.json.JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f6024a + jSONObject.optString("name");
    }

    public static java.lang.String b() {
        return java.util.UUID.randomUUID().toString();
    }

    public static java.lang.String a() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    public static java.lang.String a(com.ironsource.J9 j9) {
        if (j9.i()) {
            return com.ironsource.C3202o8.e.Banner.toString();
        }
        if (j9.n()) {
            return com.ironsource.C3202o8.e.RewardedVideo.toString();
        }
        return com.ironsource.C3202o8.e.Interstitial.toString();
    }
}
