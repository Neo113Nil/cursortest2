package com.fyber.inneractive.sdk.config.remote;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f3631a = null;

    public static com.fyber.inneractive.sdk.config.remote.f a(org.json.JSONObject jSONObject) {
        com.fyber.inneractive.sdk.config.enums.Track fromValue;
        com.fyber.inneractive.sdk.config.remote.f fVar = null;
        if (jSONObject == null) {
            return null;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("track");
        if (optJSONArray != null) {
            fVar = new com.fyber.inneractive.sdk.config.remote.f();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                java.lang.String optString = optJSONArray.optString(i);
                if (!android.text.TextUtils.isEmpty(optString) && (fromValue = com.fyber.inneractive.sdk.config.enums.Track.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            fVar.f3631a = linkedHashSet;
        }
        return fVar;
    }
}
