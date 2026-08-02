package com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository;

/* loaded from: classes15.dex */
public final class AddMoneyRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private AddMoneyRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl(apolloClient);
    }
}
