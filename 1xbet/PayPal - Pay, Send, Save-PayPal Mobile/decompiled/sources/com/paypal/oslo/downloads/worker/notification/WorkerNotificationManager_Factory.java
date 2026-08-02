package com.paypal.oslo.downloads.worker.notification;

/* loaded from: classes10.dex */
public final class WorkerNotificationManager_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.notification.NotificationBuilder> getHighSpeedVideoFpsRanges;

    private WorkerNotificationManager_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.notification.NotificationBuilder> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.notification.NotificationBuilder> provider2) {
        return new com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager_Factory(provider, provider2);
    }

    public static com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager newInstance(android.content.Context context, com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        return new com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager(context, notificationBuilder);
    }
}
