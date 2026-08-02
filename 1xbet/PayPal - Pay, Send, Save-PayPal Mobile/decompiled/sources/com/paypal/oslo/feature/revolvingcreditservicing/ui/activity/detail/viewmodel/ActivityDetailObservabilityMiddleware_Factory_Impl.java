package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

/* loaded from: classes14.dex */
public final class ActivityDetailObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0384ActivityDetailObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI;

    private ActivityDetailObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0384ActivityDetailObservabilityMiddleware_Factory c0384ActivityDetailObservabilityMiddleware_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0384ActivityDetailObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0384ActivityDetailObservabilityMiddleware_Factory c0384ActivityDetailObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware_Factory_Impl(c0384ActivityDetailObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0384ActivityDetailObservabilityMiddleware_Factory c0384ActivityDetailObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware_Factory_Impl(c0384ActivityDetailObservabilityMiddleware_Factory));
    }
}
