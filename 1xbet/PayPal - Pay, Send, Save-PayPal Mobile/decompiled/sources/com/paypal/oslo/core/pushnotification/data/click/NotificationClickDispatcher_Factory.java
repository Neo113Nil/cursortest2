package com.paypal.oslo.core.pushnotification.data.click;

/* loaded from: classes10.dex */
public final class NotificationClickDispatcher_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler>> getHighResolutionOutputSizeshNQ4ISI;

    private NotificationClickDispatcher_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler>> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler>> provider) {
        return new com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher_Factory(provider);
    }

    public static com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher newInstance(java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler> set) {
        return new com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher(set);
    }
}
