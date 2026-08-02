package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi;

/* loaded from: classes15.dex */
public final class AllTransactionsMviViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> getHighSpeedVideoFpsRangesFor;

    private AllTransactionsMviViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase getStatementAvailabilityUseCase, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel(getStatementAvailabilityUseCase, downloadOrchestrator);
    }
}
