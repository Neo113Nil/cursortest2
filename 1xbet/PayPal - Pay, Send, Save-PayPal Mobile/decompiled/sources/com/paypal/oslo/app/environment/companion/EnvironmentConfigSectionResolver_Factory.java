package com.paypal.oslo.app.environment.companion;

/* loaded from: classes10.dex */
public final class EnvironmentConfigSectionResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentSetter> getHighSpeedVideoSizes;

    private EnvironmentConfigSectionResolver_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentSetter> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentSetter> provider) {
        return new com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver_Factory(provider);
    }

    public static com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver newInstance(com.paypal.oslo.app.environment.EnvironmentSetter environmentSetter) {
        return new com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver(environmentSetter);
    }
}
