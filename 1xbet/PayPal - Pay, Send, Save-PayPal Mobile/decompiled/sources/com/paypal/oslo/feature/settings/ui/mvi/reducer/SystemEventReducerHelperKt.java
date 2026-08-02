package com.paypal.oslo.feature.settings.ui.mvi.reducer;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a-\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u001a-\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0007\u001a5\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0007\u001aA\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0007\u001a-\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u0007\u001a5\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b \u0010\u001d\u001a-\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;", "state", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "handleLoadSettings", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;)Larrow/core/Either;", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "itemId", "handleNavigation", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)Larrow/core/Either;", "handleLogoutInitiation", "handleLogoutCompleted", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutFailed;", "event", "handleLogoutFailed", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutFailed;)Larrow/core/Either;", "handleLogoutFailedAcknowledged", "Lkotlin/Pair;", "", "scrollIndex", "handleListScroll", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lkotlin/Pair;)Larrow/core/Either;", "", "enabled", "handleToggleBiometrics", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Z)Larrow/core/Either;", "handleTurnOnPushClick", "handleShowBiometricsTurnOffConfirmation", "handleToggleLLS", "handleShowLLSOptInConfirmation"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SystemEventReducerHelperKt {
    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleLoadSettings(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Loading.INSTANCE, null, null, null, null, null, 62, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleNavigation(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, androidx.navigation3.runtime.NavKey navKey, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(settingsState, new com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination(navKey, str));
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleLogoutInitiation(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, null, null, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.InProgress.INSTANCE, null, null, 55, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleLogoutCompleted(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, null, null, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Initial.INSTANCE, null, null, 55, null), com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.LogoutSuccessful.INSTANCE);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleLogoutFailed(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed logoutFailed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutFailed, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, null, null, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Failed(logoutFailed.getErrorMessage()), null, null, 55, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleLogoutFailedAcknowledged(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, null, null, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Initial.INSTANCE, null, null, 55, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleListScroll(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, null, null, null, null, pair, 31, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleToggleBiometrics(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(settingsState.getSections());
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState) mutableMap.get(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
        if (sectionState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState;
            java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> items = loaded.getData().getItems();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
            for (com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData : items) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(settingsItemUiData.getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.FINGERPRINT_SCAN) && (settingsItemUiData.getStatus() instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle)) {
                    settingsItemUiData = settingsItemUiData.copy((r24 & 1) != 0 ? settingsItemUiData.id : null, (r24 & 2) != 0 ? settingsItemUiData.title : null, (r24 & 4) != 0 ? settingsItemUiData.subtitle : null, (r24 & 8) != 0 ? settingsItemUiData.status : new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(z), (r24 & 16) != 0 ? settingsItemUiData.statusText : null, (r24 & 32) != 0 ? settingsItemUiData.showChevron : false, (r24 & 64) != 0 ? settingsItemUiData.showDivider : false, (r24 & 128) != 0 ? settingsItemUiData.isSubHeader : false, (r24 & 256) != 0 ? settingsItemUiData.destination : null, (r24 & 512) != 0 ? settingsItemUiData.isLoading : false, (r24 & 1024) != 0 ? settingsItemUiData.errorMessage : null);
                }
                arrayList.add(settingsItemUiData);
            }
            mutableMap.put(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData.copy$default(loaded.getData(), null, null, arrayList, 3, null)));
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, mutableMap, null, null, null, null, 61, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleTurnOnPushClick(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.TurnOnPushNotificationsTapped.INSTANCE);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleShowBiometricsTurnOffConfirmation(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToFingerprintConfirmation.INSTANCE);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleToggleLLS(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(settingsState.getSections());
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState) mutableMap.get(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
        if (sectionState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState;
            java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> items = loaded.getData().getItems();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
            for (com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData : items) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(settingsItemUiData.getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.LLS) && (settingsItemUiData.getStatus() instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle)) {
                    settingsItemUiData = settingsItemUiData.copy((r24 & 1) != 0 ? settingsItemUiData.id : null, (r24 & 2) != 0 ? settingsItemUiData.title : null, (r24 & 4) != 0 ? settingsItemUiData.subtitle : null, (r24 & 8) != 0 ? settingsItemUiData.status : new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(z), (r24 & 16) != 0 ? settingsItemUiData.statusText : null, (r24 & 32) != 0 ? settingsItemUiData.showChevron : false, (r24 & 64) != 0 ? settingsItemUiData.showDivider : false, (r24 & 128) != 0 ? settingsItemUiData.isSubHeader : false, (r24 & 256) != 0 ? settingsItemUiData.destination : null, (r24 & 512) != 0 ? settingsItemUiData.isLoading : false, (r24 & 1024) != 0 ? settingsItemUiData.errorMessage : null);
                }
                arrayList.add(settingsItemUiData);
            }
            mutableMap.put(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData.copy$default(loaded.getData(), null, null, arrayList, 3, null)));
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, mutableMap, null, null, null, null, 61, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleShowLLSOptInConfirmation(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToLLSConfirmation.INSTANCE);
    }
}
