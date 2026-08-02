package com.paypal.oslo.feature.taptopay.domain.api;

/* loaded from: classes15.dex */
public final class GetAllCardsApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> Camera2StreamConfigurationMap;

    private GetAllCardsApiImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl(payPalGetAllCardsUseCase);
    }
}
