package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideCardPushServiceListenerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource> getHighResolutionOutputSizeshNQ4ISI;

    public ThalesTapToPaySingletonModule_ProvideCardPushServiceListenerFactory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener get() {
        return provideCardPushServiceListener(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardPushServiceListenerFactory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource> provider) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardPushServiceListenerFactory(provider);
    }

    public static com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener provideCardPushServiceListener(com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource cardPushNotificationDataSource) {
        return (com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideCardPushServiceListener(cardPushNotificationDataSource));
    }
}
