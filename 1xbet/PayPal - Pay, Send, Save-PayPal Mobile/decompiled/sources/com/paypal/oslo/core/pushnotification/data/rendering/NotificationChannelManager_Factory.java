package com.paypal.oslo.core.pushnotification.data.rendering;

/* loaded from: classes10.dex */
public final class NotificationChannelManager_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private NotificationChannelManager_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager_Factory(provider);
    }

    public static com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager newInstance(android.content.Context context) {
        return new com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager(context);
    }
}
