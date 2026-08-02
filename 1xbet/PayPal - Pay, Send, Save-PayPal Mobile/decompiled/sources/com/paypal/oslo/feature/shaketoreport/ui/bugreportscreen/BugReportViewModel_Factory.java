package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

/* loaded from: classes14.dex */
public final class BugReportViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.IssueDataFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase> getInputFormats;

    private BugReportViewModel_Factory(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.IssueDataFactory> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter> provider4, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getInputFormats = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel_Factory create(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.IssueDataFactory> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter> provider4, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider6) {
        return new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel newInstance(androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase sendBugReportUseCase, com.paypal.oslo.feature.shaketoreport.domain.IssueDataFactory issueDataFactory, com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter screenshotConverter, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel(savedStateHandle, sendBugReportUseCase, issueDataFactory, screenshotConverter, appStorage, featureGate);
    }
}
