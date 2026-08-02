package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class EConsentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private EConsentRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl(apolloClient, coroutineDispatcher, callErrorMapper);
    }
}
