package com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper;

/* loaded from: classes13.dex */
public final class PhoneConfirmationErrorMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper_Factory create() {
        return com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper newInstance() {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper_Factory();

        private InstanceHolder() {
        }
    }
}
