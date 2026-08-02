package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Loading;", "", "p0", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$BannerError;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Loading;I)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$BannerError;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "p1", "Lkotlin/Function1;", "p2", "Camera2StreamConfigurationMap", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;Lkotlin/jvm/functions/Function1;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupCreditCardReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StepupCreditCardReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "StepupCreditCardReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect>> reduce(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState state, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent event) {
        com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError highResolutionOutputSizeshNQ4ISI;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError)) {
                            if (!(state instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached) state;
                            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.BackClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(maxAttemptsReached, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateBack.INSTANCE);
                            }
                            if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsClicked) && !(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions)) {
                                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) {
                                    return Camera2StreamConfigurationMap(maxAttemptsReached.getAvailableChallenges(), ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) event).getOptionType(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer.$r8$lambda$L8zCFDzQi8xofIlP2xl4DcBbHZ0(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached.this, (java.util.List) obj2);
                                        }
                                    });
                                }
                                return event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsDismissed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(maxAttemptsReached, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(maxAttemptsReached, event);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(maxAttemptsReached, null, 2, null);
                        }
                        final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError bannerError = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError) state;
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError.copy$default(bannerError, null, null, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) event).getCardNumber(), 0, null, null, 59, null), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.SubmitClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading(bannerError.getChallenge(), bannerError.getSelectedCard(), bannerError.getCardNumber(), bannerError.getLatestChallenges()), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.DismissError) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial(bannerError.getChallenge(), bannerError.getSelectedCard(), bannerError.getCardNumber(), false, true, null, bannerError.getLatestChallenges(), 40, null), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(bannerError, null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError.copy$default(bannerError, null, null, null, 0, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) event).getOptions(), null, 47, null), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) {
                            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected moreOptionSelected = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) event;
                            if (moreOptionSelected.getOptionType() != com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_CARD) {
                                return Camera2StreamConfigurationMap(bannerError.getLatestChallenges(), moreOptionSelected.getOptionType(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer.m15067$r8$lambda$QhfDL_3EYsUREHQtxHyd_kqB3A(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError.this, (java.util.List) obj2);
                                    }
                                });
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial(bannerError.getChallenge(), bannerError.getSelectedCard(), bannerError.getCardNumber(), true, true, null, bannerError.getLatestChallenges(), 32, null), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsDismissed) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError.copy$default(bannerError, null, null, null, 0, null, null, 47, null), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.BackClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(bannerError, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateBack.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(bannerError, event);
                    }
                    final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError inlineError = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError) state;
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial(inlineError.getChallenge(), inlineError.getSelectedCard(), ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) event).getCardNumber(), false, true, null, inlineError.getLatestChallenges(), 40, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.SubmitClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading(inlineError.getChallenge(), inlineError.getSelectedCard(), inlineError.getCardNumber(), inlineError.getLatestChallenges()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(inlineError, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError.copy$default(inlineError, null, null, null, 0, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) event).getOptions(), null, 47, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) {
                        com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected moreOptionSelected2 = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) event;
                        if (moreOptionSelected2.getOptionType() != com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_CARD) {
                            return Camera2StreamConfigurationMap(inlineError.getLatestChallenges(), moreOptionSelected2.getOptionType(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer.$r8$lambda$V4nN7xksi2zn2u9tACFcWxZiNoo(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError.this, (java.util.List) obj2);
                                }
                            });
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial(inlineError.getChallenge(), inlineError.getSelectedCard(), inlineError.getCardNumber(), true, true, null, inlineError.getLatestChallenges(), 32, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsDismissed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError.copy$default(inlineError, null, null, null, 0, null, null, 47, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.BackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(inlineError, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(inlineError, event);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess) state, event);
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading) state;
            if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess)) {
                if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed)) {
                    if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp)) {
                        return event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighResolutionOutputSizeshNQ4ISI(loading, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError) event).getErrorMessageResId()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                    }
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge = loading.getChallenge();
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard = loading.getSelectedCard();
                    com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp multiChallengeStepUp = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess(challenge, selectedCard, multiChallengeStepUp.getChallenges(), null, null, 24, null), new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToStepupDestination(multiChallengeStepUp.getChallenges(), multiChallengeStepUp.getAuthIntent()));
                }
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed) event;
                if (validationFailed.isRateLimited()) {
                    highResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached(loading.getChallenge(), loading.getSelectedCard(), validationFailed.getAvailableChallenges(), null, 8, null);
                } else if (validationFailed.isInlineError()) {
                    highResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError(loading.getChallenge(), loading.getSelectedCard(), loading.getCardNumber(), validationFailed.getErrorMessageResId(), null, loading.getLatestChallenges(), 16, null);
                } else {
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(loading, validationFailed.getErrorMessageResId());
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(highResolutionOutputSizeshNQ4ISI, null, 2, null);
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess validationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess) event;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge2 = loading.getChallenge();
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard2 = loading.getSelectedCard();
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = validationSuccess.getChallenges();
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = challenges.isEmpty() ? null : challenges;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess(challenge2, selectedCard2, list == null ? loading.getLatestChallenges() : list, validationSuccess.getNonce(), validationSuccess.getPartialToken()), new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToNextScreen(validationSuccess.getToken(), validationSuccess.getPostAuthOperations()));
        }
        final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial initial = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial) state;
        if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized)) {
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, null, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) event).getCardNumber(), false, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.SubmitClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading(initial.getChallenge(), initial.getSelectedCard(), initial.getCardNumber(), initial.getLatestChallenges()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, null, null, false, false, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) event).getOptions(), null, 95, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) {
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected moreOptionSelected3 = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) event;
                if (moreOptionSelected3.getOptionType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_CARD) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, null, null, true, true, null, null, 71, null), null, 2, null);
                }
                return Camera2StreamConfigurationMap(initial.getLatestChallenges(), moreOptionSelected3.getOptionType(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer.$r8$lambda$pUSmuL4nleuDlfwe2zHOQ1xGCgU(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.this, (java.util.List) obj2);
                    }
                });
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsDismissed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, null, null, false, false, null, null, 95, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.BackClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateBack.INSTANCE);
            }
            if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected)) {
                if (!(event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelectionDismissed)) {
                    if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError(initial.getChallenge(), initial.getSelectedCard(), initial.getCardNumber(), ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError) event).getErrorMessageResId(), null, initial.getLatestChallenges(), 16, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
                }
                if (initial.getHasCompletedInitialSelection()) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, null, null, false, false, null, null, 119, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, null, null, false, false, null, null, 119, null), com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateBack.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected) event).getCard(), "", false, true, null, null, 97, null), null, 2, null);
        }
        com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized challengeInitialized = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized) event;
        if (kotlin.jvm.internal.Intrinsics.areEqual(initial.getChallenge().getId(), challengeInitialized.getChallenge().getId()) && initial.getHasCompletedInitialSelection()) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
        }
        java.util.Iterator<T> it = challengeInitialized.getChallenge().getCards().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard) obj).isSelected()) {
                break;
            }
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard) obj;
        if (creditCard == null && (creditCard = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) challengeInitialized.getChallenge().getCards())) == null) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, challengeInitialized);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial(challengeInitialized.getChallenge(), creditCard, "", false, true, null, challengeInitialized.getLatestChallenges(), 32, null), null, 2, null);
    }

    private static com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading loading, int i) {
        return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError(loading.getChallenge(), loading.getSelectedCard(), loading.getCardNumber(), i, null, loading.getLatestChallenges(), 16, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState $r8$lambda$L8zCFDzQi8xofIlP2xl4DcBbHZ0(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached maxAttemptsReached, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return maxAttemptsReached;
    }

    /* renamed from: $r8$lambda$QhfDL_3EYsUREHQtxHyd_k-qB3A, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState m15067$r8$lambda$QhfDL_3EYsUREHQtxHyd_kqB3A(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError bannerError, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError.copy$default(bannerError, null, null, null, 0, null, list, 15, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState $r8$lambda$V4nN7xksi2zn2u9tACFcWxZiNoo(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError inlineError, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError.copy$default(inlineError, null, null, null, 0, null, list, 15, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState $r8$lambda$pUSmuL4nleuDlfwe2zHOQ1xGCgU(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial initial, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial.copy$default(initial, null, null, null, false, false, null, list, 31, null);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect>> Camera2StreamConfigurationMap(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> p0, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType p1, kotlin.jvm.functions.Function1<? super java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge>, ? extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState> p2) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        java.lang.Object obj;
        switch (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer.WhenMappings.$EnumSwitchMapping$0[p1.ordinal()]) {
            case 1:
            case 2:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
                break;
            case 3:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL;
                break;
            case 4:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP;
                break;
            case 5:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR;
                break;
            case 6:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION;
                break;
            case 7:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP;
                break;
            case 8:
                challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD;
                break;
            default:
                challengeType = null;
                break;
        }
        if (challengeType != null) {
            java.util.Iterator<T> it = p0.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj).getType() == challengeType) {
                    }
                } else {
                    obj = null;
                }
            }
            challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
        } else {
            challenge = null;
        }
        if (challenge != null) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p2.invoke(p0), new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToDifferentChallenge(challenge, p0));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p2.invoke(p0), null, 2, null);
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
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.ANSWER_SECURITY_QUESTIONS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_AUTHENTICATOR_APP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.VERIFY_CREDIT_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
