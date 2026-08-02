package com.paypal.oslo.core.captcha.ui;

/* loaded from: classes10.dex */
public final class CaptchaViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.core.captcha.ui.CaptchaViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> getHighSpeedVideoFpsRangesFor;

    private CaptchaViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.captcha.ui.CaptchaViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.captcha.ui.CaptchaViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider) {
        return new com.paypal.oslo.core.captcha.ui.CaptchaViewModel_Factory(provider);
    }

    public static com.paypal.oslo.core.captcha.ui.CaptchaViewModel newInstance(com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        return new com.paypal.oslo.core.captcha.ui.CaptchaViewModel(appInformation);
    }
}
