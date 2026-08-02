package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

/* loaded from: classes13.dex */
public final class ProcessNotificationActionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository> getHighSpeedVideoFpsRanges;

    private ProcessNotificationActionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase newInstance(com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository notificationActionRepository, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase(notificationActionRepository, userStore);
    }
}
