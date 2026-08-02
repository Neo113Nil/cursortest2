package com.paypal.oslo.app.emw.di;

/* loaded from: classes10.dex */
public final class EmwNavigationModule_ProvideEmwEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private EmwNavigationModule_ProvideEmwEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEmwEntryProvider(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.emw.di.EmwNavigationModule_ProvideEmwEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.app.emw.di.EmwNavigationModule_ProvideEmwEntryProviderFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEmwEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.emw.di.EmwNavigationModule.INSTANCE.provideEmwEntryProvider(appNavigator));
    }
}
