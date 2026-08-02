package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class BuyerInfoApiRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getOutputFormats;

    private BuyerInfoApiRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider6) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper buyerInfoEntityMapper, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl(apolloClient, buyerInfoEntityMapper, callErrorMapper, coroutineDispatcher, checkoutLogger, appSwitchSession);
    }
}
