package com.paypal.oslo.core.pushnotification.data;

/* loaded from: classes10.dex */
public final class PushNotificationPermissionEventBusImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl_Factory create() {
        return com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl newInstance() {
        return new com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl_Factory();

        private InstanceHolder() {
        }
    }
}
