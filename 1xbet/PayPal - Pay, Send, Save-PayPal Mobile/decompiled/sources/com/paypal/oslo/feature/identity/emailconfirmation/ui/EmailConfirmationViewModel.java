package com.paypal.oslo.feature.identity.emailconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00158\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020!0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020 0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010*\u001a\b\u0012\u0004\u0012\u00020!0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/usecase/ConfirmEmailUseCase;", "confirmEmailUseCase", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/usecase/ConfirmEmailUseCase;Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationReducer;)V", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationEvent;)V", "", "encryptedEmail", "confirmationCode", "initialize", "(Ljava/lang/String;Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/usecase/ConfirmEmailUseCase;", "getHighSpeedVideoFpsRanges", "", "autoDismissDelayMs", "J", "getAutoDismissDelayMs$identity_prodRelease", "()J", "setAutoDismissDelayMs$identity_prodRelease", "(J)V", "", "getHighSpeedVideoFpsRangesFor", "Z", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiState;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationViewModel extends androidx.view.ViewModel {
    public static final long DEFAULT_AUTO_DISMISS_DELAY_MS = 4000;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase getHighSpeedVideoFpsRanges;
    private long autoDismissDelayMs;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public EmailConfirmationViewModel(com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase confirmEmailUseCase, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationReducer emailConfirmationReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationReducer, "");
        this.getHighSpeedVideoFpsRanges = confirmEmailUseCase;
        this.autoDismissDelayMs = DEFAULT_AUTO_DISMISS_DELAY_MS;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("EmailConfirmationViewModel.store", com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading.INSTANCE, emailConfirmationReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent>() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$analyticsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationSuccess) {
                    com.paypal.oslo.feature.identity.emailconfirmation.ui.analytics.EmailConfirmationAnalytics.INSTANCE.createOutcomeSuccessEvent().track(com.paypal.oslo.feature.identity.AnalyticsTrackerKt.analyticsTracker);
                } else if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError) {
                    com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError confirmationError = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError) event;
                    com.paypal.oslo.feature.identity.emailconfirmation.ui.analytics.EmailConfirmationAnalytics.INSTANCE.createOutcomeErrorEvent(confirmationError.getErrorType(), confirmationError.getMessage()).track(com.paypal.oslo.feature.identity.AnalyticsTrackerKt.analyticsTracker);
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent>() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$observabilityMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                input.getEvent();
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent>() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.StartConfirmation) {
                    com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.StartConfirmation startConfirmation = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.StartConfirmation) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$confirmEmail$1(startConfirmation.getEncryptedEmail(), startConfirmation.getConfirmationCode(), com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.this, null), 3, null);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* renamed from: getAutoDismissDelayMs$identity_prodRelease, reason: from getter */
    public final long getAutoDismissDelayMs() {
        return this.autoDismissDelayMs;
    }

    public final void setAutoDismissDelayMs$identity_prodRelease(long j) {
        this.autoDismissDelayMs = j;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }

    public final void initialize(java.lang.String encryptedEmail, java.lang.String confirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedEmail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationCode, "");
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        if (encryptedEmail.length() == 0 || confirmationCode.length() == 0) {
            processEvent(new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.INVALID_LINK, null));
        } else {
            processEvent(new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.StartConfirmation(encryptedEmail, confirmationCode));
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent access$mapErrorToEvent(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel, com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError emailConfirmationError) {
        if (emailConfirmationError instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed) {
            return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.CONFIRMATION_FAILED, ((com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed) emailConfirmationError).getMessage());
        }
        if (emailConfirmationError instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.CancelledByUser) {
            return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.Dismiss.INSTANCE;
        }
        if (emailConfirmationError instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api) {
            return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.NETWORK_ERROR, null);
        }
        if (!(emailConfirmationError instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType = com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.UNKNOWN;
        java.lang.Throwable cause = ((com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown) emailConfirmationError).getCause();
        return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError(emailConfirmationErrorType, cause != null ? cause.getMessage() : null);
    }
}
