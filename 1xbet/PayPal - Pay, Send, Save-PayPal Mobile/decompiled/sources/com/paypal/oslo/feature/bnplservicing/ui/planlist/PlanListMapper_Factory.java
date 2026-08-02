package com.paypal.oslo.feature.bnplservicing.ui.planlist;

/* loaded from: classes11.dex */
public final class PlanListMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider> getHighSpeedVideoSizes;

    private PlanListMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider planListContentProvider, com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig planListConfig) {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper(bnplServFormatter, planListContentProvider, planListConfig);
    }
}
