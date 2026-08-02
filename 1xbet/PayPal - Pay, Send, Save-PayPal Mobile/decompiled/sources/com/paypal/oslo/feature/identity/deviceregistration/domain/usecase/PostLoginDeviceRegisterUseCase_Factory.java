package com.paypal.oslo.feature.identity.deviceregistration.domain.usecase;

/* loaded from: classes12.dex */
public final class PostLoginDeviceRegisterUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase> getHighSpeedVideoSizes;

    private PostLoginDeviceRegisterUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase> provider2) {
        return new com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase newInstance(com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation, com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase deviceRegistrationUseCase) {
        return new com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase(deviceRegistrationInformation, deviceRegistrationUseCase);
    }
}
