package com.paypal.oslo.feature.identity.challenges.stepupsna.ui;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/StepupSnaViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/VerifySnaUseCase;", "verifySnaUseCase", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/VerifySnaUseCase;Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaReducer;)V", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.KEY_CHALLENGE_CONTEXT, "initializeChallenge", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/usecase/VerifySnaUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupSnaViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect> getHighSpeedVideoFpsRanges;
    private com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState> uiState;

    @javax.inject.Inject
    public StepupSnaViewModel(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase verifySnaUseCase, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer stepupSnaReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifySnaUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupSnaReducer, "");
        this.Camera2StreamConfigurationMap = verifySnaUseCase;
        java.lang.String str = "StepupSnaViewModel.store";
        java.util.List list = null;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(str, new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Initial(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge("", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH, false, "", kotlin.collections.CollectionsKt.emptyList(), null, null)), stepupSnaReducer, list, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$performVerification(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel stepupSnaViewModel, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel$performVerification$1 stepupSnaViewModel$performVerification$1;
        int i;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel$performVerification$1) {
            stepupSnaViewModel$performVerification$1 = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel$performVerification$1) continuation;
            if ((stepupSnaViewModel$performVerification$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                stepupSnaViewModel$performVerification$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = stepupSnaViewModel$performVerification$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stepupSnaViewModel$performVerification$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String evUrl = silentAuthChallenge.getEvUrl();
                    if (evUrl.length() == 0) {
                        com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) silentAuthChallenge.getPhoneNumbers());
                        evUrl = phoneNumber != null ? phoneNumber.getEvaluateURL() : null;
                        if (evUrl == null) {
                            evUrl = "";
                        }
                    }
                    java.lang.String str = evUrl;
                    if (str.length() == 0) {
                        stepupSnaViewModel.getHighSpeedVideoFpsRanges.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingEvUrl.INSTANCE));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext2 = stepupSnaViewModel.getHighSpeedVideoFpsRangesFor;
                    if (challengeContext2 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType flowType = challengeContext2.getFlowType();
                    com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase verifySnaUseCase = stepupSnaViewModel.Camera2StreamConfigurationMap;
                    stepupSnaViewModel$performVerification$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(silentAuthChallenge);
                    stepupSnaViewModel$performVerification$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    stepupSnaViewModel$performVerification$1.getHighSpeedVideoFpsRanges = challengeContext2;
                    stepupSnaViewModel$performVerification$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowType);
                    stepupSnaViewModel$performVerification$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = verifySnaUseCase.invoke(silentAuthChallenge, str, flowType, stepupSnaViewModel$performVerification$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    challengeContext = challengeContext2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    challengeContext = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext) stepupSnaViewModel$performVerification$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validationChallengeResultStatus = validateChallengeResult.getValidationChallengeResultStatus();
                    if (validationChallengeResultStatus != null && com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel.WhenMappings.$EnumSwitchMapping$0[validationChallengeResultStatus.ordinal()] == 1) {
                        if (validateChallengeResult.getStepUpStatus() == com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.IN_PROGRESS) {
                            com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect> mviStateStore = stepupSnaViewModel.getHighSpeedVideoFpsRanges;
                            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = validateChallengeResult.getChallenges();
                            if (challenges == null) {
                                challenges = kotlin.collections.CollectionsKt.emptyList();
                            }
                            mviStateStore.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp(challenges, challengeContext.getAuthIntent()));
                        } else {
                            stepupSnaViewModel.getHighSpeedVideoFpsRanges.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded(validateChallengeResult));
                        }
                    } else {
                        stepupSnaViewModel.getHighSpeedVideoFpsRanges.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed(new com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ValidationError("SNA validation returned non-success status")));
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError snaVerificationError = (com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError) ((arrow.core.Either.Left) either).getValue();
                    if (snaVerificationError instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError) {
                        stepupSnaViewModel.getHighSpeedVideoFpsRanges.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed(((com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.NetworkError) snaVerificationError).getSnaError()));
                    } else {
                        if (!(snaVerificationError instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        stepupSnaViewModel.getHighSpeedVideoFpsRanges.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed(((com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.SnaVerificationError.ValidationError) snaVerificationError).getChallengeError()));
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        stepupSnaViewModel$performVerification$1 = new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel$performVerification$1(stepupSnaViewModel, continuation);
        java.lang.Object obj2 = stepupSnaViewModel$performVerification$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepupSnaViewModel$performVerification$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    public final void initializeChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeContext, "");
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge) {
            this.getHighSpeedVideoFpsRangesFor = challengeContext;
            this.getHighResolutionOutputSizeshNQ4ISI = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge) challenge;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel$initializeChallenge$1(this, challenge, null), 3, null);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
