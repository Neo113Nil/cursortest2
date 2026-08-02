package com.paypal.oslo.feature.balance.data.repository.autoreload;

/* loaded from: classes11.dex */
public final class CreateAutoReloadCall_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private CreateAutoReloadCall_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall(apolloClient);
    }
}
