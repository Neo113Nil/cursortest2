package com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.data;

/* loaded from: classes13.dex */
public final class CIPPersonalInfoStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.data.CIPPersonalInfoStepComponentParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> getHighSpeedVideoFpsRanges;

    private CIPPersonalInfoStepComponentParser_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.data.CIPPersonalInfoStepComponentParser get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.data.CIPPersonalInfoStepComponentParser_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.data.CIPPersonalInfoStepComponentParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.data.CIPPersonalInfoStepComponentParser newInstance(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.data.CIPPersonalInfoStepComponentParser(viewComponentParserRegistry);
    }
}
