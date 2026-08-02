package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020)0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00101\u001a\b\u0012\u0004\u0012\u00020)008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/ProcessStepupUseCase;", "processStepupUseCase", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/ProcessStepupUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;Lcom/paypal/oslo/feature/identity/stepup/ui/StepupReducer;)V", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;)V", "", "requestId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "stepupChallengeResult", "initialize$identity_prodRelease", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "onChallengeSelected", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)V", "optionId", "onOptionSelected", "(Ljava/lang/String;)V", "onSelectionDismissed", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/ProcessStepupUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepupViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.stepup.ui.StepupUiState, com.paypal.oslo.feature.identity.stepup.ui.StepupEvent, com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.stepup.ui.StepupUiState> uiState;

    @javax.inject.Inject
    public StepupViewModel(com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase processStepupUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.feature.identity.stepup.ui.StepupReducer stepupReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processStepupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupReducer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = processStepupUseCase;
        this.getHighSpeedVideoFpsRangesFor = stringProvider;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.stepup.ui.StepupUiState, com.paypal.oslo.feature.identity.stepup.ui.StepupEvent, com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("StepupViewModel.store", com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Initializing.INSTANCE, stepupReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.stepup.ui.StepupUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.stepup.ui.StepupEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }

    public final void initialize$identity_prodRelease(java.lang.String requestId, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult stepupChallengeResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupChallengeResult, "");
        this.getHighSpeedVideoSizes = requestId;
        this.getHighSpeedVideoFpsRanges = stepupChallengeResult;
        if (stepupChallengeResult.getAvailableChallenges().isEmpty()) {
            processEvent(new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessingFailed(com.paypal.oslo.feature.identity.stepup.ui.StepupReducer.ERROR_NO_VERIFICATION_METHODS));
        } else {
            processEvent(new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessed(this.getHighResolutionOutputSizeshNQ4ISI.invoke(stepupChallengeResult)));
        }
    }

    public final void onChallengeSelected(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers;
        com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected optionSelected;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge selectedChallenge = challengeData.getSelectedChallenge();
        if (selectedChallenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) {
            phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) selectedChallenge).getPhoneNumbers();
        } else if (selectedChallenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
            phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) selectedChallenge).getPhoneNumbers();
        } else {
            phoneNumbers = selectedChallenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) selectedChallenge).getPhoneNumbers() : kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> emails = selectedChallenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) selectedChallenge).getEmails() : kotlin.collections.CollectionsKt.emptyList();
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard> cards = selectedChallenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge) selectedChallenge).getCards() : kotlin.collections.CollectionsKt.emptyList();
        if (phoneNumbers.size() <= 1) {
            if (emails.size() <= 1) {
                if (cards.size() <= 1) {
                    if (phoneNumbers.size() == 1) {
                        optionSelected = new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.first((java.util.List) phoneNumbers)).getId(), challengeData);
                    } else if (emails.size() == 1) {
                        optionSelected = new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) kotlin.collections.CollectionsKt.first((java.util.List) emails)).getId(), challengeData);
                    } else {
                        optionSelected = cards.size() == 1 ? new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard) kotlin.collections.CollectionsKt.first((java.util.List) cards)).getId(), challengeData) : new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected(challengeData);
                    }
                } else {
                    optionSelected = new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection(new com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState(challengeData, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toSelectionOptions(cards, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard, java.lang.String>) new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel.m15371$r8$lambda$fkhzlR6N0b9aqvoZuiz5STqC8(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel.this, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard) obj);
                        }
                    }), com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.CREDIT_CARD));
                }
            } else {
                optionSelected = new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection(new com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState(challengeData, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toEmailSelectionOptions(emails, this.getHighSpeedVideoFpsRangesFor), com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.EMAIL));
            }
        } else {
            optionSelected = new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection(new com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState(challengeData, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toSelectionOptions(phoneNumbers, this.getHighSpeedVideoFpsRangesFor), com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.PHONE));
        }
        processEvent(optionSelected);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onOptionSelected(java.lang.String optionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionId, "");
        processEvent(new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected(optionId, null, 2, 0 == true ? 1 : 0));
    }

    public final void onSelectionDismissed() {
        processEvent(com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.SelectionDismissed.INSTANCE);
    }

    /* renamed from: $r8$lambda$fkhzlR6-N0b9aqvoZu-iz5STqC8, reason: not valid java name */
    public static /* synthetic */ java.lang.String m15371$r8$lambda$fkhzlR6N0b9aqvoZuiz5STqC8(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
        return stepupViewModel.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_credit_card_display_short, creditCard.getCardType(), kotlin.text.StringsKt.takeLast(creditCard.getCardLast4(), 2));
    }
}
