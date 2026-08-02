package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

/* loaded from: classes14.dex */
public final class RevolvingCreditWebViewObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0428RevolvingCreditWebViewObservabilityMiddleware_Factory Camera2StreamConfigurationMap;

    private RevolvingCreditWebViewObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0428RevolvingCreditWebViewObservabilityMiddleware_Factory c0428RevolvingCreditWebViewObservabilityMiddleware_Factory) {
        this.Camera2StreamConfigurationMap = c0428RevolvingCreditWebViewObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.Camera2StreamConfigurationMap.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0428RevolvingCreditWebViewObservabilityMiddleware_Factory c0428RevolvingCreditWebViewObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware_Factory_Impl(c0428RevolvingCreditWebViewObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.C0428RevolvingCreditWebViewObservabilityMiddleware_Factory c0428RevolvingCreditWebViewObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware_Factory_Impl(c0428RevolvingCreditWebViewObservabilityMiddleware_Factory));
    }
}
