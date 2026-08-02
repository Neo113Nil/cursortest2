package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class ResumeCardUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.ResumeCardUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> Camera2StreamConfigurationMap;

    public ResumeCardUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.ResumeCardUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ResumeCardUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.card.ResumeCardUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ResumeCardUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.android.taptopay.domain.usecase.card.ResumeCardUseCase(cardRepository);
    }
}
