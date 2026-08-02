package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0418RedeemRewardsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory> getHighSpeedVideoFpsRangesFor;

    private C0418RedeemRewardsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RedeemRewardsArgs redeemRewardsArgs) {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), redeemRewardsArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0418RedeemRewardsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0418RedeemRewardsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase redeemRewardsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsReducer redeemRewardsReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RedeemRewardsArgs redeemRewardsArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel(redeemRewardsUseCase, redeemRewardsReducer, factory, redeemRewardsArgs);
    }
}
