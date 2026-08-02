package com.paypal.oslo.feature.identity.login;

/* loaded from: classes12.dex */
public final class DefaultElapsedRealtimeProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider_Factory create() {
        return com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider newInstance() {
        return new com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider_Factory();

        private InstanceHolder() {
        }
    }
}
