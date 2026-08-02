package com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data;

/* loaded from: classes13.dex */
public final class SignUpWithGoogleStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> getHighResolutionOutputSizeshNQ4ISI;

    private SignUpWithGoogleStepComponentParser_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParser get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParser_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParser newInstance(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParser(viewComponentParserRegistry);
    }
}
