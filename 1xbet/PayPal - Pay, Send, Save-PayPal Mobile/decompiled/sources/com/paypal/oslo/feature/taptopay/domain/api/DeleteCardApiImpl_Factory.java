package com.paypal.oslo.feature.taptopay.domain.api;

/* loaded from: classes15.dex */
public final class DeleteCardApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase> getHighSpeedVideoSizes;

    private DeleteCardApiImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase payPalDeleteCardUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl(payPalDeleteCardUseCase);
    }
}
