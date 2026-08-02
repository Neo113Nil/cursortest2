package com.paypal.oslo.feature.balance.data.repository.autoreload;

/* loaded from: classes11.dex */
public final class AutoReloadRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> getOutputFormats;

    private AutoReloadRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getOutputFormats = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall> provider6) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl newInstance(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall fetchAutoReloadConfigCall, com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall createAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall updateAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall disableAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall fetchDepositOptionsCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall fetchSavingsAccountsCall) {
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl(fetchAutoReloadConfigCall, createAutoReloadCall, updateAutoReloadCall, disableAutoReloadCall, fetchDepositOptionsCall, fetchSavingsAccountsCall);
    }
}
