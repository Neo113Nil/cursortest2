package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ5\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 JC\u0010\"\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u001dH\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010*R&\u00100\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020.0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010/R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020-018\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00107\u001a\b\u0012\u0004\u0012\u00020.068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010=R \u0010>\u001a\b\u0012\u0004\u0012\u00020<018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00105R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010BR \u0010D\u001a\b\u0012\u0004\u0012\u00020A068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bE\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/domain/usecase/OtpVerificationUseCase;", "verifyOtpUseCase", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/usecase/OtpGenerationUseCase;", "generateOtpUseCase", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MapToAuthOptionUseCase;", "mapToAuthOptionUseCase", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/domain/usecase/OtpVerificationUseCase;Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/usecase/OtpGenerationUseCase;Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MapToAuthOptionUseCase;Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationReducer;)V", "", "openMoreOptions", "()V", "dismissMoreOptions", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "optionType", "", "publicCredential", "requestId", "nonce", "challengeId", "handleMoreOptionSelected", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "event", "processEvent", "(Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;)V", "Lkotlin/Function1;", "eventDispatcher", "generateOtp$identity_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "otpCode", "verifyOtp$identity_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getOutputFormats", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/domain/usecase/OtpVerificationUseCase;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/usecase/OtpGenerationUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MapToAuthOptionUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "showMoreOptions", "getShowMoreOptions", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getInputSizeshNQ4ISI", "loginFlowEffect", "getLoginFlowEffect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpVerificationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> loginFlowEffect;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showMoreOptions;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState> uiState;

    @javax.inject.Inject
    public OtpVerificationViewModel(com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase otpVerificationUseCase, com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase otpGenerationUseCase, com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase mapToAuthOptionUseCase, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer otpVerificationReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpVerificationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpGenerationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapToAuthOptionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpVerificationReducer, "");
        this.getHighSpeedVideoFpsRanges = otpVerificationUseCase;
        this.Camera2StreamConfigurationMap = otpGenerationUseCase;
        this.getHighSpeedVideoFpsRangesFor = mapToAuthOptionUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("OtpVerificationViewModel.store", com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Initial.INSTANCE, otpVerificationReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent>() { // from class: com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize) {
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize initialize = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize) event;
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel.this.generateOtp$identity_prodRelease(initialize.getChallengeId(), initialize.getEmail(), initialize.getNonce(), input.getEventDispatcher());
                } else if (event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp) {
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp requestNewOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp) event;
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel.this.generateOtp$identity_prodRelease(requestNewOtp.getChallengeId(), requestNewOtp.getPublicCredential(), requestNewOtp.getNonce(), input.getEventDispatcher());
                } else if (event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted) {
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted otpInputCompleted = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted) event;
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel.this.verifyOtp$identity_prodRelease(otpInputCompleted.getRequestId(), otpInputCompleted.getOtpCode(), otpInputCompleted.getPublicCredential(), otpInputCompleted.getNonce(), input.getEventDispatcher());
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.showMoreOptions = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getInputSizeshNQ4ISI = MutableSharedFlow$default;
        this.loginFlowEffect = MutableSharedFlow$default;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowMoreOptions() {
        return this.showMoreOptions;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> getLoginFlowEffect() {
        return this.loginFlowEffect;
    }

    public final void openMoreOptions() {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.TRUE);
    }

    public final void dismissMoreOptions() {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.FALSE);
    }

    public final void handleMoreOptionSelected(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, java.lang.String publicCredential, java.lang.String requestId, java.lang.String nonce, java.lang.String challengeId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
        dismissMoreOptions();
        int i = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel.WhenMappings.$EnumSwitchMapping$0[optionType.ordinal()];
        if (i == 1) {
            processEvent(new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp(challengeId, publicCredential, nonce));
            return;
        }
        if (i == 2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "USE_DIFFERENT_NUMBER selected in OTP-login flow; option should have been hidden by AuthOptionBuilder", null, null, 6, null);
            return;
        }
        com.paypal.oslo.feature.identity.login.domain.model.AuthOptions invoke = this.getHighSpeedVideoFpsRangesFor.invoke(optionType);
        if (invoke != null) {
            this.getInputSizeshNQ4ISI.tryEmit(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(kotlin.collections.CollectionsKt.listOf(invoke), publicCredential, publicCredential, requestId, invoke, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN));
        }
    }

    public final void processEvent(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }

    public final void generateOtp$identity_prodRelease(java.lang.String challengeId, java.lang.String publicCredential, java.lang.String nonce, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$generateOtp$1(challengeId, publicCredential, nonce, this, eventDispatcher, null), 3, null);
    }

    public final void verifyOtp$identity_prodRelease(java.lang.String requestId, java.lang.String otpCode, java.lang.String publicCredential, java.lang.String nonce, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$verifyOtp$1(requestId, publicCredential, otpCode, nonce, this, eventDispatcher, null), 3, null);
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
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
