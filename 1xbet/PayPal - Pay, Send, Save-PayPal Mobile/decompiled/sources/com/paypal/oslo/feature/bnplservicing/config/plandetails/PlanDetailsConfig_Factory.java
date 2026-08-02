package com.paypal.oslo.feature.bnplservicing.config.plandetails;

/* loaded from: classes11.dex */
public final class PlanDetailsConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> getHighSpeedVideoSizes;

    private PlanDetailsConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig newInstance(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanDetailsConfig(configContext);
    }
}
