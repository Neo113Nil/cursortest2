package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideKeyReplenisherFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> {
    private final javax.inject.Provider<android.content.Context> getHighSpeedVideoSizes;

    public ThalesTapToPaySingletonModule_ProvideKeyReplenisherFactory(javax.inject.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher get() {
        return provideKeyReplenisher(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideKeyReplenisherFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideKeyReplenisherFactory(provider);
    }

    public static com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher provideKeyReplenisher(android.content.Context context) {
        return (com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideKeyReplenisher(context));
    }
}
