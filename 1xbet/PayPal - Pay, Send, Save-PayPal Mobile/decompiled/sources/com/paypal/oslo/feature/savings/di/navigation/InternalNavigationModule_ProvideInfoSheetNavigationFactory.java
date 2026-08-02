package com.paypal.oslo.feature.savings.di.navigation;

/* loaded from: classes14.dex */
public final class InternalNavigationModule_ProvideInfoSheetNavigationFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private InternalNavigationModule_ProvideInfoSheetNavigationFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideInfoSheetNavigation(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideInfoSheetNavigationFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideInfoSheetNavigationFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideInfoSheetNavigation(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.INSTANCE.provideInfoSheetNavigation(appNavigator));
    }
}
