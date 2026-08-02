package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ThalesAarDependenciesModule_Companion_ProvideThalesCardRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.card.ThalesCardRepository> {
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardStateDataSource> getHighSpeedVideoSizes;

    private ThalesAarDependenciesModule_Companion_ProvideThalesCardRepositoryFactory(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardStateDataSource> provider, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase> provider3, dagger.internal.Provider<android.content.Context> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.card.ThalesCardRepository get() {
        return provideThalesCardRepository(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideThalesCardRepositoryFactory create(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardStateDataSource> provider, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase> provider3, dagger.internal.Provider<android.content.Context> provider4) {
        return new com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideThalesCardRepositoryFactory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.android.taptopay.data.thales.card.ThalesCardRepository provideThalesCardRepository(com.paypal.android.taptopay.data.thales.card.CardStateDataSource cardStateDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, android.content.Context context) {
        return (com.paypal.android.taptopay.data.thales.card.ThalesCardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule.INSTANCE.provideThalesCardRepository(cardStateDataSource, cardDataSource, thalesDigitizeCardUseCase, context));
    }
}
