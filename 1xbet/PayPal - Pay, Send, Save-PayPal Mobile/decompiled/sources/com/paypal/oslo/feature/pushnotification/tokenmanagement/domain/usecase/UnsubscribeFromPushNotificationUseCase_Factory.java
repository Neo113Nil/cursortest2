package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

/* loaded from: classes13.dex */
public final class UnsubscribeFromPushNotificationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> getHighSpeedVideoSizes;

    private UnsubscribeFromPushNotificationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager> provider4) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase newInstance(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider, com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager adobePushManager) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UnsubscribeFromPushNotificationUseCase(pushNotificationTokenRepository, deviceIdProvider, pushTokenProvider, adobePushManager);
    }
}
