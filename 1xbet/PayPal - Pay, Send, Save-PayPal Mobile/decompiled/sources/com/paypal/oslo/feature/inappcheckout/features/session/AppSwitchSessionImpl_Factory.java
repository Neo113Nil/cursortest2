package com.paypal.oslo.feature.inappcheckout.features.session;

/* loaded from: classes13.dex */
public final class AppSwitchSessionImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl_Factory();

        private InstanceHolder() {
        }
    }
}
