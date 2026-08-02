package com.paypal.oslo.feature.userprofile.ui.utils;

/* loaded from: classes15.dex */
public final class AddressErrorHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private AddressErrorHandler_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler(context);
    }
}
