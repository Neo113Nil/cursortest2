package com.paypal.oslo.feature.xoom.data.encoder;

/* loaded from: classes16.dex */
public final class AndroidBase64Encoder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder_Factory create() {
        return com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder newInstance() {
        return new com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.xoom.data.encoder.AndroidBase64Encoder_Factory();

        private InstanceHolder() {
        }
    }
}
