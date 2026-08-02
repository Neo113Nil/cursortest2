package com.paypal.oslo.core.security;

/* loaded from: classes10.dex */
public final class ScreenshotPreventionController_Factory implements dagger.internal.Factory<com.paypal.oslo.core.security.ScreenshotPreventionController> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.security.ScreenshotPreventionController get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.security.ScreenshotPreventionController_Factory create() {
        return com.paypal.oslo.core.security.ScreenshotPreventionController_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.security.ScreenshotPreventionController newInstance() {
        return new com.paypal.oslo.core.security.ScreenshotPreventionController();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.security.ScreenshotPreventionController_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.security.ScreenshotPreventionController_Factory();

        private InstanceHolder() {
        }
    }
}
