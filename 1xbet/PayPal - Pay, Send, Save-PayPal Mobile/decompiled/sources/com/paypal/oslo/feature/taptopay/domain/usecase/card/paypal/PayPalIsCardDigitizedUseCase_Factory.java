package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalIsCardDigitizedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private PayPalIsCardDigitizedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase(payPalGetCardIdGroupsUseCase);
    }
}
