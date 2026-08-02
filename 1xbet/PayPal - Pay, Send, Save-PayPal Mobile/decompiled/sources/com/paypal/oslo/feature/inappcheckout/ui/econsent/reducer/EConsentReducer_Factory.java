package com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer;

/* loaded from: classes13.dex */
public final class EConsentReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer_Factory();

        private InstanceHolder() {
        }
    }
}
