package com.ironsource;

/* renamed from: com.ironsource.ie, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3101ie {

    /* renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f6314a;

    public C3101ie() {
        this.f6314a = new org.json.JSONObject();
    }

    private void f(java.lang.String str) {
        try {
            this.f6314a = new org.json.JSONObject(str);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            this.f6314a = new org.json.JSONObject();
        }
    }

    public org.json.JSONObject a() {
        return this.f6314a;
    }

    public java.lang.Object b(java.lang.String str) {
        try {
            return a().get(str);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            return null;
        }
    }

    public boolean c(java.lang.String str) {
        return this.f6314a.optBoolean(str);
    }

    public java.lang.String d(java.lang.String str) {
        return this.f6314a.optString(str, null);
    }

    public boolean e(java.lang.String str) {
        return a().isNull(str);
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = this.f6314a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public boolean a(java.lang.String str) {
        return a().has(str);
    }

    public C3101ie(java.lang.String str) {
        f(str);
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        return this.f6314a.optString(str, str2);
    }

    public static java.lang.Object b(java.lang.Object obj) throws org.json.JSONException {
        if (obj instanceof java.util.Map) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.Map map = (java.util.Map) obj;
            for (java.lang.Object obj2 : map.keySet()) {
                if (obj2 != null) {
                    jSONObject.put(obj2.toString(), b(map.get(obj2)));
                }
            }
            return jSONObject;
        }
        if (!(obj instanceof java.lang.Iterable)) {
            return obj;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public int a(java.lang.String str, int i) {
        return this.f6314a.optInt(str, i);
    }

    public static boolean a(org.json.JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public java.util.List a(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            this.f6314a.put(str, jSONObject);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }

    private java.lang.Object a(java.lang.Object obj) throws org.json.JSONException {
        if (obj == org.json.JSONObject.NULL) {
            return null;
        }
        if (obj instanceof org.json.JSONObject) {
            return b((org.json.JSONObject) obj);
        }
        return obj instanceof org.json.JSONArray ? a((org.json.JSONArray) obj) : obj;
    }

    public void b(java.lang.String str, java.lang.String str2) {
        try {
            this.f6314a.put(str, str2);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }

    private java.util.Map<java.lang.String, java.lang.Object> b(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }
}
