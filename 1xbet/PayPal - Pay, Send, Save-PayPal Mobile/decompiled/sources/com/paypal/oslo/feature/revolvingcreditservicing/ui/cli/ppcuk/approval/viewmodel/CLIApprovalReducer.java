package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApprovalReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CLIApprovalReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CreditLineApprovalReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString newCreditLimitAmount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnTryAgainClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel(error.getReadyInfo()), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnAcceptIncreaseClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.ACCEPT, ready.getReadyInfo(), ready.getUiModel()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnDeclineIncreaseClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.DECLINE, ready.getReadyInfo(), ready.getUiModel()), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing processing = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnProcessError) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnProcessError) event).getOperation(), processing.getReadyInfo()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnProcessSuccess) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnProcessSuccess onProcessSuccess = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnProcessSuccess) event;
                    int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalReducer.WhenMappings.$EnumSwitchMapping$0[onProcessSuccess.getOperation().ordinal()];
                    if (i == 1) {
                        newCreditLimitAmount = processing.getUiModel().getNewCreditLimitAmount();
                    } else {
                        if (i != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        newCreditLimitAmount = processing.getUiModel().getCurrentCreditLimitAmount();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready(processing.getUiModel(), processing.getReadyInfo()), new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalUiEffect.NavigateToCLIHub(onProcessSuccess.getOperation(), newCreditLimitAmount));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processing, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel initializeUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnUiModelInitialized) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnUiModelInitialized) event).getUiModel(), initializeUiModel.getReadyInfo()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnUiModelInitializedError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error(null, initializeUiModel.getReadyInfo()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializeUiModel, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnViewCreated) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo(onViewCreated.getCreditAccountId(), onViewCreated.getCurrentCreditLimit(), onViewCreated.getExpirationDate(), onViewCreated.getNewCreditLimit(), onViewCreated.getMonthlyPaymentAmount(), onViewCreated.getOfferId())), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.ACCEPT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.DECLINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
