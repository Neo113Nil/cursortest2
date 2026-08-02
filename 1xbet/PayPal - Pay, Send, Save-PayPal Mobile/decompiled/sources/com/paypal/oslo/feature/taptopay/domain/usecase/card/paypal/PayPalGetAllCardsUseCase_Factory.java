package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalGetAllCardsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase> getHighSpeedVideoSizes;

    private PayPalGetAllCardsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase> provider4) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase(getAllCardsUseCase, payPalGetCardArtUseCase, payPalGetCardInfoUseCase, payPalGetCardIdGroupsUseCase);
    }
}
