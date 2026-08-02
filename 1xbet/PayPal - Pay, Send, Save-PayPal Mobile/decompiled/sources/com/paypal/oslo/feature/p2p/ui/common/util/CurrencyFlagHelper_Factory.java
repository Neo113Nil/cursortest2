package com.paypal.oslo.feature.p2p.ui.common.util;

/* loaded from: classes13.dex */
public final class CurrencyFlagHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper_Factory();

        private InstanceHolder() {
        }
    }
}
