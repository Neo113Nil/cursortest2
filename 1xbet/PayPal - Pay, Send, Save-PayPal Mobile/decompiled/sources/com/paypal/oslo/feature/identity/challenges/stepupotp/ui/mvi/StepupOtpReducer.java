package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010!\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/StepupOtpContentProvider;", "contentProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/StepupOtpContentProvider;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;)Larrow/core/Either;", "p0", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Larrow/core/Either;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "p2", "", "p3", "p4", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;Ljava/util/List;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/StepupOtpContentProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupOtpReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public StepupOtpReducer(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider stepupOtpContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupOtpContentProvider, "");
        this.getHighSpeedVideoFpsRanges = stepupOtpContentProvider;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "StepupOtpReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect>> reduce(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState state, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized;
        if (z) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized challengeInitialized = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized) event;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = challengeInitialized.getChallenge();
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> updatedChallenges = challengeInitialized.getUpdatedChallenges();
            if (updatedChallenges == null) {
                updatedChallenges = state.getLatestChallenges();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode(challenge, "", updatedChallenges, state.getBottomSheetState()), null, 2, null);
        }
        if (state instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial initial = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) state;
            if (z) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) {
                java.lang.String take = kotlin.text.StringsKt.take(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) event).getCode(), 6);
                if (take.length() == 6) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading(initial.getChallenge(), take, initial.getLatestChallenges(), initial.getBottomSheetState()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial.copy$default(initial, null, take, null, null, 13, null), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ResendCode.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode(initial.getChallenge(), initial.getCode(), initial.getLatestChallenges(), initial.getBottomSheetState()), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.BackClicked.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(Camera2StreamConfigurationMap(initial, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) event).getOptions()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) {
                return getHighSpeedVideoSizes(initial, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) event).getOptionType());
            }
            if ((event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsDismissed) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRanges(initial), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) {
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection showContactSelection = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRangesFor(initial, showContactSelection.getContacts(), showContactSelection.getCurrentContactId(), showContactSelection.isEmailSelection(), showContactSelection.getShouldFilterCurrentContact()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error)) {
                            if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) state;
                            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.BackClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(maxAttemptsReached, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack.INSTANCE);
                            }
                            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(maxAttemptsReached, null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(Camera2StreamConfigurationMap(maxAttemptsReached, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) event).getOptions()), null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) {
                                return getHighSpeedVideoSizes(maxAttemptsReached, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) event).getOptionType());
                            }
                            if ((event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsDismissed) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed.INSTANCE)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRanges(maxAttemptsReached), null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) {
                                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection showContactSelection2 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) event;
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRangesFor(maxAttemptsReached, showContactSelection2.getContacts(), showContactSelection2.getCurrentContactId(), showContactSelection2.isEmailSelection(), showContactSelection2.getShouldFilterCurrentContact()), null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(maxAttemptsReached, null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(maxAttemptsReached, event);
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error error = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) {
                            java.lang.String take2 = kotlin.text.StringsKt.take(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) event).getCode(), 6);
                            if (take2.length() == 6) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading(error.getChallenge(), take2, error.getLatestChallenges(), null, 8, null), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial(error.getChallenge(), take2, error.getLatestChallenges(), null, 8, null), null, 2, null);
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ResendCode.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode(error.getChallenge(), error.getCode(), error.getLatestChallenges(), error.getBottomSheetState()), null, 2, null);
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.BackClicked.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(Camera2StreamConfigurationMap(error, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) event).getOptions()), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) {
                            return getHighSpeedVideoSizes(error, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) event).getOptionType());
                        }
                        if ((event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsDismissed) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRanges(error), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) {
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection showContactSelection3 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) event;
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRangesFor(error, showContactSelection3.getContacts(), showContactSelection3.getCurrentContactId(), showContactSelection3.isEmailSelection(), showContactSelection3.getShouldFilterCurrentContact()), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess) state, event);
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode resendingCode = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) state;
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent content$default = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider.getContent$default(this.getHighSpeedVideoFpsRanges, resendingCode.getChallenge(), false, false, 6, null);
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2 = resendingCode.getChallenge();
                    java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges = resendingCode.getLatestChallenges();
                    if (latestChallenges.isEmpty()) {
                        latestChallenges = ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) event).getChallenges();
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial initial2 = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial(challenge2, "", latestChallenges, null);
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent notifySent = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) event;
                    if (notifySent.getShowToast() && resendingCode.getChallenge().getType() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR) {
                        java.lang.String maskedTarget = content$default.getMaskedTarget();
                        if (maskedTarget.length() == 0) {
                            maskedTarget = notifySent.getDeliveryTarget();
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial2, new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat(content$default.getCodeSentMessageResId(), maskedTarget, false));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial2, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed) {
                    if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed) event).isRateLimited()) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached(resendingCode.getChallenge(), null, resendingCode.getLatestChallenges(), resendingCode.getBottomSheetState(), 2, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial(resendingCode.getChallenge(), resendingCode.getCode(), resendingCode.getLatestChallenges(), resendingCode.getBottomSheetState()), new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_generic_error, true));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(resendingCode, event);
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge3 = loading.getChallenge();
                java.lang.String code = loading.getCode();
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess validationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess) event;
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = validationSuccess.getChallenges();
                if (challenges.isEmpty()) {
                    challenges = loading.getLatestChallenges();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess(challenge3, code, challenges, null, validationSuccess.getNonce(), validationSuccess.getPartialToken(), 8, null), new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen(validationSuccess.getToken(), validationSuccess.getPostAuthOperations()));
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge4 = loading.getChallenge();
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge nextStepUpChallenge = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess(challenge4, null, nextStepUpChallenge.getLatestChallenges(), null, null, null, 58, null), new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge(nextStepUpChallenge.getNextChallenge(), nextStepUpChallenge.getLatestChallenges()));
            }
            if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp)) {
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed) event;
                    java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges2 = validationFailed.getChallenges();
                    if (challenges2.isEmpty()) {
                        challenges2 = loading.getLatestChallenges();
                    }
                    java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = challenges2;
                    if (validationFailed.isRateLimited()) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached(loading.getChallenge(), null, list, loading.getBottomSheetState(), 2, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error(loading.getChallenge(), validationFailed.getErrorMessageResId(), "", validationFailed.isInvalidCode(), validationFailed.isExpired(), list, loading.getBottomSheetState()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges3 = ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp) event).getChallenges();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : challenges3) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge5 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
                if (challenge5.isEligible() && challenge5.getType() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CHANGE_PASSWORD && challenge5.getType() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SKIP_AND_LOGIN) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess(loading.getChallenge(), null, arrayList2, null, null, null, 58, null), new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination(arrayList2));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error(loading.getChallenge(), com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_validation_failed, null, false, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_validation_failed, true));
        }
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode sendingCode = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) state;
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent content$default2 = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider.getContent$default(this.getHighSpeedVideoFpsRanges, sendingCode.getChallenge(), false, false, 6, null);
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge6 = sendingCode.getChallenge();
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges2 = sendingCode.getLatestChallenges();
            if (latestChallenges2.isEmpty()) {
                latestChallenges2 = ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) event).getChallenges();
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial initial3 = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial(challenge6, "", latestChallenges2, null);
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent notifySent2 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) event;
            if (notifySent2.getShowToast() && sendingCode.getChallenge().getType() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR) {
                java.lang.String maskedTarget2 = content$default2.getMaskedTarget();
                if (maskedTarget2.length() == 0) {
                    maskedTarget2 = notifySent2.getDeliveryTarget();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial3, new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat(content$default2.getCodeSentMessageResId(), maskedTarget2, false));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial3, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed) {
            if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed) event).isRateLimited()) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached(sendingCode.getChallenge(), null, sendingCode.getLatestChallenges(), sendingCode.getBottomSheetState(), 2, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial(sendingCode.getChallenge(), sendingCode.getCode(), sendingCode.getLatestChallenges(), sendingCode.getBottomSheetState()), new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_generic_error, true));
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) {
            return getHighSpeedVideoSizes(sendingCode, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) event).getOptionType());
        }
        if ((event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsDismissed) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRanges(sendingCode), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection showContactSelection4 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoFpsRangesFor(sendingCode, showContactSelection4.getContacts(), showContactSelection4.getCurrentContactId(), showContactSelection4.isEmailSelection(), showContactSelection4.getShouldFilterCurrentContact()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(sendingCode, null, 2, null);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.BackClicked.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(sendingCode, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(sendingCode, event);
    }

    private final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState p0, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType p1) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType;
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge copy$default;
        if (p0.getChallenge().getId().length() == 0) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }
        switch (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer.WhenMappings.$EnumSwitchMapping$0[p1.ordinal()]) {
            case 1:
            case 2:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
                break;
            case 3:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP;
                break;
            case 4:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL;
                break;
            case 5:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR;
                break;
            case 6:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP;
                break;
            case 7:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD;
                break;
            case 8:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION;
                break;
            default:
                challengeType = null;
                break;
        }
        if (challengeType == null) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }
        if (p0.getChallenge().getType() == challengeType) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode(p0.getChallenge(), p0.getCode(), p0.getLatestChallenges(), p0.getBottomSheetState()), null, 2, null);
        }
        if (!p0.getLatestChallenges().isEmpty()) {
            java.util.Iterator<T> it = p0.getLatestChallenges().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj).getType() == challengeType) {
                    }
                } else {
                    obj = null;
                }
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
            if (challenge != null && challenge.getId().length() != 0) {
                boolean z = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge;
                if (!z ? !(!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) ? !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) ? !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) || ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails().size() <= 1 : ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers().size() <= 1 : ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers().size() <= 1) : ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers().size() > 1) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                }
                if (!z ? !(!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) ? !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) ? !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) || !((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails().isEmpty() : !((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers().isEmpty() : !((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers().isEmpty()) : ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers().isEmpty()) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                }
                if (z || (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) || (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                    if (z) {
                        phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers();
                    } else if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
                        phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers();
                    } else {
                        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
                            phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers();
                        }
                        copy$default = challenge;
                    }
                    if (phoneNumbers.size() == 1) {
                        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list = phoneNumbers;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) it2.next(), null, null, false, false, true, null, 47, null));
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        if (z) {
                            copy$default = com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge, null, null, false, arrayList2, null, null, 55, null);
                        } else if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
                            copy$default = com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge, null, null, false, arrayList2, null, null, 55, null);
                        } else if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
                            copy$default = com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge, null, null, false, arrayList2, null, null, 55, null);
                        }
                    }
                    copy$default = challenge;
                } else {
                    if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
                        com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge emailChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge;
                        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> emails = emailChallenge.getEmails();
                        if (emails.size() == 1) {
                            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> list2 = emails;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                            java.util.Iterator<T> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) it3.next(), null, null, false, false, true, 15, null));
                            }
                            emailChallenge = com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge.copy$default(emailChallenge, null, null, false, arrayList3, null, null, 55, null);
                        }
                        copy$default = emailChallenge;
                    }
                    copy$default = challenge;
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState stepupOtpUiState = p0;
                if (copy$default != null) {
                    challenge = copy$default;
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(stepupOtpUiState, new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge(challenge, p0.getLatestChallenges()));
            }
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
    }

    private static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState p0, java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> p1) {
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions moreOptions = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions(p1);
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) p0, null, null, null, moreOptions, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) p0, null, null, null, moreOptions, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) p0, null, null, null, moreOptions, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) p0, null, null, null, moreOptions, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) p0, null, 0, null, false, false, null, moreOptions, 63, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) p0, null, null, null, moreOptions, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess) {
            return p0;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState p0, java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> p1, java.lang.String p2, boolean p3, boolean p4) {
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection contactSelection = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection(p1, p2, p3, p4);
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) p0, null, null, null, contactSelection, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) p0, null, null, null, contactSelection, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) p0, null, null, null, contactSelection, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) p0, null, null, null, contactSelection, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) p0, null, 0, null, false, false, null, contactSelection, 63, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) p0, null, null, null, contactSelection, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess) {
            return p0;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState p0) {
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) p0, null, null, null, null, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) p0, null, null, null, null, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) p0, null, null, null, null, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) p0, null, null, null, null, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) p0, null, 0, null, false, false, null, null, 63, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) {
            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached.copy$default((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) p0, null, null, null, null, 7, null);
        }
        if (p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess) {
            return p0;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_AUTHENTICATOR_APP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.VERIFY_CREDIT_CARD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.ANSWER_SECURITY_QUESTIONS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
