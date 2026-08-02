package com.paypal.oslo.core.pushnotification.data.fcm;

/* loaded from: classes10.dex */
public final class FcmTokenProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl_Factory create() {
        return com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl newInstance() {
        return new com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
