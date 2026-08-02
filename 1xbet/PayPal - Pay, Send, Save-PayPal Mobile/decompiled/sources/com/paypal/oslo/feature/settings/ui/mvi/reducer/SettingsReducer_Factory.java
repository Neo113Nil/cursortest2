package com.paypal.oslo.feature.settings.ui.mvi.reducer;

/* loaded from: classes14.dex */
public final class SettingsReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer_Factory create() {
        return com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer newInstance() {
        return new com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer_Factory();

        private InstanceHolder() {
        }
    }
}
