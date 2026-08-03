package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578o2 {
    public static void a(io.appmetrica.analytics.impl.C0314dm c0314dm, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    java.lang.String optString = optJSONObject2.optString("key", null);
                    if (!android.text.TextUtils.isEmpty(optString)) {
                        java.lang.String optString2 = optJSONObject2.optString("value", null);
                        arrayList.add(new android.util.Pair(optString, optString2 != null ? new io.appmetrica.analytics.impl.C0500l2(optString2) : null));
                    }
                }
            }
            c0314dm.f5751s = new io.appmetrica.analytics.impl.C0526m2(arrayList);
        }
    }
}
