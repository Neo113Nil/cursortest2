package com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase;

/* loaded from: classes13.dex */
public final class ClearRememberedUserProfileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> getHighSpeedVideoSizes;

    private ClearRememberedUserProfileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider3) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase newInstance(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase(rememberedLoginRepository, deviceBindingTokenStorage, deviceAuthPreferenceStorage);
    }
}
