package com.adobe.marketing.mobile.util;

/* loaded from: classes7.dex */
public final class JSONUtils {
    private JSONUtils() {
    }

    public static boolean isNullOrEmpty(org.json.JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static boolean isNullOrEmpty(org.json.JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> toMap(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (jSONObject == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, getHighResolutionOutputSizeshNQ4ISI(jSONObject.get(next)));
        }
        return hashMap;
    }

    public static java.util.List<java.lang.Object> toList(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(jSONArray.get(i)));
        }
        return arrayList;
    }

    private static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) throws org.json.JSONException {
        if (obj == null || obj == org.json.JSONObject.NULL) {
            return null;
        }
        if (obj instanceof org.json.JSONObject) {
            return toMap((org.json.JSONObject) obj);
        }
        return obj instanceof org.json.JSONArray ? toList((org.json.JSONArray) obj) : obj;
    }
}
