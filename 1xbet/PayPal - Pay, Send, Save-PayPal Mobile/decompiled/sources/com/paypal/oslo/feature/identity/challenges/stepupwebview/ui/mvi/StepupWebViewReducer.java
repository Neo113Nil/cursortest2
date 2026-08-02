package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEvent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupWebViewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StepupWebViewReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "StepupWebViewReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect>> reduce(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState state, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 2;
        com.paypal.oslo.core.mvi.UiEffect uiEffect = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        java.lang.Object[] objArr8 = 0;
        java.lang.Object[] objArr9 = 0;
        java.lang.Object[] objArr10 = 0;
        java.lang.Object[] objArr11 = 0;
        java.lang.Object[] objArr12 = 0;
        java.lang.Object[] objArr13 = 0;
        java.lang.Object[] objArr14 = 0;
        java.lang.Object[] objArr15 = 0;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Uninitialized.INSTANCE)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure failure = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure) state;
                        if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.BackClicked)) {
                            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(failure, event));
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(failure, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success success = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success) state;
                    if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.BackClicked)) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(success, event));
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(success, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0));
                }
                com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading) state;
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeInitialized) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading.copy$default(loading, ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeInitialized) event).getChallenge(), false, 2, null), objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0));
                }
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.WebViewInitialized) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading.copy$default(loading, null, true, 1, null), objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0));
                }
                if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.RedirectUrlIntercepted) && !(event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.BackClicked)) {
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeSucceeded) {
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success(loading.getChallenge()), new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted(true, null, 2, null)));
                    }
                    if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeFailed)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure(loading.getChallenge()), new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted(false, ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeFailed) event).getReason())));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loading, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0));
            }
            com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial initial = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeInitialized) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading(((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeInitialized) event).getChallenge(), false), objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.WebViewInitialized) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading(initial.getChallenge(), true), objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(initial, event));
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeInitialized) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading(((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeInitialized) event).getChallenge(), false), uiEffect, i, objArr15 == true ? 1 : 0));
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Uninitialized.INSTANCE, event));
    }
}
