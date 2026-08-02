package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

/* loaded from: classes12.dex */
public final class PostLoginDeviceBindUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> getHighSpeedVideoSizes;

    private PostLoginDeviceBindUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage> provider2) {
        return new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase newInstance(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase deviceBindingUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        return new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase(deviceBindingUseCase, deviceAuthPreferenceStorage);
    }
}
