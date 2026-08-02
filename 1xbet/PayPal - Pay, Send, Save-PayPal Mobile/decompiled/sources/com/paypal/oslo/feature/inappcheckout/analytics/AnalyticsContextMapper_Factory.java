package com.paypal.oslo.feature.inappcheckout.analytics;

/* loaded from: classes13.dex */
public final class AnalyticsContextMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> Camera2StreamConfigurationMap;

    private AnalyticsContextMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        return new com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return new com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper(appSwitchSession);
    }
}
