package com.paypal.oslo.feature.paypalassistant.linkhandler;

/* loaded from: classes13.dex */
public final class FallbackSchemeHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler_Factory create() {
        return com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler newInstance() {
        return new com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler_Factory();

        private InstanceHolder() {
        }
    }
}
