package com.paypal.oslo.feature.bnplservicing.ui.prequal;

/* loaded from: classes11.dex */
public final class PreQualViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> getInputFormats;

    private PreQualViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualReducer> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getInputFormats = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualReducer> provider6) {
        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel newInstance(com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase getPrequalificationSummaryUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase prequalificationAmountUseCase, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper preQualMapper, com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualReducer preQualReducer) {
        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel(getPrequalificationSummaryUseCase, prequalificationAmountUseCase, preQualMapper, supportedCpisConfig, bnplServicingSessionStorage, preQualReducer);
    }
}
