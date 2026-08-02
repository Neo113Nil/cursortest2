package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0419RewardsSuccessObservabilityMiddleware_Factory {
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware get(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return newInstance(creditProductIdentifier);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware(creditProductIdentifier);
    }

    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0419RewardsSuccessObservabilityMiddleware_Factory();

        private InstanceHolder() {
        }
    }
}
