package com.paypal.oslo.feature.wallet.fifo.transfer.data.repository;

/* loaded from: classes15.dex */
public final class WithdrawMoneyRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private WithdrawMoneyRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl(apolloClient);
    }
}
