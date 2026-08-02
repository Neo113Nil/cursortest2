package com.paypal.oslo.feature.bnplacquisition.data.repository;

/* loaded from: classes11.dex */
public final class UpdateApplicationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private UpdateApplicationRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl(lazy);
    }
}
