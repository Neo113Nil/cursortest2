package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalWipeAllTokensUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.WipeAllTokensUseCase> Camera2StreamConfigurationMap;

    private PayPalWipeAllTokensUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.WipeAllTokensUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.WipeAllTokensUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.WipeAllTokensUseCase wipeAllTokensUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase(wipeAllTokensUseCase);
    }
}
