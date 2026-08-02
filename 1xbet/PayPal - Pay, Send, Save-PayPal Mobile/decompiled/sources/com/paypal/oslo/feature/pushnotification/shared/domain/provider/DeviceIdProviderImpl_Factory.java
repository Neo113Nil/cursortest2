package com.paypal.oslo.feature.pushnotification.shared.domain.provider;

/* loaded from: classes13.dex */
public final class DeviceIdProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> getHighSpeedVideoSizes;

    private DeviceIdProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> provider2) {
        return new com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl newInstance(com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal) {
        return new com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl(deviceRegistrationInformation, deviceRegistrationSignal);
    }
}
