package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020+0.8\u0007¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00102R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020:0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010,R \u0010;\u001a\b\u0012\u0004\u0012\u00020:0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b;\u00102R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020:0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010,R \u0010<\u001a\b\u0012\u0004\u0012\u00020:0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b<\u00102R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010,R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010AR \u0010C\u001a\b\u0012\u0004\u0012\u00020@0B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmPhoneViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/InitiatePhoneConfirmationUseCase;", "initiatePhoneConfirmationUseCase", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReinitiatePhoneConfirmationUseCase;", "reinitiatePhoneConfirmationUseCase", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/VerifyPhoneUseCase;", "verifyPhoneUseCase", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/userprofile/domain/usecase/InitiatePhoneConfirmationUseCase;Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReinitiatePhoneConfirmationUseCase;Lcom/paypal/oslo/feature/userprofile/domain/usecase/VerifyPhoneUseCase;)V", "", "phoneId", "maskedPhoneNumber", "", "initiateConfirmation", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmPhoneAction;", "action", "handleAction", "(Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmPhoneAction;)V", "getOutputMinFrameDuration", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/InitiatePhoneConfirmationUseCase;", "getHighSpeedVideoSizes", "getOutputStallDuration", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReinitiatePhoneConfirmationUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputSizes", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/VerifyPhoneUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;", "getInputFormats", "Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDurationlomOqCM", "Ljava/lang/String;", "getOutputSizeshNQ4ISI", "getOutputFormats", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhoneConfirmationInitState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/StateFlow;", "initState", "Lkotlinx/coroutines/flow/StateFlow;", "getInitState", "()Lkotlinx/coroutines/flow/StateFlow;", "getInputSizeshNQ4ISI", "code", "getCode", "codeError", "getCodeError", "bannerMessage", "getBannerMessage", "", "isSubmitting", "isResending", "toastMessage", "getToastMessage", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmPhoneEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmPhoneViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getInputFormats;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> bannerMessage;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> code;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> codeError;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputStallDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private java.lang.String getOutputMinFrameDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.VerifyPhoneUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getOutputFormats;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.InitiatePhoneConfirmationUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState> initState;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isResending;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSubmitting;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> toastMessage;

    @javax.inject.Inject
    public ConfirmPhoneViewModel(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase reinitiatePhoneConfirmationUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.VerifyPhoneUseCase verifyPhoneUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatePhoneConfirmationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reinitiatePhoneConfirmationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyPhoneUseCase, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = initiatePhoneConfirmationUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = reinitiatePhoneConfirmationUseCase;
        this.Camera2StreamConfigurationMap = verifyPhoneUseCase;
        this.getOutputFormats = "";
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Loading.INSTANCE);
        this.getHighSpeedVideoSizesFor = MutableStateFlow;
        this.initState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("");
        this.getInputSizeshNQ4ISI = MutableStateFlow2;
        this.code = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getInputFormats = MutableStateFlow3;
        this.codeError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputStallDurationlomOqCM = MutableStateFlow4;
        this.bannerMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputStallDuration = MutableStateFlow5;
        this.isSubmitting = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow5);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputMinFrameDurationlomOqCM = MutableStateFlow6;
        this.isResending = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow6);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow7 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputSizes = MutableStateFlow7;
        this.toastMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow7);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputSizeshNQ4ISI = MutableSharedFlow$default;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState> getInitState() {
        return this.initState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCode() {
        return this.code;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCodeError() {
        return this.codeError;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getBannerMessage() {
        return this.bannerMessage;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSubmitting() {
        return this.isSubmitting;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isResending() {
        return this.isResending;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getToastMessage() {
        return this.toastMessage;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent> getEvents() {
        return this.events;
    }

    public final void initiateConfirmation(java.lang.String phoneId, java.lang.String maskedPhoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
        if (this.getOutputMinFrameDuration != null) {
            return;
        }
        this.getOutputMinFrameDuration = phoneId;
        this.getOutputFormats = maskedPhoneNumber;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$initiateConfirmation$1(this, phoneId, null), 3, null);
    }

    public final void handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction action) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.OtpCodeChanged)) {
            if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.ConfirmPhone)) {
                if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.ResendCode)) {
                    if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.ClearToastMessage)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getOutputSizes.setValue(null);
                    return;
                }
                com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge = this.getHighSpeedVideoFpsRangesFor;
                if (phoneConfirmationChallenge == null || (str = this.getOutputMinFrameDuration) == null || this.getOutputMinFrameDurationlomOqCM.getValue().booleanValue() || this.getOutputStallDuration.getValue().booleanValue()) {
                    return;
                }
                this.getOutputMinFrameDurationlomOqCM.setValue(java.lang.Boolean.TRUE);
                this.getHighSpeedVideoSizesFor.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Loading.INSTANCE);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$resendCode$1(this, str, phoneConfirmationChallenge, null), 3, null);
                return;
            }
            com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge2 = this.getHighSpeedVideoFpsRangesFor;
            if (phoneConfirmationChallenge2 == null || (str2 = this.getOutputMinFrameDuration) == null || this.getOutputStallDuration.getValue().booleanValue() || this.getOutputMinFrameDurationlomOqCM.getValue().booleanValue()) {
                return;
            }
            this.getOutputStallDuration.setValue(java.lang.Boolean.TRUE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$confirmPhone$1(this, str2, phoneConfirmationChallenge2, null), 3, null);
            return;
        }
        this.getInputSizeshNQ4ISI.setValue(((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.OtpCodeChanged) action).getCode());
        if (this.getInputFormats.getValue() != null) {
            this.getInputFormats.setValue(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r8.equals("WALLET_SETTING_ERROR_SMS_LIMIT_EXCEEDED") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        r8 = r7.getHighSpeedVideoSizesFor;
        r0 = r7.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_wallet_setting_error_sms_limit_exceeded);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r2 = r7.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_wallet_setting_error_phone_otp_validation_limit_exceeded);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r7 = r7.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_got_it);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r8.setValue(new com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Error(r0, r2, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r8.equals("WALLET_SETTING_ERROR_PHONE_OTP_VALIDATION_LIMIT_EXCEEDED") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$handleValidationError(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError validationError) {
        confirmPhoneViewModel.getInputFormats.setValue(null);
        confirmPhoneViewModel.getOutputStallDurationlomOqCM.setValue(null);
        java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> extractDetails = com.paypal.oslo.feature.userprofile.domain.utils.GraphQLErrorExtensionsKt.extractDetails(validationError.getGraphQLError());
        if (extractDetails.size() != 1) {
            if (extractDetails.isEmpty()) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL validation error missing details", null, null, null, 14, null);
            }
            confirmPhoneViewModel.getOutputStallDurationlomOqCM.setValue(confirmPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong));
            return;
        }
        java.lang.String issue = ((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) kotlin.collections.CollectionsKt.first((java.util.List) extractDetails)).getIssue();
        if (issue != null) {
            switch (issue.hashCode()) {
                case -1509232524:
                    if (issue.equals("WALLET_SETTING_ERROR_PHONE_OTP_EXPIRED")) {
                        confirmPhoneViewModel.getOutputStallDurationlomOqCM.setValue(confirmPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_wallet_setting_error_phone_otp_expired));
                        break;
                    }
                    break;
                case 339819334:
                    if (issue.equals("WALLET_SETTING_ERROR_PHONE_INVALID_OTP")) {
                        confirmPhoneViewModel.getInputFormats.setValue(confirmPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_wallet_setting_error_phone_invalid_otp));
                        break;
                    }
                    break;
                case 415373228:
                    break;
                case 1837307305:
                    break;
            }
            return;
        }
        confirmPhoneViewModel.getOutputStallDurationlomOqCM.setValue(confirmPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong));
    }

    public static final /* synthetic */ java.lang.String access$mapPhoneErrorToMessage(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, com.paypal.oslo.feature.userprofile.domain.model.PhoneError phoneError) {
        if (phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.NetworkError) {
            java.lang.String string = confirmPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_no_internet);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError) {
            java.lang.String string2 = confirmPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (!(phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ServerError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String string3 = confirmPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        return string3;
    }
}
