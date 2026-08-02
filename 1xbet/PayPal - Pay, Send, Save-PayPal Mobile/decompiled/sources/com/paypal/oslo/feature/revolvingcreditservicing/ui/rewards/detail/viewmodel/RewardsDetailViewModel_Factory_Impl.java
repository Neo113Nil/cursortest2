package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

/* loaded from: classes14.dex */
public final class RewardsDetailViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.C0416RewardsDetailViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private RewardsDetailViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.C0416RewardsDetailViewModel_Factory c0416RewardsDetailViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0416RewardsDetailViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs rewardsDetailArgs) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(rewardsDetailArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.C0416RewardsDetailViewModel_Factory c0416RewardsDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel_Factory_Impl(c0416RewardsDetailViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.C0416RewardsDetailViewModel_Factory c0416RewardsDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel_Factory_Impl(c0416RewardsDetailViewModel_Factory));
    }
}
