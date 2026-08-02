package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020'0*8\u0007¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u00101R \u00104\u001a\b\u0012\u0004\u0012\u000200038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u00108"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/RequestEmailVerificationCodeUseCase;", "requestEmailVerificationCodeUseCase", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ConfirmEmailVerificationCodeUseCase;", "confirmEmailVerificationCodeUseCase", "Lcom/paypal/oslo/feature/onboarding/errorstruct/ui/OtpErrorDisplayMapper;", "otpErrorDisplayMapper", "Lkotlin/coroutines/CoroutineContext;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/RequestEmailVerificationCodeUseCase;Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ConfirmEmailVerificationCodeUseCase;Lcom/paypal/oslo/feature/onboarding/errorstruct/ui/OtpErrorDisplayMapper;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Z", "", "onOtpInputChange", "()V", "email", "requestOtp-RQoNrjY", "(Ljava/lang/String;)V", "requestOtp", "dismissConfirmationSheet", "", "code", "submitVerificationCode", "resendOtp", "getOutputFormats", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/RequestEmailVerificationCodeUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ConfirmEmailVerificationCodeUseCase;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/errorstruct/ui/OtpErrorDisplayMapper;", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/model/EmailConfirmationState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "emailConfirmationState", "Lkotlinx/coroutines/flow/StateFlow;", "getEmailConfirmationState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/model/EmailOtpVerificationResult;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/SharedFlow;", "verificationResultFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getVerificationResultFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "Ljava/lang/String;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailConfirmationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> emailConfirmationState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizesFor;
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailOtpVerificationResult> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailOtpVerificationResult> verificationResultFlow;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public EmailConfirmationViewModel(com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase requestEmailVerificationCodeUseCase, com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase confirmEmailVerificationCodeUseCase, com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper otpErrorDisplayMapper, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestEmailVerificationCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmEmailVerificationCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpErrorDisplayMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoSizes = requestEmailVerificationCodeUseCase;
        this.Camera2StreamConfigurationMap = confirmEmailVerificationCodeUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = otpErrorDisplayMapper;
        this.getHighSpeedVideoFpsRanges = coroutineContext;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState(null, true, 1 == true ? 1 : 0, 0 == true ? 1 : 0));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.emailConfirmationState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailOtpVerificationResult> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.verificationResultFlow = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getHighSpeedVideoSizesFor = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl("");
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> getEmailConfirmationState() {
        return this.emailConfirmationState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailOtpVerificationResult> getVerificationResultFlow() {
        return this.verificationResultFlow;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        if (!kotlin.text.StringsKt.isBlank(p0)) {
            return true;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(mutableStateFlow.getValue().copy(new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_input_invalid_email, new java.lang.Object[0]), com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.INVALID_EMAIL), false));
        return false;
    }

    public final void onOtpInputChange() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState.copy$default(mutableStateFlow.getValue(), null, false, 2, null));
    }

    /* renamed from: requestOtp-RQoNrjY, reason: not valid java name */
    public final void m16347requestOtpRQoNrjY(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        if (getHighResolutionOutputSizeshNQ4ISI(email)) {
            this.getHighSpeedVideoSizesFor = email;
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState.copy$default(mutableStateFlow.getValue(), null, false, 2, null));
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), this.getHighSpeedVideoFpsRanges, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$requestOtp$1(this, email, null), 2, null);
        }
    }

    public final void dismissConfirmationSheet() {
        this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState(null, true));
    }

    public final void submitVerificationCode(java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        if (code.length() == com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt.getOtpCodeLength().getCount()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), this.getHighSpeedVideoFpsRanges, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$submitVerificationCode$1(this, code, null), 2, null);
        } else {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(mutableStateFlow.getValue().copy(new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_otp_incomplete, new java.lang.Object[0]), "INVALID_CODE"), false));
        }
    }

    public final void resendOtp() {
        if (getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), this.getHighSpeedVideoFpsRanges, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel$resendOtp$1(this, null), 2, null);
        }
    }
}
