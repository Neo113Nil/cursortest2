package com.paypal.oslo.feature.idassurance.di;

/* loaded from: classes12.dex */
public final class NavigationModule_ProvideIdassuranceEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideIdassuranceEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideIdassuranceEntry(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.idassurance.di.NavigationModule_ProvideIdassuranceEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider2) {
        return new com.paypal.oslo.feature.idassurance.di.NavigationModule_ProvideIdassuranceEntryFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideIdassuranceEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.network.rest.config.RestConfig restConfig) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.idassurance.di.NavigationModule.INSTANCE.provideIdassuranceEntry(appNavigator, restConfig));
    }
}
