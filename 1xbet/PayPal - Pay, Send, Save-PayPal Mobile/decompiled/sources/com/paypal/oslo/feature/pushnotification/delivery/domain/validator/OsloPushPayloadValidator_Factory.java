package com.paypal.oslo.feature.pushnotification.delivery.domain.validator;

/* loaded from: classes13.dex */
public final class OsloPushPayloadValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator_Factory create() {
        return com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator newInstance() {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator_Factory();

        private InstanceHolder() {
        }
    }
}
