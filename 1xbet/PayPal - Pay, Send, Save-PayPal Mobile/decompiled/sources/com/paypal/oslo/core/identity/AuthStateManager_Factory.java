package com.paypal.oslo.core.identity;

/* loaded from: classes10.dex */
public final class AuthStateManager_Factory implements dagger.internal.Factory<com.paypal.oslo.core.identity.AuthStateManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.identity.AuthStateManager get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.identity.AuthStateManager_Factory create() {
        return com.paypal.oslo.core.identity.AuthStateManager_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.identity.AuthStateManager newInstance() {
        return new com.paypal.oslo.core.identity.AuthStateManager();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.identity.AuthStateManager_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.identity.AuthStateManager_Factory();

        private InstanceHolder() {
        }
    }
}
