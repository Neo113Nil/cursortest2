package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

/* loaded from: classes15.dex */
public final class PurgeCardDataOnCardDeletedObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardArtUseCase> getHighSpeedVideoFpsRangesFor;

    private PurgeCardDataOnCardDeletedObserver_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardArtUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardArtUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase> provider4) {
        return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardArtUseCase payPalDeleteCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase payPalDeleteCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase payPalDeleteCardInfoUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver(payPalObserveCardStateUseCase, payPalDeleteCardArtUseCase, payPalDeleteCardIdGroupUseCase, payPalDeleteCardInfoUseCase);
    }
}
