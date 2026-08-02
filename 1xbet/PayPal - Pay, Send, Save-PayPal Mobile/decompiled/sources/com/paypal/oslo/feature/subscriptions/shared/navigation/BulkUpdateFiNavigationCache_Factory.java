package com.paypal.oslo.feature.subscriptions.shared.navigation;

/* loaded from: classes15.dex */
public final class BulkUpdateFiNavigationCache_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache_Factory create() {
        return com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache newInstance() {
        return new com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache_Factory();

        private InstanceHolder() {
        }
    }
}
