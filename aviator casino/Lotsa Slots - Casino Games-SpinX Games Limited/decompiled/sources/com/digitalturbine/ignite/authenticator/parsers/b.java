package com.digitalturbine.ignite.authenticator.parsers;

/* loaded from: classes2.dex */
public final class b {
    public static com.digitalturbine.ignite.authenticator.b a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : empty one dt", "OneDTParser");
            return new com.digitalturbine.ignite.authenticator.b("", -1L);
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("data");
            if (optJSONObject != null && "onedtid".equalsIgnoreCase(optJSONObject.optString("propertyName", ""))) {
                return new com.digitalturbine.ignite.authenticator.b(optJSONObject.optString("propertyValue", ""), optJSONObject.optLong("refreshTime", -1L));
            }
        } catch (java.lang.Exception e) {
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_PARSE_ERROR, e);
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : failed parse one dt", "OneDTParser");
        }
        return new com.digitalturbine.ignite.authenticator.b("", -1L);
    }
}
