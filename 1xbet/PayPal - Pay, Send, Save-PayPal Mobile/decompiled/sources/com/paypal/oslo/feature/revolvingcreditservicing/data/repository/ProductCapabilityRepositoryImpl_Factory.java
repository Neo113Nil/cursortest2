package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class ProductCapabilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
