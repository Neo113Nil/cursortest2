package com.paypal.oslo.app.navigation.di;

/* loaded from: classes4.dex */
public final class NavigationConfigModule_ProvideNavigationSectionFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.ConfigSection> {
    private final dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationConfigSectionResolver> Camera2StreamConfigurationMap;

    private NavigationConfigModule_ProvideNavigationSectionFactory(dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationConfigSectionResolver> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.ConfigSection get() {
        return provideNavigationSection(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.navigation.di.NavigationConfigModule_ProvideNavigationSectionFactory create(dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationConfigSectionResolver> provider) {
        return new com.paypal.oslo.app.navigation.di.NavigationConfigModule_ProvideNavigationSectionFactory(provider);
    }

    public static com.paypal.oslo.core.companion.domain.ConfigSection provideNavigationSection(com.paypal.oslo.app.navigation.NavigationConfigSectionResolver navigationConfigSectionResolver) {
        return (com.paypal.oslo.core.companion.domain.ConfigSection) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.navigation.di.NavigationConfigModule.INSTANCE.provideNavigationSection(navigationConfigSectionResolver));
    }
}
