package com.paypal.oslo.feature.balance.data.repository.balance;

/* loaded from: classes11.dex */
public final class BalanceRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private BalanceRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl(apolloClient);
    }
}
