package com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data;

/* loaded from: classes13.dex */
public final class SavingsCIPW9StepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> getHighResolutionOutputSizeshNQ4ISI;

    private SavingsCIPW9StepComponentParser_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser newInstance(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser(viewComponentParserRegistry);
    }
}
