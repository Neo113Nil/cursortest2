package com.paypal.oslo.core.pushnotification.data.click;

/* loaded from: classes10.dex */
abstract class Hilt_NotificationClickReceiver extends android.content.BroadcastReceiver {
    private volatile boolean getHighSpeedVideoFpsRanges = false;
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    Hilt_NotificationClickReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        inject(context);
    }

    protected void inject(android.content.Context context) {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoFpsRanges) {
                ((com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver_GeneratedInjector) dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager.generatedComponent(context)).injectNotificationClickReceiver((com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
                this.getHighSpeedVideoFpsRanges = true;
            }
        }
    }
}
