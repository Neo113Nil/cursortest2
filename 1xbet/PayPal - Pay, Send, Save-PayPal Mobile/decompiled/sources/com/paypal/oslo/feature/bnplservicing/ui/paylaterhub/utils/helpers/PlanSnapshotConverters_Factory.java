package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

/* loaded from: classes11.dex */
public final class PlanSnapshotConverters_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> getHighSpeedVideoSizes;

    private PlanSnapshotConverters_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> provider4) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers planListHelpers, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider payLaterHubContentProvider, com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig payLaterHubConfig) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters(bnplServFormatter, planListHelpers, payLaterHubContentProvider, payLaterHubConfig);
    }
}
