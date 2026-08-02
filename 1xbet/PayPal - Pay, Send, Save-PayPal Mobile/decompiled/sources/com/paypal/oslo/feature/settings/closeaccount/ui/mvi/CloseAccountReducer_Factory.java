package com.paypal.oslo.feature.settings.closeaccount.ui.mvi;

/* loaded from: classes14.dex */
public final class CloseAccountReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer_Factory create() {
        return com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer newInstance() {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer_Factory();

        private InstanceHolder() {
        }
    }
}
