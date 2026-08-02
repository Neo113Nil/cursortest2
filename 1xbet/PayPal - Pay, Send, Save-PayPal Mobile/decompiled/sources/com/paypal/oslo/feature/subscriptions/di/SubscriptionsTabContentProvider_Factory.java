package com.paypal.oslo.feature.subscriptions.di;

/* loaded from: classes15.dex */
public final class SubscriptionsTabContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> Camera2StreamConfigurationMap;

    private SubscriptionsTabContentProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider) {
        return new com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider newInstance(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        return new com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider(analyticsScreenProvider);
    }
}
