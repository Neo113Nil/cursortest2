package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

/* loaded from: classes14.dex */
public final class RedeemRewardsObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0417RedeemRewardsObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI;

    private RedeemRewardsObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0417RedeemRewardsObservabilityMiddleware_Factory c0417RedeemRewardsObservabilityMiddleware_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0417RedeemRewardsObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0417RedeemRewardsObservabilityMiddleware_Factory c0417RedeemRewardsObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware_Factory_Impl(c0417RedeemRewardsObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.C0417RedeemRewardsObservabilityMiddleware_Factory c0417RedeemRewardsObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsObservabilityMiddleware_Factory_Impl(c0417RedeemRewardsObservabilityMiddleware_Factory));
    }
}
