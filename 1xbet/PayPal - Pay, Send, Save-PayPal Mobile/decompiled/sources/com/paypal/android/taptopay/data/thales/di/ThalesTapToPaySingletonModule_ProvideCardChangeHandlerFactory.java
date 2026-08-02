package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes10.dex */
public final class ThalesTapToPaySingletonModule_ProvideCardChangeHandlerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.card.CardChangeHandler> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> getHighSpeedVideoFpsRanges;

    public ThalesTapToPaySingletonModule_ProvideCardChangeHandlerFactory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.card.CardChangeHandler get() {
        return provideCardChangeHandler(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardChangeHandlerFactory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardChangeHandlerFactory(provider, provider2);
    }

    public static com.paypal.android.taptopay.data.thales.card.CardChangeHandler provideCardChangeHandler(com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource cardPushNotificationDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        return (com.paypal.android.taptopay.data.thales.card.CardChangeHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideCardChangeHandler(cardPushNotificationDataSource, cardDataSource));
    }
}
