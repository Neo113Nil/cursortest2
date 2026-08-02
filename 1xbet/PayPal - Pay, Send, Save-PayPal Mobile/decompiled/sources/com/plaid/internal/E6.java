package com.plaid.internal;

/* loaded from: classes16.dex */
public final class E6 {
    public static java.util.HashMap a(java.lang.String str) {
        java.lang.String str2;
        if (str == null || (str2 = (java.lang.String) com.plaid.internal.AbstractC0663v1.b(str).get("pfcfg")) == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(str2, 8)));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            return hashMap;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
