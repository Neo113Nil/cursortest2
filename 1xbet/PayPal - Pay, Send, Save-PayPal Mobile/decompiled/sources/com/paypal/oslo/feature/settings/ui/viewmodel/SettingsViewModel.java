package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R&\u0010\"\u001a\u0014\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000204028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00108R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002030:8\u0007¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u0002040?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0011\u0010E\u001a\u00020D8G¢\u0006\u0006\u001a\u0004\bE\u0010F"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/settings/domain/usecase/SettingsUseCasesProvider;", "settingsUseCases", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "Lcom/paypal/oslo/feature/settings/featureflags/featuregate/SettingsFeatureGateConfig;", "settingsFeatureGateConfig", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetAccountSettingsUseCase;", "accountSettingsUseCase", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "stringsProvider", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "identityManagement", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "Lcom/paypal/oslo/feature/settings/ui/mvi/reducer/SettingsReducer;", "settingsReducer", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/usecase/SettingsUseCasesProvider;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;Lcom/paypal/oslo/feature/settings/featureflags/featuregate/SettingsFeatureGateConfig;Lcom/paypal/oslo/feature/settings/domain/usecase/GetAccountSettingsUseCase;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;Lcom/paypal/oslo/feature/identity/api/IdentityManagement;Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Lcom/paypal/oslo/feature/settings/ui/mvi/reducer/SettingsReducer;)V", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "event", "", "onIntent", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;)V", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "processUserEvents", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;)V", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "processSystemEvents", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;)V", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "processDataEvents", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;)V", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/domain/usecase/SettingsUseCasesProvider;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/settings/featureflags/featuregate/SettingsFeatureGateConfig;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetAccountSettingsUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "", "", "Ljava/util/Set;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effects", "Lkotlinx/coroutines/flow/Flow;", "getEffects", "()Lkotlinx/coroutines/flow/Flow;", "", "isCloseAccountEnabled", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentityManagement getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect> getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getOutputFormats;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.settings.ui.mvi.SettingsState> state;

    @javax.inject.Inject
    public SettingsViewModel(com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider settingsUseCasesProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig settingsFeatureGateConfig, com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer settingsReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsUseCasesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsFeatureGateConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountSettingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityManagement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsReducer, "");
        this.getHighSpeedVideoFpsRanges = settingsUseCasesProvider;
        this.Camera2StreamConfigurationMap = settingsDynamicConfiguration;
        this.getHighSpeedVideoFpsRangesFor = settingsFeatureGateConfig;
        this.getHighSpeedVideoSizes = getAccountSettingsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = settingsStringsProvider;
        this.getHighSpeedVideoSizesFor = identityManagement;
        this.getOutputFormats = webEnvironmentProvider;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("SettingsViewModel.store", new com.paypal.oslo.feature.settings.ui.mvi.SettingsState(null, null, null, null, null, null, 63, null), settingsReducer, null, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.getInputFormats = new java.util.LinkedHashSet();
        this.state = mviStateStore.getUiState();
        this.effects = mviStateStore.getUiEffect();
        onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.SettingsLaunched.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.settings.ui.mvi.SettingsState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect> getEffects() {
        return this.effects;
    }

    public final boolean isCloseAccountEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.isCloseAccountEnabled();
    }

    public final void onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent) {
            processUserEvents((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent) event);
        } else if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent) {
            processSystemEvents((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent) event);
        } else {
            if (!(event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            processDataEvents((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent) event);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void processUserEvents(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.AcknowledgeLogoutFailure.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User acknowledged logout failure", null, null, 6, null);
            onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailedAcknowledgementReceived.INSTANCE);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.RetryAllTapped.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User clicked retry all settings", null, null, 6, null);
            onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LoadSettings.INSTANCE);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.SettingsLaunched.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User launched settings", null, null, 6, null);
            onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LoadSettings.INSTANCE);
            return;
        }
        int i = 2;
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapCloseAccount.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User tapped close account", null, null, 6, null);
            java.lang.String webBaseUrl = this.getOutputFormats.getWebBaseUrl();
            java.util.Locale locale = java.util.Locale.getDefault();
            java.lang.String language = locale.getLanguage();
            java.lang.String country = locale.getCountry();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(language);
            sb.append("_");
            sb.append(country);
            onIntent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation(new com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination(okhttp3.HttpUrl.INSTANCE.get(webBaseUrl).newBuilder().addPathSegment("myaccount").addPathSegment("preferences").addPathSegment("close-account").addQueryParameter("locale.x", sb.toString()).addQueryParameter("lock-overpanel", "true").addQueryParameter("hide-menu", "true").build().toString()), str, i, objArr3 == true ? 1 : 0));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLegalAgreements.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User tapped legal agreements", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("destination", com.paypal.oslo.feature.settings.api.navigation.LegalDestination.INSTANCE.toString())), null, 4, null);
            onIntent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation(com.paypal.oslo.feature.settings.api.navigation.LegalDestination.INSTANCE, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLogout.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User tapped logout", null, null, 6, null);
            onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.InitiateLogout.INSTANCE);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate tapToNavigate = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate) event;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User tapped to navigate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("destination", tapToNavigate.getDestination().toString())), null, 4, null);
            onIntent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation(tapToNavigate.getDestination(), tapToNavigate.getItemId()));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapTurnOnPushNotifications.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User tapped to turn on push notifications", null, null, 6, null);
            onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformPushNotificationOptInFlow.INSTANCE);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics toggleBiometrics = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics) event;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User toggled biometrics", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(toggleBiometrics.getEnabled()))), null, 4, null);
            if (toggleBiometrics.getEnabled()) {
                onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptInFlow.INSTANCE);
                return;
            } else {
                onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptOutFlow.INSTANCE);
                return;
            }
        }
        if (!(event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS toggleLLS = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS) event;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Analytics: User toggled LLS", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(toggleLLS.getEnabled()))), null, 4, null);
        if (toggleLLS.getEnabled()) {
            onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptInFlow.INSTANCE);
        } else {
            onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptOutFlow.INSTANCE);
        }
    }

    public final void processSystemEvents(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.InitiateLogout.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$logout$1(this, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LoadSettings.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$loadSettings$1(this, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutCompleted.INSTANCE)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Logout completed", null, null, 6, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed) {
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getLogout(), "Logout failed", "logout_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed) event).getErrorMessage())), null, 8, null));
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation performNavigation = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation) event;
            java.lang.String itemId = performNavigation.getItemId();
            if (itemId != null) {
                com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState screenState = this.getInputSizeshNQ4ISI.getUiState().getValue().getScreenState();
                if ((screenState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error) || (screenState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Loading)) {
                    com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getInternalNavigation(), "Navigate to row but settings data is in unexpected state", "settings_data_nil", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("row_id", itemId), kotlin.TuplesKt.to("screen_state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(screenState.getClass()).getSimpleName())), null, 8, null));
                }
            }
            if (performNavigation.getItemId() == null || this.getHighSpeedVideoFpsRanges.getRefreshItem().invoke(performNavigation.getItemId()) == null) {
                return;
            }
            this.getInputFormats.add(performNavigation.getItemId());
            return;
        }
        if ((event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailedAcknowledgementReceived.INSTANCE)) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptInFlow.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$enableBiometrics$1(this, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.m19311$r8$lambda$arg2B4zuujtq1rkz5MZuZRQrm8(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent) obj);
                }
            }, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformPushNotificationOptInFlow.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptOutFlow.INSTANCE)) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmBiometricOptOut.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$disableBiometrics$1(this, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.m19310$r8$lambda$GnOKY69QTuvtxLvrE6OQ37nBjQ(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent) obj);
                }
            }, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptInFlow.INSTANCE)) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmLLSOptIn.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$enableLLS$1(this, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.$r8$lambda$ajYGyPk97Lx1xhBJ5RdJcjGxQDQ(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent) obj);
                }
            }, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptOutFlow.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$disableLLS$1(this, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.m19312$r8$lambda$dGi40xjhpeLEH6r9P4Adlm_SpQ(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent) obj);
                }
            }, null), 3, null);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.RefreshPendingItems.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (this.getInputFormats.isEmpty()) {
            return;
        }
        java.util.Set<java.lang.String> set = kotlin.collections.CollectionsKt.toSet(this.getInputFormats);
        this.getInputFormats.clear();
        for (java.lang.String str : set) {
            com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult invoke = this.getHighSpeedVideoFpsRanges.getRefreshItem().invoke(str);
            if (invoke != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$refreshPendingItems$1(invoke, str, this, null), 3, null);
            } else {
                com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getInternalNavigation(), "Refresh item not found", "row_not_found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("row_id", str)), null, 8, null));
            }
        }
    }

    public final void processDataEvents(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
        if ((event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed) || (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed) || (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess) || (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded)) {
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError) {
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getLoading(), "Settings screen loading failed", "loading_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError) event).getMessage())), null, 8, null));
            return;
        }
        if ((event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult) || (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult)) {
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError) {
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getProfileLoading(), "Account visibility load failed via user store", "account_visibility_load_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError) event).getMessage())), null, 8, null));
        } else if (!(event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess) && !(event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    /* renamed from: $r8$lambda$GnOKY69QTu-vtxLvrE6OQ37nBjQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19310$r8$lambda$GnOKY69QTuvtxLvrE6OQ37nBjQ(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsEvent, "");
        settingsViewModel.onIntent(settingsEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ajYGyPk97Lx1xhBJ5RdJcjGxQDQ(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsEvent, "");
        settingsViewModel.onIntent(settingsEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$arg2B4z-uujtq1rkz5MZuZRQrm8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19311$r8$lambda$arg2B4zuujtq1rkz5MZuZRQrm8(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsEvent, "");
        settingsViewModel.onIntent(settingsEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dGi40xjhpeLEH6r9-P4Adlm_SpQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19312$r8$lambda$dGi40xjhpeLEH6r9P4Adlm_SpQ(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsEvent, "");
        settingsViewModel.onIntent(settingsEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$getStatusText(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, java.lang.String str, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus) {
        if (settingsItemStatus == null) {
            return "";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.ACCOUNT_VISIBILITY)) {
            return com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(settingsItemStatus, settingsViewModel.getHighResolutionOutputSizeshNQ4ISI.getAccountStrings().getProfileVisibilityPositiveBadge(), settingsViewModel.getHighResolutionOutputSizeshNQ4ISI.getAccountStrings().getProfileVisibilityNegativeBadge(), null, null, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.PASSKEY)) {
            return com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(settingsItemStatus, settingsViewModel.getHighResolutionOutputSizeshNQ4ISI.getDataAndPrivacyStrings().getAdded(), settingsViewModel.getHighResolutionOutputSizeshNQ4ISI.getDataAndPrivacyStrings().getPasskeyDisabled(), null, null, 12, null);
        }
        if (settingSection == com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES) {
            return com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDisplayHelper.INSTANCE.getStatusText(settingsViewModel.getHighResolutionOutputSizeshNQ4ISI.getPaymentPreferencesStrings(), settingsItemStatus);
        }
        return com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(settingsItemStatus, null, null, null, null, 15, null);
    }

    public static final /* synthetic */ java.lang.String access$getSubtitleText(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, java.lang.String str, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus) {
        java.lang.String subtitleText = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDisplayHelper.INSTANCE.getSubtitleText(str, settingsViewModel.getHighResolutionOutputSizeshNQ4ISI.getPaymentPreferencesStrings(), settingsItemStatus);
        if (subtitleText.length() == 0) {
            subtitleText = null;
        }
        return subtitleText;
    }

    public static final /* synthetic */ void access$initializeSettingsSections(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel) {
        java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingSection> sectionsBasedOnConfig = com.paypal.oslo.feature.settings.ui.viewmodel.SettingsDynamicConfigFeaturesHelperKt.getSectionsBasedOnConfig(settingsViewModel.Camera2StreamConfigurationMap.getEnabledFeatures());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : sectionsBasedOnConfig) {
            if (((com.paypal.oslo.feature.settings.domain.model.SettingSection) obj) != com.paypal.oslo.feature.settings.domain.model.SettingSection.ACCOUNT) {
                arrayList.add(obj);
            }
        }
        com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel2 = settingsViewModel;
        kotlinx.coroutines.flow.SharedFlow shareIn = kotlinx.coroutines.flow.FlowKt.shareIn(settingsViewModel.getHighSpeedVideoSizes.invoke(), androidx.view.ViewModelKt.getViewModelScope(settingsViewModel2), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getLazily(), 1);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(settingsViewModel2), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$1(shareIn, settingsViewModel, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(settingsViewModel2), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2(shareIn, arrayList, settingsViewModel, null), 3, null);
    }

    public static final /* synthetic */ void access$loadSection(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection) {
        com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase invoke = settingsViewModel.getHighSpeedVideoFpsRanges.invoke(settingSection);
        if (invoke != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(settingsViewModel), null, null, new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$loadSection$1(invoke, settingSection, settingsViewModel, null), 3, null);
        }
    }
}
