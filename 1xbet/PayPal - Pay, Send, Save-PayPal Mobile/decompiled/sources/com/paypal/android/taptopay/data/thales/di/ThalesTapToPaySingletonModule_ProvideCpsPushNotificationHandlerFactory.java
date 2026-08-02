package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideCpsPushNotificationHandlerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener> getHighSpeedVideoSizes;

    public ThalesTapToPaySingletonModule_ProvideCpsPushNotificationHandlerFactory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency get() {
        return provideCpsPushNotificationHandler(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCpsPushNotificationHandlerFactory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener> provider2) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCpsPushNotificationHandlerFactory(provider, provider2);
    }

    public static com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency provideCpsPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener cardPushServiceListener) {
        return (com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideCpsPushNotificationHandler(pushNotificationDataSource, cardPushServiceListener));
    }
}
