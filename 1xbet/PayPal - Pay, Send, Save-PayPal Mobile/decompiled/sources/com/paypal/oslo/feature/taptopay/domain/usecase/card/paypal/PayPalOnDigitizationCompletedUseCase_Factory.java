package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalOnDigitizationCompletedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardIdMappingInDbUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetCardArtUseCase> getHighSpeedVideoFpsRangesFor;

    private PayPalOnDigitizationCompletedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardIdMappingInDbUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetCardArtUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardIdMappingInDbUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetCardArtUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardIdMappingInDbUseCase payPalAddCardIdMappingInDbUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetCardArtUseCase payPalSetCardArtUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase(payPalAddCardIdMappingInDbUseCase, payPalSetCardArtUseCase);
    }
}
