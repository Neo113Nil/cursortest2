package com.paypal.oslo.feature.inappcheckout.features.switchback;

/* loaded from: classes13.dex */
public final class SwitchBackUriBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder_Factory();

        private InstanceHolder() {
        }
    }
}
