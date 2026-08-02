package com.paypal.oslo.feature.bnplservicing.ui.plandetails.content;

/* loaded from: classes11.dex */
public final class PlanDetailsContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
