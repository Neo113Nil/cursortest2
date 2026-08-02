package com.paypal.oslo.feature.bnplservicing.ui.planlist.content;

/* loaded from: classes11.dex */
public final class PlanListContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
