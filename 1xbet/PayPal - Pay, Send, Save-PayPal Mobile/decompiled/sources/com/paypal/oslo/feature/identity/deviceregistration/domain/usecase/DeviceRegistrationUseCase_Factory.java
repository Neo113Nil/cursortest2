package com.paypal.oslo.feature.identity.deviceregistration.domain.usecase;

/* loaded from: classes12.dex */
public final class DeviceRegistrationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.repository.DeviceRegistrationRepository> getHighSpeedVideoFpsRangesFor;

    private DeviceRegistrationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.repository.DeviceRegistrationRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.repository.DeviceRegistrationRepository> provider) {
        return new com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase newInstance(com.paypal.oslo.feature.identity.deviceregistration.domain.repository.DeviceRegistrationRepository deviceRegistrationRepository) {
        return new com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase(deviceRegistrationRepository);
    }
}
