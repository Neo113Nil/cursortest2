package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

/* loaded from: classes14.dex */
public final class ActivityHubObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory getHighSpeedVideoFpsRangesFor;

    private ActivityHubObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory c0387ActivityHubObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0387ActivityHubObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoFpsRangesFor.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory c0387ActivityHubObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware_Factory_Impl(c0387ActivityHubObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory c0387ActivityHubObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware_Factory_Impl(c0387ActivityHubObservabilityMiddleware_Factory));
    }
}
