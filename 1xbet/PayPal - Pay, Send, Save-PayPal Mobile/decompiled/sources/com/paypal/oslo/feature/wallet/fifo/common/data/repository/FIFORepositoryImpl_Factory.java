package com.paypal.oslo.feature.wallet.fifo.common.data.repository;

/* loaded from: classes15.dex */
public final class FIFORepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private FIFORepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl(apolloClient);
    }
}
