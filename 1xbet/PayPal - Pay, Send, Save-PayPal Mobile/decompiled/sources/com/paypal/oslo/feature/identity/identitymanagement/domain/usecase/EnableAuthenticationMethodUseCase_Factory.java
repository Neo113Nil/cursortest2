package com.paypal.oslo.feature.identity.identitymanagement.domain.usecase;

/* loaded from: classes12.dex */
public final class EnableAuthenticationMethodUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase> getHighSpeedVideoFpsRangesFor;

    private EnableAuthenticationMethodUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider2) {
        return new com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase newInstance(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase deviceBindingUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        return new com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase(deviceBindingUseCase, deviceAuthPreferenceStorage);
    }
}
