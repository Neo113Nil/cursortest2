package com.paypal.oslo.feature.pools.navigation;

/* loaded from: classes13.dex */
public final class ErrorNavigationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler_Factory create() {
        return com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler newInstance() {
        return new com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler_Factory();

        private InstanceHolder() {
        }
    }
}
