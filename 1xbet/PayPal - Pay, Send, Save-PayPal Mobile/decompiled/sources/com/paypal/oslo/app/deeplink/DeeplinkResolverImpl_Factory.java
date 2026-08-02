package com.paypal.oslo.app.deeplink;

/* loaded from: classes10.dex */
public final class DeeplinkResolverImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.deeplink.DeeplinkResolverImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.deeplink.DeeplinkResolverImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.deeplink.DeeplinkResolverImpl_Factory create() {
        return com.paypal.oslo.app.deeplink.DeeplinkResolverImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.app.deeplink.DeeplinkResolverImpl newInstance() {
        return new com.paypal.oslo.app.deeplink.DeeplinkResolverImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.deeplink.DeeplinkResolverImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.app.deeplink.DeeplinkResolverImpl_Factory();

        private InstanceHolder() {
        }
    }
}
