package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0380gb {
    public static java.lang.String a(java.util.HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        return hashMap.isEmpty() ? "" : b(hashMap);
    }

    public static java.lang.String b(java.util.Map map) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(map)) {
            return null;
        }
        return new org.json.JSONObject(map).toString();
    }

    public static java.util.HashMap c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!org.json.JSONObject.NULL.equals(jSONObject)) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            }
            return hashMap;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.util.HashMap d(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!org.json.JSONObject.NULL.equals(jSONObject)) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    public static io.appmetrica.analytics.coreapi.internal.model.ScreenInfo e(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return new io.appmetrica.analytics.coreapi.internal.model.ScreenInfo(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.util.ArrayList b(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        arrayList.add(jSONArray.getString(i2));
                    } catch (java.lang.Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (java.lang.Throwable unused2) {
            }
        }
        return null;
    }

    public static java.util.HashMap a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new java.util.HashMap();
        }
        return c(str);
    }

    public static java.lang.Integer a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return java.lang.Integer.valueOf(jSONObject.getInt(str));
        } catch (java.lang.Throwable unused) {
            return num;
        }
    }

    public static java.util.ArrayList a(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static java.lang.String a(io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo) {
        org.json.JSONObject jSONObject;
        if (screenInfo == null) {
            jSONObject = null;
        } else {
            jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("width", screenInfo.getWidth()).put("height", screenInfo.getHeight()).put("dpi", screenInfo.getDpi()).put("scaleFactor", screenInfo.getScaleFactor());
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public static java.lang.String a(java.util.Map map) {
        if (map == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.util.List list = (java.util.List) entry.getValue();
                org.json.JSONArray jSONArray = io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list) ? null : new org.json.JSONArray((java.util.Collection) list);
                if (jSONArray != null) {
                    jSONObject.put((java.lang.String) entry.getKey(), jSONArray.toString());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject.toString();
    }
}
