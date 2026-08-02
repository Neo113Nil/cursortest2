package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

/* loaded from: classes11.dex */
public final class EnterAmountUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountContentProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider> getOutputMinFrameDuration;

    private EnterAmountUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider7) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.Camera2StreamConfigurationMap = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider7) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountContentProvider enterAmountContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider howItWorksContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider, com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker urlMaker, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper(enterAmountContentProvider, howItWorksContentProvider, enterAmountConfig, cpiAvailabilityProvider, urlMaker, applicationFailureUiMapper, bnplAcquisitionFormatter);
    }
}
