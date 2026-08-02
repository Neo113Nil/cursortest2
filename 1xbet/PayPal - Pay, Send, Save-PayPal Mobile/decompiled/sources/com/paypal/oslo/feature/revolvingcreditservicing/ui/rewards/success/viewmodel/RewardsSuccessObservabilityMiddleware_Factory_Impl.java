package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel;

/* loaded from: classes14.dex */
public final class RewardsSuccessObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory Camera2StreamConfigurationMap;

    private RewardsSuccessObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory c0419RewardsSuccessObservabilityMiddleware_Factory) {
        this.Camera2StreamConfigurationMap = c0419RewardsSuccessObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.Camera2StreamConfigurationMap.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory c0419RewardsSuccessObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware_Factory_Impl(c0419RewardsSuccessObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory c0419RewardsSuccessObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware_Factory_Impl(c0419RewardsSuccessObservabilityMiddleware_Factory));
    }
}
