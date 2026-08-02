package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

/* loaded from: classes13.dex */
public final class CustomViewMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper_Factory create() {
        return com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper newInstance() {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper_Factory();

        private InstanceHolder() {
        }
    }
}
