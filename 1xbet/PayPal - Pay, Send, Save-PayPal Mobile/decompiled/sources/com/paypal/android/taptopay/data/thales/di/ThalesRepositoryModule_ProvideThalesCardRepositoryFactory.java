package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes10.dex */
public final class ThalesRepositoryModule_ProvideThalesCardRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.card.CardRepository> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardStateDataSource> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardChangeHandler> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule getHighSpeedVideoSizes;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> getOutputFormats;

    public ThalesRepositoryModule_ProvideThalesCardRepositoryFactory(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardStateDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider3, javax.inject.Provider<android.content.Context> provider4, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardChangeHandler> provider5) {
        this.getHighSpeedVideoSizes = thalesRepositoryModule;
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getOutputFormats = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.card.CardRepository get() {
        return provideThalesCardRepository(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule_ProvideThalesCardRepositoryFactory create(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardStateDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider3, javax.inject.Provider<android.content.Context> provider4, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardChangeHandler> provider5) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule_ProvideThalesCardRepositoryFactory(thalesRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.android.taptopay.domain.repository.card.CardRepository provideThalesCardRepository(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, com.paypal.android.taptopay.data.thales.card.CardStateDataSource cardStateDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, android.content.Context context, com.paypal.android.taptopay.data.thales.card.CardChangeHandler cardChangeHandler) {
        return (com.paypal.android.taptopay.domain.repository.card.CardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(thalesRepositoryModule.provideThalesCardRepository(cardStateDataSource, cardDataSource, pushNotificationTokenDataSource, context, cardChangeHandler));
    }
}
