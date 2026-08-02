package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ThalesAarDependenciesModule_Companion_ProvideThalesDigitizeCardUseCaseFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase> {
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> getHighSpeedVideoSizes;

    private ThalesAarDependenciesModule_Companion_ProvideThalesDigitizeCardUseCaseFactory(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase get() {
        return provideThalesDigitizeCardUseCase(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideThalesDigitizeCardUseCaseFactory create(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider2) {
        return new com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideThalesDigitizeCardUseCaseFactory(provider, provider2);
    }

    public static com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase provideThalesDigitizeCardUseCase(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        return (com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule.INSTANCE.provideThalesDigitizeCardUseCase(pushNotificationTokenDataSource, cardDataSource));
    }
}
