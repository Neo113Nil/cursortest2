package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

/* loaded from: classes13.dex */
public final class TrackPushNotificationImpressionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository> getHighSpeedVideoFpsRangesFor;

    private TrackPushNotificationImpressionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository> provider) {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase newInstance(com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository notificationTrackingRepository) {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase(notificationTrackingRepository);
    }
}
