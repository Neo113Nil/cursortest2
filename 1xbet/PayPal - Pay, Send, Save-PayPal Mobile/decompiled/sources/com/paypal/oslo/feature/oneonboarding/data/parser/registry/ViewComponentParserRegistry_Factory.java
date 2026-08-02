package com.paypal.oslo.feature.oneonboarding.data.parser.registry;

/* loaded from: classes13.dex */
public final class ViewComponentParserRegistry_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>>> Camera2StreamConfigurationMap;

    private ViewComponentParserRegistry_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>>> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>>> provider) {
        return new com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry newInstance(java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>> set) {
        return new com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry(set);
    }
}
