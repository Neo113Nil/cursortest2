package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalGetCardEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> getHighSpeedVideoSizes;

    private PayPalGetCardEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase(payPalCardRepository, payPalGetCardIdGroupUseCase);
    }
}
