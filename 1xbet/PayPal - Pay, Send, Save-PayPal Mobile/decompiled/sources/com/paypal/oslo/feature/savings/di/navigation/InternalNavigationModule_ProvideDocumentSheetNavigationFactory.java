package com.paypal.oslo.feature.savings.di.navigation;

/* loaded from: classes14.dex */
public final class InternalNavigationModule_ProvideDocumentSheetNavigationFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private InternalNavigationModule_ProvideDocumentSheetNavigationFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideDocumentSheetNavigation(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideDocumentSheetNavigationFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideDocumentSheetNavigationFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDocumentSheetNavigation(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.INSTANCE.provideDocumentSheetNavigation(appNavigator));
    }
}
