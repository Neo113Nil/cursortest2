package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideFcmTokenHandlerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<android.content.Context> getHighSpeedVideoSizes;

    public ThalesTapToPaySingletonModule_ProvideFcmTokenHandlerFactory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler get() {
        return provideFcmTokenHandler(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideFcmTokenHandlerFactory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider2) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideFcmTokenHandlerFactory(provider, provider2);
    }

    public static com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler provideFcmTokenHandler(android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource) {
        return (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideFcmTokenHandler(context, pushNotificationTokenDataSource));
    }
}
