package com.paypal.oslo.feature.taptopay.data.observer.auth;

/* loaded from: classes15.dex */
public final class TapToPayLogoutObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private TapToPayLogoutObserver_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4) {
        return new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller backgroundSyncWorkerCanceller, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver(userStore, isNfcSupportedUseCase, backgroundSyncWorkerCanceller, coroutineScope);
    }
}
