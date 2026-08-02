package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

/* loaded from: classes11.dex */
public final class PayLaterHubReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubReducer_Factory();

        private InstanceHolder() {
        }
    }
}
