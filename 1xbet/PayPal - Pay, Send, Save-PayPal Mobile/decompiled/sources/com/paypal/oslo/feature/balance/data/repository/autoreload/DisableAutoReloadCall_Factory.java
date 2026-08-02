package com.paypal.oslo.feature.balance.data.repository.autoreload;

/* loaded from: classes11.dex */
public final class DisableAutoReloadCall_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private DisableAutoReloadCall_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall(apolloClient);
    }
}
