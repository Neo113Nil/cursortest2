package com.paypal.oslo.feature.taptopay.data.pushnotification;

/* loaded from: classes15.dex */
public final class PayairSdkPushForwarder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder> {
    private final dagger.internal.Provider<com.payair.logic.notifications.FirebaseNotificationHandler> getHighSpeedVideoFpsRanges;

    private PayairSdkPushForwarder_Factory(dagger.internal.Provider<com.payair.logic.notifications.FirebaseNotificationHandler> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder_Factory create(dagger.internal.Provider<com.payair.logic.notifications.FirebaseNotificationHandler> provider) {
        return new com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder newInstance(com.payair.logic.notifications.FirebaseNotificationHandler firebaseNotificationHandler) {
        return new com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder(firebaseNotificationHandler);
    }
}
