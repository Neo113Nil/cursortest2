package com.paypal.oslo.feature.taptopay.ui.transaction.notification;

/* loaded from: classes15.dex */
public final class TapToPayNotificationClickHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.transaction.notification.TapToPayNotificationClickHandler> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private TapToPayNotificationClickHandler_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.transaction.notification.TapToPayNotificationClickHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.transaction.notification.TapToPayNotificationClickHandler_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.ui.transaction.notification.TapToPayNotificationClickHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.ui.transaction.notification.TapToPayNotificationClickHandler newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.ui.transaction.notification.TapToPayNotificationClickHandler(context);
    }
}
