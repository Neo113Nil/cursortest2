package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

/* loaded from: classes11.dex */
public final class PayLaterHubViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase> getOutputMinFrameDuration;

    private PayLaterHubViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory> provider9, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer> provider10) {
        this.Camera2StreamConfigurationMap = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getOutputFormats = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getInputSizeshNQ4ISI = provider7;
        this.getHighSpeedVideoSizesFor = provider8;
        this.getHighResolutionOutputSizeshNQ4ISI = provider9;
        this.getInputFormats = provider10;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getOutputMinFrameDuration.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory> provider9, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer> provider10) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel newInstance(com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase getPayLaterHubOverviewUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase prequalificationAmountUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase refreshPlansUseCase, com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig payLaterHubConfig, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper, com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage, com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Factory factory, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer payLaterHubReducer) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel(getPayLaterHubOverviewUseCase, prequalificationAmountUseCase, refreshPlansUseCase, payLaterHubConfig, payLaterHubOverviewMapper, featureGateManager, supportedCpisConfig, bnplServicingSessionStorage, factory, payLaterHubReducer);
    }
}
