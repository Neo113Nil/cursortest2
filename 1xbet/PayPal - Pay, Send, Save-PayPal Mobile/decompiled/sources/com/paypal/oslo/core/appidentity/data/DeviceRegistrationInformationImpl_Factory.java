package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class DeviceRegistrationInformationImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRangesFor;

    private DeviceRegistrationInformationImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> provider2) {
        return new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal) {
        return new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl(appStorage, deviceRegistrationSignal);
    }
}
