package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010/R&\u00106\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000203018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u00108\u001a\b\u0012\u0004\u0012\u000202078\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\b\u0012\u0004\u0012\u0002030<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ExecuteSendTransferUseCase;", "executeSendTransferUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ExecuteRequestTransferUseCase;", "executeRequestTransferUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getPaymentTransferAttemptUseCase", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/TransferErrorToUiTextMapper;", "transferErrorMapper", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePlanContingencyUseCase;", "resolvePlanContingencyUseCase", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/ExecuteSendTransferUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/ExecuteRequestTransferUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;Lcom/paypal/oslo/feature/p2p/ui/review/mappers/TransferErrorToUiTextMapper;Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePlanContingencyUseCase;)V", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;)V", "Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;", "p0", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;Z)V", "getHighResolutionOutputSizeshNQ4ISI", "()V", "abortContingencyResolution$p2p_prodRelease", "", "errorMessage", "errorCode", "abortContingencyResolutionWithError$p2p_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;", "input", "resolveContingency$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ExecuteSendTransferUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ExecuteRequestTransferUseCase;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/TransferErrorToUiTextMapper;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePlanContingencyUseCase;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel$contingencyResolutionMiddleware$1;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel$contingencyResolutionMiddleware$1;", "getInputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ReviewUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$contingencyResolutionMiddleware$1 getInputFormats;
    private final com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState, com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent, com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect> getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState> uiState;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$contingencyResolutionMiddleware$1, java.lang.Object] */
    @javax.inject.Inject
    public ReviewViewModel(com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase executeSendTransferUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase executeRequestTransferUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper transferErrorToUiTextMapper, com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase resolvePlanContingencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeSendTransferUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeRequestTransferUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferAttemptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferErrorToUiTextMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePlanContingencyUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = executeSendTransferUseCase;
        this.getHighSpeedVideoFpsRanges = executeRequestTransferUseCase;
        this.getHighSpeedVideoSizes = getPaymentTransferAttemptUseCase;
        this.Camera2StreamConfigurationMap = transferErrorToUiTextMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = resolvePlanContingencyUseCase;
        ?? r1 = new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState, com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$contingencyResolutionMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState, com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionStarted) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.this.getHighResolutionOutputSizeshNQ4ISI();
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.AllContingenciesResolved) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$executeTransfer(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.this, input.getStates().getSecond().getIntent());
                }
            }
        };
        this.getInputFormats = r1;
        com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState reviewUiState = new com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState(null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262143, null);
        com.paypal.oslo.feature.p2p.ui.review.reducers.ReviewReducer reviewReducer = com.paypal.oslo.feature.p2p.ui.review.reducers.ReviewReducer.INSTANCE;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(r1);
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState, com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent, com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ReviewViewModel.store", reviewUiState, reviewReducer, listOf, androidx.view.ViewModelKt.getViewModelScope(reviewViewModel));
        this.getInputSizeshNQ4ISI = mviStateStore;
        kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState> uiState = mviStateStore.getUiState();
        this.uiState = uiState;
        this.uiEffect = mviStateStore.getUiEffect();
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("intent", uiState.getValue().getIntent().name());
        pairArr[1] = kotlin.TuplesKt.to("hasReceiver", java.lang.String.valueOf(uiState.getValue().getSelectedContact() != null));
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_REQUEST_FLOW, java.lang.String.valueOf(uiState.getValue().getIntent() == com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST));
        com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.REVIEW_SCREEN_INITIALIZED, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.AnonymousClass1(null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect> getUiEffect() {
        return this.uiEffect;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$1", f = "ReviewViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, nl = {138}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt> invoke = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.this.getHighSpeedVideoSizes.invoke();
                final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.this;
                this.Camera2StreamConfigurationMap = 1;
                if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) obj2;
                        if (paymentTransferAttempt != null) {
                            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel2 = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.this;
                            reviewViewModel2.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateTransferAttemptId(paymentTransferAttempt.getId()));
                            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent = paymentTransferAttempt.getSelectedIntent();
                            if (selectedIntent != null) {
                                reviewViewModel2.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent(selectedIntent));
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent event) {
        java.lang.String str;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction action;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> fundingSources;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer) {
            com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer executeTransfer = (com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer) event;
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent = executeTransfer.getIntent();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("intent", intent.name());
            pairArr[1] = kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId());
            pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.BUTTON_TYPE, intent == com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST ? "request_now" : "pay_now");
            com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_MAIN_ACTION_BUTTON, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            if (executeTransfer.getIntent() != this.uiState.getValue().getIntent()) {
                this.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent(executeTransfer.getIntent()));
            }
            this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionStarted.INSTANCE);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowContactSection) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TOGGLED_REVIEW_SECTION, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "contact"), kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId())), null, 4, null);
            this.getInputSizeshNQ4ISI.onEvent(event);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentMethodSection) {
            getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.PAYMENT_METHOD, !this.uiState.getValue().getPaymentMethodSection().isExpanded());
            this.getInputSizeshNQ4ISI.onEvent(event);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentTypeSection) {
            getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.PAYMENT_TYPE, !this.uiState.getValue().getPaymentTypeSection().isExpanded());
            this.getInputSizeshNQ4ISI.onEvent(event);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection) {
            getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.SHIPPING, !this.uiState.getValue().getShippingSection().isExpanded());
            this.getInputSizeshNQ4ISI.onEvent(event);
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.InitiateRedirectionContingency)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.CancelButtonClicked)) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ConfirmCancelTransaction)) {
                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DismissCancelConfirmation)) {
                        this.getInputSizeshNQ4ISI.onEvent(event);
                        return;
                    } else {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_DISMISSED_CANCELLATION_DIALOG, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId())), null, 4, null);
                        this.getInputSizeshNQ4ISI.onEvent(event);
                        return;
                    }
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_CONFIRMED_TRANSFER_CANCELLATION, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId()), kotlin.TuplesKt.to("intent", this.uiState.getValue().getIntent().name())), null, 4, null);
                this.getInputSizeshNQ4ISI.onEvent(event);
                return;
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_CLOSE_BUTTON, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId()), kotlin.TuplesKt.to("intent", this.uiState.getValue().getIntent().name())), null, 4, null);
            this.getInputSizeshNQ4ISI.onEvent(event);
            return;
        }
        com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency = (com.paypal.oslo.feature.p2p.domain.model.PlanContingency) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.unresolvedContingencies(this.uiState.getValue().getSelectedFundingOption(), com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.INSTANCE.getREDIRECTION_ACTIONS$p2p_prodRelease()));
        java.lang.Object obj = null;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction action2 = planContingency != null ? planContingency.getAction() : null;
        if (action2 != null && com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.WhenMappings.$EnumSwitchMapping$1[action2.ordinal()] == 1) {
            com.paypal.oslo.feature.p2p.domain.model.FundingOption selectedFundingOption = this.uiState.getValue().getSelectedFundingOption();
            if (selectedFundingOption != null && (fundingSources = selectedFundingOption.getFundingSources()) != null) {
                java.util.Iterator<T> it = fundingSources.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((com.paypal.oslo.feature.p2p.domain.model.FundingSource) next).getType() == com.paypal.oslo.feature.p2p.domain.model.FundingSourceType.BANK_ACCOUNT) {
                        obj = next;
                        break;
                    }
                }
                com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource = (com.paypal.oslo.feature.p2p.domain.model.FundingSource) obj;
                if (fundingSource != null) {
                    this.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NavigateToConfirmBankRequested(fundingSource));
                    return;
                }
            }
            abortContingencyResolution$p2p_prodRelease();
            return;
        }
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        pairArr2[0] = kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId());
        if (planContingency == null || (action = planContingency.getAction()) == null || (str = action.name()) == null) {
            str = "null";
        }
        pairArr2[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTINGENCY_ACTION, str);
        com.paypal.android.logger.Logger.w$default(logger2, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UNHANDLED_REDIRECTION_CONTINGENCY, kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        abortContingencyResolution$p2p_prodRelease();
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType p0, boolean p1) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        java.lang.String lowerCase = p0.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TOGGLED_REVIEW_SECTION, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, lowerCase), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, java.lang.String.valueOf(p1)), kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId())), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI() {
        com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency = (com.paypal.oslo.feature.p2p.domain.model.PlanContingency) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.unresolvedContingencies(this.uiState.getValue().getSelectedFundingOption(), com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.INSTANCE.getAUTO_RESOLVE_ACTIONS$p2p_prodRelease()));
        if (planContingency == null) {
            this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.AllContingenciesResolved.INSTANCE);
        } else if (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.WhenMappings.$EnumSwitchMapping$1[planContingency.getAction().ordinal()] == 2) {
            resolveContingency$p2p_prodRelease(new com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput(this.uiState.getValue().getTransferAttemptId(), this.uiState.getValue().getFundingOptionId(), new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance(planContingency.getAction(), null)));
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UNHANDLED_CONTINGENCY_ACTION, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTINGENCY_ACTION, planContingency.getAction().name())), null, 4, null);
            this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.AllContingenciesResolved.INSTANCE);
        }
    }

    public final void abortContingencyResolution$p2p_prodRelease() {
        this.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionAborted.INSTANCE);
    }

    public final void abortContingencyResolutionWithError$p2p_prodRelease(java.lang.String errorMessage, java.lang.String errorCode) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", this.uiState.getValue().getTransferAttemptId());
        if (errorMessage == null) {
            errorMessage = "";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorMessage", errorMessage);
        if (errorCode == null) {
            errorCode = "";
        }
        pairArr[2] = kotlin.TuplesKt.to("errorCode", errorCode);
        com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONFIRM_BANK_FLOW_ERROR, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        abortContingencyResolution$p2p_prodRelease();
        this.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen(com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource.REVIEW));
    }

    public final void resolveContingency$p2p_prodRelease(com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$resolveContingency$1(this, input, null), 3, null);
    }

    public static final /* synthetic */ void access$executeTransfer(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
        int i = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.WhenMappings.$EnumSwitchMapping$0[paymentTransferIntent.ordinal()];
        if (i == 1) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeSendTransfer$1(reviewViewModel, null), 3, null);
        } else if (i == 2) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeRequestTransfer$1(reviewViewModel, null), 3, null);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed(new com.paypal.oslo.feature.p2p.ui.UiText.DynamicString("Unsupported transfer intent: ".concat(java.lang.String.valueOf(paymentTransferIntent)))));
        }
    }

    public static final /* synthetic */ void access$handleContingencyResolutionError(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        reviewViewModel.abortContingencyResolution$p2p_prodRelease();
        if (transferError instanceof com.paypal.oslo.feature.p2p.domain.error.TransferError.Network) {
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NetworkErrorOccurred.INSTANCE);
            return;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", reviewViewModel.uiState.getValue().getTransferAttemptId());
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
        com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_ERROR_GRAPHQL, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public static final /* synthetic */ void access$handleTransferError(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError) {
        if (executePaymentTransferError instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Network) {
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NetworkErrorOccurred.INSTANCE);
        } else {
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed(reviewViewModel.Camera2StreamConfigurationMap.map(executePaymentTransferError)));
        }
    }

    public static final /* synthetic */ void access$logPaymentFailed(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, java.lang.String str, java.lang.Object obj, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
        pairArr[2] = kotlin.TuplesKt.to("intent", paymentTransferIntent.name());
        com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FAILED_TO_EXECUTE_PAYMENT, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
    }

    public static final /* synthetic */ void access$logPaymentSuccess(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
        java.lang.String id;
        java.lang.String str2;
        if (paymentTransferResult instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send) {
            id = ((com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send) paymentTransferResult).getId();
        } else {
            if (!(paymentTransferResult instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            id = ((com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request) paymentTransferResult).getId();
        }
        if (paymentTransferIntent == com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST) {
            str2 = com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_REQUEST_EXECUTED_SUCCESSFULLY;
        } else {
            str2 = com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TRANSFER_EXECUTED_SUCCESSFULLY;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, str2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str), kotlin.TuplesKt.to("transactionId", id)), null, 4, null);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.NAVIGATING_TO_SUCCESS_SCREEN, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", paymentTransferIntent.name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "success")), null, 4, null);
    }

    public static final /* synthetic */ void access$onContingencyStepResolved(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        reviewViewModel.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyStepResolved(fundingOptions));
        if (reviewViewModel.uiState.getValue().isResolvingContingencies()) {
            reviewViewModel.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.values().length];
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.OBTAIN_REAL_TIME_BALANCE_CONSENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.REFRESH_REAL_TIME_BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
