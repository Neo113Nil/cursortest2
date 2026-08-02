package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class GetActionFromLoadedUrlsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder> getHighSpeedVideoSizes;

    private GetActionFromLoadedUrlsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher switchBackUrlMatcher, com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder switchBackActionBuilder) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase(appSwitchSession, switchBackUrlMatcher, switchBackActionBuilder);
    }
}
