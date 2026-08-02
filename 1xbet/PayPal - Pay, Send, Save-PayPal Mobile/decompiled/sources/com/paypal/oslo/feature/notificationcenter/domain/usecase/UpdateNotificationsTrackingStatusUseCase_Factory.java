package com.paypal.oslo.feature.notificationcenter.domain.usecase;

/* loaded from: classes13.dex */
public final class UpdateNotificationsTrackingStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository> getHighSpeedVideoFpsRanges;

    private UpdateNotificationsTrackingStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository> provider) {
        return new com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase newInstance(com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository notificationRepository) {
        return new com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase(notificationRepository);
    }
}
