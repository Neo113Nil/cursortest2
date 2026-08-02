package com.paypal.oslo.feature.cryptocurrency.data.repository.funding;

/* loaded from: classes12.dex */
public final class CryptoFundingRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private CryptoFundingRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl(apolloClient);
    }
}
