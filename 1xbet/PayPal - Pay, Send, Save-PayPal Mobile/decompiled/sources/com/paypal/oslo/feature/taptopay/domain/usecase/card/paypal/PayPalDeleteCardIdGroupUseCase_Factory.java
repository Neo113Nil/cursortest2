package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalDeleteCardIdGroupUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> getHighSpeedVideoSizes;

    private PayPalDeleteCardIdGroupUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase(payPalLocalCardDataRepository);
    }
}
