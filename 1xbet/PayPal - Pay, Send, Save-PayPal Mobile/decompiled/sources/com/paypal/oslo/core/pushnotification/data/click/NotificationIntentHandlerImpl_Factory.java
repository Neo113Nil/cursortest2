package com.paypal.oslo.core.pushnotification.data.click;

/* loaded from: classes10.dex */
public final class NotificationIntentHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.click.NotificationIntentHandlerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher> getHighSpeedVideoSizes;

    private NotificationIntentHandlerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.click.NotificationIntentHandlerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.pushnotification.data.click.NotificationIntentHandlerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher> provider) {
        return new com.paypal.oslo.core.pushnotification.data.click.NotificationIntentHandlerImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.pushnotification.data.click.NotificationIntentHandlerImpl newInstance(com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher notificationClickDispatcher) {
        return new com.paypal.oslo.core.pushnotification.data.click.NotificationIntentHandlerImpl(notificationClickDispatcher);
    }
}
