package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideAutoReloadRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> getOutputMinFrameDuration;

    private RepositoryModule_ProvideAutoReloadRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getOutputMinFrameDuration = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository get() {
        return provideAutoReloadRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideAutoReloadRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall> provider6) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideAutoReloadRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository provideAutoReloadRepository(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall fetchAutoReloadConfigCall, com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall createAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall updateAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall disableAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall fetchDepositOptionsCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall fetchSavingsAccountsCall) {
        return (com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideAutoReloadRepository(fetchAutoReloadConfigCall, createAutoReloadCall, updateAutoReloadCall, disableAutoReloadCall, fetchDepositOptionsCall, fetchSavingsAccountsCall));
    }
}
