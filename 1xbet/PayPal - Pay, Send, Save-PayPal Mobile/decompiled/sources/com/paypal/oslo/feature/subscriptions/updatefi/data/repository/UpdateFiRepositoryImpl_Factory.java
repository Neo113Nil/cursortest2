package com.paypal.oslo.feature.subscriptions.updatefi.data.repository;

/* loaded from: classes15.dex */
public final class UpdateFiRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private UpdateFiRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl(lazy);
    }
}
