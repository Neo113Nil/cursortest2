package com.paypal.oslo.downloads.impl.notification;

/* loaded from: classes10.dex */
public final class NotificationBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.notification.NotificationBuilder> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private NotificationBuilder_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.notification.NotificationBuilder get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.downloads.impl.notification.NotificationBuilder_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.downloads.impl.notification.NotificationBuilder_Factory(provider);
    }

    public static com.paypal.oslo.downloads.impl.notification.NotificationBuilder newInstance(android.content.Context context) {
        return new com.paypal.oslo.downloads.impl.notification.NotificationBuilder(context);
    }
}
