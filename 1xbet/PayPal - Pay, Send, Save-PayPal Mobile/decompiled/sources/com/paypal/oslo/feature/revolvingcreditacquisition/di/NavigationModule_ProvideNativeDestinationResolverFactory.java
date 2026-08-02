package com.paypal.oslo.feature.revolvingcreditacquisition.di;

/* loaded from: classes14.dex */
public final class NavigationModule_ProvideNativeDestinationResolverFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideNativeDestinationResolverFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver get() {
        return provideNativeDestinationResolver(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule_ProvideNativeDestinationResolverFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule_ProvideNativeDestinationResolverFactory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver provideNativeDestinationResolver(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.INSTANCE.provideNativeDestinationResolver(appNavigator));
    }
}
