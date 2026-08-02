package com.paypal.oslo.feature.identity.identitymanagement.domain.usecase;

/* loaded from: classes12.dex */
public final class DisableAuthenticationMethodUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getHighSpeedVideoSizes;

    private DisableAuthenticationMethodUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider3) {
        return new com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase newInstance(com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase deviceUnbindingUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        return new com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase(deviceUnbindingUseCase, deviceBindingTokenStorage, deviceAuthPreferenceStorage);
    }
}
