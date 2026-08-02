package com.paypal.oslo.feature.packagetracking.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvidePackageDetailEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private NavigationModule_ProvidePackageDetailEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return providePackageDetailEntry(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.packagetracking.di.NavigationModule_ProvidePackageDetailEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.packagetracking.di.NavigationModule_ProvidePackageDetailEntryFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePackageDetailEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.packagetracking.di.NavigationModule.INSTANCE.providePackageDetailEntry(appNavigator));
    }
}
