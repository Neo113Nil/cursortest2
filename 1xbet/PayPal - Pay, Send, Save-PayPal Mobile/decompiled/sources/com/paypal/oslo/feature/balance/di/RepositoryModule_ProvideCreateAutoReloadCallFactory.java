package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideCreateAutoReloadCallFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvideCreateAutoReloadCallFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall get() {
        return provideCreateAutoReloadCall(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideCreateAutoReloadCallFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideCreateAutoReloadCallFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall provideCreateAutoReloadCall(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideCreateAutoReloadCall(apolloClient));
    }
}
