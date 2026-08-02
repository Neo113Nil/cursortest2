package com.paypal.oslo.feature.dataprivacy.di;

/* loaded from: classes12.dex */
public final class NavigationModule_ProvideDataAccessIntroEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideDataAccessIntroEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideDataAccessIntroEntryProvider(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.di.NavigationModule_ProvideDataAccessIntroEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.dataprivacy.di.NavigationModule_ProvideDataAccessIntroEntryProviderFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDataAccessIntroEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.dataprivacy.di.NavigationModule.INSTANCE.provideDataAccessIntroEntryProvider(appNavigator));
    }
}
