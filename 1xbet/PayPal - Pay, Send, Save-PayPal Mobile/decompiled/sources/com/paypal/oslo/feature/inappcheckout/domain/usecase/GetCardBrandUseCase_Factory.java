package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class GetCardBrandUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository> Camera2StreamConfigurationMap;

    private GetCardBrandUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase(cardRepository);
    }
}
