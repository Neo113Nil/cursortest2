package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

/* loaded from: classes15.dex */
public final class TaxDocumentsReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer_Factory create() {
        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer newInstance() {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer_Factory();

        private InstanceHolder() {
        }
    }
}
