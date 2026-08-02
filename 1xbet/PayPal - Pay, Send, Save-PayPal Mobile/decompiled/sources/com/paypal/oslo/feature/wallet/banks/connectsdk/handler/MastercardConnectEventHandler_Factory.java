package com.paypal.oslo.feature.wallet.banks.connectsdk.handler;

/* loaded from: classes15.dex */
public final class MastercardConnectEventHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler_Factory create() {
        return com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler newInstance() {
        return new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler_Factory();

        private InstanceHolder() {
        }
    }
}
