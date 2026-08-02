package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class ObserveCardStateUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.ObserveCardStateUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> Camera2StreamConfigurationMap;

    public ObserveCardStateUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.ObserveCardStateUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ObserveCardStateUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.card.ObserveCardStateUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ObserveCardStateUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.android.taptopay.domain.usecase.card.ObserveCardStateUseCase(cardRepository);
    }
}
