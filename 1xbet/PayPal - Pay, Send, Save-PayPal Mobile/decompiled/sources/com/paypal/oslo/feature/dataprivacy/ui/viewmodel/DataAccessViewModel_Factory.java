package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class DataAccessViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase> getHighSpeedVideoSizes;

    private DataAccessViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> provider5) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel newInstance(com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase getExistingRequestsUseCase, com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase downloadFileUseCase, com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver fileSaver, com.paypal.oslo.core.network.rest.config.RestConfig restConfig, com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration dataPrivacyDynamicConfiguration) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel(getExistingRequestsUseCase, downloadFileUseCase, fileSaver, restConfig, dataPrivacyDynamicConfiguration);
    }
}
