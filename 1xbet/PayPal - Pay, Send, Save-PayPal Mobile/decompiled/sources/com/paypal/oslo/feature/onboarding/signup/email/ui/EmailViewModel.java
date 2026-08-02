package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0013J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010&\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00105R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010;R \u0010>\u001a\b\u0012\u0004\u0012\u00020:0=8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020B098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010;R \u0010C\u001a\b\u0012\u0004\u0012\u00020B0=8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR \u0010E\u001a\b\u0012\u0004\u0012\u000207008\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\bF\u0010GR \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00110H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010IR\u0011\u0010M\u001a\u00020J8G¢\u0006\u0006\u001a\u0004\bK\u0010L"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;", "signupDataManager", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ValidateLocalEmailUseCase;", "validateLocalEmailUseCase", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/CheckEmailUseCase;", "checkEmailUseCase", "Lkotlin/coroutines/CoroutineContext;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ValidateLocalEmailUseCase;Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/CheckEmailUseCase;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "createCallbackMapForEmail", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "", "onNavigateNext", "()V", "onEmailVerificationComplete", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "p0", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "suggestedEmail", "originalEmail", "setEmailSuggestion-TNt61W4", "(Ljava/lang/String;Ljava/lang/String;)V", "setEmailSuggestion", "onEmailSuggestionAccepted-RQoNrjY", "(Ljava/lang/String;)V", "onEmailSuggestionAccepted", "showEmailConfirmationModal", "clearEmailModalState", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ValidateLocalEmailUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/CheckEmailUseCase;", "getOutputFormats", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailNavigationEffect;", "Lkotlinx/coroutines/channels/Channel;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/Flow;", "navigationEffects", "Lkotlinx/coroutines/flow/Flow;", "getNavigationEffects$onboarding_prodRelease", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect;", "analyticsEffects", "getAnalyticsEffects$onboarding_prodRelease", "emailUiState", "getEmailUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "getPhoneNumber-v-Cycbc", "()Ljava/lang/String;", "phoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> analyticsEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> emailUiState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> getInputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> navigationEffects;

    @javax.inject.Inject
    public EmailViewModel(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager, com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase validateLocalEmailUseCase, com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase checkEmailUseCase, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupDataManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateLocalEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighResolutionOutputSizeshNQ4ISI = signupDataManager;
        this.Camera2StreamConfigurationMap = validateLocalEmailUseCase;
        this.getHighSpeedVideoFpsRangesFor = checkEmailUseCase;
        this.getHighSpeedVideoSizes = coroutineContext;
        kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> observeState = signupDataManager.observeState();
        this.getHighSpeedVideoFpsRanges = observeState;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState(null, null, null, false, 15, defaultConstructorMarker));
        this.getHighSpeedVideoSizesFor = MutableStateFlow;
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
        this.getInputSizeshNQ4ISI = Channel$default;
        this.navigationEffects = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> Channel$default2 = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getInputFormats = Channel$default2;
        this.analyticsEffects = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default2);
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> stateFlow = observeState;
        this.emailUiState = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.combine(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email>() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email m15921boximpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(((com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData) obj).m16319getEmailBvNjjI());
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(m15921boximpl, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1$2", f = "EmailViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getInputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoSizes = flowCollector;
                }
            }
        }), MutableStateFlow, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$emailUiState$2(null)), androidx.view.ViewModelKt.getViewModelScope(this), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState(null, null, null, false, 15, defaultConstructorMarker));
        this.getOutputFormats = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel.$r8$lambda$nYlTE_hoOdtoZa_Z4APxgB3GJgI(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel.this, (java.lang.String) obj);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0152, code lost:
    
        if (r0.send(r2, r3) != r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        if (r18.getHighSpeedVideoFpsRangesFor(r1, r5, r3) == r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
    
        if (r2 != r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: access$performEmailCheck-E4ilnuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object m16367access$performEmailCheckE4ilnuY(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$performEmailCheck$1 emailViewModel$performEmailCheck$1;
        int i;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value;
        arrow.core.Either either;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value2;
        java.lang.String str2;
        arrow.core.Either either2;
        int i2;
        int i3;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value3;
        java.lang.String str3 = str;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$performEmailCheck$1) {
            emailViewModel$performEmailCheck$1 = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$performEmailCheck$1) continuation;
            if ((emailViewModel$performEmailCheck$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                emailViewModel$performEmailCheck$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = emailViewModel$performEmailCheck$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailViewModel$performEmailCheck$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow = emailViewModel.getHighSpeedVideoSizesFor;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value, null, null, null, true, 7, null)));
                    com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase checkEmailUseCase = emailViewModel.getHighSpeedVideoFpsRangesFor;
                    emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRangesFor = str3;
                    emailViewModel$performEmailCheck$1.getOutputFormats = 1;
                    obj = checkEmailUseCase.m16343invokeE4ilnuY(str3, emailViewModel$performEmailCheck$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            int i4 = emailViewModel$performEmailCheck$1.getHighSpeedVideoSizes;
                            int i5 = emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRanges;
                        } else if (i == 3) {
                            i2 = emailViewModel$performEmailCheck$1.getHighSpeedVideoSizes;
                            i3 = emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRanges;
                            either2 = (arrow.core.Either) emailViewModel$performEmailCheck$1.Camera2StreamConfigurationMap;
                            str2 = (java.lang.String) emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> channel = emailViewModel.getInputSizeshNQ4ISI;
                            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext navigateNext = com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext.INSTANCE;
                            emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            emailViewModel$performEmailCheck$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                            emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRanges = i3;
                            emailViewModel$performEmailCheck$1.getHighSpeedVideoSizes = i2;
                            emailViewModel$performEmailCheck$1.getOutputFormats = 4;
                        } else {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = emailViewModel$performEmailCheck$1.getHighSpeedVideoSizes;
                            int i7 = emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRanges;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    str3 = (java.lang.String) emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult emailCheckResult = (com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow2 = emailViewModel.getHighSpeedVideoSizesFor;
                    do {
                        value3 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value3, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value3, null, null, null, false, 7, null)));
                    emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    emailViewModel$performEmailCheck$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    emailViewModel$performEmailCheck$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailCheckResult);
                    emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRanges = 0;
                    emailViewModel$performEmailCheck$1.getHighSpeedVideoSizes = 0;
                    emailViewModel$performEmailCheck$1.getOutputFormats = 2;
                } else if (either instanceof arrow.core.Either.Left) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow3 = emailViewModel.getHighSpeedVideoSizesFor;
                    do {
                        value2 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value2, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value2, null, null, null, false, 7, null)));
                    kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> channel2 = emailViewModel.getInputFormats;
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError pageError = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError("NETWORK_FAILURE", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_network_failure, new java.lang.Object[0]));
                    emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    emailViewModel$performEmailCheck$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRanges = 0;
                    emailViewModel$performEmailCheck$1.getHighSpeedVideoSizes = 0;
                    emailViewModel$performEmailCheck$1.getOutputFormats = 3;
                    if (channel2.send(pageError, emailViewModel$performEmailCheck$1) != coroutine_suspended) {
                        str2 = str3;
                        either2 = either;
                        i2 = 0;
                        i3 = 0;
                        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> channel3 = emailViewModel.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext navigateNext2 = com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext.INSTANCE;
                        emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        emailViewModel$performEmailCheck$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                        emailViewModel$performEmailCheck$1.getHighSpeedVideoFpsRanges = i3;
                        emailViewModel$performEmailCheck$1.getHighSpeedVideoSizes = i2;
                        emailViewModel$performEmailCheck$1.getOutputFormats = 4;
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
        }
        emailViewModel$performEmailCheck$1 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$performEmailCheck$1(emailViewModel, continuation);
        java.lang.Object obj2 = emailViewModel$performEmailCheck$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailViewModel$performEmailCheck$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return coroutine_suspended2;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> getNavigationEffects$onboarding_prodRelease() {
        return this.navigationEffects;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> getAnalyticsEffects$onboarding_prodRelease() {
        return this.analyticsEffects;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> getEmailUiState() {
        return this.emailUiState;
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap createCallbackMapForEmail(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap componentCallbackMap = this.getOutputMinFrameDuration;
        if (componentCallbackMap != null) {
            return componentCallbackMap;
        }
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap generateCallbacks = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMapKt.mutableComponentCallbackMap().generateCallbacks(pageConfig.getComponents(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.EMAIL, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email(this.getOutputFormats))));
        this.getOutputMinFrameDuration = generateCallbacks;
        return generateCallbacks;
    }

    public final void onNavigateNext() {
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState emailUiState;
        java.lang.String str;
        com.paypal.oslo.feature.onboarding.validators.domain.ValidationError validationError;
        java.lang.String m16319getEmailBvNjjI = this.getHighSpeedVideoFpsRanges.getValue().m16319getEmailBvNjjI();
        com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult invoke = this.Camera2StreamConfigurationMap.invoke(m16319getEmailBvNjjI);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
            emailUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(emailUiState, null, emailUiState.getComponentStates().copy(kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.EMAIL, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email(invoke.getValidationResults()))), null, false, 13, null)));
        if (invoke.isValid()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), this.getHighSpeedVideoSizes, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onNavigateNext$2(this, m16319getEmailBvNjjI, null), 2, null);
            return;
        }
        if (kotlin.text.StringsKt.isBlank(m16319getEmailBvNjjI)) {
            str = com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.EMAIL_EMPTY_VALIDATION;
        } else {
            str = com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.EMAIL_REGEX_VALIDATION;
        }
        java.util.Iterator<T> it = invoke.getValidationResults().iterator();
        while (true) {
            if (!it.hasNext()) {
                validationError = null;
                break;
            } else {
                validationError = (com.paypal.oslo.feature.onboarding.validators.domain.ValidationError) ((arrow.core.Either) it.next()).leftOrNull();
                if (validationError != null) {
                    break;
                }
            }
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onNavigateNext$3(this, str, validationError != null ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(validationError.getMessageResId(), new java.lang.Object[0]) : null, null), 3, null);
    }

    public final void onEmailVerificationComplete() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onEmailVerificationComplete$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r12.send(r2, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
    
        if (r2.send(r5, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        if (r2.send(r3, r0) != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c3, code lost:
    
        if (r12.send(r2, r0) == r1) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult emailCheckResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$handleEmailCheckResult$1 emailViewModel$handleEmailCheckResult$1;
        int i;
        java.lang.String str2;
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value2;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$handleEmailCheckResult$1) {
            emailViewModel$handleEmailCheckResult$1 = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$handleEmailCheckResult$1) continuation;
            if ((emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (emailCheckResult.isExistingAccount()) {
                        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> channel = this.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateBackWithEmailAlreadyExists navigateBackWithEmailAlreadyExists = com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateBackWithEmailAlreadyExists.INSTANCE;
                        emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailViewModel$handleEmailCheckResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailCheckResult);
                        emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    } else if (emailCheckResult.getOnboardingEmailStatus() != null) {
                        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus2 = emailCheckResult.getOnboardingEmailStatus();
                        int i2 = com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel.WhenMappings.$EnumSwitchMapping$0[onboardingEmailStatus2.getValidity().ordinal()];
                        if (i2 == 1) {
                            kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect> channel2 = this.getInputSizeshNQ4ISI;
                            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext navigateNext = com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext.INSTANCE;
                            emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            emailViewModel$handleEmailCheckResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailCheckResult);
                            emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(onboardingEmailStatus2);
                            emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        } else if (i2 == 2) {
                            kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> channel3 = this.getInputFormats;
                            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError pageError = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError(com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.INVALID_EMAIL, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_input_invalid_email, new java.lang.Object[0]));
                            emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRangesFor = str;
                            emailViewModel$handleEmailCheckResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailCheckResult);
                            emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoSizes = onboardingEmailStatus2;
                            emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                            if (channel3.send(pageError, emailViewModel$handleEmailCheckResult$1) != coroutine_suspended) {
                                str2 = str;
                                onboardingEmailStatus = onboardingEmailStatus2;
                                if (onboardingEmailStatus.getSuggestions().isEmpty()) {
                                }
                            }
                        } else {
                            if (i2 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> channel4 = this.getInputFormats;
                            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError pageError2 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError(com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.BLOCKED_EMAIL, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_validation_error_blocked_email, new java.lang.Object[0]));
                            emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRangesFor = str;
                            emailViewModel$handleEmailCheckResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailCheckResult);
                            emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(onboardingEmailStatus2);
                            emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI = 4;
                        }
                    } else {
                        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> channel5 = this.getInputFormats;
                        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError pageError3 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError("UNKNOWN_ERROR", null);
                        emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailViewModel$handleEmailCheckResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailCheckResult);
                        emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI = 5;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 3) {
                    onboardingEmailStatus = (com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus) emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoSizes;
                    str2 = (java.lang.String) emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (onboardingEmailStatus.getSuggestions().isEmpty()) {
                        com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onboardingEmailStatus.getSuggestions());
                        java.lang.String m15927unboximpl = email != null ? email.m15927unboximpl() : null;
                        m16370setEmailSuggestionTNt61W4(m15927unboximpl != null ? m15927unboximpl : null, str2);
                    } else {
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value, null, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation(str2, objArr == true ? 1 : 0), false, 11, null)));
                    }
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    str = (java.lang.String) emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow2 = this.getHighSpeedVideoSizesFor;
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value2, null, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation(str, objArr2 == true ? 1 : 0), false, 11, null)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        emailViewModel$handleEmailCheckResult$1 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$handleEmailCheckResult$1(this, continuation);
        java.lang.Object obj2 = emailViewModel$handleEmailCheckResult$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailViewModel$handleEmailCheckResult$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr22 = 0;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: setEmailSuggestion-TNt61W4, reason: not valid java name */
    public final void m16370setEmailSuggestionTNt61W4(java.lang.String suggestedEmail, java.lang.String originalEmail) {
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalEmail, "");
        java.lang.String str = suggestedEmail;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return;
        }
        java.lang.String m15922constructorimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(suggestedEmail);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value, null, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion(m15922constructorimpl, originalEmail, null), false, 11, null)));
    }

    /* renamed from: onEmailSuggestionAccepted-RQoNrjY, reason: not valid java name */
    public final void m16369onEmailSuggestionAcceptedRQoNrjY(java.lang.String suggestedEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedEmail, "");
        this.getHighResolutionOutputSizeshNQ4ISI.m16333updateEmailRQoNrjY(suggestedEmail);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onEmailSuggestionAccepted$1(this, null), 3, null);
    }

    public final void showEmailConfirmationModal() {
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value;
        java.lang.String m16319getEmailBvNjjI = this.getHighSpeedVideoFpsRanges.getValue().m16319getEmailBvNjjI();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value, null, null, new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation(m16319getEmailBvNjjI, null), false, 11, null)));
    }

    public final void clearEmailModalState() {
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(value, null, null, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.None.INSTANCE, false, 11, null)));
    }

    /* renamed from: getPhoneNumber-v-Cycbc, reason: not valid java name */
    public final java.lang.String m16368getPhoneNumbervCycbc() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCurrentState().getPhone().m16399getPhoneNumbervCycbc();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nYlTE_hoOdtoZa_Z4APxgB3GJgI(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        emailViewModel.getHighResolutionOutputSizeshNQ4ISI.m16333updateEmailRQoNrjY(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(str));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.VALID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.INVALID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.BLOCKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
