package com.paypal.oslo.core.pushnotification.data.click;

/* loaded from: classes10.dex */
public final class NotificationClickReceiver_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher> getHighResolutionOutputSizeshNQ4ISI;

    private NotificationClickReceiver_MembersInjector(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver notificationClickReceiver) {
        injectClickDispatcher(notificationClickReceiver, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver> create(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher> provider) {
        return new com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver_MembersInjector(provider);
    }

    public static void injectClickDispatcher(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver notificationClickReceiver, com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher notificationClickDispatcher) {
        notificationClickReceiver.clickDispatcher = notificationClickDispatcher;
    }
}
