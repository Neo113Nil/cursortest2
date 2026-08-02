package com.paypal.oslo.feature.balance.data.repository.autoreload;

/* loaded from: classes11.dex */
public final class UpdateAutoReloadCall_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private UpdateAutoReloadCall_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall(apolloClient);
    }
}
