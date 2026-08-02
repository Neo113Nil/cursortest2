package com.paypal.oslo.app.environment;

/* loaded from: classes10.dex */
public final class EnvironmentManager_Factory implements dagger.internal.Factory<com.paypal.oslo.app.environment.EnvironmentManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.environment.EnvironmentManager get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.environment.EnvironmentManager_Factory create() {
        return com.paypal.oslo.app.environment.EnvironmentManager_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.app.environment.EnvironmentManager newInstance() {
        return new com.paypal.oslo.app.environment.EnvironmentManager();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.environment.EnvironmentManager_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.app.environment.EnvironmentManager_Factory();

        private InstanceHolder() {
        }
    }
}
