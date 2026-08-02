package com.paypal.oslo.feature.pushnotification.delivery.domain.validator;

/* loaded from: classes13.dex */
public final class DefaultCommsPayloadValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator_Factory create() {
        return com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator newInstance() {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator_Factory();

        private InstanceHolder() {
        }
    }
}
