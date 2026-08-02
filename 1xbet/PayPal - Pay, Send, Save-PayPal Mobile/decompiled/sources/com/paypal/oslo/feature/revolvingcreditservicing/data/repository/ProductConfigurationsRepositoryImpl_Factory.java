package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class ProductConfigurationsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductConfigurationsRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
