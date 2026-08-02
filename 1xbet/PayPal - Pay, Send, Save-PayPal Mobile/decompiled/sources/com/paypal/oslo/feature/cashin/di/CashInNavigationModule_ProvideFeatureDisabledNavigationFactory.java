package com.paypal.oslo.feature.cashin.di;

/* loaded from: classes11.dex */
public final class CashInNavigationModule_ProvideFeatureDisabledNavigationFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private CashInNavigationModule_ProvideFeatureDisabledNavigationFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideFeatureDisabledNavigation(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cashin.di.CashInNavigationModule_ProvideFeatureDisabledNavigationFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.cashin.di.CashInNavigationModule_ProvideFeatureDisabledNavigationFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideFeatureDisabledNavigation(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cashin.di.CashInNavigationModule.INSTANCE.provideFeatureDisabledNavigation(appNavigator));
    }
}
