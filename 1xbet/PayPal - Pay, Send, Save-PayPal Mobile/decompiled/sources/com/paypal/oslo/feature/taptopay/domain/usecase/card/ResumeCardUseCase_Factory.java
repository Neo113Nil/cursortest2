package com.paypal.oslo.feature.taptopay.domain.usecase.card;

/* loaded from: classes15.dex */
public final class ResumeCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ResumeCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.ResumeCardUseCase(cardRepository);
    }
}
