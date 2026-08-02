package com.paypal.oslo.feature.identity.shared.data;

/* loaded from: classes13.dex */
public final class Base64EncoderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl_Factory create() {
        return com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl newInstance() {
        return new com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
