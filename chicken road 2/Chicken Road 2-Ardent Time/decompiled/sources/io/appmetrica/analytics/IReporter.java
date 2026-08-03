package io.appmetrica.analytics;

/* loaded from: classes.dex */
public interface IReporter {
    void clearAppEnvironment();

    io.appmetrica.analytics.plugins.IPluginReporter getPluginExtension();

    void pauseSession();

    void putAppEnvironmentValue(java.lang.String str, java.lang.String str2);

    void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue);

    void reportAnr(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map);

    void reportECommerce(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent);

    void reportError(java.lang.String str, java.lang.String str2);

    void reportError(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    void reportError(java.lang.String str, java.lang.Throwable th);

    void reportEvent(java.lang.String str);

    void reportEvent(java.lang.String str, java.lang.String str2);

    void reportEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map);

    void reportRevenue(io.appmetrica.analytics.Revenue revenue);

    void reportUnhandledException(java.lang.Throwable th);

    void reportUserProfile(io.appmetrica.analytics.profile.UserProfile userProfile);

    void resumeSession();

    void sendEventsBuffer();

    void setDataSendingEnabled(boolean z2);

    void setUserProfileID(java.lang.String str);
}
