package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class InitializeNativeRypCheckoutRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> getHighSpeedVideoSizesFor;

    private InitializeNativeRypCheckoutRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoSizesFor = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider6) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser initializeNativeRypCheckoutParser, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl(apolloClient, localeProvider, callErrorMapper, coroutineDispatcher, initializeNativeRypCheckoutParser, checkoutLogger);
    }
}
