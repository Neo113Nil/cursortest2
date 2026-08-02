package com.paypal.oslo.core.pushnotification.di;

/* loaded from: classes10.dex */
public final class PushNotificationPermissionModule_Companion_ProvideSdkVersionFactory implements dagger.internal.Factory<java.lang.Integer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Integer get() {
        return java.lang.Integer.valueOf(provideSdkVersion());
    }

    public static com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule_Companion_ProvideSdkVersionFactory create() {
        return com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule_Companion_ProvideSdkVersionFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static int provideSdkVersion() {
        return com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule.INSTANCE.provideSdkVersion();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule_Companion_ProvideSdkVersionFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule_Companion_ProvideSdkVersionFactory();

        private InstanceHolder() {
        }
    }
}
