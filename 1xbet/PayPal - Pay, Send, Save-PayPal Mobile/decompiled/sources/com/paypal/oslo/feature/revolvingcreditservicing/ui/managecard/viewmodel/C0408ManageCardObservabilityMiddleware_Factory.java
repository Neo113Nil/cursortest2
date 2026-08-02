package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0408ManageCardObservabilityMiddleware_Factory {
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware get(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return newInstance(creditProductIdentifier);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware(creditProductIdentifier);
    }

    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory();

        private InstanceHolder() {
        }
    }
}
