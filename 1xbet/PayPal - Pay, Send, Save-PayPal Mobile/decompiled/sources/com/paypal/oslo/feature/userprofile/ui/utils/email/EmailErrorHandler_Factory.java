package com.paypal.oslo.feature.userprofile.ui.utils.email;

/* loaded from: classes15.dex */
public final class EmailErrorHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.config.UserProfileConfig> getHighResolutionOutputSizeshNQ4ISI;

    private EmailErrorHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.config.UserProfileConfig> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.config.UserProfileConfig> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler newInstance(com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler(userProfileConfig);
    }
}
