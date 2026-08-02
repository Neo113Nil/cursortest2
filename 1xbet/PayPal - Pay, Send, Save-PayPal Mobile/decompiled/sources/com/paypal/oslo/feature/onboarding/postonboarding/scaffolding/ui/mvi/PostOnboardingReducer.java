package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostOnboardingReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PostOnboardingReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect>> reduce(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState state, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent event) {
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.Network network;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 0;
        if (event instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.StartFlow) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading(0, event), null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition)) {
            if (event instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Content.INSTANCE, new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepNavigation(((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition) event).getStep()));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestBack.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Content.INSTANCE, new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepBack(((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack) event).getStep()));
            }
            if (!(event instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RetryFlow.INSTANCE)) {
                    if (state instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error) {
                        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error error = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error) state;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading(error.getRetryCount(), error.getTrigger()), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                }
                if (!(event instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState postOnboardingUiState = state;
                java.lang.String m16131getFlowId8NcbBzM = ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate) event).m16131getFlowId8NcbBzM();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(postOnboardingUiState, new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.CloseFlow((com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(m16131getFlowId8NcbBzM, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.getExistingUserAppOnboardingFlowId()) || com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(m16131getFlowId8NcbBzM, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.getPostOnboardingFlowId())) ? com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE : null));
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError handleStepError = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError) event;
            if (!(state instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError error2 = handleStepError.getError();
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading loading = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading) state;
            int retryCount = loading.getRetryCount();
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = error2.getApiCallError();
            if ((apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) || (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout) || (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown)) {
                network = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.Network.INSTANCE;
            } else {
                if (!(apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError) && !(apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound) && !(apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData) && !(apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) && apiCallError != null) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (retryCount > 0) {
                    network = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiSecondAttempt.INSTANCE;
                } else {
                    network = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiFirstAttempt.INSTANCE;
                }
            }
            com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError error3 = handleStepError.getError();
            int retryCount2 = loading.getRetryCount();
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError2 = error3.getApiCallError();
            if (!(apiCallError2 instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) && !(apiCallError2 instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout) && !(apiCallError2 instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown)) {
                retryCount2++;
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent trigger = loading.getTrigger();
            if (trigger != null) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error(network, retryCount2, trigger), null, 2, null);
            }
            throw new java.lang.IllegalStateException("Loading.trigger must be set before an error can occur".toString());
        }
        if (!(state instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Content)) {
            if (state instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error) {
                i = ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error) state).getRetryCount();
            } else {
                if (!(state instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                i = ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading) state).getRetryCount();
            }
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading(i, event), null, 2, null);
    }
}
