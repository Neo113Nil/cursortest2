package com.paypal.oslo.feature.taptopay.domain.usecase.notification;

/* loaded from: classes15.dex */
public final class ShowTapToPayNotificationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> getHighSpeedVideoFpsRangesFor;

    private ShowTapToPayNotificationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider3) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher tapToPayNotificationContentDispatcher, com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer notificationRenderer, com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase(tapToPayNotificationContentDispatcher, notificationRenderer, payPalLocalCardDataRepository);
    }
}
