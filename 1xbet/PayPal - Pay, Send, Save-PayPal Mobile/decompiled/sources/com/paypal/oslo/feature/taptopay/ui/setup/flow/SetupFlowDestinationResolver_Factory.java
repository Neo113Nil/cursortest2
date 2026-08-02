package com.paypal.oslo.feature.taptopay.ui.setup.flow;

/* loaded from: classes15.dex */
public final class SetupFlowDestinationResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver_Factory create() {
        return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver newInstance() {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationResolver_Factory();

        private InstanceHolder() {
        }
    }
}
