package com.paypal.oslo.feature.subscriptions.bulkfi.data.repository;

/* loaded from: classes15.dex */
public final class BulkUpdateFiRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private BulkUpdateFiRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes));
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl(lazy);
    }
}
