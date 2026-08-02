package com.paypal.oslo.feature.paypalassistant.linkhandler;

/* loaded from: classes13.dex */
public final class WebSchemeHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler_Factory create() {
        return com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler newInstance() {
        return new com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler_Factory();

        private InstanceHolder() {
        }
    }
}
