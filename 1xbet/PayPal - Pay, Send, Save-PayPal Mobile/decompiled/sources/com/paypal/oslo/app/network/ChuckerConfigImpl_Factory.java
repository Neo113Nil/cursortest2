package com.paypal.oslo.app.network;

/* loaded from: classes10.dex */
public final class ChuckerConfigImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.network.ChuckerConfigImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.network.ChuckerConfigImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.network.ChuckerConfigImpl_Factory create() {
        return com.paypal.oslo.app.network.ChuckerConfigImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.app.network.ChuckerConfigImpl newInstance() {
        return new com.paypal.oslo.app.network.ChuckerConfigImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.network.ChuckerConfigImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.app.network.ChuckerConfigImpl_Factory();

        private InstanceHolder() {
        }
    }
}
