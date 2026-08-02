package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel;

/* loaded from: classes14.dex */
public final class LegacyServicingLandingObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0398LegacyServicingLandingObservabilityMiddleware_Factory getHighSpeedVideoSizes;

    private LegacyServicingLandingObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0398LegacyServicingLandingObservabilityMiddleware_Factory c0398LegacyServicingLandingObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoSizes = c0398LegacyServicingLandingObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoSizes.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0398LegacyServicingLandingObservabilityMiddleware_Factory c0398LegacyServicingLandingObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware_Factory_Impl(c0398LegacyServicingLandingObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0398LegacyServicingLandingObservabilityMiddleware_Factory c0398LegacyServicingLandingObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware_Factory_Impl(c0398LegacyServicingLandingObservabilityMiddleware_Factory));
    }
}
