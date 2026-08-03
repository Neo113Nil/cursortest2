package com.fyber.inneractive.sdk.config.remote;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f3635a;
    public java.lang.Integer b;
    public java.util.Set c = null;

    public static com.fyber.inneractive.sdk.config.remote.k a(org.json.JSONObject jSONObject) {
        com.fyber.inneractive.sdk.config.enums.Vendor fromValue;
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("pausePct", Integer.MIN_VALUE);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt("playPct", Integer.MIN_VALUE);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(optInt2);
        com.fyber.inneractive.sdk.config.remote.k kVar = new com.fyber.inneractive.sdk.config.remote.k();
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        kVar.f3635a = valueOf;
        if (optInt2 == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        kVar.b = valueOf2;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("vendor");
        if (optJSONArray != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                java.lang.String optString = optJSONArray.optString(i, null);
                if (!android.text.TextUtils.isEmpty(optString) && (fromValue = com.fyber.inneractive.sdk.config.enums.Vendor.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            kVar.c = linkedHashSet;
        }
        return kVar;
    }
}
