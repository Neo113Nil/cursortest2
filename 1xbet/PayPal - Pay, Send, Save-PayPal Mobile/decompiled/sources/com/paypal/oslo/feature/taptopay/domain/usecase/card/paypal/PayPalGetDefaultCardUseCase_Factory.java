package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalGetDefaultCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase> getHighSpeedVideoSizes;

    private PayPalGetDefaultCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase> provider3) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase getDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase(getDefaultCardUseCase, payPalGetCardIdGroupUseCase, payPalGetCardInfoUseCase);
    }
}
