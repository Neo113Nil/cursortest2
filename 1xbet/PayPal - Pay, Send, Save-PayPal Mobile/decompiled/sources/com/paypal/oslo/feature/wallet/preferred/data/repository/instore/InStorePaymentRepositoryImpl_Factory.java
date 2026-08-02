package com.paypal.oslo.feature.wallet.preferred.data.repository.instore;

/* loaded from: classes16.dex */
public final class InStorePaymentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private InStorePaymentRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl(apolloClient);
    }
}
