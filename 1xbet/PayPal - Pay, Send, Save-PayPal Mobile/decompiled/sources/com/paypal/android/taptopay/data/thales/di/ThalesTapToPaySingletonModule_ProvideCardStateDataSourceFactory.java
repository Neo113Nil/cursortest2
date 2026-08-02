package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideCardStateDataSourceFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.card.CardStateDataSource> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> getHighSpeedVideoFpsRangesFor;

    public ThalesTapToPaySingletonModule_ProvideCardStateDataSourceFactory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.card.CardStateDataSource get() {
        return provideCardStateDataSource(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardStateDataSourceFactory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardStateDataSourceFactory(provider);
    }

    public static com.paypal.android.taptopay.data.thales.card.CardStateDataSource provideCardStateDataSource(com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        return (com.paypal.android.taptopay.data.thales.card.CardStateDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideCardStateDataSource(cardDataSource));
    }
}
