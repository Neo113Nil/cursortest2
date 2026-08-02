package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

/* loaded from: classes12.dex */
public final class InboundConnectReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer_Factory create() {
        return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer newInstance() {
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer_Factory();

        private InstanceHolder() {
        }
    }
}
