package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalGetCardIdGroupsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> Camera2StreamConfigurationMap;

    private PayPalGetCardIdGroupsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase(payPalLocalCardDataRepository);
    }
}
