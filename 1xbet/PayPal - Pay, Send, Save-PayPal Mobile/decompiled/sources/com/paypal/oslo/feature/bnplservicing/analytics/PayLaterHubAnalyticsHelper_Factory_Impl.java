package com.paypal.oslo.feature.bnplservicing.analytics;

/* loaded from: classes11.dex */
public final class PayLaterHubAnalyticsHelper_Factory_Impl implements com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory {
    private final com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory Camera2StreamConfigurationMap;

    private PayLaterHubAnalyticsHelper_Factory_Impl(com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory c0308PayLaterHubAnalyticsHelper_Factory) {
        this.Camera2StreamConfigurationMap = c0308PayLaterHubAnalyticsHelper_Factory;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory
    public final com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper create(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory> create(com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory c0308PayLaterHubAnalyticsHelper_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper_Factory_Impl(c0308PayLaterHubAnalyticsHelper_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory> createFactoryProvider(com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory c0308PayLaterHubAnalyticsHelper_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper_Factory_Impl(c0308PayLaterHubAnalyticsHelper_Factory));
    }
}
