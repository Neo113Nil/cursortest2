package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class AuthRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> getHighSpeedVideoFpsRangesFor;

    private AuthRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl newInstance(com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange, com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider identityCheckoutDataProvider, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl(tokenToCodeExchange, identityCheckoutDataProvider, checkoutLogger, analyticsTracer);
    }
}
