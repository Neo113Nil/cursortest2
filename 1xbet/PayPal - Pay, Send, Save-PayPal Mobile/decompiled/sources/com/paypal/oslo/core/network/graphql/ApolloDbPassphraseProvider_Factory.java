package com.paypal.oslo.core.network.graphql;

/* loaded from: classes10.dex */
public final class ApolloDbPassphraseProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRangesFor;

    private ApolloDbPassphraseProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider(appStorage, coroutineScope);
    }
}
