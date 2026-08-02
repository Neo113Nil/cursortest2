package com.paypal.oslo.core.remoteconfig;

/* loaded from: classes10.dex */
public final class RemoteConfigStateHolder_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder_Factory create() {
        return com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder newInstance() {
        return new com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder_Factory();

        private InstanceHolder() {
        }
    }
}
