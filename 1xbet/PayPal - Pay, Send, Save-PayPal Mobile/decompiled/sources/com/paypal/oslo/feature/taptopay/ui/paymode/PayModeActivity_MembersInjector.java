package com.paypal.oslo.feature.taptopay.ui.paymode;

/* loaded from: classes15.dex */
public final class PayModeActivity_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager> getHighSpeedVideoSizes;

    private PayModeActivity_MembersInjector(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity) {
        injectReAuthPromptManager(payModeActivity, this.getHighSpeedVideoSizes.get());
        injectNavResultManager(payModeActivity, this.Camera2StreamConfigurationMap.get());
        injectAppNavigator(payModeActivity, this.getHighSpeedVideoFpsRangesFor.get());
        injectSetPreferredAppForOneTimeUseCase(payModeActivity, this.getHighResolutionOutputSizeshNQ4ISI.get());
        injectUnsetPreferredAppForOneTimeUseCase(payModeActivity, this.getHighSpeedVideoFpsRanges.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity> create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase> provider5) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectReAuthPromptManager(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager reAuthPromptManager) {
        payModeActivity.reAuthPromptManager = reAuthPromptManager;
    }

    public static void injectNavResultManager(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager) {
        payModeActivity.navResultManager = navResultManager;
    }

    public static void injectAppNavigator(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        payModeActivity.appNavigator = appNavigator;
    }

    public static void injectSetPreferredAppForOneTimeUseCase(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase payPalSetPreferredAppForOneTimeUseCase) {
        payModeActivity.setPreferredAppForOneTimeUseCase = payPalSetPreferredAppForOneTimeUseCase;
    }

    public static void injectUnsetPreferredAppForOneTimeUseCase(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase payPalUnsetPreferredAppForOneTimeUseCase) {
        payModeActivity.unsetPreferredAppForOneTimeUseCase = payPalUnsetPreferredAppForOneTimeUseCase;
    }
}
