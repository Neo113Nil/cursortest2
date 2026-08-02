package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase;

/* loaded from: classes15.dex */
public final class TaxDocumentsUseCaseProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase> getOutputMinFrameDuration;

    private TaxDocumentsUseCaseProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getOutputMinFrameDuration = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase> provider6) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfoUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getYearDropdownDataUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageDataUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReportsUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase createTaxReconciliationReportUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase requestTaxReportSelfCorrectionUseCase) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider(getUserInfoUseCase, getYearDropdownDataUseCase, getTaxDocumentsPageDataUseCase, getTaxReportsUseCase, createTaxReconciliationReportUseCase, requestTaxReportSelfCorrectionUseCase);
    }
}
