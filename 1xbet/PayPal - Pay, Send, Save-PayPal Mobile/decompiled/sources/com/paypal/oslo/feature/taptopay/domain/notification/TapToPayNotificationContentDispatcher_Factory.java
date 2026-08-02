package com.paypal.oslo.feature.taptopay.domain.notification;

/* loaded from: classes15.dex */
public final class TapToPayNotificationContentDispatcher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider>> getHighResolutionOutputSizeshNQ4ISI;

    private TapToPayNotificationContentDispatcher_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider>> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider>> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher newInstance(java.util.Set<com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider> set) {
        return new com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher(set);
    }
}
