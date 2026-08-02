package com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper;

/* loaded from: classes11.dex */
public final class OffersUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> getHighSpeedVideoSizes;

    private OffersUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider5) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider offersContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig offersConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper(bnplAcquisitionFormatter, offersContentProvider, applicationFailureUiMapper, offersConfig, exitConfirmationContentProvider);
    }
}
