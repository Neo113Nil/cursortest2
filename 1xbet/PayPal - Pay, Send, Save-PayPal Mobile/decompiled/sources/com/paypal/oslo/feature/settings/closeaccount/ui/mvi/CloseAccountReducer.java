package com.paypal.oslo.feature.settings.closeaccount.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountState;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountState;Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;)Larrow/core/Either;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountState;Ljava/lang/String;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect> {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer.Companion Companion = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer.Companion(null);

    @java.lang.Deprecated
    public static final int MAX_SELECTED_REASONS = 3;

    @javax.inject.Inject
    public CloseAccountReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CloseAccountReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect>> reduce(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState state, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent event) {
        com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState copy$default;
        com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState copy$default2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView openWebView = null;
        if (!(event instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent)) {
            if (!(event instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent)) {
                if (!(event instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent dataEvent = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent) event;
                if (dataEvent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError) {
                    return getHighSpeedVideoSizes(state, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError) dataEvent).getError().getMessage());
                }
                if (dataEvent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed) {
                    return getHighSpeedVideoSizes(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, null, null, null, null, 0, false, null, 95, null), ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed) dataEvent).getError().getMessage());
                }
                if (dataEvent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady) {
                    com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady screenContentReady = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady) dataEvent;
                    com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState copy$default3 = com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState.Ready.INSTANCE, null, screenContentReady.getContent(), null, 0, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
                    com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer = screenContentReady.getFooter();
                    if (footer != null && (copy$default2 = com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(copy$default3, null, null, null, footer, 0, false, null, 119, null)) != null) {
                        copy$default3 = copy$default2;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default3, null, 2, null);
                }
                if (dataEvent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady) {
                    com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady stepContentReady = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady) dataEvent;
                    com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState copy$default4 = com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState.Ready.INSTANCE, com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar.copy$default(state.getTopBar(), !(stepContentReady.getStep() == 0), null, 2, null), stepContentReady.getContent(), null, stepContentReady.getStep(), false, null, 104, null);
                    com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter footer2 = stepContentReady.getFooter();
                    if (footer2 != null && (copy$default = com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(copy$default4, null, null, null, footer2, 0, false, null, 119, null)) != null) {
                        copy$default4 = copy$default;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default4, null, 2, null);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(dataEvent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, null, null, null, null, 0, false, null, 95, null), null, 2, null);
            }
            com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent systemEvent = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent) event;
            if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadCloseAccount.INSTANCE) || (systemEvent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            if (!(systemEvent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.CloseAccount)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, null, null, null, null, 0, true, null, 95, null), null, 2, null);
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent userIntent = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent) event;
        if (kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnBackPressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCanceledPressed.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.CloseScreen.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnContinuePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCloseAccountClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        if (userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, null, null, null, null, 0, false, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput.copy$default(state.getUserInput(), ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged) userIntent).getValue(), null, null, 6, null), 63, null), null, 2, null);
        }
        if (userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled) {
            java.util.List<java.lang.String> selectedReasons = state.getUserInput().getSelectedReasons();
            com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled onReasonToggled = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled) userIntent;
            if (onReasonToggled.getSelected()) {
                if (!selectedReasons.contains(onReasonToggled.getReason()) && selectedReasons.size() < 3) {
                    selectedReasons = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) selectedReasons, onReasonToggled.getReason());
                }
            } else {
                selectedReasons = kotlin.collections.CollectionsKt.minus(selectedReasons, onReasonToggled.getReason());
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, null, null, null, null, 0, false, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput.copy$default(state.getUserInput(), null, selectedReasons, null, 5, null), 63, null), null, 2, null);
        }
        if (userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(state, null, null, null, null, 0, false, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput.copy$default(state.getUserInput(), null, null, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged) userIntent).getValue(), 3, null), 63, null), null, 2, null);
        }
        if (!(userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState closeAccountState = state;
        com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination destination = ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed) userIntent).getDestination();
        if (destination.getNative() != null) {
            openWebView = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination(destination.getNative());
        } else if (destination.getUrl() != null) {
            openWebView = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView(destination.getUrl(), null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(closeAccountState, openWebView);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState p0, java.lang.String p1) {
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState.copy$default(p0, new com.paypal.oslo.feature.settings.closeaccount.ui.model.ScreenState.Error(p1), null, null, null, 0, false, null, 126, null), null, 2, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountReducer$Companion;", "", "<init>", "()V", "", "MAX_SELECTED_REASONS", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
