package com.paypal.oslo.feature.inappcheckout.ui.profile.reducer;

/* loaded from: classes13.dex */
public final class ProfileReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer_Factory();

        private InstanceHolder() {
        }
    }
}
