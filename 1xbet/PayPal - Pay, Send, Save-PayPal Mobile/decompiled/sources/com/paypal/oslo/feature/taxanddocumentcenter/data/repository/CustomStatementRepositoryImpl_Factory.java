package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class CustomStatementRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.CustomStatementRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
