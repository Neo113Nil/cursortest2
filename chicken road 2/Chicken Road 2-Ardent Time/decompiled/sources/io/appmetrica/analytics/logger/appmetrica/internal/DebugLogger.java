package io.appmetrica.analytics.logger.appmetrica.internal;

/* loaded from: classes.dex */
public final class DebugLogger extends io.appmetrica.analytics.logger.common.BaseDebugLogger {
    public static final io.appmetrica.analytics.logger.appmetrica.internal.DebugLogger INSTANCE = new io.appmetrica.analytics.logger.appmetrica.internal.DebugLogger();

    private DebugLogger() {
        super("AppMetricaDebug");
    }

    public final void dumpJson(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String str2;
        try {
            str2 = jSONObject.toString(2);
        } catch (java.lang.Throwable unused) {
            str2 = "Exception during dumping JSONObject";
        }
        info(str, str2, new java.lang.Object[0]);
    }
}
