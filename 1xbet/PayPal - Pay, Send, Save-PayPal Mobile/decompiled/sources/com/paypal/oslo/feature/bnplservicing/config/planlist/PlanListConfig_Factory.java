package com.paypal.oslo.feature.bnplservicing.config.planlist;

/* loaded from: classes11.dex */
public final class PlanListConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> getHighSpeedVideoFpsRanges;

    private PlanListConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig newInstance(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig(configContext);
    }
}
