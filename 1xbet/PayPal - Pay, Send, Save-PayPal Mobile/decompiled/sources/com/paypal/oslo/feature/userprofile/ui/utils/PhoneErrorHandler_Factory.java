package com.paypal.oslo.feature.userprofile.ui.utils;

/* loaded from: classes15.dex */
public final class PhoneErrorHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private PhoneErrorHandler_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler(context);
    }
}
