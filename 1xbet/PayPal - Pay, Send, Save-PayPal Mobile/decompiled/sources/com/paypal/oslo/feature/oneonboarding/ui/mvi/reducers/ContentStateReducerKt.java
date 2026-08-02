package com.paypal.oslo.feature.oneonboarding.ui.mvi.reducers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Content;", "state", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "reduceContentState", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Content;Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContentStateReducerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect>> reduceContentState(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent oneOnboardingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingEvent, "");
        int i = 2;
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepForward) {
            if (content.getHasNextStep()) {
                int currentStepIndex = content.getCurrentStepIndex() + 1;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content.copy$default(content, null, currentStepIndex, 1, null), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward(content.getFlow().getIntentId(), content.getFlow().getSteps().get(currentStepIndex), false, 4, null));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error(content.getFlow().getIntentId(), new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError("Concluded flow without terminal submit step."), null, 4, null), null, 2, null);
        }
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepBack) {
            if (content.getHasPreviousStep()) {
                int currentStepIndex2 = content.getCurrentStepIndex() - 1;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content.copy$default(content, null, currentStepIndex2, 1, null), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack(content.getFlow().getIntentId(), content.getFlow().getSteps().get(currentStepIndex2), 0, 4, null));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus(com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED, list, i, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0))));
        }
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) {
            com.paypal.oslo.feature.oneonboarding.api.domain.Status status = ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) oneOnboardingEvent).getStatus();
            if (status == null) {
                status = content.getFlow().getStatus();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus(status), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(status, content.getFlow().getStatusDetails())));
        }
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting(content.getFlow(), ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit) oneOnboardingEvent).getCollectedItems()), null, 2, null);
        }
        return oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded ? com.paypal.oslo.feature.oneonboarding.ui.mvi.reducers.FlowLoadedReducerKt.handleFlowLoaded((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded) oneOnboardingEvent) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content, oneOnboardingEvent);
    }
}
