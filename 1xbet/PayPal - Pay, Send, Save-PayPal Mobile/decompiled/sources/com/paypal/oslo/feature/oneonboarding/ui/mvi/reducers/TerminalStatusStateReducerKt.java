package com.paypal.oslo.feature.oneonboarding.ui.mvi.reducers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$TerminalStatus;", "state", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "reduceTerminalStatusState", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$TerminalStatus;Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TerminalStatusStateReducerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect>> reduceTerminalStatusState(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus terminalStatus, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent oneOnboardingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingEvent, "");
        int i = 2;
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) {
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus terminalStatus2 = terminalStatus;
            com.paypal.oslo.feature.oneonboarding.api.domain.Status status = ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) oneOnboardingEvent).getStatus();
            if (status == null) {
                status = terminalStatus.getStatus();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(terminalStatus2, new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(status, list, i, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0))));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(terminalStatus, null, 2, null);
    }
}
