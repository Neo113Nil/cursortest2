package com.paypal.oslo.feature.shoppingrewards.rewards.common.di;

/* loaded from: classes15.dex */
public final class RewardsUiModule_ProvideActiveOffersEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private RewardsUiModule_ProvideActiveOffersEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideActiveOffersEntryProviderInstaller(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideActiveOffersEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideActiveOffersEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideActiveOffersEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule.INSTANCE.provideActiveOffersEntryProviderInstaller(appNavigator));
    }
}
