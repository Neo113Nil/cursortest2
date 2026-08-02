package com.paypal.oslo.feature.packagetracking.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvidePackageSettingsEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvidePackageSettingsEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return providePackageSettingsEntry(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.packagetracking.di.NavigationModule_ProvidePackageSettingsEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.packagetracking.di.NavigationModule_ProvidePackageSettingsEntryFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePackageSettingsEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.packagetracking.di.NavigationModule.INSTANCE.providePackageSettingsEntry(appNavigator));
    }
}
