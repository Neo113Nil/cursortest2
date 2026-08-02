package com.paypal.oslo.feature.revolvingcreditacquisition.di;

/* loaded from: classes14.dex */
public final class NavigationModule_ProvideWebViewDestinationResolverFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private NavigationModule_ProvideWebViewDestinationResolverFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver get() {
        return provideWebViewDestinationResolver(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule_ProvideWebViewDestinationResolverFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule_ProvideWebViewDestinationResolverFactory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver provideWebViewDestinationResolver(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.INSTANCE.provideWebViewDestinationResolver(appNavigator));
    }
}
