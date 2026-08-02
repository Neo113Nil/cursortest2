package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

/* loaded from: classes14.dex */
public final class PayFlowContainerReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer_Factory create() {
        return com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer newInstance() {
        return new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer_Factory();

        private InstanceHolder() {
        }
    }
}
