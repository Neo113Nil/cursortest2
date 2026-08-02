package com.paypal.oslo.feature.taptopay.domain.api;

/* loaded from: classes15.dex */
public final class IsCardDigitizedApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase> getHighSpeedVideoSizes;

    private IsCardDigitizedApiImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase payPalIsCardDigitizedUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl(payPalIsCardDigitizedUseCase);
    }
}
