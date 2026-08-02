package com.paypal.oslo.feature.taptopay.ui.transaction.notification;

/* loaded from: classes15.dex */
public final class DefaultTapToPayNotificationContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider_Factory create() {
        return com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider newInstance() {
        return new com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
