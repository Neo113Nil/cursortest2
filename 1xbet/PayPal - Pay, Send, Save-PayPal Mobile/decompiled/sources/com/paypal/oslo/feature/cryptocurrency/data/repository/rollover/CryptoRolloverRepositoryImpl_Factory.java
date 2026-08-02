package com.paypal.oslo.feature.cryptocurrency.data.repository.rollover;

/* loaded from: classes12.dex */
public final class CryptoRolloverRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private CryptoRolloverRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl(apolloClient);
    }
}
