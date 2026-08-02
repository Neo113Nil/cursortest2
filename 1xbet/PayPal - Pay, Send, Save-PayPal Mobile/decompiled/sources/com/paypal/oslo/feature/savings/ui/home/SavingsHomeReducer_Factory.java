package com.paypal.oslo.feature.savings.ui.home;

/* loaded from: classes14.dex */
public final class SavingsHomeReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer_Factory create() {
        return com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer newInstance() {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer_Factory();

        private InstanceHolder() {
        }
    }
}
