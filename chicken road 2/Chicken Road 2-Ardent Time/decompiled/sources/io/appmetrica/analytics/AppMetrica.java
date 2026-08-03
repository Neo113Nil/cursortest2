package io.appmetrica.analytics;

/* loaded from: classes.dex */
public final class AppMetrica {
    public static void activate(android.content.Context context, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(context, appMetricaConfig);
    }

    public static void activateReporter(android.content.Context context, io.appmetrica.analytics.ReporterConfig reporterConfig) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a();
    }

    public static void enableActivityAutoTracking(android.app.Application application) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(application);
    }

    public static java.lang.String getDeviceId(android.content.Context context) {
        return io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.b();
    }

    public static int getLibraryApiLevel() {
        return io.appmetrica.analytics.BuildConfig.API_LEVEL;
    }

    public static java.lang.String getLibraryVersion() {
        return "8.0.0";
    }

    public static io.appmetrica.analytics.plugins.AppMetricaPlugins getPluginExtension() {
        return io.appmetrica.analytics.impl.K0.f4523a;
    }

    public static io.appmetrica.analytics.IReporter getReporter(android.content.Context context, java.lang.String str) {
        return io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(context, str);
    }

    public static java.lang.String getUuid(android.content.Context context) {
        return io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(context).id;
    }

    public static void initWebViewReporting(android.webkit.WebView webView) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(webView);
    }

    public static void pauseSession(android.app.Activity activity) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(activity);
    }

    public static void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.b(str, str2);
    }

    public static void registerAnrListener(io.appmetrica.analytics.AnrListener anrListener) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(anrListener);
    }

    public static void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(adRevenue);
    }

    public static void reportAnr(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(map);
    }

    public static void reportAppOpen(android.app.Activity activity) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.b(activity);
    }

    public static void reportECommerce(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(eCommerceEvent);
    }

    public static void reportError(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(str, str2, (java.lang.Throwable) null);
    }

    public static void reportEvent(java.lang.String str) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.b(str);
    }

    public static void reportExternalAdRevenue(java.lang.Object... objArr) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.b(objArr);
    }

    public static void reportExternalAttribution(io.appmetrica.analytics.ExternalAttribution externalAttribution) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(externalAttribution);
    }

    public static void reportRevenue(io.appmetrica.analytics.Revenue revenue) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(revenue);
    }

    public static void reportUnhandledException(java.lang.Throwable th) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(th);
    }

    public static void reportUserProfile(io.appmetrica.analytics.profile.UserProfile userProfile) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(userProfile);
    }

    public static void requestDeferredDeeplink(io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(android.content.Context context, io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List<java.lang.String> list) {
        io.appmetrica.analytics.impl.C0706t1 c0706t1 = io.appmetrica.analytics.impl.AbstractC0732u1.f6870a;
        if (list.isEmpty()) {
            list = java.util.Arrays.asList(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID, io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID, io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c0706t1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(android.app.Activity activity) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.c(activity);
    }

    public static void sendEventsBuffer() {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z2) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(z2);
    }

    public static void setDataSendingEnabled(boolean z2) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.b(z2);
    }

    public static void setLocation(android.location.Location location) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(location);
    }

    public static void setLocationTracking(boolean z2) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.c(z2);
    }

    public static void setUserProfileID(java.lang.String str) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.d(str);
    }

    public static void reportAppOpen(android.content.Intent intent) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(intent);
    }

    public static void reportError(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(str, str2, th);
    }

    public static void reportEvent(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.c(str, str2);
    }

    public static void reportAppOpen(java.lang.String str) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(str);
    }

    public static void reportError(java.lang.String str, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(str, th);
    }

    public static void reportEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.a(str, map);
    }
}
