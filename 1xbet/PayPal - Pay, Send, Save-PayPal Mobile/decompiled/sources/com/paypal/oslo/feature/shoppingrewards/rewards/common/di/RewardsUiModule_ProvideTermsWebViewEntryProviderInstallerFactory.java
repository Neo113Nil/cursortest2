package com.paypal.oslo.feature.shoppingrewards.rewards.common.di;

/* loaded from: classes15.dex */
public final class RewardsUiModule_ProvideTermsWebViewEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private RewardsUiModule_ProvideTermsWebViewEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideTermsWebViewEntryProviderInstaller(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideTermsWebViewEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideTermsWebViewEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideTermsWebViewEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule.INSTANCE.provideTermsWebViewEntryProviderInstaller(appNavigator));
    }
}
