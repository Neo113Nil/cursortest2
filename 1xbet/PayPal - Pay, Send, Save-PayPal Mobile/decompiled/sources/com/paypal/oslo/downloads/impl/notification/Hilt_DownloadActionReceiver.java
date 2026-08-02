package com.paypal.oslo.downloads.impl.notification;

/* loaded from: classes10.dex */
abstract class Hilt_DownloadActionReceiver extends android.content.BroadcastReceiver {
    private volatile boolean getHighSpeedVideoSizes = false;
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

    Hilt_DownloadActionReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        inject(context);
    }

    protected void inject(android.content.Context context) {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (!this.getHighSpeedVideoSizes) {
                ((com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver_GeneratedInjector) dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager.generatedComponent(context)).injectDownloadActionReceiver((com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
                this.getHighSpeedVideoSizes = true;
            }
        }
    }
}
