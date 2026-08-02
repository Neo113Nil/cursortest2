package com.paypal.oslo.feature.userprofile.ui.utils;

/* loaded from: classes15.dex */
public final class ValidationErrorMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private ValidationErrorMapper_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper(context);
    }
}
