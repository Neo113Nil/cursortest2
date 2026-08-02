package com.paypal.oslo.feature.dataprivacy.di;

/* loaded from: classes12.dex */
public final class ErasureNavigationModule_ProvideErasurePendingEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private ErasureNavigationModule_ProvideErasurePendingEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideErasurePendingEntryProvider(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule_ProvideErasurePendingEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule_ProvideErasurePendingEntryProviderFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideErasurePendingEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.INSTANCE.provideErasurePendingEntryProvider(appNavigator));
    }
}
