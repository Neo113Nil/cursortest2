package com.paypal.oslo.core.navigation.result;

/* loaded from: classes10.dex */
public final class NavResultManager_Factory implements dagger.internal.Factory<com.paypal.oslo.core.navigation.result.NavResultManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.navigation.result.NavResultManager get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.navigation.result.NavResultManager_Factory create() {
        return com.paypal.oslo.core.navigation.result.NavResultManager_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.navigation.result.NavResultManager newInstance() {
        return new com.paypal.oslo.core.navigation.result.NavResultManager();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.navigation.result.NavResultManager_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.navigation.result.NavResultManager_Factory();

        private InstanceHolder() {
        }
    }
}
