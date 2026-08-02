package com.paypal.oslo.feature.cashin.data.repository;

/* loaded from: classes11.dex */
public final class CashInStoresRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInStoresMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private CashInStoresRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInStoresMapper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInStoresMapper> provider2) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.cashin.data.mapper.CashInStoresMapper cashInStoresMapper) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl(apolloClient, cashInStoresMapper);
    }
}
