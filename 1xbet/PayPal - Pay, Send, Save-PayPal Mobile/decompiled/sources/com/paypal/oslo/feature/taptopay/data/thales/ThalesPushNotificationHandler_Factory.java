package com.paypal.oslo.feature.taptopay.data.thales;

/* loaded from: classes15.dex */
public final class ThalesPushNotificationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler> {
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> getHighSpeedVideoSizes;

    private ThalesPushNotificationHandler_Factory(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler_Factory create(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> provider) {
        return new com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler newInstance(com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler) {
        return new com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler(fcmHandler);
    }
}
