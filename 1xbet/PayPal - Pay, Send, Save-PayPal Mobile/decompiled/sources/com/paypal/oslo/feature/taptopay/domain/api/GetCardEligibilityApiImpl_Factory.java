package com.paypal.oslo.feature.taptopay.domain.api;

/* loaded from: classes15.dex */
public final class GetCardEligibilityApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> Camera2StreamConfigurationMap;

    private GetCardEligibilityApiImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl(payPalGetCardEligibilityUseCase);
    }
}
