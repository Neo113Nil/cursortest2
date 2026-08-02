package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

/* loaded from: classes14.dex */
public final class CardActivationAnalyticsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationAnalyticsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> Camera2StreamConfigurationMap;

    private CardActivationAnalyticsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationAnalyticsMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationAnalyticsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationAnalyticsMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationAnalyticsMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationAnalyticsMiddleware(creditProductIdentifier);
    }
}
