package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001AB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010,\u001a\u00020$J\u0016\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0082@¢\u0006\u0002\u00100J\u0018\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u0002062\u0006\u00102\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u00108J\u001a\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020/H\u0002J\u000e\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006B"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel;", "Landroidx/lifecycle/ViewModel;", "getPageConfigurationUseCase", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/GetPageConfigurationUseCase;", "preloadSignupFlowUseCase", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/PreloadSignupFlowUseCase;", "backstackFlowStepService", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/BackstackFlowStepService;", "calculateProgressUseCase", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/CalculateProgressUseCase;", "signupDataManager", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;", "determineSignupFlow", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/DetermineSignupFlowUseCase;", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/GetPageConfigurationUseCase;Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/PreloadSignupFlowUseCase;Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/BackstackFlowStepService;Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/CalculateProgressUseCase;Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/DetermineSignupFlowUseCase;)V", "flowState", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState;", "currentStepId", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "Ljava/lang/String;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_uiEffect", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "initializeFlow", "", "intent", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "initializeFlow-_ygcFeA", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;Ljava/lang/String;)V", "persistSignupIntentData", "navigateToNextStep", "launchOneOnboarding", "withResult", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLoadStepConfiguration", "stepId", "handleLoadStepConfiguration-4HgBkxg", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateTopBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "calculateTopBarConfig-DJJLKbI", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "handleError", "errorMessage", "", "isInitializationError", "exitFlow", "result", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "handleBackNavigation", "FlowState", "onboarding_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupFlowViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private java.lang.String Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState> getHighSpeedVideoSizes;
    private com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState getHighSpeedVideoSizesFor;
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase getInputFormats;
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase getInputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase getOutputFormats;
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState> uiState;

    @javax.inject.Inject
    public SignupFlowViewModel(com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase getPageConfigurationUseCase, com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase preloadSignupFlowUseCase, com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService, com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase calculateProgressUseCase, com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager, com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase determineSignupFlowUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPageConfigurationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preloadSignupFlowUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backstackFlowStepService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculateProgressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupDataManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(determineSignupFlowUseCase, "");
        this.getInputFormats = getPageConfigurationUseCase;
        this.getOutputFormats = preloadSignupFlowUseCase;
        this.getHighSpeedVideoFpsRangesFor = backstackFlowStepService;
        this.getHighSpeedVideoFpsRanges = calculateProgressUseCase;
        this.getOutputMinFrameDuration = signupDataManager;
        this.getInputSizeshNQ4ISI = determineSignupFlowUseCase;
        this.getHighSpeedVideoSizesFor = com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Uninitialized.INSTANCE;
        this.Camera2StreamConfigurationMap = com.paypal.oslo.feature.onboarding.api.steps.domain.StepIdKt.getInitialStepId();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
        this.getHighResolutionOutputSizeshNQ4ISI = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: access$handleLoadStepConfiguration-4HgBkxg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object m16441access$handleLoadStepConfiguration4HgBkxg(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleLoadStepConfiguration$1 signupFlowViewModel$handleLoadStepConfiguration$1;
        int i;
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleLoadStepConfiguration$1) {
            signupFlowViewModel$handleLoadStepConfiguration$1 = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleLoadStepConfiguration$1) continuation;
            if ((signupFlowViewModel$handleLoadStepConfiguration$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                signupFlowViewModel$handleLoadStepConfiguration$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = signupFlowViewModel$handleLoadStepConfiguration$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = signupFlowViewModel$handleLoadStepConfiguration$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState flowState = signupFlowViewModel.getHighSpeedVideoSizesFor;
                    if (flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Uninitialized) {
                        signupFlowViewModel.Camera2StreamConfigurationMap("Flow must be initialized first", true);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!(flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase getPageConfigurationUseCase = signupFlowViewModel.getInputFormats;
                    com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized initialized = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) flowState;
                    java.lang.String m16448getFlowId8NcbBzM = initialized.m16448getFlowId8NcbBzM();
                    java.lang.String m16447getCountryCodeALGuh4w = initialized.m16447getCountryCodeALGuh4w();
                    signupFlowViewModel$handleLoadStepConfiguration$1.Camera2StreamConfigurationMap = str;
                    signupFlowViewModel$handleLoadStepConfiguration$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowState);
                    signupFlowViewModel$handleLoadStepConfiguration$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getPageConfigurationUseCase.m16330invoke7h4kOIA(m16448getFlowId8NcbBzM, str, m16447getCountryCodeALGuh4w, signupFlowViewModel$handleLoadStepConfiguration$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) signupFlowViewModel$handleLoadStepConfiguration$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pageConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig) obj;
                if (pageConfig != null) {
                    signupFlowViewModel.Camera2StreamConfigurationMap = str;
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState> mutableStateFlow = signupFlowViewModel.getHighSpeedVideoSizes;
                    int m16328invokeDJJLKbI = signupFlowViewModel.getHighSpeedVideoFpsRanges.m16328invokeDJJLKbI(str);
                    boolean z = ((float) m16328invokeDJJLKbI) > 0.0f;
                    com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor = com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK;
                    if (!z) {
                        navDecor = null;
                    }
                    mutableStateFlow.setValue(new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success(pageConfig, new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(navDecor, null, new com.paypal.oslo.feature.oneonboarding.api.domain.Progress(m16328invokeDJJLKbI, (com.paypal.oslo.feature.oneonboarding.api.domain.Range) null, com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress.INSTANCE, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), 2, null)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        signupFlowViewModel$handleLoadStepConfiguration$1 = new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleLoadStepConfiguration$1(signupFlowViewModel, continuation);
        java.lang.Object obj2 = signupFlowViewModel$handleLoadStepConfiguration$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = signupFlowViewModel$handleLoadStepConfiguration$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        pageConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig) obj2;
        if (pageConfig != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState;", "", "Uninitialized", "Initialized", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState$Initialized;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState$Uninitialized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    interface FlowState {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState$Uninitialized;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Uninitialized implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Uninitialized INSTANCE = new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Uninitialized();

            public final int hashCode() {
                return 1857424186;
            }

            private Uninitialized() {
            }

            public final java.lang.String toString() {
                return "Uninitialized";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Uninitialized)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState$Initialized;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState;", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "signupIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-8NcbBzM", "()Ljava/lang/String;", "component1", "component2-ALGuh4w", "component2", "component3", "()Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "copy-k3UT_Go", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;)Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel$FlowState$Initialized;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getFlowId-8NcbBzM", "getCountryCode-ALGuh4w", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "getSignupIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialized implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState {
            public static final int $stable = 8;
            private final java.lang.String countryCode;
            private final java.lang.String flowId;
            private final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent;

            private Initialized(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupIntent, "");
                this.flowId = str;
                this.countryCode = str2;
                this.signupIntent = signupIntent;
            }

            /* renamed from: getFlowId-8NcbBzM, reason: not valid java name */
            public final java.lang.String m16448getFlowId8NcbBzM() {
                return this.flowId;
            }

            /* renamed from: getCountryCode-ALGuh4w, reason: not valid java name */
            public final java.lang.String m16447getCountryCodeALGuh4w() {
                return this.countryCode;
            }

            public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent getSignupIntent() {
                return this.signupIntent;
            }

            public final java.lang.String toString() {
                java.lang.String m16025toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16025toStringimpl(this.flowId);
                java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.countryCode);
                com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent = this.signupIntent;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialized(flowId=");
                sb.append(m16025toStringimpl);
                sb.append(", countryCode=");
                sb.append(m11368toStringimpl);
                sb.append(", signupIntent=");
                sb.append(signupIntent);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16024hashCodeimpl(this.flowId) * 31) + com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.countryCode)) * 31) + this.signupIntent.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized)) {
                    return false;
                }
                com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized initialized = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) other;
                return com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(this.flowId, initialized.flowId) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.countryCode, initialized.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.signupIntent, initialized.signupIntent);
            }

            /* renamed from: copy-k3UT_Go, reason: not valid java name */
            public final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized m16446copyk3UT_Go(java.lang.String flowId, java.lang.String countryCode, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupIntent, "");
                return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized(flowId, countryCode, signupIntent, null);
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent getSignupIntent() {
                return this.signupIntent;
            }

            /* renamed from: component2-ALGuh4w, reason: not valid java name and from getter */
            public final java.lang.String getCountryCode() {
                return this.countryCode;
            }

            /* renamed from: component1-8NcbBzM, reason: not valid java name and from getter */
            public final java.lang.String getFlowId() {
                return this.flowId;
            }

            /* renamed from: copy-k3UT_Go$default, reason: not valid java name */
            public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized m16443copyk3UT_Go$default(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized initialized, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = initialized.flowId;
                }
                if ((i & 2) != 0) {
                    str2 = initialized.countryCode;
                }
                if ((i & 4) != 0) {
                    signupIntent = initialized.signupIntent;
                }
                return initialized.m16446copyk3UT_Go(str, str2, signupIntent);
            }

            public /* synthetic */ Initialized(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, signupIntent);
            }
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: initializeFlow-_ygcFeA, reason: not valid java name */
    public final void m16442initializeFlow_ygcFeA(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent intent, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState flowState = this.getHighSpeedVideoSizesFor;
        if (flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) {
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized initialized = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) flowState;
            if (kotlin.jvm.internal.Intrinsics.areEqual(initialized.getSignupIntent(), intent) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(initialized.m16447getCountryCodeALGuh4w(), countryCode)) {
                return;
            }
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$initializeFlow$1(this, intent, countryCode, null), 3, null);
    }

    public final void navigateToNextStep() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$navigateToNextStep$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(java.lang.String str, boolean z) {
        java.util.Map mapOf;
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState flowState = this.getHighSpeedVideoSizesFor;
        if (flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Uninitialized) {
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.FLOW_ID, "not_initialized"), kotlin.TuplesKt.to("step_id", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("country_code", "not_initialized"));
        } else {
            if (!(flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized initialized = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) flowState;
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.FLOW_ID, initialized.m16448getFlowId8NcbBzM()), kotlin.TuplesKt.to("step_id", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("country_code", initialized.m16447getCountryCodeALGuh4w()));
        }
        java.util.Map map = mapOf;
        if (z) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, str, map, null, new java.lang.IllegalStateException(str), 4, null);
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, str, map, null, null, 12, null);
        }
        this.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Error(str));
    }

    public final void exitFlow(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$exitFlow$1(this, result, null), 3, null);
    }

    public final void handleBackNavigation() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleBackNavigation$1(this, null), 3, null);
    }

    public static final /* synthetic */ java.lang.Object access$launchOneOnboarding(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, boolean z, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding navigateToOneOnboarding;
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState flowState = signupFlowViewModel.getHighSpeedVideoSizesFor;
        if (flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) {
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized initialized = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) flowState;
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId m16299toOneOnboardingIntentIdJmYZZyY = com.paypal.oslo.feature.onboarding.signup.domain.mapper.OneOnboardingIntentMapperKt.m16299toOneOnboardingIntentIdJmYZZyY(initialized.getSignupIntent(), initialized.m16447getCountryCodeALGuh4w(), signupFlowViewModel.getOutputMinFrameDuration.getCurrentState().m16319getEmailBvNjjI());
            if (z) {
                navigateToOneOnboarding = new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboardingForResult(m16299toOneOnboardingIntentIdJmYZZyY);
            } else {
                navigateToOneOnboarding = new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding(m16299toOneOnboardingIntentIdJmYZZyY);
            }
            java.lang.Object send = signupFlowViewModel.getHighResolutionOutputSizeshNQ4ISI.send(navigateToOneOnboarding, continuation);
            if (send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return send;
            }
        } else {
            signupFlowViewModel.Camera2StreamConfigurationMap("Flow must be initialized first", false);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$persistSignupIntentData(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent) {
        if (signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail) {
            signupFlowViewModel.getOutputMinFrameDuration.m16333updateEmailRQoNrjY(((com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail) signupIntent).m15999getEmailBvNjjI());
        } else if (signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) {
            signupFlowViewModel.getOutputMinFrameDuration.m16336updatePhoneNumberEzAuIyE(((com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) signupIntent).m16019getPhoneNumbervCycbc());
        } else if (!(signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle) && !(signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
