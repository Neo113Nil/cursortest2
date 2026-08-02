package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper;

/* loaded from: classes11.dex */
public final class DeviceRequirementMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper_Factory create() {
        return com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper newInstance() {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper_Factory();

        private InstanceHolder() {
        }
    }
}
