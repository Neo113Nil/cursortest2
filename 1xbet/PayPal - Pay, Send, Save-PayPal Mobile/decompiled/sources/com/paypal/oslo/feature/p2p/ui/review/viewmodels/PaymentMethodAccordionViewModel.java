package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0011\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\"J\u0010\u0010*\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010)J\u0006\u0010,\u001a\u00020&J\u0006\u0010-\u001a\u00020&J\u001a\u0010.\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010)2\u0006\u00100\u001a\u00020/H\u0002J\u001c\u00101\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010)2\b\b\u0002\u00102\u001a\u00020/H\u0002J\u000e\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020&J\u0006\u00107\u001a\u00020&J\u0006\u00108\u001a\u00020&J\u0014\u00109\u001a\u00020&2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002050;J\u000e\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u000205Jl\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020&0B2\u0006\u0010C\u001a\u0002052\b\u0010D\u001a\u0004\u0018\u0001052\u0006\u0010=\u001a\u0002052\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020/2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020J0I2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002Jh\u0010L\u001a\u00020&2\u0006\u0010?\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020&0B2\u0006\u0010C\u001a\u0002052\f\u0010:\u001a\b\u0012\u0004\u0012\u0002050;2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020/2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020J0I2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0019¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentPlanMapper", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/FundingOptionToPaymentPlanMapper;", "paymentLinkDisclosureMapper", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentLinkDisclosureMapper;", "getPaymentTransferAttemptUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "addFinancialInstrumentsToPaymentTransferAttemptUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/AddFinancialInstrumentsToPaymentTransferAttemptUseCase;", "resolvePlanContingencyUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePlanContingencyUseCase;", "p2pFeatureGateManager", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/mappers/FundingOptionToPaymentPlanMapper;Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentLinkDisclosureMapper;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/AddFinancialInstrumentsToPaymentTransferAttemptUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePlanContingencyUseCase;Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;)V", "sideEffectsMiddleware", "com/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel$sideEffectsMiddleware$1", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel$sideEffectsMiddleware$1;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodAccordionUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/PaymentMethodAccordionEffect;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "_instrumentAdditionConfig", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfig;", "instrumentAdditionConfig", "getInstrumentAdditionConfig", "updateInstrumentAdditionConfig", "", "config", "latestFundingOptions", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "updateFundingOptions", "fundingOptions", "setLoading", "restoreFromCache", "handleEmptyFundingOptions", "", "hasForeignTaxDisclosure", "processFundingOptions", "resetUserSelection", "onPlanSelected", "planId", "", "onExpand", "onCollapse", "onAddPaymentMethod", "onAddFIFlowCompleted", "preferredFundingInstrumentIds", "", "onCvvSubmit", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "handleCvvSubmitted", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "eventDispatcher", "Lkotlin/Function1;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "previousPlanData", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "previousHasAmexCard", "previousFundingOptionMap", "", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "previousSelectedFundingOption", "handleAddFIFlowCompleted", "p2p_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodAccordionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase Camera2StreamConfigurationMap;
    private com.paypal.oslo.feature.p2p.domain.model.FundingOptions getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentLinkDisclosureMapper getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$sideEffectsMiddleware$1 getHighSpeedVideoSizesFor;
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper getInputFormats;
    private final com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase getOutputFormats;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState, com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.PaymentMethodAccordionEffect> getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig> instrumentAdditionConfig;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.PaymentMethodAccordionEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState> uiState;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$sideEffectsMiddleware$1, java.lang.Object] */
    @javax.inject.Inject
    public PaymentMethodAccordionViewModel(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper fundingOptionToPaymentPlanMapper, com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentLinkDisclosureMapper paymentLinkDisclosureMapper, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase addFinancialInstrumentsToPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase resolvePlanContingencyUseCase, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionToPaymentPlanMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentLinkDisclosureMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferAttemptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFinancialInstrumentsToPaymentTransferAttemptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePlanContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pFeatureGateManager, "");
        this.getInputFormats = fundingOptionToPaymentPlanMapper;
        this.getHighSpeedVideoSizes = paymentLinkDisclosureMapper;
        this.getHighSpeedVideoFpsRanges = getPaymentTransferAttemptUseCase;
        this.Camera2StreamConfigurationMap = addFinancialInstrumentsToPaymentTransferAttemptUseCase;
        this.getOutputFormats = resolvePlanContingencyUseCase;
        ?? r1 = new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState, com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState, com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.access$handleAddFIFlowCompleted(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.this, input.getScope(), input.getEventDispatcher(), input.getStates().getFirst().getTransferAttemptId(), ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted) event).getPreferredFundingInstrumentIds(), input.getStates().getFirst().getPlanData(), input.getStates().getFirst().getHasAmexCard(), input.getStates().getFirst().getFundingOptionMap(), input.getStates().getFirst().getSelectedFundingOption());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel = com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.this;
                    kotlinx.coroutines.CoroutineScope scope = input.getScope();
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                    java.lang.String transferAttemptId = input.getStates().getFirst().getTransferAttemptId();
                    com.paypal.oslo.feature.p2p.domain.model.FundingOption selectedFundingOption = input.getStates().getFirst().getSelectedFundingOption();
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.access$handleCvvSubmitted(paymentMethodAccordionViewModel, scope, eventDispatcher, transferAttemptId, selectedFundingOption != null ? selectedFundingOption.getId() : null, ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted) event).getCvv(), input.getStates().getFirst().getPlanData(), input.getStates().getFirst().getHasAmexCard(), input.getStates().getFirst().getFundingOptionMap(), input.getStates().getFirst().getSelectedFundingOption());
                }
            }
        };
        this.getHighSpeedVideoSizesFor = r1;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState, com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.PaymentMethodAccordionEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PaymentMethodAccordionViewModel.store", new com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState(null, null, false, null, null, null, null, false, null, p2pFeatureGateManager.isAddPaymentMethodEnabled(), null, null, false, 7679, null), com.paypal.oslo.feature.p2p.ui.review.reducers.PaymentMethodAccordionReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf(r1), androidx.view.ViewModelKt.getViewModelScope(paymentMethodAccordionViewModel));
        this.getOutputMinFrameDuration = mviStateStore;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(paymentMethodAccordionViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1(null), 3, null);
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.instrumentAdditionConfig = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$1", f = "PaymentMethodAccordionViewModel.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, nl = {145}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRangesFor;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "attempt", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$1$1", f = "PaymentMethodAccordionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01301 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel Camera2StreamConfigurationMap;
            int getHighSpeedVideoFpsRangesFor;
            /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.String id;
                com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) this.getHighSpeedVideoSizes;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRangesFor != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (paymentTransferAttempt != null && (id = paymentTransferAttempt.getId()) != null) {
                    this.Camera2StreamConfigurationMap.getOutputMinFrameDuration.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.TransferAttemptIdUpdated(id));
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1.C01301) create(paymentTransferAttempt, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1.C01301 c01301 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1.C01301(this.Camera2StreamConfigurationMap, continuation);
                c01301.getHighSpeedVideoSizes = obj;
                return c01301;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01301(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1.C01301> continuation) {
                super(2, continuation);
                this.Camera2StreamConfigurationMap = paymentMethodAccordionViewModel;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.this.getHighSpeedVideoFpsRanges.invoke(), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1.C01301(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.this, null), this) == coroutine_suspended) {
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
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.PaymentMethodAccordionEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig> getInstrumentAdditionConfig() {
        return this.instrumentAdditionConfig;
    }

    public final void updateInstrumentAdditionConfig(com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig config) {
        this.getHighSpeedVideoFpsRangesFor.setValue(config);
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (fundingOptions != null) {
            updateFundingOptions(fundingOptions);
        }
    }

    public final void setLoading() {
        this.getOutputMinFrameDuration.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.Companion.loading$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.INSTANCE, false, 1, null), false, null, null, null, null, null, null, false, 510, null));
    }

    public final void restoreFromCache() {
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (fundingOptions != null) {
            getHighSpeedVideoFpsRangesFor(fundingOptions, false);
        }
    }

    private final boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, boolean z) {
        com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData fromDomain;
        com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig value = this.getHighSpeedVideoFpsRangesFor.getValue();
        boolean z2 = (value != null ? value.getStatus() : null) == com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus.MANDATORY;
        if (fundingOptions != null && !fundingOptions.getAllowedOptions().isEmpty() && !z2) {
            return false;
        }
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState, com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.PaymentMethodAccordionEffect> mviStateStore = this.getOutputMinFrameDuration;
        fromDomain = com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.INSTANCE.fromDomain(kotlin.collections.CollectionsKt.emptyList(), (r15 & 2) != 0 ? null : null, (r15 & 4) != 0 ? false : false, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? false : false, (r15 & 64) == 0 ? null : null);
        mviStateStore.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(fromDomain, false, null, null, null, null, null, null, z, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, boolean z) {
        boolean z2;
        java.lang.String str;
        com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData fromDomain;
        this.getHighResolutionOutputSizeshNQ4ISI = fundingOptions;
        boolean hasForeignTaxDisclosure = com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.hasForeignTaxDisclosure(fundingOptions);
        if (getHighSpeedVideoFpsRanges(fundingOptions, hasForeignTaxDisclosure)) {
            return;
        }
        if (fundingOptions == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> allowedOptions = fundingOptions.getAllowedOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allowedOptions, 10));
        java.util.Iterator<T> it = allowedOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(this.getInputFormats.map((com.paypal.oslo.feature.p2p.domain.model.FundingOption) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.p2p.domain.model.FundingOption selectedFundingOption = this.uiState.getValue().getSelectedFundingOption();
        if (selectedFundingOption != null) {
            str = selectedFundingOption.getId();
            z2 = z;
        } else {
            z2 = z;
            str = null;
        }
        com.paypal.oslo.feature.p2p.domain.model.FundingOption resolveSelectedFundingOption = com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.resolveSelectedFundingOption(fundingOptions, str, z2);
        com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange currencyExchange = resolveSelectedFundingOption != null ? resolveSelectedFundingOption.getCurrencyExchange() : null;
        java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> currencyExchangeMap = com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.toCurrencyExchangeMap(fundingOptions);
        java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> fundingOptionMap = com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.toFundingOptionMap(fundingOptions);
        com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType map = resolveSelectedFundingOption != null ? this.getHighSpeedVideoSizes.map(resolveSelectedFundingOption) : null;
        java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> paymentLinkDisclosureMap = com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.toPaymentLinkDisclosureMap(fundingOptions, this.getHighSpeedVideoSizes);
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState, com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.PaymentMethodAccordionEffect> mviStateStore = this.getOutputMinFrameDuration;
        fromDomain = com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.INSTANCE.fromDomain(arrayList2, (r15 & 2) != 0 ? null : resolveSelectedFundingOption != null ? resolveSelectedFundingOption.getId() : null, (r15 & 4) != 0 ? false : resolveSelectedFundingOption == null || com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.hasUnresolvedCvvContingency(resolveSelectedFundingOption), (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? false : false, (r15 & 64) == 0 ? null : null);
        mviStateStore.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(fromDomain, com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.hasAmexCard(fundingOptions), currencyExchange, currencyExchangeMap, resolveSelectedFundingOption, fundingOptionMap, map, paymentLinkDisclosureMap, hasForeignTaxDisclosure));
    }

    public final void onPlanSelected(java.lang.String planId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planId, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_SELECTED_FUNDING_INSTRUMENT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_METHOD_ID, planId)), null, 4, null);
        this.getOutputMinFrameDuration.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanSelected(planId));
    }

    public final void onExpand() {
        this.getOutputMinFrameDuration.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Expanded.INSTANCE);
    }

    public final void onCollapse() {
        this.getOutputMinFrameDuration.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Collapsed.INSTANCE);
    }

    public final void onAddPaymentMethod() {
        this.getOutputMinFrameDuration.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddPaymentMethodClicked.INSTANCE);
    }

    public final void onAddFIFlowCompleted(java.util.List<java.lang.String> preferredFundingInstrumentIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredFundingInstrumentIds, "");
        this.getOutputMinFrameDuration.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted(preferredFundingInstrumentIds));
    }

    public final void onCvvSubmit(java.lang.String cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        if (kotlin.text.StringsKt.isBlank(cvv)) {
            return;
        }
        this.getOutputMinFrameDuration.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted(cvv));
    }

    public static final /* synthetic */ void access$handleAddFIFlowCompleted(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.util.List list, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, java.util.Map map, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption) {
        if (str.length() != 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1(paymentMethodAccordionViewModel, str, list, function1, planAccordionData, z, fundingOption, map, null), 3, null);
            return;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_NO_ATTEMPT_ID, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str)), null, null, 12, null);
        function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(planAccordionData, z, null, null, fundingOption, map, null, null, false, 460, null));
        function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.FundingOptionsUnavailable.INSTANCE);
    }

    public static final /* synthetic */ void access$handleCvvSubmitted(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, java.util.Map map, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption) {
        java.lang.String str4;
        if (str.length() != 0 && (str4 = str2) != null && str4.length() != 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleCvvSubmitted$1(paymentMethodAccordionViewModel, str, str2, str3, function1, planAccordionData, z, fundingOption, map, null), 3, null);
            return;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, str2 == null ? "" : str2);
        com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CVV_RESOLUTION_MISSING_IDS, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(planAccordionData, z, null, null, fundingOption, map, null, null, false, 460, null));
        function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.FundingOptionsUnavailable.INSTANCE);
    }

    public final void updateFundingOptions(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        getHighSpeedVideoFpsRangesFor(fundingOptions, false);
    }
}
