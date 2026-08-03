package com.fyber.inneractive.sdk.response.nativead.parser;

/* loaded from: classes3.dex */
public abstract class a {
    public static java.util.ArrayList a(org.json.JSONArray jSONArray) {
        com.fyber.inneractive.sdk.response.nativead.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null || optJSONObject.names() == null) {
                    gVar = null;
                } else {
                    gVar = new com.fyber.inneractive.sdk.response.nativead.g();
                    gVar.f4259a = optJSONObject.optInt(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                    gVar.b = optJSONObject.optInt("method");
                    gVar.c = com.fyber.inneractive.sdk.util.v.a(optJSONObject, "url");
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("customdata");
                    java.util.HashMap hashMap = gVar.d;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    if (optJSONObject2 != null) {
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        org.json.JSONArray names = optJSONObject2.names();
                        if (names != null && names.length() != 0) {
                            for (int i2 = 0; i2 < names.length(); i2++) {
                                java.lang.String optString = names.optString(i2);
                                if (optString != null && !optString.isEmpty() && !optJSONObject2.isNull(optString)) {
                                    java.lang.String optString2 = optJSONObject2.optString(optString);
                                    if (!optString2.isEmpty()) {
                                        hashMap3.put(optString, optString2);
                                    }
                                }
                            }
                        }
                        hashMap2.putAll(hashMap3);
                    }
                    hashMap.putAll(hashMap2);
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }
}
