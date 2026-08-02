package com.paypal.oslo.feature.taptopay.domain.api;

/* loaded from: classes15.dex */
public final class GetCardApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase> getHighSpeedVideoFpsRanges;

    private GetCardApiImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl(payPalGetCardUseCase);
    }
}
