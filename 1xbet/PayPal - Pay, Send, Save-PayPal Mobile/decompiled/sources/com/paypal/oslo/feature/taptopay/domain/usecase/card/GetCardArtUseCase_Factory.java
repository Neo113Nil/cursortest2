package com.paypal.oslo.feature.taptopay.domain.usecase.card;

/* loaded from: classes15.dex */
public final class GetCardArtUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> Camera2StreamConfigurationMap;

    private GetCardArtUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase(cardRepository);
    }
}
