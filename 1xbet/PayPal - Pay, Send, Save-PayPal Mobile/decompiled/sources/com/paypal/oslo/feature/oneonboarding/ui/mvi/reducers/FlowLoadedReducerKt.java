package com.paypal.oslo.feature.oneonboarding.ui.mvi.reducers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoaded;", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "handleFlowLoaded", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoaded;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FlowLoadedReducerKt {
    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect>> handleFlowLoaded(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded flowLoaded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowLoaded, "");
        com.paypal.oslo.feature.oneonboarding.domain.Flow flow = flowLoaded.getFlow();
        if (flow.getSteps().isEmpty()) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content(flow, 0, 2, null), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(flow.getStatus(), flow.getStatusDetails())));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content(flow, 0), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward(flow.getIntentId(), (com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig) kotlin.collections.CollectionsKt.first((java.util.List) flow.getSteps()), false, 4, null));
    }
}
