package com.paypal.oslo.feature.balance.data.repository.autoreload;

/* loaded from: classes11.dex */
public final class FetchAutoReloadConfigCall_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private FetchAutoReloadConfigCall_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall(apolloClient);
    }
}
