package com.paypal.oslo.feature.wallet.cards.domain.usecase;

/* loaded from: classes15.dex */
public final class GetCardDefinitionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> Camera2StreamConfigurationMap;

    private GetCardDefinitionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase newInstance(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase(cardRepository);
    }
}
