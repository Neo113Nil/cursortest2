package com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement;

/* loaded from: classes15.dex */
public final class GenerateStatementRequestMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper_Factory create() {
        return com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper newInstance() {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper_Factory();

        private InstanceHolder() {
        }
    }
}
