package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalGetCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase> getHighSpeedVideoSizes;

    private PayPalGetCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> provider5) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase deleteCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase(getCardUseCase, deleteCardUseCase, payPalGetCardArtUseCase, payPalGetCardIdGroupUseCase, payPalGetCardInfoUseCase);
    }
}
