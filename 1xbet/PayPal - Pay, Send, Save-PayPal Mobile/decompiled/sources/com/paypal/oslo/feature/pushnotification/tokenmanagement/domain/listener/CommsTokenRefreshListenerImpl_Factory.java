package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener;

/* loaded from: classes13.dex */
public final class CommsTokenRefreshListenerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl_Factory create() {
        return com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl newInstance() {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl_Factory();

        private InstanceHolder() {
        }
    }
}
