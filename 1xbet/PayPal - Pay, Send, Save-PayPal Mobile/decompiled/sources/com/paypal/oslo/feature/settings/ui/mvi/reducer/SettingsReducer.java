package com.paypal.oslo.feature.settings.ui.mvi.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/reducer/SettingsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SettingsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SettingsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> reduce(com.paypal.oslo.feature.settings.ui.mvi.SettingsState state, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent)) {
            if (!(event instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent dataEvent = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent) event;
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError) {
                return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleScreenError(state, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError) dataEvent);
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult) {
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult sectionLoadedResult = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult) dataEvent;
                return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleSectionLoaded(state, sectionLoadedResult.getSection(), sectionLoadedResult.getData());
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult) {
                return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleSectionLoadFailed(state, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult) dataEvent);
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed) {
                return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleBiometricsToggleFailed(state, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed) dataEvent);
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded) {
                return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleAppVersionLoaded(state, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded) dataEvent).getAppVersion());
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError) {
                return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleUserStoreError(state, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError) dataEvent);
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed) {
                return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleLLSToggleFailed(state, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed) dataEvent);
            }
            if (dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            if (!(dataEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.DataEventReducerHelperKt.handleItemStatusRefreshed(state, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed) dataEvent);
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent systemEvent = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent) event;
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutCompleted.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleLogoutCompleted(state);
        }
        if (systemEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleLogoutFailed(state, (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed) systemEvent);
        }
        if (systemEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleListScroll(state, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll) systemEvent).getScrollIndex());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.InitiateLogout.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleLogoutInitiation(state);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LoadSettings.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleLoadSettings(state);
        }
        if (systemEvent instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation performNavigation = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation) systemEvent;
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleNavigation(state, performNavigation.getDestination(), performNavigation.getItemId());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailedAcknowledgementReceived.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleLogoutFailedAcknowledged(state);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformPushNotificationOptInFlow.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleTurnOnPushClick(state);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptInFlow.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleToggleBiometrics(state, true);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptOutFlow.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleShowBiometricsTurnOffConfirmation(state);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmBiometricOptOut.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleToggleBiometrics(state, false);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptInFlow.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleShowLLSOptInConfirmation(state);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmLLSOptIn.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleToggleLLS(state, true);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptOutFlow.INSTANCE)) {
            return com.paypal.oslo.feature.settings.ui.mvi.reducer.SystemEventReducerHelperKt.handleToggleLLS(state, false);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.RefreshPendingItems.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
