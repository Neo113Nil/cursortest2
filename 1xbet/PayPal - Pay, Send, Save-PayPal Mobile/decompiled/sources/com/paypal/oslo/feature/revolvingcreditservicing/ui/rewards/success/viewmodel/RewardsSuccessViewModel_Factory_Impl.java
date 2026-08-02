package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel;

/* loaded from: classes14.dex */
public final class RewardsSuccessViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0420RewardsSuccessViewModel_Factory getHighSpeedVideoFpsRanges;

    private RewardsSuccessViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0420RewardsSuccessViewModel_Factory c0420RewardsSuccessViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0420RewardsSuccessViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsSuccessArgs rewardsSuccessArgs) {
        return this.getHighSpeedVideoFpsRanges.get(rewardsSuccessArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0420RewardsSuccessViewModel_Factory c0420RewardsSuccessViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel_Factory_Impl(c0420RewardsSuccessViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0420RewardsSuccessViewModel_Factory c0420RewardsSuccessViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel_Factory_Impl(c0420RewardsSuccessViewModel_Factory));
    }
}
