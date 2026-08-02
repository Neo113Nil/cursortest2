package com.paypal.oslo.feature.pushnotification.delivery.data.repository;

/* loaded from: classes13.dex */
public final class NotificationTrackingRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private NotificationTrackingRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl(apolloClient);
    }
}
