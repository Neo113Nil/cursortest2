package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I0 {
    public static java.lang.String a(io.appmetrica.analytics.impl.H0 h02) {
        try {
            return android.util.Base64.encodeToString(new org.json.JSONObject().put("apiKey", h02.f4360a).put("packageName", h02.f4361b).put("reporterType", h02.f4362c.getStringValue()).put("processID", h02.f4363d).put("processSessionID", h02.f4364e).put("errorEnvironment", h02.f4365f).toString().getBytes(y1.a.f8486a), 0);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static io.appmetrica.analytics.impl.H0 a(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(str, 0), y1.a.f8486a));
            return new io.appmetrica.analytics.impl.H0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), io.appmetrica.analytics.internal.CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
