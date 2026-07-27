package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class G0 {
    public static String a(F0 f02) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", f02.f6761a).put("packageName", f02.f6762b).put("reporterType", f02.f6763c.getStringValue()).put("processID", f02.f6764d).put("processSessionID", f02.f6765e).put("errorEnvironment", f02.f6766f).toString().getBytes(B4.a.f287a), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static F0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), B4.a.f287a));
            return new F0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
