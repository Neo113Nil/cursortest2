package com.paypal.oslo.app.navigation;

/* loaded from: classes10.dex */
public final class NavigationFlowProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.navigation.NavigationFlowProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.navigation.NavigationFlowProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.navigation.NavigationFlowProviderImpl_Factory create() {
        return com.paypal.oslo.app.navigation.NavigationFlowProviderImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.app.navigation.NavigationFlowProviderImpl newInstance() {
        return new com.paypal.oslo.app.navigation.NavigationFlowProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.navigation.NavigationFlowProviderImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.app.navigation.NavigationFlowProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
