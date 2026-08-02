package com.paypal.oslo.feature.wallet.banks.data.repository;

/* loaded from: classes15.dex */
public final class OpenBankingAggregatorRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private OpenBankingAggregatorRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl(apolloClient);
    }
}
