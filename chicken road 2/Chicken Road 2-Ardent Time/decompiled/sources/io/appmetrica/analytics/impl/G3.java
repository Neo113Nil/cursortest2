package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C7 f4319a = new io.appmetrica.analytics.impl.C7();

    public static android.location.Location b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            android.location.Location location = new android.location.Location(jSONObject.has("provider") ? jSONObject.optString("provider") : null);
            location.setLongitude(jSONObject.getDouble("lng"));
            location.setLatitude(jSONObject.getDouble("lat"));
            location.setTime(jSONObject.optLong("time"));
            location.setAccuracy((float) jSONObject.optDouble("accuracy"));
            location.setAltitude((float) jSONObject.optDouble("alt"));
            return location;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static io.appmetrica.analytics.PreloadInfo c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        io.appmetrica.analytics.PreloadInfo.Builder newBuilder = io.appmetrica.analytics.PreloadInfo.newBuilder(jSONObject.has("trackid") ? jSONObject.optString("trackid") : null);
        java.util.HashMap c2 = io.appmetrica.analytics.impl.AbstractC0380gb.c(jSONObject.optString("params"));
        if (c2 != null && c2.size() > 0) {
            for (java.util.Map.Entry entry : c2.entrySet()) {
                newBuilder.setAdditionalParams((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        return newBuilder.build();
    }

    public final io.appmetrica.analytics.AppMetricaConfig.Builder a(java.lang.String str) {
        java.util.HashMap c2;
        java.util.HashMap c3;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            io.appmetrica.analytics.AppMetricaConfig.Builder newConfigBuilder = io.appmetrica.analytics.AppMetricaConfig.newConfigBuilder(jSONObject.getString("apikey"));
            if (jSONObject.has("app_version")) {
                newConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
            }
            if (jSONObject.has("session_timeout")) {
                newConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
            }
            newConfigBuilder.withLocation(b(jSONObject.optString("location")));
            newConfigBuilder.withPreloadInfo(c(jSONObject.optString("preload_info")));
            if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                newConfigBuilder.withLogs();
            }
            if (jSONObject.has("crash_enabled")) {
                newConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
            }
            if (jSONObject.has("crash_native_enabled")) {
                newConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
            }
            if (jSONObject.has("location_enabled")) {
                newConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
            }
            if (jSONObject.has("adv_identifiers_tracking")) {
                newConfigBuilder.withAdvIdentifiersTracking(jSONObject.optBoolean("adv_identifiers_tracking", true));
            }
            if (jSONObject.has("max_reports_in_db_count")) {
                newConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
            }
            if (jSONObject.has("error_environment") && (c3 = io.appmetrica.analytics.impl.AbstractC0380gb.c(jSONObject.optString("error_environment"))) != null) {
                for (java.util.Map.Entry entry : c3.entrySet()) {
                    newConfigBuilder.withErrorEnvironmentValue((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
            if (jSONObject.has("first_activation_as_update")) {
                newConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
            }
            if (jSONObject.has("data_sending_enabled")) {
                newConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
            }
            if (jSONObject.has("user_profile_id")) {
                try {
                    newConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
                } catch (java.lang.Throwable unused) {
                    return null;
                }
            }
            if (jSONObject.has("revenue_auto_tracking_enabled")) {
                newConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
            }
            if (jSONObject.has("sessions_auto_tracking_enabled")) {
                newConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
            }
            if (jSONObject.has("app_open_tracking_enabled")) {
                newConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
            }
            if (jSONObject.has(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_TYPE)) {
                newConfigBuilder.withDeviceType(jSONObject.optString(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_TYPE));
            }
            if (jSONObject.has(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_VERSION_CODE)) {
                newConfigBuilder.withAppBuildNumber(jSONObject.optInt(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_VERSION_CODE));
            }
            if (jSONObject.has("dispatch_period_seconds")) {
                newConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
            }
            if (jSONObject.has("max_reports_count")) {
                newConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
            }
            if (jSONObject.has("app_environment") && (c2 = io.appmetrica.analytics.impl.AbstractC0380gb.c(jSONObject.optString("app_environment"))) != null) {
                for (java.util.Map.Entry entry2 : c2.entrySet()) {
                    newConfigBuilder.withAppEnvironmentValue((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
                }
            }
            if (jSONObject.has("anr_monitoring")) {
                newConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
            }
            if (jSONObject.has("anr_monitoring_timeout")) {
                newConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
            }
            if (jSONObject.has("customHosts")) {
                newConfigBuilder.withCustomHosts(io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject.optJSONArray("customHosts")));
            }
            if (jSONObject.has("additional_config")) {
                try {
                    io.appmetrica.analytics.impl.C7 c7 = this.f4319a;
                    jSONObject.optJSONObject("additional_config");
                    c7.getClass();
                } catch (java.lang.Throwable unused2) {
                    return null;
                }
            }
            return newConfigBuilder;
        } catch (java.lang.Throwable unused3) {
        }
    }

    public static java.lang.String a(android.location.Location location) {
        if (location == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("provider", location.getProvider());
            jSONObject.put("time", location.getTime());
            jSONObject.put("accuracy", location.getAccuracy());
            jSONObject.put("alt", location.getAltitude());
            jSONObject.put("lng", location.getLongitude());
            jSONObject.put("lat", location.getLatitude());
            return jSONObject.toString();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
