package com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer;

/* loaded from: classes13.dex */
public final class InstantVaultReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer_Factory();

        private InstanceHolder() {
        }
    }
}
