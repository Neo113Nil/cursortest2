package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class CheckoutUrlRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private CheckoutUrlRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager dynamicConfigurationManager, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl(apolloClient, dynamicConfigurationManager, checkoutLogger, analyticsTracer);
    }
}
