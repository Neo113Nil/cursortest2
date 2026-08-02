package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

/* loaded from: classes11.dex */
public final class PlanDetailsViewModel_Factory_Impl implements com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.Factory {
    private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.C0312PlanDetailsViewModel_Factory getHighSpeedVideoSizes;

    private PlanDetailsViewModel_Factory_Impl(com.paypal.oslo.feature.bnplservicing.ui.plandetails.C0312PlanDetailsViewModel_Factory c0312PlanDetailsViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0312PlanDetailsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.Factory
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel create(java.lang.String str, java.lang.String str2) {
        return this.getHighSpeedVideoSizes.get(str, str2);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.Factory> create(com.paypal.oslo.feature.bnplservicing.ui.plandetails.C0312PlanDetailsViewModel_Factory c0312PlanDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel_Factory_Impl(c0312PlanDetailsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.bnplservicing.ui.plandetails.C0312PlanDetailsViewModel_Factory c0312PlanDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel_Factory_Impl(c0312PlanDetailsViewModel_Factory));
    }
}
