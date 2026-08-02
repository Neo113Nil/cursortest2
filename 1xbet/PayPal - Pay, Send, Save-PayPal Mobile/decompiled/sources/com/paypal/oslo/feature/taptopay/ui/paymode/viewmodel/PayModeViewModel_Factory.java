package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

/* loaded from: classes15.dex */
public final class PayModeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase> getOutputSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase> getOutputStallDuration;

    private PayModeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter> provider7, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase> provider11, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider12, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider13) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getOutputSizes = provider2;
        this.getOutputStallDuration = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getOutputFormats = provider6;
        this.getHighSpeedVideoSizes = provider7;
        this.getOutputMinFrameDuration = provider8;
        this.getHighSpeedVideoFpsRangesFor = provider9;
        this.getInputFormats = provider10;
        this.getHighSpeedVideoSizesFor = provider11;
        this.getOutputSizeshNQ4ISI = provider12;
        this.getHighSpeedVideoFpsRanges = provider13;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputSizes.get(), this.getOutputStallDuration.get(), this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter> provider7, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase> provider11, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider12, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider13) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase payPalSetDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase payPalObservePaymentUseCase, com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase isForegroundSettingEnabledUseCase, com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter cardPrioritySorter, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase isDeviceCompromisedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase handleDeviceCompromisedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase isDeviceScreenLockEnabledUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase isNfcEnabledUseCase, com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel(payPalGetAllCardsUseCase, payPalSetDefaultCardUseCase, payPalObservePaymentUseCase, networkConnectivityChecker, payPalIsDefaultPaymentAppUseCase, isForegroundSettingEnabledUseCase, cardPrioritySorter, isDeviceCompromisedUseCase, handleDeviceCompromisedUseCase, isDeviceScreenLockEnabledUseCase, isNfcEnabledUseCase, payLaterExpiryChecker, coroutineDispatcher);
    }
}
