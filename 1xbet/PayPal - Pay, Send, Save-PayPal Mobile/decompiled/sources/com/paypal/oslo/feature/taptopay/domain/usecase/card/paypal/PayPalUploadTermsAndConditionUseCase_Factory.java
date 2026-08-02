package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalUploadTermsAndConditionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> getHighResolutionOutputSizeshNQ4ISI;

    private PayPalUploadTermsAndConditionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase(payPalCardRepository);
    }
}
