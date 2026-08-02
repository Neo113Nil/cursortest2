package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class FundingSelectionApiRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getOutputMinFrameDuration;

    private FundingSelectionApiRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider7) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getInputFormats = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getInputFormats.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider7) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl(apolloClient, appSwitchSession, fundingSelectionEntityMapper, callErrorMapper, localeProvider, coroutineDispatcher, checkoutLogger);
    }
}
