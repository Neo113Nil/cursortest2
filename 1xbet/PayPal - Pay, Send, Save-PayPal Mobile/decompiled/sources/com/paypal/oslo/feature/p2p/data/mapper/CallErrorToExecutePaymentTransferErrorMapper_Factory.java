package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class CallErrorToExecutePaymentTransferErrorMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper_Factory();

        private InstanceHolder() {
        }
    }
}
