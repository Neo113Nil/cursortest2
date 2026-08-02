package com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer;

/* loaded from: classes13.dex */
public final class PublicProfileReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer_Factory create() {
        return com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer newInstance() {
        return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer_Factory();

        private InstanceHolder() {
        }
    }
}
