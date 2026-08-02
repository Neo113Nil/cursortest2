package com.paypal.oslo.downloads.impl.notification;

/* loaded from: classes10.dex */
public final class DownloadActionReceiver_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.notification.DownloadActionHandler> getHighSpeedVideoFpsRanges;

    private DownloadActionReceiver_MembersInjector(dagger.internal.Provider<com.paypal.oslo.downloads.impl.notification.DownloadActionHandler> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver downloadActionReceiver) {
        injectHandler(downloadActionReceiver, this.getHighSpeedVideoFpsRanges.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver> create(dagger.internal.Provider<com.paypal.oslo.downloads.impl.notification.DownloadActionHandler> provider) {
        return new com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver_MembersInjector(provider);
    }

    public static void injectHandler(com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver downloadActionReceiver, com.paypal.oslo.downloads.impl.notification.DownloadActionHandler downloadActionHandler) {
        downloadActionReceiver.handler = downloadActionHandler;
    }
}
