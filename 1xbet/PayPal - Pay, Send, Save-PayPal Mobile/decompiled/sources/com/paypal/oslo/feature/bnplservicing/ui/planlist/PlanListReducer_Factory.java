package com.paypal.oslo.feature.bnplservicing.ui.planlist;

/* loaded from: classes11.dex */
public final class PlanListReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer_Factory();

        private InstanceHolder() {
        }
    }
}
