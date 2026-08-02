package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalResumeCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalResumeCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase> getHighSpeedVideoSizes;

    private PayPalResumeCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalResumeCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalResumeCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalResumeCardUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalResumeCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase resumeCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalResumeCardUseCase(resumeCardUseCase, payPalGetCardIdGroupUseCase);
    }
}
