package com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0004\u0012\u00020\u00190\u001c2\u0006\u0010\u0011\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0016\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionEvent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionEvent;)Larrow/core/Either;", "p0", "p1", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;)Z", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;)Lkotlin/Pair;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupSecurityQuestionReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StepupSecurityQuestionReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "StepupSecurityQuestionReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect>> reduce(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState state, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent event) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        java.lang.Object obj;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) && !(state instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached) state;
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.BackClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(maxAttemptsReached, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateBack.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionsClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(maxAttemptsReached, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToMoreOptions.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowMoreOptions) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(maxAttemptsReached, null, 2, null);
                        }
                        if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected)) {
                            return event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionsDismissed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(maxAttemptsReached, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(maxAttemptsReached, event);
                        }
                        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected) event).getOptionType());
                        if (highSpeedVideoFpsRangesFor != null) {
                            java.util.Iterator<T> it = maxAttemptsReached.getLatestChallenges().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj).getType() == highSpeedVideoFpsRangesFor) {
                                    break;
                                }
                            }
                            challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
                        } else {
                            challenge = null;
                        }
                        if (challenge != null) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(maxAttemptsReached, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge(challenge, maxAttemptsReached.getLatestChallenges()));
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(maxAttemptsReached, null, 2, null);
                    }
                    return getHighSpeedVideoFpsRanges(state, event);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess) state, event);
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading) state;
            if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ValidationSuccess)) {
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MultiChallengeStepUp) {
                    com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MultiChallengeStepUp multiChallengeStepUp = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MultiChallengeStepUp) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess(loading.getChallenge(), multiChallengeStepUp.getChallenges(), null, null, 12, null), new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToStepupDestination(multiChallengeStepUp.getChallenges(), multiChallengeStepUp.getAuthIntent()));
                }
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ValidationFailed) {
                    com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ValidationFailed) event;
                    if (validationFailed.isRateLimited()) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached(loading.getChallenge(), validationFailed.getAvailableChallenges(), loading.getLatestChallenges()), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error(loading.getChallenge(), validationFailed.getErrorMessageResId(), loading.getAnswers(), loading.getLatestChallenges(), null, 16, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.TechnicalError) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError(loading.getChallenge(), ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.TechnicalError) event).getErrorMessageResId(), loading.getAnswers(), loading.getLatestChallenges(), null, 16, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ValidationSuccess validationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ValidationSuccess) event;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge3 = loading.getChallenge();
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = validationSuccess.getChallenges();
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = challenges.isEmpty() ? null : challenges;
            if (list == null) {
                list = loading.getLatestChallenges();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess(challenge3, list, validationSuccess.getNonce(), validationSuccess.getPartialToken()), new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToNextScreen(validationSuccess.getToken(), validationSuccess.getPostAuthOperations()));
        }
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial initial = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ChallengeInitialized) {
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ChallengeInitialized challengeInitialized = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ChallengeInitialized) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial(challengeInitialized.getChallenge(), kotlin.collections.MapsKt.emptyMap(), challengeInitialized.getLatestChallenges(), null, 8, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.AnswerChanged) {
            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(initial.getAnswers());
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.AnswerChanged answerChanged = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.AnswerChanged) event;
            mutableMap.put(answerChanged.getQuestionId(), answerChanged.getAnswer());
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, mutableMap, null, null, 13, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.SubmitClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading(initial.getChallenge(), initial.getAnswers(), initial.getLatestChallenges(), null, 8, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionsClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToMoreOptions.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowMoreOptions) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.MoreOptions(((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowMoreOptions) event).getOptions()), 7, null), null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected)) {
            if ((event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionsDismissed) || (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelectionDismissed)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, null, 7, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection) {
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection showContactSelection = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection(showContactSelection.getContacts(), null, showContactSelection.isEmailSelection(), showContactSelection.getPendingChallenge()), 7, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelected) {
                java.lang.String contactId = ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelected) event).getContactId();
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState = initial.getBottomSheetState();
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection contactSelection = bottomSheetState instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection ? (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection) bottomSheetState : null;
                if (contactSelection == null) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, null, 7, null), null, 2, null);
                }
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge pendingChallenge = contactSelection.getPendingChallenge();
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge updateChallengeWithSelectedContact = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.updateChallengeWithSelectedContact(pendingChallenge, contactId);
                if (updateChallengeWithSelectedContact != null) {
                    pendingChallenge = updateChallengeWithSelectedContact;
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, null, 7, null), new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge(pendingChallenge, initial.getLatestChallenges()));
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.BackClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.TechnicalError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError(initial.getChallenge(), ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.TechnicalError) event).getErrorMessageResId(), initial.getAnswers(), initial.getLatestChallenges(), null, 16, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected) event).getOptionType());
        if (highSpeedVideoFpsRangesFor2 != null) {
            java.util.Iterator<T> it2 = initial.getLatestChallenges().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj2).getType() == highSpeedVideoFpsRangesFor2) {
                    break;
                }
            }
            challenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj2;
        } else {
            challenge2 = null;
        }
        if (challenge2 != null) {
            if (getHighSpeedVideoSizes(challenge2)) {
                kotlin.Pair<java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel>, java.lang.Boolean> highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(challenge2);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection(highSpeedVideoFpsRangesFor3.component1(), null, highSpeedVideoFpsRangesFor3.component2().booleanValue(), challenge2), 7, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, null, 7, null), new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge(challenge2, initial.getLatestChallenges()));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial.copy$default(initial, null, null, null, null, 7, null), null, 2, null);
    }

    private final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState p0, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent p1) {
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection contactSelection;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default2;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default3;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default4;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default5;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default6;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default7;
        java.lang.Object obj;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default8;
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default9;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge2 = p0.getChallenge();
        java.util.Map<java.lang.String, java.lang.String> answers = p0.getAnswers();
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges = p0.getLatestChallenges();
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.AnswerChanged) {
            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(answers);
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.AnswerChanged answerChanged = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.AnswerChanged) p1;
            mutableMap.put(answerChanged.getQuestionId(), answerChanged.getAnswer());
            if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) {
                copy$default9 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) p0, null, 0, mutableMap, null, null, 27, null);
            } else {
                if (!(p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
                }
                copy$default9 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) p0, null, 0, mutableMap, null, null, 27, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default9, null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.SubmitClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading(challenge2, answers, latestChallenges, null, 8, null), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.DismissError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial(challenge2, answers, latestChallenges, null, 8, null), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionsClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToMoreOptions.INSTANCE);
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowMoreOptions) {
            if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) {
                copy$default8 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) p0, null, 0, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.MoreOptions(((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowMoreOptions) p1).getOptions()), 15, null);
            } else if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) {
                copy$default8 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) p0, null, 0, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.MoreOptions(((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowMoreOptions) p1).getOptions()), 15, null);
            } else {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default8, null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected) {
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState stepupSecurityQuestionState = p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error ? (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) p0 : null;
            if (stepupSecurityQuestionState == null) {
                stepupSecurityQuestionState = p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError ? (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) p0 : null;
                if (stepupSecurityQuestionState == null) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
                }
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState stepupSecurityQuestionState2 = stepupSecurityQuestionState;
            com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected) p1).getOptionType();
            boolean z = stepupSecurityQuestionState2 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error;
            if (!z && !(stepupSecurityQuestionState2 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(stepupSecurityQuestionState2, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected(optionType));
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(optionType);
            if (highSpeedVideoFpsRangesFor != null) {
                java.util.Iterator<T> it = stepupSecurityQuestionState2.getLatestChallenges().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj).getType() == highSpeedVideoFpsRangesFor) {
                        break;
                    }
                }
                challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
            } else {
                challenge = null;
            }
            if (challenge != null) {
                if (getHighSpeedVideoSizes(challenge)) {
                    kotlin.Pair<java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel>, java.lang.Boolean> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(challenge);
                    java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> component1 = highSpeedVideoFpsRangesFor2.component1();
                    boolean booleanValue = highSpeedVideoFpsRangesFor2.component2().booleanValue();
                    if (z) {
                        copy$default7 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) stepupSecurityQuestionState2, null, 0, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection(component1, null, booleanValue, challenge), 15, null);
                    } else if (stepupSecurityQuestionState2 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) {
                        copy$default7 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) stepupSecurityQuestionState2, null, 0, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection(component1, null, booleanValue, challenge), 15, null);
                    } else {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(stepupSecurityQuestionState2, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected(optionType));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default7, null, 2, null);
                }
                if (z) {
                    copy$default6 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) stepupSecurityQuestionState2, null, 0, null, null, null, 15, null);
                } else {
                    if (!(stepupSecurityQuestionState2 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(stepupSecurityQuestionState2, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected(optionType));
                    }
                    copy$default6 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) stepupSecurityQuestionState2, null, 0, null, null, null, 15, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default6, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge(challenge, stepupSecurityQuestionState2.getLatestChallenges()));
            }
            if (z) {
                copy$default5 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) stepupSecurityQuestionState2, null, 0, null, null, null, 15, null);
            } else {
                if (!(stepupSecurityQuestionState2 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(stepupSecurityQuestionState2, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionSelected(optionType));
                }
                copy$default5 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) stepupSecurityQuestionState2, null, 0, null, null, null, 15, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default5, null, 2, null);
        }
        if ((p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.MoreOptionsDismissed) || (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelectionDismissed)) {
            if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) {
                copy$default = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) p0, null, 0, null, null, null, 15, null);
            } else {
                if (!(p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
                }
                copy$default = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) p0, null, 0, null, null, null, 15, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default, null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection) {
            if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) {
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection showContactSelection = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection) p1;
                copy$default4 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) p0, null, 0, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection(showContactSelection.getContacts(), null, showContactSelection.isEmailSelection(), showContactSelection.getPendingChallenge()), 15, null);
            } else if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) {
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection showContactSelection2 = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ShowContactSelection) p1;
                copy$default4 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) p0, null, 0, null, null, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection(showContactSelection2.getContacts(), null, showContactSelection2.isEmailSelection(), showContactSelection2.getPendingChallenge()), 15, null);
            } else {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default4, null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelected) {
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState stepupSecurityQuestionState3 = p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error ? (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) p0 : null;
            if (stepupSecurityQuestionState3 == null) {
                stepupSecurityQuestionState3 = p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError ? (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) p0 : null;
                if (stepupSecurityQuestionState3 == null) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
                }
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState stepupSecurityQuestionState4 = stepupSecurityQuestionState3;
            java.lang.String contactId = ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelected) p1).getContactId();
            boolean z2 = stepupSecurityQuestionState4 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error;
            if (!z2 && !(stepupSecurityQuestionState4 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(stepupSecurityQuestionState4, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelected(contactId));
            }
            if (z2) {
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState = ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) stepupSecurityQuestionState4).getBottomSheetState();
                if (bottomSheetState instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection) {
                    contactSelection = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection) bottomSheetState;
                }
                contactSelection = null;
            } else {
                if (stepupSecurityQuestionState4 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) {
                    com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState2 = ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) stepupSecurityQuestionState4).getBottomSheetState();
                    if (bottomSheetState2 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection) {
                        contactSelection = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState.ContactSelection) bottomSheetState2;
                    }
                }
                contactSelection = null;
            }
            if (contactSelection == null) {
                if (z2) {
                    copy$default3 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) stepupSecurityQuestionState4, null, 0, null, null, null, 15, null);
                } else {
                    if (!(stepupSecurityQuestionState4 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(stepupSecurityQuestionState4, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelected(contactId));
                    }
                    copy$default3 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) stepupSecurityQuestionState4, null, 0, null, null, null, 15, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default3, null, 2, null);
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge pendingChallenge = contactSelection.getPendingChallenge();
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge updateChallengeWithSelectedContact = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.updateChallengeWithSelectedContact(pendingChallenge, contactId);
            if (updateChallengeWithSelectedContact != null) {
                pendingChallenge = updateChallengeWithSelectedContact;
            }
            if (z2) {
                copy$default2 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) stepupSecurityQuestionState4, null, 0, null, null, null, 15, null);
            } else {
                if (!(stepupSecurityQuestionState4 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(stepupSecurityQuestionState4, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.ContactSelected(contactId));
                }
                copy$default2 = com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError.copy$default((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) stepupSecurityQuestionState4, null, 0, null, null, null, 15, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default2, new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge(pendingChallenge, stepupSecurityQuestionState4.getLatestChallenges()));
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.BackClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateBack.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
    }

    private static com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType p0) {
        switch (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionReducer.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
            case 2:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
            case 3:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
            case 4:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL;
            case 5:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL;
            case 6:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR;
            case 7:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP;
            case 8:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP;
            case 9:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION;
            case 10:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD;
            case 11:
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH;
            default:
                return null;
        }
    }

    private static boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge p0) {
        return p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) p0).getPhoneNumbers().size() > 1 : (p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) && ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) p0).getEmails().size() > 1;
    }

    private static kotlin.Pair<java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel>, java.lang.Boolean> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge p0) {
        boolean z = p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (z) {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) p0).getPhoneNumbers();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
            for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber : phoneNumbers) {
                arrayList.add(new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel(phoneNumber.getId(), phoneNumber.getMaskedNumber(), false, null));
            }
            return kotlin.TuplesKt.to(arrayList, bool);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> emails = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) p0).getEmails();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emails, 10));
            for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress : emails) {
                arrayList2.add(new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel(emailAddress.getId(), emailAddress.getMaskedEmail(), false, null));
            }
            return kotlin.TuplesKt.to(arrayList2, java.lang.Boolean.TRUE);
        }
        return kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.emptyList(), bool);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_AUTHENTICATOR_APP.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.ANSWER_SECURITY_QUESTIONS.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.VERIFY_CREDIT_CARD.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SILENT_AUTH.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
