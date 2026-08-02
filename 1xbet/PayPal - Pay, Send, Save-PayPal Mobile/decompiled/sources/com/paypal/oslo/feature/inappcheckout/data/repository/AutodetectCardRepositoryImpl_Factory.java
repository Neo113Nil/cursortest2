package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class AutodetectCardRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.AutodetectCardsEntityMapper> getHighSpeedVideoSizes;

    private AutodetectCardRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.AutodetectCardsEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.AutodetectCardsEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.AutodetectCardsEntityMapper autodetectCardsEntityMapper, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl(apolloClient, callErrorMapper, autodetectCardsEntityMapper, localeProvider, coroutineDispatcher);
    }
}
