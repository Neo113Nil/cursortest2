package com.paypal.oslo.feature.cashin.data.repository;

/* loaded from: classes11.dex */
public final class CashInRetailerRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInRetailerMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private CashInRetailerRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInRetailerMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.data.mapper.CashInRetailerMapper> provider2) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.cashin.data.mapper.CashInRetailerMapper cashInRetailerMapper) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl(apolloClient, cashInRetailerMapper);
    }
}
