package com.paypal.oslo.feature.inappcheckout.ui.card.reducer;

/* loaded from: classes13.dex */
public final class CardFormReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer_Factory();

        private InstanceHolder() {
        }
    }
}
