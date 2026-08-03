package com.ironsource;

/* loaded from: classes5.dex */
public class P6 {

    /* renamed from: a, reason: collision with root package name */
    private static com.ironsource.P6 f5921a = new com.ironsource.P6();

    public static com.ironsource.P6 a() {
        return f5921a;
    }

    public static org.json.JSONObject b(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object opt = jSONObject.opt(next);
                if (opt instanceof java.util.List) {
                    jSONObject.put(next, android.text.TextUtils.join(",", (java.util.List) opt));
                }
            }
        }
        return jSONObject;
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> a(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> concurrentHashMap) throws org.json.JSONException {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof org.json.JSONObject) {
                hashMap.put(entry.getKey(), a((org.json.JSONObject) entry.getValue()));
            } else if (entry.getValue() instanceof org.json.JSONArray) {
                hashMap.put(entry.getKey(), a((org.json.JSONArray) entry.getValue()));
            } else if (entry.getValue() instanceof java.util.Map) {
                hashMap.put(entry.getKey(), a((java.util.Map<java.lang.String, java.lang.Object>) entry.getValue()));
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }

    public static org.json.JSONArray a(org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : map.keySet()) {
            hashMap.put(str, map.get(str));
        }
        return hashMap;
    }
}
