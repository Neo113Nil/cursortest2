package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

/* loaded from: classes11.dex */
public final class PlanDetailsMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig> getHighSpeedVideoSizes;

    private PlanDetailsMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig> provider4) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper planActivityMapper, com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider planDetailsContentProvider, com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig planDetailsConfig) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper(bnplServFormatter, planActivityMapper, planDetailsContentProvider, planDetailsConfig);
    }
}
