package com.paypal.oslo.app.navigation;

/* loaded from: classes10.dex */
public final class NavigationConfigSectionResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.app.navigation.NavigationConfigSectionResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationFlowSetter> getHighSpeedVideoFpsRanges;

    private NavigationConfigSectionResolver_Factory(dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationFlowSetter> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.navigation.NavigationConfigSectionResolver get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.app.navigation.NavigationConfigSectionResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationFlowSetter> provider) {
        return new com.paypal.oslo.app.navigation.NavigationConfigSectionResolver_Factory(provider);
    }

    public static com.paypal.oslo.app.navigation.NavigationConfigSectionResolver newInstance(com.paypal.oslo.app.navigation.NavigationFlowSetter navigationFlowSetter) {
        return new com.paypal.oslo.app.navigation.NavigationConfigSectionResolver(navigationFlowSetter);
    }
}
