package com.helpshift.util;

/* loaded from: classes5.dex */
public class JsonUtils {
    private static final java.lang.String TAG = "JsonUtils";

    private JsonUtils() {
    }

    public static boolean isEmpty(org.json.JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean isEmpty(org.json.JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !isValidJsonString(str)) {
            return new java.util.HashMap();
        }
        try {
            return toMap(new org.json.JSONObject(str));
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in creating map from string json", e);
            return new java.util.HashMap();
        }
    }

    public static <K, V> java.lang.String mapToJsonString(java.util.Map<K, V> map) {
        if (map != null) {
            return new org.json.JSONObject(map).toString();
        }
        return "";
    }

    public static java.util.Map<java.lang.String, java.lang.String> jsonStringToStringMap(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !isValidJsonString(str)) {
            return new java.util.HashMap();
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in creating map from string json", e);
            return new java.util.HashMap();
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object> parseConfigDictionary(java.lang.String str) throws org.json.JSONException {
        return toMap(new org.json.JSONObject(str));
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> toMap(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, fromJson(jSONObject.get(next)));
        }
        return hashMap;
    }

    public static java.util.List<java.lang.Object> toList(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(fromJson(jSONArray.get(i)));
        }
        return arrayList;
    }

    private static java.lang.Object fromJson(java.lang.Object obj) throws org.json.JSONException {
        if (obj == org.json.JSONObject.NULL) {
            return null;
        }
        if (obj instanceof org.json.JSONObject) {
            return toMap((org.json.JSONObject) obj);
        }
        return obj instanceof org.json.JSONArray ? toList((org.json.JSONArray) obj) : obj;
    }

    public static org.json.JSONArray listOfMapToJSONArray(java.util.List<java.util.Map<java.lang.String, java.lang.String>> list) {
        if (list == null || list.size() == 0) {
            return new org.json.JSONArray();
        }
        return new org.json.JSONArray((java.util.Collection) list);
    }

    public static boolean isValidJsonString(java.lang.String str) {
        try {
            try {
                new org.json.JSONObject(str);
                return true;
            } catch (java.lang.Exception unused) {
                return false;
            }
        } catch (java.lang.Exception unused2) {
            new org.json.JSONArray(str);
            return true;
        }
    }

    public static <T> java.util.List<T> listFromJsonArrayString(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            return com.helpshift.util.Utils.isEmpty(str) ? arrayList : (java.util.List<T>) toList(new org.json.JSONArray(str));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting list for JsonArray string", e);
            return arrayList;
        }
    }

    public static <T> org.json.JSONArray jsonArrayFromList(java.util.List<T> list) {
        try {
            return new org.json.JSONArray((java.util.Collection) list);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting json array from list", e);
            return new org.json.JSONArray();
        }
    }
}
