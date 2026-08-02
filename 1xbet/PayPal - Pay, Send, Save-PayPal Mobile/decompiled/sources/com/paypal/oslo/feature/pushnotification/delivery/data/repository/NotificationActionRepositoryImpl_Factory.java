package com.paypal.oslo.feature.pushnotification.delivery.data.repository;

/* loaded from: classes13.dex */
public final class NotificationActionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private NotificationActionRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl(apolloClient);
    }
}
