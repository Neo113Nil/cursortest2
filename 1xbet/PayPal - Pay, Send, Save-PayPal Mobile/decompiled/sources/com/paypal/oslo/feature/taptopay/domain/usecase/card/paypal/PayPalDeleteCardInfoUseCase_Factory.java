package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalDeleteCardInfoUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> getHighSpeedVideoFpsRanges;

    private PayPalDeleteCardInfoUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase(payPalLocalCardDataRepository);
    }
}
