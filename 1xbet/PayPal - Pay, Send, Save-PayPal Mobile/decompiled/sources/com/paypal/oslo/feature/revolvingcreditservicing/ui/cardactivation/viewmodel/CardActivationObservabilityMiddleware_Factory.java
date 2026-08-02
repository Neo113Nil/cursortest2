package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

/* loaded from: classes14.dex */
public final class CardActivationObservabilityMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationObservabilityMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> getHighResolutionOutputSizeshNQ4ISI;

    private CardActivationObservabilityMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationObservabilityMiddleware get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationObservabilityMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationObservabilityMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationObservabilityMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationObservabilityMiddleware(creditProductIdentifier);
    }
}
