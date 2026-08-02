package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

/* loaded from: classes11.dex */
public final class PlanActivityMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider> getHighSpeedVideoFpsRangesFor;

    private PlanActivityMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider planDetailsContentProvider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanActivityMapper(bnplServFormatter, planDetailsContentProvider);
    }
}
