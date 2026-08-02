package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class PayPalCloseCardsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver> getHighSpeedVideoSizes;

    private PayPalCloseCardsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver deviceIdResolver, com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase(deviceIdResolver, payPalCardRepository);
    }
}
