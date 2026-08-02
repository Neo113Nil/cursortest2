package com.paypal.oslo.feature.notificationcenter.badge;

/* loaded from: classes13.dex */
public final class NotificationBadgeProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.badge.NotificationBadgeProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager> getHighSpeedVideoFpsRangesFor;

    private NotificationBadgeProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.badge.NotificationBadgeProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.NotificationBadgeProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager> provider) {
        return new com.paypal.oslo.feature.notificationcenter.badge.NotificationBadgeProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.NotificationBadgeProvider newInstance(com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager notificationBadgeManager) {
        return new com.paypal.oslo.feature.notificationcenter.badge.NotificationBadgeProvider(notificationBadgeManager);
    }
}
