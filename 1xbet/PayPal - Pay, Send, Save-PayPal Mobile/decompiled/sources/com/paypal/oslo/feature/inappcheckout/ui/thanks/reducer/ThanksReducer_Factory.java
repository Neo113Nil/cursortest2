package com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer;

/* loaded from: classes13.dex */
public final class ThanksReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer_Factory();

        private InstanceHolder() {
        }
    }
}
