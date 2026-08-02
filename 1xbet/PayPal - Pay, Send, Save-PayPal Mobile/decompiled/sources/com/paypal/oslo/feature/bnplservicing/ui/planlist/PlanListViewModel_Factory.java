package com.paypal.oslo.feature.bnplservicing.ui.planlist;

/* loaded from: classes11.dex */
public final class PlanListViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer> getHighSpeedVideoSizes;

    private PlanListViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer> provider5) {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel newInstance(com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase getPlanListOverviewUseCase, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper planListMapper, com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer planListReducer) {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel(getPlanListOverviewUseCase, planListMapper, supportedCpisConfig, bnplServicingSessionStorage, planListReducer);
    }
}
