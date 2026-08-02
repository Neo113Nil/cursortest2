package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalAddCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.ContinueAddCardUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase> getOutputMinFrameDuration;

    private PayPalAddCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.ContinueAddCardUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase> provider8) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighSpeedVideoSizes = provider6;
        this.getOutputMinFrameDuration = provider7;
        this.getHighResolutionOutputSizeshNQ4ISI = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.ContinueAddCardUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase> provider8) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalPrepareAddCardUseCase payPalPrepareAddCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase payPalOnDigitizationCompletedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.ContinueAddCardUseCase continueAddCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase payPalUploadTermsAndConditionUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase payPalDeleteCardIdGroupUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase(payPalPrepareAddCardUseCase, addCardUseCase, payPalOnDigitizationCompletedUseCase, payPalGetCardIdGroupUseCase, payPalGetCardUseCase, continueAddCardUseCase, payPalUploadTermsAndConditionUseCase, payPalDeleteCardIdGroupUseCase);
    }
}
