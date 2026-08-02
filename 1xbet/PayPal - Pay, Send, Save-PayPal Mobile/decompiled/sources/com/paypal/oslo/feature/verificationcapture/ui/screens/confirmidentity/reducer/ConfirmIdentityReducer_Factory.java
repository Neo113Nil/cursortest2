package com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer;

/* loaded from: classes15.dex */
public final class ConfirmIdentityReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer_Factory();

        private InstanceHolder() {
        }
    }
}
