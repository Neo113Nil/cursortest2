package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

/* loaded from: classes14.dex */
public final class RedeemRewardsViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0418RedeemRewardsViewModel_Factory getHighSpeedVideoSizes;

    private RedeemRewardsViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0418RedeemRewardsViewModel_Factory c0418RedeemRewardsViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0418RedeemRewardsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RedeemRewardsArgs redeemRewardsArgs) {
        return this.getHighSpeedVideoSizes.get(redeemRewardsArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0418RedeemRewardsViewModel_Factory c0418RedeemRewardsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel_Factory_Impl(c0418RedeemRewardsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0418RedeemRewardsViewModel_Factory c0418RedeemRewardsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel_Factory_Impl(c0418RedeemRewardsViewModel_Factory));
    }
}
