package com.paypal.oslo.feature.activity.ui.webview.model;

/* loaded from: classes10.dex */
public final class ActivityCommonSecureWebViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoFpsRangesFor;

    private ActivityCommonSecureWebViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder> provider2) {
        return new com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder activityWebViewUrlBuilder) {
        return new com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel(activityComposeConfig, activityWebViewUrlBuilder);
    }
}
