package com.paypal.oslo.feature.businesshome.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideWebViewEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private NavigationModule_ProvideWebViewEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideWebViewEntry(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideWebViewEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideWebViewEntryFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideWebViewEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesshome.di.NavigationModule.INSTANCE.provideWebViewEntry(appNavigator));
    }
}
