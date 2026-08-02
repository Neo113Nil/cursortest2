package com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository;

/* loaded from: classes13.dex */
public final class CriticalAlertRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private CriticalAlertRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl(apolloClient);
    }
}
