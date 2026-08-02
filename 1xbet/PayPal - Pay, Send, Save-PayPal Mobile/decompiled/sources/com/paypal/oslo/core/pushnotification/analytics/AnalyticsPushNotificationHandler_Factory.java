package com.paypal.oslo.core.pushnotification.analytics;

/* loaded from: classes10.dex */
public final class AnalyticsPushNotificationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.push.PushTokenListener>> Camera2StreamConfigurationMap;

    private AnalyticsPushNotificationHandler_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.push.PushTokenListener>> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.push.PushTokenListener>> provider) {
        return new com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler_Factory(provider);
    }

    public static com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler newInstance(java.util.Set<com.paypal.oslo.core.telemetry.push.PushTokenListener> set) {
        return new com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler(set);
    }
}
