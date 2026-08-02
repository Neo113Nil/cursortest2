package com.paypal.oslo.feature.taptopay.data.observer.auth;

/* loaded from: classes15.dex */
public final class TapToPayLoginObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getOutputMinFrameDuration;

    private TapToPayLoginObserver_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6) {
        this.getOutputMinFrameDuration = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6) {
        return new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater payairAccessTokenUpdater, com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar sdkUserRegistrar, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase payPalSyncAllFailedNotifyCallsUseCase, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver(userStore, isNfcSupportedUseCase, payairAccessTokenUpdater, sdkUserRegistrar, payPalSyncAllFailedNotifyCallsUseCase, coroutineScope);
    }
}
