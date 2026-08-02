package com.paypal.oslo.feature.shoppingrewards.rewards.common.di;

/* loaded from: classes15.dex */
public final class RewardsUiModule_ProvideRewardsSummaryEarnEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> getHighSpeedVideoSizes;

    private RewardsUiModule_ProvideRewardsSummaryEarnEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideRewardsSummaryEarnEntryProviderInstaller(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideRewardsSummaryEarnEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideRewardsSummaryEarnEntryProviderInstallerFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideRewardsSummaryEarnEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule.INSTANCE.provideRewardsSummaryEarnEntryProviderInstaller(appNavigator, iActivityWidgetProvider));
    }
}
