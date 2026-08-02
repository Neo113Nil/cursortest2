package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

/* loaded from: classes11.dex */
public final class AdditionalInfoUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoFpsRanges;

    private AdditionalInfoUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider3) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider additionalInfoContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper(additionalInfoContentProvider, applicationFailureUiMapper, configContext);
    }
}
