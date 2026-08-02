package com.paypal.oslo.feature.identity.shared.data;

/* loaded from: classes13.dex */
public final class PKCEGeneratorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl_Factory create() {
        return com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl newInstance() {
        return new com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.shared.data.PKCEGeneratorImpl_Factory();

        private InstanceHolder() {
        }
    }
}
