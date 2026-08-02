package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

/* loaded from: classes11.dex */
public final class PayLaterHubOverviewMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> getHighSpeedVideoSizes;

    private PayLaterHubOverviewMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> provider5) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper planSectionMapper, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider payLaterHubContentProvider, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper bnplUrlHelper, com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig payLaterHubConfig) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper(bnplServFormatter, planSectionMapper, payLaterHubContentProvider, bnplUrlHelper, payLaterHubConfig);
    }
}
