package com.paypal.oslo.feature.cashin.data.repository;

/* loaded from: classes11.dex */
public final class CashInActivationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInActivationMapper> getHighSpeedVideoFpsRanges;

    private CashInActivationRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInActivationMapper> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInActivationMapper> provider2) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.cashin.data.mapper.CashInActivationMapper cashInActivationMapper) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl(apolloClient, cashInActivationMapper);
    }
}
