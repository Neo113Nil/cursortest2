package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u00100\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010.\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u00101R&\u00105\u001a\u0014\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u000204028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u00108\u001a\b\u0012\u0004\u0012\u000203078\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\b\u0012\u0004\u0012\u0002040<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010*\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010AR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010C\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010E"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/viewmodel/StepupOtpVerificationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/NotifyChallengeUseCase;", "notifyChallengeUseCase", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeUseCase;", "validateChallengeUseCase", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/StepupOtpContentProvider;", "contentProvider", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpReducer;", "reducer", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/NotifyChallengeUseCase;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeUseCase;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/StepupOtpContentProvider;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpReducer;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.KEY_CHALLENGE_CONTEXT, "", "latestChallenges", "", "isSwitchingChallenge", "initializeChallenge", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;Ljava/util/List;Z)V", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Z)V", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;)V", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/NotifyChallengeUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeUseCase;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/StepupOtpContentProvider;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Landroidx/lifecycle/SavedStateHandle;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Z", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "getOutputMinFrameDuration", "Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupOtpVerificationViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandle getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect> getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public StepupOtpVerificationViewModel(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase notifyChallengeUseCase, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider stepupOtpContentProvider, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer stepupOtpReducer, androidx.view.SavedStateHandle savedStateHandle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyChallengeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupOtpContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupOtpReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.getHighSpeedVideoFpsRanges = stringProvider;
        this.Camera2StreamConfigurationMap = notifyChallengeUseCase;
        this.getHighSpeedVideoSizes = validateChallengeUseCase;
        this.getHighSpeedVideoFpsRangesFor = stepupOtpContentProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = savedStateHandle;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("StepupOtpVerificationViewModel.store", new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS, true, kotlin.collections.CollectionsKt.emptyList(), "", ""), "", null, null, 12, null), stepupOtpReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent>() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleCodeChanged(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this, input.getStates().getSecond());
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ResendCode.INSTANCE)) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleResendCode(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this, input.getStates().getFirst());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleMoreOptionSelectedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this, (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) event, input);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsClicked.INSTANCE)) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleMoreOptionsClicked(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this, input.getStates().getFirst());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleContactSelectedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this, (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) event, input.getStates().getFirst());
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed.INSTANCE)) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleEmailPhoneSelectionDismissedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed.INSTANCE)) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleEmailPhoneSelectionClosedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this);
                } else if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleNotifySentEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this);
                } else if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed) {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleNotifyFailedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.this);
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent>() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$analyticsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) {
                    return;
                }
                kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ResendCode.INSTANCE);
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputFormats.onEvent(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeChallenge$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        stepupOtpVerificationViewModel.initializeChallenge(challenge, challengeContext, list, z);
    }

    public final void initializeChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, boolean isSwitchingChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
        this.getHighSpeedVideoSizesFor = challengeContext;
        if (isSwitchingChallenge) {
            this.getHighResolutionOutputSizeshNQ4ISI.set("notified_challenge_id", null);
        }
        if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge)) {
            processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_unknown, false));
            return;
        }
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect> mviStateStore = this.getOutputFormats;
        if (latestChallenges.isEmpty()) {
            latestChallenges = null;
        }
        mviStateStore.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized(challenge, latestChallenges));
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.get("notified_challenge_id"), challenge.getId())) {
            processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent(this.getHighSpeedVideoFpsRangesFor.getDeliveryTarget(challenge), kotlin.collections.CollectionsKt.emptyList(), false));
        } else {
            if (!com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeExtensionsKt.hasNotifiedContact(challenge)) {
                Camera2StreamConfigurationMap(challenge, isSwitchingChallenge);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.set("notified_challenge_id", challenge.getId());
            processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent(this.getHighSpeedVideoFpsRangesFor.getDeliveryTarget(challenge), kotlin.collections.CollectionsKt.emptyList(), false));
        }
    }

    private final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge p0, boolean p1) {
        java.lang.String challengeId = this.getHighSpeedVideoFpsRangesFor.getChallengeId(p0);
        java.lang.String deliveryTarget = this.getHighSpeedVideoFpsRangesFor.getDeliveryTarget(p0);
        java.lang.String nonce = this.getHighSpeedVideoFpsRangesFor.getNonce(p0);
        java.lang.String partialToken = this.getHighSpeedVideoFpsRangesFor.getPartialToken(p0);
        if (p0.getId().length() == 0 || challengeId == null) {
            processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_session_not_initialized, false));
        } else {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$sendCodeNotification$1(p0.getId(), challengeId, p0, deliveryTarget, nonce, partialToken, this, p1, null), 3, null);
        }
    }

    private final void getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult p0) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.getOutputFormats.getUiState().getValue().getChallenge();
        if (p0.getStepUpStatus() == com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.IN_PROGRESS) {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = p0.getChallenges();
            if (challenges == null) {
                challenges = kotlin.collections.CollectionsKt.emptyList();
            }
            processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp(challenges));
            return;
        }
        if ((p0.getStepUpStatus() == com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.PENDING || p0.getStepUpStatus() == com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.FAILED) && challenge.getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP) {
            int i = com.paypal.oslo.feature.identity.R.string.feature_identity_otp_max_attempts_title;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges2 = p0.getChallenges();
            if (challenges2 == null) {
                challenges2 = kotlin.collections.CollectionsKt.emptyList();
            }
            processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(i, false, true, false, challenges2));
            return;
        }
        com.paypal.oslo.feature.identity.foundation.model.UserAccessToken firstPartyUserAccessToken = p0.getFirstPartyUserAccessToken();
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges3 = p0.getChallenges();
        if (challenges3 == null) {
            challenges3 = kotlin.collections.CollectionsKt.emptyList();
        }
        processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess(firstPartyUserAccessToken, challenges3, this.getHighSpeedVideoFpsRangesFor.getNonce(challenge), this.getHighSpeedVideoFpsRangesFor.getPartialToken(challenge), p0.getPostAuthOperations()));
    }

    public static final /* synthetic */ void access$handleCodeChanged(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState stepupOtpUiState) {
        if (stepupOtpUiState instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) stepupOtpUiState;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = loading.getChallenge();
            java.lang.String code = loading.getCode();
            java.lang.String nonce = stepupOtpVerificationViewModel.getHighSpeedVideoFpsRangesFor.getNonce(challenge);
            java.lang.String partialToken = stepupOtpVerificationViewModel.getHighSpeedVideoFpsRangesFor.getPartialToken(challenge);
            if (challenge.getId().length() != 0) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(stepupOtpVerificationViewModel), null, null, new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$validateCode$1(challenge, code, nonce, partialToken, stepupOtpVerificationViewModel, null), 3, null);
            } else {
                stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_session_not_initialized, false, false, false, null, 24, null));
            }
        }
    }

    public static final /* synthetic */ void access$handleContactSelectedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected contactSelected, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState stepupOtpUiState) {
        stepupOtpVerificationViewModel.getInputFormats = true;
        java.lang.String contactId = contactSelected.getContactId();
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = stepupOtpVerificationViewModel.getOutputMinFrameDuration;
        if (challenge == null) {
            challenge = stepupOtpUiState.getChallenge();
        }
        stepupOtpVerificationViewModel.getOutputMinFrameDuration = null;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge updateChallengeWithSelectedContact = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.updateChallengeWithSelectedContact(challenge, contactId);
        if (updateChallengeWithSelectedContact != null) {
            stepupOtpVerificationViewModel.getOutputFormats.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized(updateChallengeWithSelectedContact, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.updateLatestChallenges(stepupOtpUiState.getLatestChallenges(), updateChallengeWithSelectedContact)));
            stepupOtpVerificationViewModel.Camera2StreamConfigurationMap(updateChallengeWithSelectedContact, true);
        }
    }

    public static final /* synthetic */ void access$handleEmailPhoneSelectionClosedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel) {
        stepupOtpVerificationViewModel.getInputSizeshNQ4ISI = null;
        stepupOtpVerificationViewModel.getInputFormats = false;
    }

    public static final /* synthetic */ void access$handleEmailPhoneSelectionDismissedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel) {
        stepupOtpVerificationViewModel.getInputFormats = false;
        java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = stepupOtpVerificationViewModel.getInputSizeshNQ4ISI;
        if (list != null) {
            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions(list));
        }
        stepupOtpVerificationViewModel.getInputSizeshNQ4ISI = null;
    }

    public static final /* synthetic */ void access$handleMoreOptionSelectedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected moreOptionSelected, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input) {
        java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> emptyList;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType;
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState stepupOtpUiState = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState) input.getStates().getFirst();
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState stepupOtpUiState2 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState) input.getStates().getSecond();
        if (moreOptionSelected.getOptionType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER || moreOptionSelected.getOptionType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState = stepupOtpUiState.getBottomSheetState();
            if (bottomSheetState instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions) {
                stepupOtpVerificationViewModel.getInputSizeshNQ4ISI = ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions) bottomSheetState).getOptions();
            }
        }
        switch (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.WhenMappings.$EnumSwitchMapping$2[moreOptionSelected.getOptionType().ordinal()]) {
            case 1:
            case 2:
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = stepupOtpUiState.getChallenge();
                if (challenge.getId().length() != 0) {
                    if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge)) {
                        if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge)) {
                            if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                                if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge)) {
                                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                                } else {
                                    java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> emails = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails();
                                    if (emails.size() > 1) {
                                        emptyList = com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toEmailUiModels(emails, stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges);
                                    } else {
                                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                                    }
                                }
                            } else {
                                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers();
                                if (phoneNumbers.size() > 1) {
                                    emptyList = com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toUiModels(phoneNumbers, stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges);
                                } else {
                                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                                }
                            }
                        } else {
                            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers2 = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers();
                            if (phoneNumbers2.size() > 1) {
                                emptyList = com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toUiModels(phoneNumbers2, stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges);
                            } else {
                                emptyList = kotlin.collections.CollectionsKt.emptyList();
                            }
                        }
                    } else {
                        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers3 = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers();
                        if (phoneNumbers3.size() > 1) {
                            emptyList = com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toUiModels(phoneNumbers3, stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges);
                        } else {
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                    }
                    if (!emptyList.isEmpty()) {
                        kotlin.Pair<java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel>, java.lang.String> sortAndGetCurrentContact = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.sortAndGetCurrentContact(emptyList);
                        stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection(sortAndGetCurrentContact.component1(), sortAndGetCurrentContact.component2(), challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge, true));
                        break;
                    }
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                int i = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.WhenMappings.$EnumSwitchMapping$2[moreOptionSelected.getOptionType().ordinal()];
                java.lang.Object obj = null;
                if (i == 3) {
                    challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
                } else if (i == 4) {
                    challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL;
                } else if (i == 5) {
                    challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP;
                } else {
                    challengeType = i != 6 ? null : com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR;
                }
                if (challengeType != null) {
                    java.util.Iterator<T> it = stepupOtpUiState.getLatestChallenges().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.lang.Object next = it.next();
                            if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) next).getType() == challengeType) {
                                obj = next;
                            }
                        }
                    }
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
                    if (challenge2 != null) {
                        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> extractPhoneNumbers = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.extractPhoneNumbers(challenge2);
                        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> extractEmailAddresses = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.extractEmailAddresses(challenge2);
                        if (extractPhoneNumbers.size() <= 1) {
                            if (extractEmailAddresses.size() > 1) {
                                kotlin.Pair<java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel>, java.lang.String> sortAndGetCurrentContact2 = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.sortAndGetCurrentContact(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toEmailUiModels(extractEmailAddresses, stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges));
                                stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection(sortAndGetCurrentContact2.component1(), sortAndGetCurrentContact2.component2(), true, false));
                                stepupOtpVerificationViewModel.getOutputMinFrameDuration = challenge2;
                                break;
                            }
                        } else {
                            kotlin.Pair<java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel>, java.lang.String> sortAndGetCurrentContact3 = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper.INSTANCE.sortAndGetCurrentContact(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper.EmailPhoneUiMapperKt.toUiModels(extractPhoneNumbers, stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges));
                            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection(sortAndGetCurrentContact3.component1(), sortAndGetCurrentContact3.component2(), false, false));
                            stepupOtpVerificationViewModel.getOutputMinFrameDuration = challenge2;
                            break;
                        }
                    }
                }
                break;
        }
        if (!(stepupOtpUiState2 instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) || (stepupOtpUiState instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode)) {
            return;
        }
        stepupOtpVerificationViewModel.Camera2StreamConfigurationMap(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) stepupOtpUiState2).getChallenge(), true);
    }

    public static final /* synthetic */ void access$handleMoreOptionsClicked(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState stepupOtpUiState) {
        java.util.ArrayList textChallengeFallbackOptions;
        try {
            if (!stepupOtpUiState.getLatestChallenges().isEmpty()) {
                java.util.List<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData> mapChallengesToOptions = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.ChallengeToOptionMapperKt.mapChallengesToOptions(stepupOtpUiState.getChallenge(), stepupOtpUiState.getLatestChallenges());
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(mapChallengesToOptions, 10));
                for (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData : mapChallengesToOptions) {
                    arrayList.add(new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(optionData.getType(), stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges.getString(optionData.getTitleRes()), optionData.getIcon(), optionData.isVisible()));
                }
                textChallengeFallbackOptions = arrayList;
            } else {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = stepupOtpUiState.getChallenge();
                if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                    textChallengeFallbackOptions = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    textChallengeFallbackOptions = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.provider.FallbackOptionsProvider.INSTANCE.getTextChallengeFallbackOptions(stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges);
                }
            }
            if (textChallengeFallbackOptions.isEmpty()) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2 = stepupOtpUiState.getChallenge();
                if ((challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) || (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) || (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) || (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                    textChallengeFallbackOptions = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.provider.FallbackOptionsProvider.INSTANCE.getTextChallengeFallbackOptions(stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges);
                }
            }
            if (textChallengeFallbackOptions.isEmpty()) {
                return;
            }
            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions(textChallengeFallbackOptions));
        } catch (java.lang.Exception unused) {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge3 = stepupOtpUiState.getChallenge();
            if ((challenge3 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) || (challenge3 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) || (challenge3 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) || (challenge3 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.provider.FallbackOptionsProvider.INSTANCE.getTextChallengeFallbackOptions(stepupOtpVerificationViewModel.getHighSpeedVideoFpsRanges)));
            }
        }
    }

    public static final /* synthetic */ void access$handleNotifyError(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, java.lang.Object obj) {
        stepupOtpVerificationViewModel.getHighResolutionOutputSizeshNQ4ISI.set("notified_challenge_id", null);
        stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_unknown, false));
    }

    public static final /* synthetic */ void access$handleNotifyFailedEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel) {
        if (stepupOtpVerificationViewModel.getInputFormats) {
            stepupOtpVerificationViewModel.getInputFormats = false;
        }
    }

    public static final /* synthetic */ void access$handleNotifySentEvent(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel) {
        if (stepupOtpVerificationViewModel.getInputFormats) {
            stepupOtpVerificationViewModel.getInputSizeshNQ4ISI = null;
            stepupOtpVerificationViewModel.getInputFormats = false;
        }
    }

    public static final /* synthetic */ void access$handleNotifySuccess(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult notifyChallengeResult, java.lang.String str, boolean z, java.lang.String str2) {
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus = notifyChallengeResult.getNotifyChallengeResultStatus();
        int i = notifyChallengeResultStatus == null ? -1 : com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.WhenMappings.$EnumSwitchMapping$0[notifyChallengeResultStatus.ordinal()];
        if (i == 1) {
            stepupOtpVerificationViewModel.getHighResolutionOutputSizeshNQ4ISI.set("notified_challenge_id", str2);
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = notifyChallengeResult.getChallenges();
            if (challenges == null) {
                challenges = kotlin.collections.CollectionsKt.emptyList();
            }
            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent(str, challenges, z));
            return;
        }
        if (i == 2) {
            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_rate_limit, false));
        } else if (i == 3) {
            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_rate_limit, true));
        } else {
            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_send_failed, false));
        }
    }

    public static final /* synthetic */ void access$handleResendCode(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState stepupOtpUiState) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        if (stepupOtpUiState instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) {
            challenge = ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) stepupOtpUiState).getChallenge();
        } else if (stepupOtpUiState instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) {
            challenge = ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) stepupOtpUiState).getChallenge();
        } else if (!(stepupOtpUiState instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached)) {
            return;
        } else {
            challenge = ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) stepupOtpUiState).getChallenge();
        }
        stepupOtpVerificationViewModel.Camera2StreamConfigurationMap(challenge, true);
    }

    public static final /* synthetic */ void access$handleValidationResult(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult) {
        int i;
        if (validateChallengeResult.getValidationChallengeResultStatus() == null && validateChallengeResult.getFirstPartyUserAccessToken() != null) {
            stepupOtpVerificationViewModel.getHighSpeedVideoSizes(validateChallengeResult);
        }
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validationChallengeResultStatus = validateChallengeResult.getValidationChallengeResultStatus();
        switch (validationChallengeResultStatus == null ? -1 : com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.WhenMappings.$EnumSwitchMapping$1[validationChallengeResultStatus.ordinal()]) {
            case 1:
            case 2:
                int i2 = com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_invalid_code;
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = validateChallengeResult.getChallenges();
                if (challenges == null) {
                    challenges = kotlin.collections.CollectionsKt.emptyList();
                }
                stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(i2, true, false, false, challenges));
                break;
            case 3:
            case 4:
                int i3 = com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_expired_code;
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges2 = validateChallengeResult.getChallenges();
                if (challenges2 == null) {
                    challenges2 = kotlin.collections.CollectionsKt.emptyList();
                }
                stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(i3, false, false, true, challenges2));
                break;
            case 5:
            case 6:
                int i4 = com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_too_many_attempts;
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges3 = validateChallengeResult.getChallenges();
                if (challenges3 == null) {
                    challenges3 = kotlin.collections.CollectionsKt.emptyList();
                }
                stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(i4, false, true, false, challenges3));
                break;
            case 7:
                stepupOtpVerificationViewModel.getHighSpeedVideoSizes(validateChallengeResult);
                break;
            default:
                if (validateChallengeResult.getFirstPartyUserAccessToken() == null) {
                    i = com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_validation_failed;
                } else {
                    i = com.paypal.oslo.feature.identity.R.string.feature_identity_otp_generic_error;
                }
                int i5 = i;
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges4 = validateChallengeResult.getChallenges();
                if (challenges4 == null) {
                    challenges4 = kotlin.collections.CollectionsKt.emptyList();
                }
                stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(i5, false, false, false, challenges4));
                break;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus.DELIVERY_LIMIT_EXCEEDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus.RATE_LIMIT_EXCEEDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.INVALID_ONE_TIME_PASSCODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.VALIDATION_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.ONE_TIME_PASSCODE_EXPIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.CONTEXT_EXPIRED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.VERIFICATION_LIMIT_EXCEEDED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.RATE_LIMIT_EXCEEDED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.SUCCESS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.values().length];
            try {
                iArr3[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
