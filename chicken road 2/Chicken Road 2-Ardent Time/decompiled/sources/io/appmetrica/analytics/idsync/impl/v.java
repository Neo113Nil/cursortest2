package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class v {
    public static java.lang.String a(io.appmetrica.analytics.idsync.impl.D d2) {
        java.lang.String encodeToString;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", d2.f3884a);
        jSONObject.put("url", d2.f3886c);
        jSONObject.put("responseCode", d2.f3888e);
        byte[] bArr = d2.f3889f;
        try {
            encodeToString = new java.lang.String(bArr, y1.a.f8486a);
        } catch (java.lang.Throwable unused) {
            encodeToString = android.util.Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", encodeToString);
        java.util.Map map = d2.f3890g;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((java.lang.String) entry.getKey(), new org.json.JSONArray((java.util.Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
