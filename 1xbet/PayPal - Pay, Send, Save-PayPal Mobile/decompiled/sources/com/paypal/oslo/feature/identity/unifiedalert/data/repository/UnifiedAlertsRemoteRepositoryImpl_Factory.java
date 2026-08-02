package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

/* loaded from: classes13.dex */
public final class UnifiedAlertsRemoteRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private UnifiedAlertsRemoteRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl(apolloClient);
    }
}
