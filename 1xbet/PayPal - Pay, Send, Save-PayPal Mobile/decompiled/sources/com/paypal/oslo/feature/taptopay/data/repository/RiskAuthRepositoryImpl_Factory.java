package com.paypal.oslo.feature.taptopay.data.repository;

/* loaded from: classes15.dex */
public final class RiskAuthRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.data.repository.RiskAuthRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
