package com.paypal.oslo.feature.dataprivacy.di;

/* loaded from: classes12.dex */
public final class ErasureNavigationModule_ProvideEmailConfirmationEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private ErasureNavigationModule_ProvideEmailConfirmationEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEmailConfirmationEntryProvider(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule_ProvideEmailConfirmationEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule_ProvideEmailConfirmationEntryProviderFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEmailConfirmationEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.INSTANCE.provideEmailConfirmationEntryProvider(appNavigator));
    }
}
