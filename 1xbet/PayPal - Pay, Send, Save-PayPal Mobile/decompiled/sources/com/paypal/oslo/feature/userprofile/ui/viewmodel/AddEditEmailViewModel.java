package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020*0-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010,R \u00107\u001a\b\u0012\u0004\u0012\u0002050-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00101R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u0002050)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010,R \u00109\u001a\b\u0012\u0004\u0012\u0002050-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u00101R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\"\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u00101R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u0002050)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010,R \u0010=\u001a\b\u0012\u0004\u0012\u0002050-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u00101R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,R\"\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\bA\u00101R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010DR \u0010F\u001a\b\u0012\u0004\u0012\u00020C0E8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u0002050)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R \u0010J\u001a\b\u0012\u0004\u0012\u0002050-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010/\u001a\u0004\bJ\u00101R\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "observeUserStoreUseCase", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailValidator;", "emailValidator", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddEmailUseCase;", "addEmailUseCase", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;", "emailErrorHandler", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailValidator;Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddEmailUseCase;Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;)V", "", "emailId", "", "loadEmailForEdit", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction;", "action", "handleAction", "(Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction;)V", "getOutputMinFrameDurationlomOqCM", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getOutputStallDuration", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "getHighSpeedVideoFpsRanges", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailValidator;", "getHighSpeedVideoSizes", "getInputFormats", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddEmailUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;", "Camera2StreamConfigurationMap", "getOutputSizes", "Ljava/lang/String;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/EmailFormUiState;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getOutputFormats", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "getEmailAddress", "", "getInputSizeshNQ4ISI", "makePrimary", "getMakePrimary", "showMakePrimaryCheckbox", "getShowMakePrimaryCheckbox", "emailError", "getEmailError", "showErrors", "getShowErrors", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Banner;", "bannerMessage", "getBannerMessage", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "isSaving", "toString", "isOutputSupportedFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddEditEmailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputFormats;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner> bannerMessage;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> emailAddress;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> emailError;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputStallDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailFormUiState> getInputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSaving;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> makePrimary;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showErrors;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showMakePrimaryCheckbox;

    /* renamed from: toString, reason: from kotlin metadata */
    private java.lang.String isOutputSupportedFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailFormUiState> uiState;

    @javax.inject.Inject
    public AddEditEmailViewModel(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator emailValidator, com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase addEmailUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler emailErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeUserStoreUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailErrorHandler, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoFpsRanges = observeUserStoreUseCase;
        this.getHighSpeedVideoSizes = emailValidator;
        this.getHighResolutionOutputSizeshNQ4ISI = addEmailUseCase;
        this.Camera2StreamConfigurationMap = emailErrorHandler;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailFormUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailFormUiState.Ready.INSTANCE);
        this.getInputFormats = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("");
        this.getOutputFormats = MutableStateFlow2;
        this.emailAddress = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getInputSizeshNQ4ISI = MutableStateFlow3;
        this.makePrimary = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputMinFrameDuration = MutableStateFlow4;
        this.showMakePrimaryCheckbox = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputStallDuration = MutableStateFlow5;
        this.emailError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow5);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputSizes = MutableStateFlow6;
        this.showErrors = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow6);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner> MutableStateFlow7 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputSizeshNQ4ISI = MutableStateFlow7;
        this.bannerMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow7);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputMinFrameDurationlomOqCM = MutableSharedFlow$default;
        this.events = MutableSharedFlow$default;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow8 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputStallDurationlomOqCM = MutableStateFlow8;
        this.isSaving = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow8);
        this.isOutputSupportedFor = "";
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        MutableStateFlow4.setValue(bool2);
        MutableStateFlow3.setValue(bool2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e5, code lost:
    
        if (r7.emit(r12, r2) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01bb, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0097, code lost:
    
        if (r1 != r3) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$saveEmail(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel addEditEmailViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$saveEmail$1 addEditEmailViewModel$saveEmail$1;
        int i;
        java.lang.String str;
        arrow.core.Either either;
        java.lang.String str2;
        java.lang.String str3;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$saveEmail$1) {
            addEditEmailViewModel$saveEmail$1 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$saveEmail$1) continuation;
            if ((addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = addEditEmailViewModel$saveEmail$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    addEditEmailViewModel.getOutputStallDurationlomOqCM.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    addEditEmailViewModel.getOutputSizes.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    addEditEmailViewModel.getOutputStallDuration.setValue(null);
                    addEditEmailViewModel.getOutputSizeshNQ4ISI.setValue(null);
                    str = addEditEmailViewModel.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase addEmailUseCase = addEditEmailViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String value = addEditEmailViewModel.getOutputFormats.getValue();
                    boolean booleanValue = addEditEmailViewModel.getInputSizeshNQ4ISI.getValue().booleanValue();
                    addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizes = str;
                    addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizesFor = 1;
                    obj = addEmailUseCase.invoke(value, booleanValue, addEditEmailViewModel$saveEmail$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = addEditEmailViewModel$saveEmail$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = addEditEmailViewModel$saveEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        addEditEmailViewModel.getOutputStallDurationlomOqCM.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                        return kotlin.Unit.INSTANCE;
                    }
                    str = (java.lang.String) addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = (com.paypal.oslo.core.userstore.model.ProfileEmail) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent> mutableSharedFlow = addEditEmailViewModel.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation navigateToConfirmation = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation(profileEmail.getId(), profileEmail.getEmailAddress(), addEditEmailViewModel.getInputSizeshNQ4ISI.getValue().booleanValue(), str);
                    addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    addEditEmailViewModel$saveEmail$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    addEditEmailViewModel$saveEmail$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    addEditEmailViewModel$saveEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileEmail);
                    addEditEmailViewModel$saveEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    addEditEmailViewModel$saveEmail$1.getHighSpeedVideoFpsRangesFor = 0;
                    addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizesFor = 2;
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) ((arrow.core.Either.Left) either).getValue();
                        addEditEmailViewModel.getOutputStallDurationlomOqCM.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction = addEditEmailViewModel.getHighSpeedVideoSizesFor != null ? com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.EDIT : com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD;
                        java.lang.String str4 = addEditEmailViewModel.getHighSpeedVideoSizesFor;
                        if (str4 != null) {
                            str2 = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_EDIT_EMAIL;
                        } else {
                            str2 = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_ADD_EMAIL;
                        }
                        if (str4 != null) {
                            str3 = "edit";
                        } else {
                            str3 = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD;
                        }
                        com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail().trackEmailError(emailError, str2, str3, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.SAVE_FAILED);
                        for (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy : addEditEmailViewModel.Camera2StreamConfigurationMap.mapToEmailErrorStrategies(emailAction, emailError, addEditEmailViewModel.getHighSpeedVideoFpsRangesFor)) {
                            if (emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) {
                                addEditEmailViewModel.getOutputStallDuration.setValue(((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) emailErrorStrategy).getMessage());
                                addEditEmailViewModel.getOutputSizes.setValue(java.lang.Boolean.TRUE);
                            } else if (emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner) {
                                addEditEmailViewModel.getOutputSizeshNQ4ISI.setValue(emailErrorStrategy);
                            } else if (emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(addEditEmailViewModel), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$handleSaveError$1(addEditEmailViewModel, emailErrorStrategy, null), 3, null);
                            } else {
                                if (!(emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable retryable = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) emailErrorStrategy;
                                addEditEmailViewModel.getOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner(com.paypal.pds.core.RichTextKt.toRichText$default(retryable.getSubtitle(), null, false, null, 7, null), retryable.getSubtitle(), false, null, 12, null));
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        addEditEmailViewModel$saveEmail$1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$saveEmail$1(addEditEmailViewModel, continuation);
        java.lang.Object obj2 = addEditEmailViewModel$saveEmail$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addEditEmailViewModel$saveEmail$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailFormUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getEmailAddress() {
        return this.emailAddress;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getMakePrimary() {
        return this.makePrimary;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowMakePrimaryCheckbox() {
        return this.showMakePrimaryCheckbox;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getEmailError() {
        return this.emailError;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowErrors() {
        return this.showErrors;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner> getBannerMessage() {
        return this.bannerMessage;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent> getEvents() {
        return this.events;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSaving() {
        return this.isSaving;
    }

    public final void loadEmailForEdit(java.lang.String emailId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailId, "");
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        if (str == null || !kotlin.jvm.internal.Intrinsics.areEqual(str, emailId)) {
            this.getHighSpeedVideoSizesFor = emailId;
            this.getOutputMinFrameDuration.setValue(java.lang.Boolean.FALSE);
            this.getInputSizeshNQ4ISI.setValue(java.lang.Boolean.FALSE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1(this, emailId, null), 3, null);
        }
    }

    public final void handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged)) {
            if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged)) {
                if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.ConfirmClicked)) {
                    if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.BannerDismissed)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getOutputSizeshNQ4ISI.setValue(null);
                    return;
                }
                java.lang.String validateEmailFormat = this.getHighSpeedVideoSizes.validateEmailFormat(this.getOutputFormats.getValue(), this.getHighSpeedVideoFpsRangesFor);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (validateEmailFormat != null) {
                    this.getOutputStallDuration.setValue(validateEmailFormat);
                    this.getOutputSizes.setValue(bool);
                    return;
                } else if (this.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.hasEmailChanged(this.isOutputSupportedFor, this.getOutputFormats.getValue())) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$validateAndSave$1(this, null), 3, null);
                    return;
                } else {
                    this.getOutputStallDuration.setValue(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_make_a_change_to_continue));
                    this.getOutputSizes.setValue(bool);
                    return;
                }
            }
            this.getInputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged) action).getValue()));
            return;
        }
        this.getOutputFormats.setValue(((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged) action).getEmail());
        if (this.getOutputSizes.getValue().booleanValue()) {
            this.getOutputSizes.setValue(java.lang.Boolean.FALSE);
            this.getOutputStallDuration.setValue(null);
        }
    }
}
