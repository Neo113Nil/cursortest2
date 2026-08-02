package com.paypal.oslo.feature.identity.shared.data.capability;

/* loaded from: classes13.dex */
public final class EmulatorDetectorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.data.capability.EmulatorDetectorImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceInformation> getHighResolutionOutputSizeshNQ4ISI;

    private EmulatorDetectorImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceInformation> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.data.capability.EmulatorDetectorImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.shared.data.capability.EmulatorDetectorImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceInformation> provider) {
        return new com.paypal.oslo.feature.identity.shared.data.capability.EmulatorDetectorImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.shared.data.capability.EmulatorDetectorImpl newInstance(com.paypal.oslo.core.appidentity.domain.DeviceInformation deviceInformation) {
        return new com.paypal.oslo.feature.identity.shared.data.capability.EmulatorDetectorImpl(deviceInformation);
    }
}
