package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3620a = new java.util.HashMap();

    public m() {
    }

    public m(org.json.JSONObject jSONObject) {
        org.json.JSONArray names;
        org.json.JSONArray names2 = jSONObject.names();
        for (int i = 0; i < names2.length(); i++) {
            java.lang.String optString = names2.optString(i, null);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(optString);
            com.fyber.inneractive.sdk.config.l lVar = new com.fyber.inneractive.sdk.config.l();
            if (optJSONObject != null && (names = optJSONObject.names()) != null) {
                for (int i2 = 0; i2 < names.length(); i2++) {
                    java.lang.String optString2 = names.optString(i2, null);
                    java.lang.String optString3 = optJSONObject.optString(optString2, null);
                    if (optString2 != null && optString3 != null) {
                        lVar.f3618a.put(optString2, optString3);
                    }
                }
            }
            this.f3620a.put(optString, lVar);
        }
    }
}
