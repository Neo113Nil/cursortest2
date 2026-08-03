package com.ironsource;

/* renamed from: com.ironsource.ha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3079ha {
    public static boolean a(java.lang.String str) {
        try {
            new org.json.JSONObject(str);
            return true;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    public static java.util.List<java.lang.String> b(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static org.json.JSONObject a(org.json.JSONObject... jSONObjectArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (jSONObjectArr != null) {
            for (org.json.JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        try {
                            jSONObject.put(next, jSONObject2.get(next));
                        } catch (org.json.JSONException e) {
                            com.ironsource.C3180n4.d().a(e);
                            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof org.json.JSONArray) || (obj instanceof org.json.JSONObject) || obj.equals(org.json.JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof java.util.Collection) {
                return new org.json.JSONArray((java.util.Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new org.json.JSONArray((java.util.Collection) java.util.Arrays.asList(obj));
            }
            if (obj instanceof java.util.Map) {
                return new org.json.JSONObject((java.util.Map) obj);
            }
            if (!(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.String)) {
                if (obj instanceof java.lang.Enum) {
                    return obj.toString();
                }
                return obj.getClass().getPackage().getName().startsWith("java.") ? obj.toString() : obj;
            }
            return obj;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object> a(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            try {
                hashMap.put(next, a(jSONObject.get(next)));
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(java.lang.String.format("Could not put value in map: %s, %s", next, e.getMessage()));
            }
        }
        return hashMap;
    }

    public static java.util.List<java.lang.Object> a(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(a(jSONArray.get(i)));
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(java.lang.String.format("Could not put value into list: %s", e.getMessage()));
            }
        }
        return arrayList;
    }

    private static java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof org.json.JSONObject) {
            return a((org.json.JSONObject) obj);
        }
        return obj instanceof org.json.JSONArray ? a((org.json.JSONArray) obj) : obj;
    }

    public static org.json.JSONObject a(java.util.Map<java.lang.String, java.lang.Object> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), b(entry.getValue()));
                } catch (org.json.JSONException e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(java.lang.String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }
}
