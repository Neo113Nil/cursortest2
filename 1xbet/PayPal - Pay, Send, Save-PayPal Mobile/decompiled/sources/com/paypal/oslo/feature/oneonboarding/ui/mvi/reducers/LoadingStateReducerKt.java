package com.paypal.oslo.feature.oneonboarding.ui.mvi.reducers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Loading;", "state", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "reduceLoadingState", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Loading;Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoadingStateReducerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect>> reduceLoadingState(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading loading, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent oneOnboardingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loading, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingEvent, "");
        int i = 2;
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepBack) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED, list, i, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr3 == true ? 1 : 0))));
        }
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) {
            com.paypal.oslo.feature.oneonboarding.api.domain.Status status = ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) oneOnboardingEvent).getStatus();
            if (status == null) {
                status = com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus(status), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(status, (java.util.List) (objArr2 == true ? 1 : 0), i, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0))));
        }
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded) {
            return com.paypal.oslo.feature.oneonboarding.ui.mvi.reducers.FlowLoadedReducerKt.handleFlowLoaded((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded) oneOnboardingEvent);
        }
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed) {
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed flowLoadFailed = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed) oneOnboardingEvent;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error(flowLoadFailed.getIntentId(), flowLoadFailed.getError(), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow(flowLoadFailed.getIntentId())), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, oneOnboardingEvent);
    }
}
