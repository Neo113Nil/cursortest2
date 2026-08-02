package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

/* renamed from: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0312PlanDetailsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer> getHighSpeedVideoSizes;

    private C0312PlanDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel get(java.lang.String str, java.lang.String str2) {
        return newInstance(str, str2, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.C0312PlanDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> provider4) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.C0312PlanDetailsViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel newInstance(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer planDetailsReducer, com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase getPlanDetailsOverviewUseCase, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel(str, str2, planDetailsReducer, getPlanDetailsOverviewUseCase, planDetailsMapper, bnplServicingSessionStorage);
    }
}
