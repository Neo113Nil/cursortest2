package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

/* loaded from: classes15.dex */
public final class DeviceIntegrityCheckerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceIntegrityCheckerImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private DeviceIntegrityCheckerImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceIntegrityCheckerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceIntegrityCheckerImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceIntegrityCheckerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceIntegrityCheckerImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceIntegrityCheckerImpl(context);
    }
}
