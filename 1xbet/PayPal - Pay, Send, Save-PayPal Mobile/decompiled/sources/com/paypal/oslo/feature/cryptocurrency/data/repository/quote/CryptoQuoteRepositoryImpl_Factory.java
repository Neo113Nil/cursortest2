package com.paypal.oslo.feature.cryptocurrency.data.repository.quote;

/* loaded from: classes12.dex */
public final class CryptoQuoteRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private CryptoQuoteRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl(apolloClient);
    }
}
