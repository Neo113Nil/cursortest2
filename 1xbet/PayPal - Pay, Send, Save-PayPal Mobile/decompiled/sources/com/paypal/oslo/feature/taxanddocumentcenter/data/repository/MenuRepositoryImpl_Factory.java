package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class MenuRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.MenuRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
