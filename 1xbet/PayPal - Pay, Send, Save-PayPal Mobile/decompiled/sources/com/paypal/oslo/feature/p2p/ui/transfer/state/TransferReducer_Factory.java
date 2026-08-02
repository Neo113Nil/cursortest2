package com.paypal.oslo.feature.p2p.ui.transfer.state;

/* loaded from: classes13.dex */
public final class TransferReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer_Factory();

        private InstanceHolder() {
        }
    }
}
