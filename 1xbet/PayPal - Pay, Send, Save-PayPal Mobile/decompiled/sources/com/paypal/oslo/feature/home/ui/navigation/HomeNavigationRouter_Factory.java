package com.paypal.oslo.feature.home.ui.navigation;

/* loaded from: classes12.dex */
public final class HomeNavigationRouter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter_Factory create() {
        return com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter newInstance() {
        return new com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter_Factory();

        private InstanceHolder() {
        }
    }
}
