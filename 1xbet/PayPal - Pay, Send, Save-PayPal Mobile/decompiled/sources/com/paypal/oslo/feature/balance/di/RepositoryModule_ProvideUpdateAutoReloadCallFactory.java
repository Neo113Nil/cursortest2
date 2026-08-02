package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideUpdateAutoReloadCallFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideUpdateAutoReloadCallFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall get() {
        return provideUpdateAutoReloadCall(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideUpdateAutoReloadCallFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideUpdateAutoReloadCallFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall provideUpdateAutoReloadCall(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideUpdateAutoReloadCall(apolloClient));
    }
}
