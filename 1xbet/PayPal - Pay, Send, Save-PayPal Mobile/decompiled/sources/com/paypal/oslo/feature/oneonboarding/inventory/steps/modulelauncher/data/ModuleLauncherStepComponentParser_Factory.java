package com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data;

/* loaded from: classes13.dex */
public final class ModuleLauncherStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data.ModuleLauncherStepComponentParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> getHighSpeedVideoSizes;

    private ModuleLauncherStepComponentParser_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data.ModuleLauncherStepComponentParser get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data.ModuleLauncherStepComponentParser_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data.ModuleLauncherStepComponentParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data.ModuleLauncherStepComponentParser newInstance(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data.ModuleLauncherStepComponentParser(viewComponentParserRegistry);
    }
}
