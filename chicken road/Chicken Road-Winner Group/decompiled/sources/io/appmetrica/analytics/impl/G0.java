package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class G0 {
    public static String a(F0 f0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", f0.f5920a).put("packageName", f0.f5921b).put("reporterType", f0.f5922c.getStringValue()).put("processID", f0.f5923d).put("processSessionID", f0.f5924e).put("errorEnvironment", f0.f).toString().getBytes(v2.a.f10417a), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static F0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), v2.a.f10417a));
            return new F0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
