package com.paypal.oslo.feature.notificationcenter.data.repository;

/* loaded from: classes13.dex */
public final class NotificationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper> getHighSpeedVideoSizes;

    private NotificationRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2) {
        return new com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl newInstance(com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper notificationMapper, com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl(notificationMapper, apolloClient);
    }
}
