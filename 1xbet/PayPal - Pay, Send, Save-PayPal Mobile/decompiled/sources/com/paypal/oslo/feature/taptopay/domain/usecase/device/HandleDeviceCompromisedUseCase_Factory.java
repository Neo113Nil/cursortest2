package com.paypal.oslo.feature.taptopay.domain.usecase.device;

/* loaded from: classes15.dex */
public final class HandleDeviceCompromisedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private HandleDeviceCompromisedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase payPalWipeAllTokensUseCase, com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller backgroundSyncCanceller) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase(payPalWipeAllTokensUseCase, backgroundSyncCanceller);
    }
}
