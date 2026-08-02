package com.paypal.oslo.feature.subscriptions.analytics.di;

/* loaded from: classes15.dex */
public final class AnalyticsModule_ProvideAnalyticsScreenProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider get() {
        return provideAnalyticsScreenProvider();
    }

    public static com.paypal.oslo.feature.subscriptions.analytics.di.AnalyticsModule_ProvideAnalyticsScreenProviderFactory create() {
        return com.paypal.oslo.feature.subscriptions.analytics.di.AnalyticsModule_ProvideAnalyticsScreenProviderFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider provideAnalyticsScreenProvider() {
        return (com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.analytics.di.AnalyticsModule.INSTANCE.provideAnalyticsScreenProvider());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.analytics.di.AnalyticsModule_ProvideAnalyticsScreenProviderFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.subscriptions.analytics.di.AnalyticsModule_ProvideAnalyticsScreenProviderFactory();

        private InstanceHolder() {
        }
    }
}
