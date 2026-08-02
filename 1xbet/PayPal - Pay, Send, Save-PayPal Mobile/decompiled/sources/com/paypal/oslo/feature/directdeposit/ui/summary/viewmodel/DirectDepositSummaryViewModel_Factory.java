package com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel;

/* loaded from: classes12.dex */
public final class DirectDepositSummaryViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.ui.summary.mapper.VbaToUiStateMapper> getOutputFormats;

    private DirectDepositSummaryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.ui.summary.mapper.VbaToUiStateMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager> provider7) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoSizesFor = provider2;
        this.getOutputFormats = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.ui.summary.mapper.VbaToUiStateMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager> provider7) {
        return new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel newInstance(com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase getVbaUseCase, com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase updateDirectDebitStatusUseCase, com.paypal.oslo.feature.directdeposit.ui.summary.mapper.VbaToUiStateMapper vbaToUiStateMapper, com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase getAtomicPublicTokenUseCase, com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase linkDirectDepositAccountUseCase, com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase getSmartRoutePreferencesUseCase, com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager directDepositFeatureManager) {
        return new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel(getVbaUseCase, updateDirectDebitStatusUseCase, vbaToUiStateMapper, getAtomicPublicTokenUseCase, linkDirectDepositAccountUseCase, getSmartRoutePreferencesUseCase, directDepositFeatureManager);
    }
}
