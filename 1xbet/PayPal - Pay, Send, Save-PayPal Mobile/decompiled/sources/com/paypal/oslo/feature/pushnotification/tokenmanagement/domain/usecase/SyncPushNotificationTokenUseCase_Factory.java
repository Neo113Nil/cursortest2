package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

/* loaded from: classes13.dex */
public final class SyncPushNotificationTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> getOutputFormats;

    private SyncPushNotificationTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getOutputFormats = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> provider6) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase newInstance(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.repository.PushNotificationTokenRepository pushNotificationTokenRepository, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider pushTokenProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider pushConsentProvider, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider cloudIdentityProvider, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase updateAdobePushConsentUseCase) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase(pushNotificationTokenRepository, pushTokenProvider, pushConsentProvider, deviceIdProvider, cloudIdentityProvider, updateAdobePushConsentUseCase);
    }
}
