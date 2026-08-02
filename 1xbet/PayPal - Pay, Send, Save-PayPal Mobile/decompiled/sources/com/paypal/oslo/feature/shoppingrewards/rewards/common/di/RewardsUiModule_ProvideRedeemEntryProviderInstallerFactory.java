package com.paypal.oslo.feature.shoppingrewards.rewards.common.di;

/* loaded from: classes15.dex */
public final class RewardsUiModule_ProvideRedeemEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> getHighSpeedVideoSizes;

    private RewardsUiModule_ProvideRedeemEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider2, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> provider4, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideRedeemEntryProviderInstaller(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideRedeemEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider2, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> provider4, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents> provider5) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule_ProvideRedeemEntryProviderInstallerFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideRedeemEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shoppingrewards.rewards.common.di.RewardsUiModule.INSTANCE.provideRedeemEntryProviderInstaller(appNavigator, amountScreenComponents, commonComponents, successScreenComponents, transferScreenComponents));
    }
}
