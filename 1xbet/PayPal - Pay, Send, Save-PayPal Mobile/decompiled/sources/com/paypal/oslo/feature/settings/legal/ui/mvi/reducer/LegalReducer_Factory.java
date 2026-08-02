package com.paypal.oslo.feature.settings.legal.ui.mvi.reducer;

/* loaded from: classes14.dex */
public final class LegalReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer_Factory create() {
        return com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer newInstance() {
        return new com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer_Factory();

        private InstanceHolder() {
        }
    }
}
