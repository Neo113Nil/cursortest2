package com.paypal.oslo.feature.cashin.di;

/* loaded from: classes11.dex */
public final class CashInNavigationModule_ProvideMethodSelectionNavigationFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private CashInNavigationModule_ProvideMethodSelectionNavigationFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideMethodSelectionNavigation(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cashin.di.CashInNavigationModule_ProvideMethodSelectionNavigationFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.cashin.di.CashInNavigationModule_ProvideMethodSelectionNavigationFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideMethodSelectionNavigation(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cashin.di.CashInNavigationModule.INSTANCE.provideMethodSelectionNavigation(appNavigator));
    }
}
