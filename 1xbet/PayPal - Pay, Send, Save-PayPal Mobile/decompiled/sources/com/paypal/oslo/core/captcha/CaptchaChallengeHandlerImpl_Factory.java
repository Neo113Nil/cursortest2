package com.paypal.oslo.core.captcha;

/* loaded from: classes10.dex */
public final class CaptchaChallengeHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;

    private CaptchaChallengeHandlerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.core.captcha.CaptchaChallengeHandlerImpl(appNavigator);
    }
}
