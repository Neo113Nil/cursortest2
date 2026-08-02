package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIManageReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CLIManageReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CLIManageReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageUiEffect.NavigateToCLIApproval navigateToCLIApproval;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.FetchingData)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.InitializeUiModel)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Ready)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnTryAgainClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.FetchingData(error.getCreditAccountId(), error.getCreditProductIdentifier()), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnBackClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageUiEffect.NavigateBack.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Ready) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnViewCreated) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataLoaded) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnToggleChanged) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CLIManageUiModel.copy$default(ready.getUiModel(), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel.copy$default(ready.getUiModel().getCreditLimitIncreaseToggle(), null, null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnToggleChanged) event).isEnabled(), 3, null), null, null, 13, null), null, 2, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnCreditIncreaseOfferClicked) {
                        if (ready.getReadyInfo().getStatusReason() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.PENDING_INCOME_VERIFICATION) {
                            navigateToCLIApproval = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageUiEffect.NavigateToCLIApplication(ready.getReadyInfo().getCreditAccountId(), ready.getReadyInfo().getOfferId(), ready.getReadyInfo().getCurrentCreditLimit(), ready.getReadyInfo().getNewCreditLimit(), ready.getReadyInfo().getExpirationDate(), ready.getReadyInfo().getMaximumProjectedMinimumPaymentDue(), ready.getReadyInfo().getCreditProductIdentifier(), ready.getReadyInfo().getPrivacyStatementUrl());
                        } else {
                            navigateToCLIApproval = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageUiEffect.NavigateToCLIApproval(ready.getReadyInfo().getCreditAccountId(), ready.getReadyInfo().getOfferId(), ready.getReadyInfo().getCurrentCreditLimit(), ready.getReadyInfo().getNewCreditLimit(), ready.getReadyInfo().getExpirationDate(), ready.getReadyInfo().getMaximumProjectedMinimumPaymentDue(), ready.getReadyInfo().getCreditProductIdentifier());
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, navigateToCLIApproval);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnCompletedFlow) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CLIManageUiModel.copy$default(ready.getUiModel(), null, null, null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnCompletedFlow) event).getToast(), 7, null), null, 2, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnToastDismissed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CLIManageUiModel.copy$default(ready.getUiModel(), null, null, null, null, 7, null), null, 2, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnBackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageUiEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.InitializeUiModel initializeUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.InitializeUiModel) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataLoaded) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Ready(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataLoaded) event).getUiModel(), initializeUiModel.getReadyInfo()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataLoadFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Error(initializeUiModel.getReadyInfo().getCreditProductIdentifier(), initializeUiModel.getReadyInfo().getCreditAccountId()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializeUiModel, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.FetchingData fetchingData = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.FetchingData) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataFetched) {
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = fetchingData.getCreditProductIdentifier();
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataFetched onDataFetched = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataFetched) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.InitializeUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.ReadyInfo(creditProductIdentifier, onDataFetched.getData().getCreditAccountId(), onDataFetched.getData().getCurrentCreditLimit(), onDataFetched.getData().getNewCreditLimit(), onDataFetched.getData().getStatus(), onDataFetched.getData().getStatusReason(), onDataFetched.getData().isCreditLimitNotificationsEnabled(), onDataFetched.getData().getOfferId(), onDataFetched.getData().getMaximumProjectedMinimumPaymentDue(), onDataFetched.getData().getExpirationDate(), onDataFetched.getData().getPrivacyStatementUrl())), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnDataLoadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Error(fetchingData.getCreditProductIdentifier(), fetchingData.getCreditAccountID()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(fetchingData, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnViewCreated) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.FetchingData(onViewCreated.getCreditAccountId(), onViewCreated.getCreditProductIdentifier()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
