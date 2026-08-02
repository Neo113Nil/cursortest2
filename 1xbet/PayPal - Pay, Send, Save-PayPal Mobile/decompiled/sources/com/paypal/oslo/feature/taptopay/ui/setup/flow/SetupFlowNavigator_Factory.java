package com.paypal.oslo.feature.taptopay.ui.setup.flow;

/* loaded from: classes15.dex */
public final class SetupFlowNavigator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator_Factory create() {
        return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator newInstance() {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator_Factory();

        private InstanceHolder() {
        }
    }
}
