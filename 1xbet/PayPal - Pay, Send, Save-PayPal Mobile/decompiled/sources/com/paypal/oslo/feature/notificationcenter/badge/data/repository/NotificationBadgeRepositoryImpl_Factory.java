package com.paypal.oslo.feature.notificationcenter.badge.data.repository;

/* loaded from: classes13.dex */
public final class NotificationBadgeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private NotificationBadgeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl(apolloClient);
    }
}
