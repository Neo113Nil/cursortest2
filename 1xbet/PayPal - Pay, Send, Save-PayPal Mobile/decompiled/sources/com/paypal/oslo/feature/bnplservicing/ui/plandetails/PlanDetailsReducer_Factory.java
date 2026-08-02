package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

/* loaded from: classes11.dex */
public final class PlanDetailsReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsReducer_Factory();

        private InstanceHolder() {
        }
    }
}
