package com.paypal.oslo.feature.balance.data.repository.autoreload;

/* loaded from: classes11.dex */
public final class FetchDepositOptionsCall_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private FetchDepositOptionsCall_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall(apolloClient);
    }
}
