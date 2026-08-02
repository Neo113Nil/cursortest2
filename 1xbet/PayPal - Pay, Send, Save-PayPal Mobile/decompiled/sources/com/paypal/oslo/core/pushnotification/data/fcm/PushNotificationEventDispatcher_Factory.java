package com.paypal.oslo.core.pushnotification.data.fcm;

/* loaded from: classes10.dex */
public final class PushNotificationEventDispatcher_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler>> getHighSpeedVideoFpsRanges;

    private PushNotificationEventDispatcher_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler>> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler>> provider) {
        return new com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher_Factory(provider);
    }

    public static com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher newInstance(java.util.Set<com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler> set) {
        return new com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher(set);
    }
}
