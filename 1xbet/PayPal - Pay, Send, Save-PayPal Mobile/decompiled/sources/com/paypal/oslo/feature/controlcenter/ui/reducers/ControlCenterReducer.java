package com.paypal.oslo.feature.controlcenter.ui.reducers;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/reducers/ControlCenterReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "Lcom/paypal/oslo/feature/controlcenter/ui/effects/ControlCenterUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;)Larrow/core/Either;", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlCenterReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent, com.paypal.oslo.feature.controlcenter.ui.effects.ControlCenterUiEffect> {
    public static final com.paypal.oslo.feature.controlcenter.ui.reducers.ControlCenterReducer INSTANCE = new com.paypal.oslo.feature.controlcenter.ui.reducers.ControlCenterReducer();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.INSTANCE, "feature_control_center_tab_wallet", null, 4, null));
    public static final int $stable = 8;

    private ControlCenterReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ControlCenterReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.effects.ControlCenterUiEffect>> reduce(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState state, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event) {
        com.paypal.oslo.feature.controlcenter.domain.model.UserProfile copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial) {
            com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial initial = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading(getHighSpeedVideoFpsRanges), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
        }
        if (state instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading) {
            com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading loading = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) {
                com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded profileLoaded = (com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success(profileLoaded.getUserProfile(), profileLoaded.getTabs(), profileLoaded.getShowAccountSwitchChevron(), profileLoaded.isUpdatePhotoEnabled()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed) {
                com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed profileLoadFailed = (com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error(profileLoadFailed.getErrorMessage(), profileLoadFailed.getError()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        if (state instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) {
            com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success success = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading(getHighSpeedVideoFpsRanges), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) {
                com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded profileLoaded2 = (com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success(profileLoaded2.getUserProfile(), profileLoaded2.getTabs(), profileLoaded2.getShowAccountSwitchChevron(), profileLoaded2.isUpdatePhotoEnabled()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted) {
                com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile = success.getUserProfile();
                java.lang.String formattedName = ((com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted) event).getFormattedName();
                if (formattedName == null) {
                    formattedName = success.getUserProfile().getFullName();
                }
                copy = userProfile.copy((r20 & 1) != 0 ? userProfile.id : null, (r20 & 2) != 0 ? userProfile.fullName : formattedName, (r20 & 4) != 0 ? userProfile.givenName : null, (r20 & 8) != 0 ? userProfile.middleName : null, (r20 & 16) != 0 ? userProfile.surname : null, (r20 & 32) != 0 ? userProfile.secondSurname : null, (r20 & 64) != 0 ? userProfile.accountCountryCode : null, (r20 & 128) != 0 ? userProfile.profilePhotoUrl : null, (r20 & 256) != 0 ? userProfile.accountType : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success.copy$default(success, copy, null, false, false, 14, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error error = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading(getHighSpeedVideoFpsRanges), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
    }
}
