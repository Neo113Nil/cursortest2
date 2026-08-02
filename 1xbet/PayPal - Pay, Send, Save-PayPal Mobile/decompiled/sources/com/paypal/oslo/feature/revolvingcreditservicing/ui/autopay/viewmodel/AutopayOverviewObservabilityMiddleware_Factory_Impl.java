package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

/* loaded from: classes14.dex */
public final class AutopayOverviewObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0388AutopayOverviewObservabilityMiddleware_Factory getHighSpeedVideoFpsRanges;

    private AutopayOverviewObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0388AutopayOverviewObservabilityMiddleware_Factory c0388AutopayOverviewObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoFpsRanges = c0388AutopayOverviewObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoFpsRanges.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0388AutopayOverviewObservabilityMiddleware_Factory c0388AutopayOverviewObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware_Factory_Impl(c0388AutopayOverviewObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.C0388AutopayOverviewObservabilityMiddleware_Factory c0388AutopayOverviewObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware_Factory_Impl(c0388AutopayOverviewObservabilityMiddleware_Factory));
    }
}
