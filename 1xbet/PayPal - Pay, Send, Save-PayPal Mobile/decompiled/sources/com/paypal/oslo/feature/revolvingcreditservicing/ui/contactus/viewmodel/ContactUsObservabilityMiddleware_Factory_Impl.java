package com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel;

/* loaded from: classes14.dex */
public final class ContactUsObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0396ContactUsObservabilityMiddleware_Factory getHighSpeedVideoFpsRanges;

    private ContactUsObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0396ContactUsObservabilityMiddleware_Factory c0396ContactUsObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoFpsRanges = c0396ContactUsObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoFpsRanges.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0396ContactUsObservabilityMiddleware_Factory c0396ContactUsObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware_Factory_Impl(c0396ContactUsObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.C0396ContactUsObservabilityMiddleware_Factory c0396ContactUsObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware_Factory_Impl(c0396ContactUsObservabilityMiddleware_Factory));
    }
}
