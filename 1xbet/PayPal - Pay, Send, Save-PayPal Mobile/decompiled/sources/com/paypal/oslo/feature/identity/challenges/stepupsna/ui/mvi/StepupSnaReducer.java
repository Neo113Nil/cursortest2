package com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupSnaReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StepupSnaReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "StepupSnaReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect>> reduce(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState state, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted)) {
            if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallSucceeded)) {
                if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed)) {
                    if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded)) {
                        if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed)) {
                            if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp multiChallengeStepUp = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp) event;
                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success(state.getChallenge(), multiChallengeStepUp.getChallenges(), state.getChallenge().getNonce(), state.getChallenge().getPartialToken()), new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination(multiChallengeStepUp.getChallenges(), multiChallengeStepUp.getAuthIntent())));
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason.ValidationFailed)));
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded validationSucceeded = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded) event;
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge = state.getChallenge();
                    java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = validationSucceeded.getResult().getChallenges();
                    if (challenges == null) {
                        challenges = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success(challenge, challenges, state.getChallenge().getNonce(), state.getChallenge().getPartialToken()), new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome(validationSucceeded.getResult())));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason.NetworkCallFailed)));
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork verifyingNetwork = state instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork ? (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork) state : null;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge2 = state.getChallenge();
            java.lang.String maskedNumber = verifyingNetwork != null ? verifyingNetwork.getMaskedNumber() : null;
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend(challenge2, maskedNumber != null ? maskedNumber : ""), null));
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge3 = ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted) event).getChallenge();
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) challenge3.getPhoneNumbers());
        java.lang.String maskedNumber2 = phoneNumber != null ? phoneNumber.getMaskedNumber() : null;
        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork(challenge3, maskedNumber2 != null ? maskedNumber2 : ""), null));
    }
}
