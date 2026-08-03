package io.appmetrica.analytics.coreutils.internal.parsing;

/* loaded from: classes.dex */
public final class RemoteConfigJsonUtils {
    public static final io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    public static final boolean extractFeature(org.json.JSONObject jSONObject, java.lang.String str, boolean z2) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        try {
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("features");
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("list")) != null && (optJSONObject2 = optJSONObject.optJSONObject(str)) != null) {
                return optJSONObject2.optBoolean("enabled", z2);
            }
        } catch (java.lang.Throwable unused) {
        }
        return z2;
    }

    public static final byte[][] extractHosts(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        org.json.JSONArray optJSONArray;
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("query_hosts");
        if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("list")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null || (optJSONArray = optJSONObject2.optJSONArray("urls")) == null) {
            return new byte[0][];
        }
        int length = optJSONArray.length();
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = optJSONArray.optString(i2).getBytes(y1.a.f8486a);
        }
        return bArr;
    }

    public static final long extractMillisFromSecondsOrDefault(org.json.JSONObject jSONObject, java.lang.String str, long j2) {
        return extractMillisOrDefault(jSONObject, str, java.util.concurrent.TimeUnit.SECONDS, j2);
    }

    public static final long extractMillisOrDefault(org.json.JSONObject jSONObject, java.lang.String str, java.util.concurrent.TimeUnit timeUnit, long j2) {
        return io.appmetrica.analytics.coreutils.internal.WrapUtils.getMillisOrDefault(io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrNull(jSONObject, str), timeUnit, j2);
    }

    public static final java.lang.String extractQuery(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        try {
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("queries");
            if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("list")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null) {
                return null;
            }
            io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils remoteConfigJsonUtils = INSTANCE;
            java.lang.String optString = optJSONObject2.optString("url", "");
            remoteConfigJsonUtils.getClass();
            if (kotlin.jvm.internal.i.a(optString, "")) {
                return null;
            }
            return optString;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
