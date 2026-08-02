package com.paypal.oslo.app.environment.companion.di;

/* loaded from: classes4.dex */
public final class EnvironmentConfigModule_ProvideEnvironmentSectionFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.ConfigSection> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver> getHighResolutionOutputSizeshNQ4ISI;

    private EnvironmentConfigModule_ProvideEnvironmentSectionFactory(dagger.internal.Provider<com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.ConfigSection get() {
        return provideEnvironmentSection(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.environment.companion.di.EnvironmentConfigModule_ProvideEnvironmentSectionFactory create(dagger.internal.Provider<com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver> provider) {
        return new com.paypal.oslo.app.environment.companion.di.EnvironmentConfigModule_ProvideEnvironmentSectionFactory(provider);
    }

    public static com.paypal.oslo.core.companion.domain.ConfigSection provideEnvironmentSection(com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver environmentConfigSectionResolver) {
        return (com.paypal.oslo.core.companion.domain.ConfigSection) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.environment.companion.di.EnvironmentConfigModule.INSTANCE.provideEnvironmentSection(environmentConfigSectionResolver));
    }
}
