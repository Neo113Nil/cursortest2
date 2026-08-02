package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class DeviceRegistrationSignalImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl_Factory create() {
        return com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl newInstance() {
        return new com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl_Factory();

        private InstanceHolder() {
        }
    }
}
