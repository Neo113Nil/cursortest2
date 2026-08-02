package com.paypal.oslo.feature.userprofile.ui.utils;

/* loaded from: classes15.dex */
public final class AddressBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder_Factory create() {
        return com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder newInstance() {
        return new com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder_Factory();

        private InstanceHolder() {
        }
    }
}
