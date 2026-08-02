package com.paypal.oslo.feature.oneonboarding.data.parser;

/* loaded from: classes13.dex */
public final class OneOnboardingComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry> getHighSpeedVideoSizes;

    private OneOnboardingComponentParser_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry> provider) {
        return new com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser newInstance(com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry stepComponentParserRegistry) {
        return new com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser(stepComponentParserRegistry);
    }
}
