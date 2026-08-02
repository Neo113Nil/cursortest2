package com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.data;

/* loaded from: classes13.dex */
public final class TermsStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.data.TermsStepComponentParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> getHighResolutionOutputSizeshNQ4ISI;

    private TermsStepComponentParser_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.data.TermsStepComponentParser get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.data.TermsStepComponentParser_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.data.TermsStepComponentParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.data.TermsStepComponentParser newInstance(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.data.TermsStepComponentParser(viewComponentParserRegistry);
    }
}
