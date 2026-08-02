package com.paypal.oslo.core.captcha.interceptor;

/* loaded from: classes10.dex */
public final class CaptchaInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.core.captcha.CaptchaChallengeHandler> getHighResolutionOutputSizeshNQ4ISI;

    private CaptchaInterceptor_Factory(dagger.internal.Provider<com.paypal.oslo.core.captcha.CaptchaChallengeHandler> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor_Factory create(dagger.internal.Provider<com.paypal.oslo.core.captcha.CaptchaChallengeHandler> provider) {
        return new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor_Factory(provider);
    }

    public static com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor newInstance(com.paypal.oslo.core.captcha.CaptchaChallengeHandler captchaChallengeHandler) {
        return new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor(captchaChallengeHandler);
    }
}
