package com.paypal.oslo.feature.taptopay.data;

/* loaded from: classes15.dex */
public final class PreTransactionManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase> getInputSizeshNQ4ISI;

    private PreTransactionManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getInputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase> provider6) {
        return new com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl newInstance(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase isDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase payPalGetDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase payPalSetPreferredAppForOneTimeUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase payPalUnsetPreferredAppForOneTimeUseCase) {
        return new com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl(manager, isNfcSupportedUseCase, isDefaultPaymentAppUseCase, payPalGetDefaultCardUseCase, payPalSetPreferredAppForOneTimeUseCase, payPalUnsetPreferredAppForOneTimeUseCase);
    }
}
