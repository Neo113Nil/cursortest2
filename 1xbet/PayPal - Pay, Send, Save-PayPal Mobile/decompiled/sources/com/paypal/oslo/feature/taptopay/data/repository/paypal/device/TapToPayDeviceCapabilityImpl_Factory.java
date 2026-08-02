package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

/* loaded from: classes15.dex */
public final class TapToPayDeviceCapabilityImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.TapToPayDeviceCapabilityImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private TapToPayDeviceCapabilityImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.device.TapToPayDeviceCapabilityImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.TapToPayDeviceCapabilityImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.TapToPayDeviceCapabilityImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.TapToPayDeviceCapabilityImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.TapToPayDeviceCapabilityImpl(context);
    }
}
