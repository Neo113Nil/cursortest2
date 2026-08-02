package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideReplenishmentPushNotificationHandlerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> getHighSpeedVideoFpsRanges;

    public ThalesTapToPaySingletonModule_ProvideReplenishmentPushNotificationHandlerFactory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency get() {
        return provideReplenishmentPushNotificationHandler(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideReplenishmentPushNotificationHandlerFactory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> provider2) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideReplenishmentPushNotificationHandlerFactory(provider, provider2);
    }

    public static com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency provideReplenishmentPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher) {
        return (com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideReplenishmentPushNotificationHandler(pushNotificationDataSource, cardPaymentKeysReplenisher));
    }
}
