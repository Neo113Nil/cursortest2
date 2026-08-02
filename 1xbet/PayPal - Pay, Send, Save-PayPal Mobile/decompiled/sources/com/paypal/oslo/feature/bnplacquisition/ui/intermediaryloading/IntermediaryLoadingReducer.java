package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IntermediaryLoadingReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public IntermediaryLoadingReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "IntermediaryLoadingReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState state, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect>> output;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Error) state;
            if ((event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ClosePressed) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ErrorBackPressed)) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.CloseAcquisition.INSTANCE);
            } else {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckScreenLockRequired) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToRequireScreenLock.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckLoanStatus) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived) {
                com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived loanStatusReceived = (com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived) event;
                if (loanStatusReceived.getResult().getHasActiveLoan()) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview(loanStatusReceived.getResult().getCreditAccountId()));
                } else {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToEnterAmount.INSTANCE);
                }
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Error(((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed) event).getErrorContent()), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCompleted) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCancelled) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.CloseAcquisition.INSTANCE);
            } else {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }
}
