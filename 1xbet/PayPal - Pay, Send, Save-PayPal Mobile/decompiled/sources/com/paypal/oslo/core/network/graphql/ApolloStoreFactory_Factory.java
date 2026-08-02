package com.paypal.oslo.core.network.graphql;

/* loaded from: classes10.dex */
public final class ApolloStoreFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.graphql.ApolloStoreFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider> getHighSpeedVideoFpsRangesFor;

    private ApolloStoreFactory_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.graphql.ApolloStoreFactory get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.network.graphql.ApolloStoreFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader> provider2) {
        return new com.paypal.oslo.core.network.graphql.ApolloStoreFactory_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.network.graphql.ApolloStoreFactory newInstance(javax.inject.Provider<com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider> provider, com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader sqlCipherLibraryLoader) {
        return new com.paypal.oslo.core.network.graphql.ApolloStoreFactory(provider, sqlCipherLibraryLoader);
    }
}
