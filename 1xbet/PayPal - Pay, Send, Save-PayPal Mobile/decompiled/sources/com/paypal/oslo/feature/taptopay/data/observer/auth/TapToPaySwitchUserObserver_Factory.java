package com.paypal.oslo.feature.taptopay.data.observer.auth;

/* loaded from: classes15.dex */
public final class TapToPaySwitchUserObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getInputSizeshNQ4ISI;

    private TapToPaySwitchUserObserver_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider7) {
        this.getInputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getInputFormats = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoSizes = provider6;
        this.Camera2StreamConfigurationMap = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider7) {
        return new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase payPalWipeAllTokensUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase payPalCloseCardsUseCase, com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller backgroundSyncWorkerCanceller, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase payPalSyncAllFailedNotifyCallsUseCase, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver(userStore, isNfcSupportedUseCase, payPalWipeAllTokensUseCase, payPalCloseCardsUseCase, backgroundSyncWorkerCanceller, payPalSyncAllFailedNotifyCallsUseCase, coroutineScope);
    }
}
