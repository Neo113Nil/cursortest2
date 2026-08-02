package com.paypal.oslo.feature.oneonboarding.data.parser.registry;

/* loaded from: classes13.dex */
public final class StepComponentParserRegistry_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?>>> getHighSpeedVideoFpsRanges;

    private StepComponentParserRegistry_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?>>> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?>>> provider) {
        return new com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry newInstance(java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?>> set) {
        return new com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry(set);
    }
}
