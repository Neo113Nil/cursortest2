package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0018\u00104\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0018\u0010!\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00109R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0:8\u0007¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u00109R\"\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020A088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u00109R \u0010B\u001a\b\u0012\u0004\u0012\u00020A0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0010088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00109R \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010<\u001a\u0004\bD\u0010>R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u0010088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00109R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00100:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bE\u0010>R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00109R\"\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00109R\"\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010>R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010MR \u0010P\u001a\b\u0012\u0004\u0012\u00020L0O8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ConfirmEmailUseCase;", "confirmEmailUseCase", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/InitiateEmailConfirmationUseCase;", "initiateEmailConfirmationUseCase", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReinitiateEmailConfirmationUseCase;", "reinitiateEmailConfirmationUseCase", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;", "emailErrorHandler", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/userprofile/domain/usecase/ConfirmEmailUseCase;Lcom/paypal/oslo/feature/userprofile/domain/usecase/InitiateEmailConfirmationUseCase;Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReinitiateEmailConfirmationUseCase;Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;)V", "", "emailId", "", "makePrimary", "replaceId", "", "initialize", "(Ljava/lang/String;ZLjava/lang/String;)V", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "action", "handleAction", "(Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;)V", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ConfirmEmailUseCase;", "Camera2StreamConfigurationMap", "getOutputStallDuration", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/InitiateEmailConfirmationUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "unwrapAs", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReinitiateEmailConfirmationUseCase;", "getHighSpeedVideoFpsRangesFor", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;", "getOutputSizeshNQ4ISI", "Z", "getOutputFormats", "getOutputSizes", "Ljava/lang/String;", "isOutputSupportedFor", "getOutputMinFrameDuration", "getValidOutputFormatsForInputhNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailConfirmationChallenge;", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailConfirmationChallenge;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "code", "Lkotlinx/coroutines/flow/StateFlow;", "getCode", "()Lkotlinx/coroutines/flow/StateFlow;", "codeError", "getCodeError", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailConfirmationInitState;", "initState", "getInitState", "isSubmitting", "isResending", "bannerMessage", "getBannerMessage", "isOutputSupportedForhNQ4ISI", "toastMessage", "getToastMessage", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "toString", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmEmailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> bannerMessage;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> code;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> codeError;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> isOutputSupportedFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState> getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent> toString;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ConfirmEmailUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputStallDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler getHighSpeedVideoSizes;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getInputFormats;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState> initState;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isResending;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSubmitting;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> toastMessage;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiateEmailConfirmationUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ConfirmEmailViewModel(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.ConfirmEmailUseCase confirmEmailUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase initiateEmailConfirmationUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiateEmailConfirmationUseCase reinitiateEmailConfirmationUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler emailErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiateEmailConfirmationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reinitiateEmailConfirmationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailErrorHandler, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.Camera2StreamConfigurationMap = confirmEmailUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = initiateEmailConfirmationUseCase;
        this.getHighSpeedVideoFpsRangesFor = reinitiateEmailConfirmationUseCase;
        this.getHighSpeedVideoSizes = emailErrorHandler;
        this.getInputSizeshNQ4ISI = "";
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("");
        this.getOutputSizeshNQ4ISI = MutableStateFlow;
        this.code = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputSizes = MutableStateFlow2;
        this.codeError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Loading.INSTANCE);
        this.getOutputStallDurationlomOqCM = MutableStateFlow3;
        this.initState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputMinFrameDurationlomOqCM = MutableStateFlow4;
        this.isSubmitting = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputStallDuration = MutableStateFlow5;
        this.isResending = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow5);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.isOutputSupportedFor = MutableStateFlow6;
        this.bannerMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow6);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow7 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.isOutputSupportedForhNQ4ISI = MutableStateFlow7;
        this.toastMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow7);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.toString = MutableSharedFlow$default;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleError(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$handleError$1 confirmEmailViewModel$handleError$1;
        int i;
        java.util.List<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> mapToEmailErrorStrategies;
        com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError2;
        java.util.Iterator<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> it;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$handleError$1) {
            confirmEmailViewModel$handleError$1 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$handleError$1) continuation;
            if ((confirmEmailViewModel$handleError$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                confirmEmailViewModel$handleError$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = confirmEmailViewModel$handleError$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = confirmEmailViewModel$handleError$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail().trackEmailError(emailError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_CONFIRM_EMAIL, str, str2);
                    mapToEmailErrorStrategies = confirmEmailViewModel.getHighSpeedVideoSizes.mapToEmailErrorStrategies(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.CONFIRM, emailError, confirmEmailViewModel.getHighSpeedVideoFpsRanges);
                    emailError2 = emailError;
                    it = mapToEmailErrorStrategies.iterator();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) confirmEmailViewModel$handleError$1.getHighSpeedVideoFpsRangesFor;
                    java.util.List<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> list = (java.util.List) confirmEmailViewModel$handleError$1.Camera2StreamConfigurationMap;
                    str2 = (java.lang.String) confirmEmailViewModel$handleError$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str3 = (java.lang.String) confirmEmailViewModel$handleError$1.getHighSpeedVideoFpsRanges;
                    emailError2 = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) confirmEmailViewModel$handleError$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mapToEmailErrorStrategies = list;
                    str = str3;
                }
                while (it.hasNext()) {
                    com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy next = it.next();
                    if (next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) {
                        confirmEmailViewModel.getOutputSizes.setValue(((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) next).getMessage());
                        confirmEmailViewModel.getOutputSizeshNQ4ISI.setValue("");
                    } else if (next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner) {
                        confirmEmailViewModel.isOutputSupportedFor.setValue(((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner) next).getMessage());
                    } else if (next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) {
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent> mutableSharedFlow = confirmEmailViewModel.toString;
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError navigateToFullScreenError = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) next);
                        confirmEmailViewModel$handleError$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError2);
                        confirmEmailViewModel$handleError$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        confirmEmailViewModel$handleError$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        confirmEmailViewModel$handleError$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapToEmailErrorStrategies);
                        confirmEmailViewModel$handleError$1.getHighSpeedVideoFpsRangesFor = it;
                        confirmEmailViewModel$handleError$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        confirmEmailViewModel$handleError$1.getHighSpeedVideoSizesFor = 1;
                        if (mutableSharedFlow.emit(navigateToFullScreenError, confirmEmailViewModel$handleError$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (!(next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        confirmEmailViewModel.isOutputSupportedFor.setValue(((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) next).getSubtitle());
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        confirmEmailViewModel$handleError$1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$handleError$1(confirmEmailViewModel, continuation);
        java.lang.Object obj2 = confirmEmailViewModel$handleError$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = confirmEmailViewModel$handleError$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r5.getHighSpeedVideoSizes(r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r6 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$initiateEmailConfirmation(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$initiateEmailConfirmation$1 confirmEmailViewModel$initiateEmailConfirmation$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$initiateEmailConfirmation$1) {
            confirmEmailViewModel$initiateEmailConfirmation$1 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$initiateEmailConfirmation$1) continuation;
            if ((confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase initiateEmailConfirmationUseCase = confirmEmailViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str = confirmEmailViewModel.getInputSizeshNQ4ISI;
                    confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = initiateEmailConfirmationUseCase.invoke(str, confirmEmailViewModel$initiateEmailConfirmation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = confirmEmailViewModel$initiateEmailConfirmation$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    confirmEmailViewModel.getHighSpeedVideoSizesFor = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge) ((arrow.core.Either.Right) either).getValue();
                    confirmEmailViewModel.getOutputStallDurationlomOqCM.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Success.INSTANCE);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) ((arrow.core.Either.Left) either).getValue();
                    confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    confirmEmailViewModel$initiateEmailConfirmation$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError);
                    confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoSizes = 0;
                    confirmEmailViewModel$initiateEmailConfirmation$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoFpsRangesFor = 2;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        confirmEmailViewModel$initiateEmailConfirmation$1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$initiateEmailConfirmation$1(confirmEmailViewModel, continuation);
        java.lang.Object obj2 = confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = confirmEmailViewModel$initiateEmailConfirmation$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCode() {
        return this.code;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCodeError() {
        return this.codeError;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState> getInitState() {
        return this.initState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSubmitting() {
        return this.isSubmitting;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isResending() {
        return this.isResending;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getBannerMessage() {
        return this.bannerMessage;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getToastMessage() {
        return this.toastMessage;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent> getEvents() {
        return this.events;
    }

    public static /* synthetic */ void initialize$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        confirmEmailViewModel.initialize(str, z, str2);
    }

    public final void initialize(java.lang.String emailId, boolean makePrimary, java.lang.String replaceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailId, "");
        if (this.getOutputFormats) {
            return;
        }
        this.getOutputFormats = true;
        this.getInputSizeshNQ4ISI = emailId;
        this.getOutputMinFrameDuration = makePrimary;
        this.getInputFormats = replaceId;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$initialize$1(this, null), 3, null);
    }

    public final void handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged)) {
            if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ConfirmEmail)) {
                if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ResendCode)) {
                    if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ClearToastMessage)) {
                        if (action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.BannerDismissed) {
                            this.isOutputSupportedFor.setValue(null);
                            return;
                        } else {
                            if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.RetryInit)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            this.getOutputStallDurationlomOqCM.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Loading.INSTANCE);
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$retryInit$1(this, null), 3, null);
                            return;
                        }
                    }
                    this.isOutputSupportedForhNQ4ISI.setValue(null);
                    return;
                }
                if (this.getOutputStallDuration.getValue().booleanValue() || this.getOutputMinFrameDurationlomOqCM.getValue().booleanValue()) {
                    return;
                }
                this.getOutputStallDuration.setValue(java.lang.Boolean.TRUE);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$resendCode$1(this, null), 3, null);
                return;
            }
            java.lang.String value = this.getOutputSizeshNQ4ISI.getValue();
            com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge emailConfirmationChallenge = this.getHighSpeedVideoSizesFor;
            if (emailConfirmationChallenge == null || this.getOutputMinFrameDurationlomOqCM.getValue().booleanValue() || this.getOutputStallDuration.getValue().booleanValue()) {
                return;
            }
            this.getOutputMinFrameDurationlomOqCM.setValue(java.lang.Boolean.TRUE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$confirmEmail$1(this, emailConfirmationChallenge, value, null), 3, null);
            return;
        }
        this.getOutputSizeshNQ4ISI.setValue(((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged) action).getCode());
        if (this.getOutputSizes.getValue() != null) {
            this.getOutputSizes.setValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String string;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error error;
        com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail().trackEmailError(emailError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_CONFIRM_EMAIL, "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.INITIATE_CONFIRMATION_FAILED);
        for (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy : this.getHighSpeedVideoSizes.mapToEmailErrorStrategies(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.CONFIRM, emailError, this.getHighSpeedVideoFpsRanges)) {
            boolean z = emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner;
            if (z) {
                string = ((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner) emailErrorStrategy).getMessage();
            } else if (emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) {
                string = ((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) emailErrorStrategy).getMessage();
            } else if (emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) {
                string = ((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) emailErrorStrategy).getSubtitle();
            } else {
                string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_lets_try_that_again);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            }
            if (emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) {
                java.lang.Object emit = this.toString.emit(new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) emailErrorStrategy), continuation);
                return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
            }
            if (!(emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) && !z && !(emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState> mutableStateFlow = this.getOutputStallDurationlomOqCM;
            if (this.getHighSpeedVideoSizes.isOTPLimitExceededError(emailError)) {
                java.lang.String string2 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_otp_limit_exceeded_title);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                java.lang.String string3 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_got_it);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                error = new com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error(string2, string, string3, false);
            } else {
                java.lang.String string4 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong_title);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                java.lang.String string5 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_this_happens_sometimes_lets_try_that_again);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                java.lang.String string6 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_retry_button);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
                error = new com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailConfirmationInitState.Error(string4, string5, string6, true);
            }
            mutableStateFlow.setValue(error);
        }
        return kotlin.Unit.INSTANCE;
    }
}
