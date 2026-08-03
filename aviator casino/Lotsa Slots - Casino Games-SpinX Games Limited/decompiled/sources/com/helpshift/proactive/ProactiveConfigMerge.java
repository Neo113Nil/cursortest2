package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveConfigMerge {
    private static final java.lang.String TAG = "ProactivConfigMerge";

    public static org.json.JSONObject mergeProactiveConfig(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (!jSONObject2.has(next)) {
                    jSONObject2.put(next, obj);
                } else {
                    java.lang.Object obj2 = jSONObject2.get(next);
                    if ((obj instanceof org.json.JSONArray) && (obj2 instanceof org.json.JSONArray)) {
                        jSONObject2.put(next, mergeJsonArrays((org.json.JSONArray) obj, (org.json.JSONArray) obj2));
                    } else if ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) {
                        jSONObject2.put(next, mergeJsonObjects((org.json.JSONObject) obj, (org.json.JSONObject) obj2));
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Proactive Config merge failed", e);
        }
        return jSONObject2;
    }

    private static org.json.JSONArray mergeJsonArrays(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) throws org.json.JSONException {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < jSONArray2.length(); i++) {
            hashSet.add(jSONArray2.get(i));
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            hashSet.add(jSONArray.get(i2));
        }
        return new org.json.JSONArray((java.util.Collection) hashSet);
    }

    private static org.json.JSONObject mergeJsonObjects(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!jSONObject2.has(next)) {
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        return jSONObject2;
    }

    private ProactiveConfigMerge() {
    }
}
