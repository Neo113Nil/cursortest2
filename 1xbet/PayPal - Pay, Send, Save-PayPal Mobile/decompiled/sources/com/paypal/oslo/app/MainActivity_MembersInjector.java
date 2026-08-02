package com.paypal.oslo.app;

/* loaded from: classes10.dex */
public final class MainActivity_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.app.MainActivity> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.app.launch.AppLaunchSourceTracker> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.app.identity.AppTokenProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>>> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationConfigProvider> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.app.pds.PdsHighlightProvider> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider>> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.app.navigation.StartDestinationProvider> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> getOutputSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.datadog.TTFDReporting> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> getOutputStallDuration;

    private MainActivity_MembersInjector(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>>> provider2, dagger.internal.Provider<com.paypal.oslo.app.navigation.StartDestinationProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker> provider4, dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationConfigProvider> provider5, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider6, dagger.internal.Provider<com.paypal.oslo.app.identity.AppTokenProvider> provider7, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider>> provider8, dagger.internal.Provider<com.paypal.oslo.app.pds.PdsHighlightProvider> provider9, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.datadog.TTFDReporting> provider10, dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider11, dagger.internal.Provider<com.paypal.oslo.app.launch.AppLaunchSourceTracker> provider12, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler> provider13) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getOutputMinFrameDuration = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getOutputSizes = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
        this.getOutputFormats = provider8;
        this.getInputSizeshNQ4ISI = provider9;
        this.getOutputSizeshNQ4ISI = provider10;
        this.getOutputStallDuration = provider11;
        this.getHighResolutionOutputSizeshNQ4ISI = provider12;
        this.getHighSpeedVideoSizesFor = provider13;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.app.MainActivity mainActivity) {
        injectNavigator(mainActivity, this.getInputFormats.get());
        injectEntryProviderInstallers(mainActivity, this.getHighSpeedVideoFpsRangesFor.get());
        injectStartDestinationProvider(mainActivity, this.getOutputMinFrameDuration.get());
        injectNav3ViewTracker(mainActivity, this.Camera2StreamConfigurationMap.get());
        injectNavigationConfigProvider(mainActivity, this.getHighSpeedVideoSizes.get());
        injectTokenProvider(mainActivity, this.getOutputSizes.get());
        injectAppTokenProvider(mainActivity, this.getHighSpeedVideoFpsRanges.get());
        injectOverlayProviders(mainActivity, this.getOutputFormats.get());
        injectPdsHighlightProvider(mainActivity, this.getInputSizeshNQ4ISI.get());
        injectTelemetryTTFDReporting(mainActivity, this.getOutputSizeshNQ4ISI.get());
        injectTelemetryFeatureGateProvider(mainActivity, this.getOutputStallDuration.get());
        injectAppLaunchSourceTracker(mainActivity, this.getHighResolutionOutputSizeshNQ4ISI.get());
        injectNotificationIntentHandler(mainActivity, this.getHighSpeedVideoSizesFor.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.app.MainActivity> create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>>> provider2, dagger.internal.Provider<com.paypal.oslo.app.navigation.StartDestinationProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker> provider4, dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationConfigProvider> provider5, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider6, dagger.internal.Provider<com.paypal.oslo.app.identity.AppTokenProvider> provider7, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider>> provider8, dagger.internal.Provider<com.paypal.oslo.app.pds.PdsHighlightProvider> provider9, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.datadog.TTFDReporting> provider10, dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider11, dagger.internal.Provider<com.paypal.oslo.app.launch.AppLaunchSourceTracker> provider12, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler> provider13) {
        return new com.paypal.oslo.app.MainActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectNavigator(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        mainActivity.navigator = appNavigator;
    }

    public static void injectEntryProviderInstallers(com.paypal.oslo.app.MainActivity mainActivity, java.util.Set<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> set) {
        mainActivity.entryProviderInstallers = set;
    }

    public static void injectStartDestinationProvider(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.app.navigation.StartDestinationProvider startDestinationProvider) {
        mainActivity.startDestinationProvider = startDestinationProvider;
    }

    public static void injectNav3ViewTracker(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker) {
        mainActivity.nav3ViewTracker = nav3ViewTracker;
    }

    public static void injectNavigationConfigProvider(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.app.navigation.NavigationConfigProvider navigationConfigProvider) {
        mainActivity.navigationConfigProvider = navigationConfigProvider;
    }

    public static void injectTokenProvider(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        mainActivity.tokenProvider = tokenProvider;
    }

    public static void injectAppTokenProvider(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider) {
        mainActivity.appTokenProvider = appTokenProvider;
    }

    public static void injectOverlayProviders(com.paypal.oslo.app.MainActivity mainActivity, java.util.Set<com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> set) {
        mainActivity.overlayProviders = set;
    }

    public static void injectPdsHighlightProvider(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.app.pds.PdsHighlightProvider pdsHighlightProvider) {
        mainActivity.pdsHighlightProvider = pdsHighlightProvider;
    }

    public static void injectTelemetryTTFDReporting(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.core.telemetry.vendors.datadog.TTFDReporting tTFDReporting) {
        mainActivity.telemetryTTFDReporting = tTFDReporting;
    }

    public static void injectTelemetryFeatureGateProvider(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        mainActivity.telemetryFeatureGateProvider = telemetryFeatureGateProvider;
    }

    public static void injectAppLaunchSourceTracker(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.app.launch.AppLaunchSourceTracker appLaunchSourceTracker) {
        mainActivity.appLaunchSourceTracker = appLaunchSourceTracker;
    }

    public static void injectNotificationIntentHandler(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler notificationIntentHandler) {
        mainActivity.notificationIntentHandler = notificationIntentHandler;
    }
}
