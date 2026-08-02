package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public final class PayPalMockDeviceCapability_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability_Factory create() {
        return com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability newInstance() {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockDeviceCapability_Factory();

        private InstanceHolder() {
        }
    }
}
