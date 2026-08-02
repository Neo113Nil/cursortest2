package com.paypal.oslo.feature.identity.sso.data.repository.checkout;

/* loaded from: classes13.dex */
public final class CheckoutWebSSOIntentStoreImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl_Factory create() {
        return com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl newInstance() {
        return new com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl_Factory();

        private InstanceHolder() {
        }
    }
}
