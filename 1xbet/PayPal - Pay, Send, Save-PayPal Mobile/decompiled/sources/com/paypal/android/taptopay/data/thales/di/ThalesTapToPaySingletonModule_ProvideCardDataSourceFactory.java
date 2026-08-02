package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideCardDataSourceFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.card.CardDataSource> {
    private final javax.inject.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    public ThalesTapToPaySingletonModule_ProvideCardDataSourceFactory(javax.inject.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.card.CardDataSource get() {
        return provideCardDataSource(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardDataSourceFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCardDataSourceFactory(provider);
    }

    public static com.paypal.android.taptopay.data.thales.card.CardDataSource provideCardDataSource(android.content.Context context) {
        return (com.paypal.android.taptopay.data.thales.card.CardDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideCardDataSource(context));
    }
}
