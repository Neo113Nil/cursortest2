package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R&\u0010,\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020(0-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00103\u001a\b\u0012\u0004\u0012\u00020*028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/OTPVerificationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/CompletePhoneConfirmationUseCase;", "completePhoneConfirmationUseCase", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/InitiatePhoneConfirmationUseCase;", "initiatePhoneConfirmationUseCase", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/CompletePhoneConfirmationUseCase;Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/InitiatePhoneConfirmationUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationReducer;)V", "", "code", "", "onOtpCodeChange", "(Ljava/lang/String;)V", "onVerifyTapped", "()V", "onResendCodeTapped", "onBackTapped", "clearError", "onDoneTapped", "getMaskedPhoneNumber", "()Ljava/lang/String;", "getOtpCode", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/CompletePhoneConfirmationUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/InitiatePhoneConfirmationUseCase;", "getHighSpeedVideoSizesFor", "Landroidx/lifecycle/SavedStateHandle;", "getHighSpeedVideoFpsRanges", "getInputFormats", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OTPVerificationViewModel extends androidx.view.ViewModel {
    private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandle getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect> getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public OTPVerificationViewModel(com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase completePhoneConfirmationUseCase, com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer oTPVerificationReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completePhoneConfirmationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatePhoneConfirmationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTPVerificationReducer, "");
        this.Camera2StreamConfigurationMap = completePhoneConfirmationUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = initiatePhoneConfirmationUseCase;
        this.getHighSpeedVideoFpsRanges = savedStateHandle;
        java.lang.String str = (java.lang.String) savedStateHandle.get("phoneNumber");
        if (str == null) {
            throw new java.lang.IllegalStateException("phoneNumber is required".toString());
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        java.lang.String str2 = (java.lang.String) savedStateHandle.get("maskedPhoneNumber");
        if (str2 == null) {
            throw new java.lang.IllegalStateException("maskedPhoneNumber is required".toString());
        }
        this.getHighSpeedVideoSizes = str2;
        java.lang.String str3 = (java.lang.String) savedStateHandle.get("countryCode");
        if (str3 == null) {
            throw new java.lang.IllegalStateException("countryCode is required".toString());
        }
        this.getOutputMinFrameDuration = str3;
        java.lang.String str4 = (java.lang.String) savedStateHandle.get("deviceId");
        if (str4 == null) {
            throw new java.lang.IllegalStateException("deviceId is required".toString());
        }
        this.getOutputFormats = str4;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("OTPVerificationViewModel.store", new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial("", str2), oTPVerificationReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent>() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel$verifyOtpCode$1(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) event).getOtpCode(), com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel.this, input.getEventDispatcher(), null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel$resendCode$1(com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel.this, input.getEventDispatcher(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "OTPVerificationViewModel initialized", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("maskedPhoneNumber", str2)), null, 4, null);
        mviStateStore.onEvent(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit(str, str2, str3, str4));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void onVerifyTapped() {
        java.lang.String otpCode;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState value = this.uiState.getValue();
        if (value instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial) {
            otpCode = ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial) value).getOtpCode();
        } else if (value instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error) {
            otpCode = ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error) value).getOtpCode();
        } else {
            otpCode = value instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent ? ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent) value).getOtpCode() : "";
        }
        if (otpCode.length() == 6) {
            this.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify(otpCode));
        }
    }

    public final void onResendCodeTapped() {
        this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode.INSTANCE);
    }

    public final void onBackTapped() {
        this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnBack.INSTANCE);
    }

    public final void clearError() {
        this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDismissMessage.INSTANCE);
    }

    public final void onDoneTapped() {
        this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDone.INSTANCE);
    }

    /* renamed from: getMaskedPhoneNumber, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getOtpCode() {
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState value = this.uiState.getValue();
        return value instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial ? ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial) value).getOtpCode() : value instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading ? ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading) value).getOtpCode() : value instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error ? ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error) value).getOtpCode() : value instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent ? ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent) value).getOtpCode() : "";
    }

    public final void onOtpCodeChange(java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        java.lang.String str = code;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        this.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged(kotlin.text.StringsKt.take(sb.toString(), 6)));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact access$createPhoneContact(com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel oTPVerificationViewModel) {
        java.lang.String str;
        if (kotlin.text.StringsKt.startsWith$default(oTPVerificationViewModel.getHighSpeedVideoFpsRangesFor, oTPVerificationViewModel.getOutputMinFrameDuration, false, 2, (java.lang.Object) null)) {
            str = oTPVerificationViewModel.getHighSpeedVideoFpsRangesFor.substring(oTPVerificationViewModel.getOutputMinFrameDuration.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = oTPVerificationViewModel.getHighSpeedVideoFpsRangesFor;
        }
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact(str, oTPVerificationViewModel.getOutputMinFrameDuration);
    }
}
