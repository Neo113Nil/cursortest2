package com.paypal.oslo.feature.cardconnect.domain.usecase;

/* loaded from: classes11.dex */
public final class CardConnectCreateSessionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository> Camera2StreamConfigurationMap;

    private CardConnectCreateSessionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository> provider) {
        return new com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase newInstance(com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository cardConnectRepository) {
        return new com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase(cardConnectRepository);
    }
}
