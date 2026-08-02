package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class GetCardMetaDataUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.GetCardMetaDataUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoSizes;

    public GetCardMetaDataUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.GetCardMetaDataUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetCardMetaDataUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetCardMetaDataUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetCardMetaDataUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetCardMetaDataUseCase(cardRepository);
    }
}
