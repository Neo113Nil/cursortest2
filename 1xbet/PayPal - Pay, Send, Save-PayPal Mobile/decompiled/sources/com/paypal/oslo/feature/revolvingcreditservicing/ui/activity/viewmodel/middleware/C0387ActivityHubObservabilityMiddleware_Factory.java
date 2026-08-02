package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0387ActivityHubObservabilityMiddleware_Factory {
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware get(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return newInstance(creditProductIdentifier);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware(creditProductIdentifier);
    }

    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.C0387ActivityHubObservabilityMiddleware_Factory();

        private InstanceHolder() {
        }
    }
}
