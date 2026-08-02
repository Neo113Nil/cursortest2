package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020$0(8\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020%0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/EditAmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetAmountUseCase;", "getAmountUseCase", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;", "amountToUiAmountMapper", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;", "updateAmountAndIntentUseCase", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "amountFormatter", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getPaymentTransferAttemptUseCase", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/GetAmountUseCase;Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;)V", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;)V", "", "amountValue", "currencyCode", "updateAmount", "(Ljava/lang/String;Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetAmountUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditAmountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect> getInputFormats;
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState> uiState;

    @javax.inject.Inject
    public EditAmountViewModel(com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase getAmountUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper, com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase, com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAmountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountToUiAmountMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAmountAndIntentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferAttemptUseCase, "");
        this.getHighSpeedVideoFpsRanges = getAmountUseCase;
        this.getHighSpeedVideoFpsRangesFor = amountToUiAmountMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = updateAmountAndIntentUseCase;
        this.getHighSpeedVideoSizes = amountFormatter;
        this.Camera2StreamConfigurationMap = getPaymentTransferAttemptUseCase;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("EditAmountViewModel.store", new com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState(null, null, null, false, null, false, null, null, null, 511, null), com.paypal.oslo.feature.p2p.ui.review.reducers.EditAmountReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.LoadAmount) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this, input.getEventDispatcher(), null), 3, null);
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$createAmountUpdateMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent> input) {
                java.lang.String str;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState second = input.getStates().getSecond();
                com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to("amount", ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) event).getNewAmount());
                    pairArr[1] = kotlin.TuplesKt.to("attemptId", second.getTransferAttemptId());
                    com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent = second.getSelectedIntent();
                    if (selectedIntent == null || (str = selectedIntent.name()) == null) {
                        str = "UNKNOWN";
                    }
                    pairArr[2] = kotlin.TuplesKt.to("intent", str);
                    com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_MODIFIED_AMOUNT, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    eventDispatcher.invoke(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateStarted.INSTANCE);
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$createAmountUpdateMiddleware$1$invoke$1(event, second, com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this, eventDispatcher, null), 3, null);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(editAmountViewModel));
        this.getInputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(editAmountViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.AnonymousClass1(null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputFormats.onEvent(event);
    }

    public final void updateAmount(java.lang.String amountValue, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        java.lang.String formatAmountWithCurrency$default = com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter.formatAmountWithCurrency$default(this.getHighSpeedVideoSizes, amountValue, currencyCode, null, false, 4, null);
        java.lang.String formatAmountOnly$default = com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter.formatAmountOnly$default(this.getHighSpeedVideoSizes, amountValue, currencyCode, null, false, 12, null);
        java.math.BigDecimal parseFormattedAmount$default = com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(this.getHighSpeedVideoFpsRangesFor, amountValue, null, 2, null);
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
        java.lang.String plainString = parseFormattedAmount$default.toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount(new com.paypal.oslo.feature.p2p.ui.review.state.UiAmount(formatAmountOnly$default, currencyCode, currencyCode, "🇺🇸", formatAmountWithCurrency$default, companion.fiat(currencyCode, plainString))));
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$1", f = "EditAmountViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, nl = {161}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt> invoke = com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this.Camera2StreamConfigurationMap.invoke();
                final com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel = com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this;
                this.Camera2StreamConfigurationMap = 1;
                if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) obj2;
                        if (paymentTransferAttempt != null) {
                            com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this.getInputFormats.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained(paymentTransferAttempt.getId()));
                            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent = paymentTransferAttempt.getSelectedIntent();
                            if (selectedIntent != null) {
                                com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this.getInputFormats.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained(selectedIntent));
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
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public static final /* synthetic */ void access$logAmountUpdatedSuccessfully(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
        java.lang.String str3;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("amount", str);
        pairArr[1] = kotlin.TuplesKt.to("attemptId", str2);
        if (paymentTransferIntent == null || (str3 = paymentTransferIntent.name()) == null) {
            str3 = "UNKNOWN";
        }
        pairArr[2] = kotlin.TuplesKt.to("intent", str3);
        com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.AMOUNT_UPDATED_SUCCESSFULLY, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }
}
