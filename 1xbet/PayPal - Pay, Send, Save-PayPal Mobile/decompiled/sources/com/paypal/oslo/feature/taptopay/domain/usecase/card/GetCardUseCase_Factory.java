package com.paypal.oslo.feature.taptopay.domain.usecase.card;

/* loaded from: classes15.dex */
public final class GetCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private GetCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase(cardRepository, getCardArtUseCase);
    }
}
