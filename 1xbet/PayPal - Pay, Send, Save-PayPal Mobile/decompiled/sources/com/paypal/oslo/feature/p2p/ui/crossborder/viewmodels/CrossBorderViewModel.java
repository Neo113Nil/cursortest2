package com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00132\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001aH\u0082@¢\u0006\u0004\b!\u0010\"J+\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00132\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001aH\u0002¢\u0006\u0004\b!\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0018\u0010!\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010/R&\u00104\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000202008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R\u001d\u00106\u001a\b\u0012\u0004\u0012\u000201058\u0007¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010;\u001a\b\u0012\u0004\u0012\u0002020:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/viewmodels/CrossBorderViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetFxQuoteUseCase;", "getFxQuoteUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;", "updateAmountAndIntentUseCase", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;", "amountToUiAmountMapper", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "amountFormatter", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/reducers/CrossBorderReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/GetFxQuoteUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;Lcom/paypal/oslo/feature/p2p/ui/crossborder/reducers/CrossBorderReducer;)V", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;)V", "", "amount", "currencyCode", "formatAmountWithCurrency", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "p0", "p1", "Lkotlin/Function1;", "p2", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;", "p3", "p4", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onCleared", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetFxQuoteUseCase;", "getHighSpeedVideoSizes", "getInputFormats", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/state/CrossBorderUiState;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/effects/CrossBorderEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossBorderViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState> uiState;

    @javax.inject.Inject
    public CrossBorderViewModel(com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase getFxQuoteUseCase, com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper, com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer crossBorderReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFxQuoteUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAmountAndIntentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountToUiAmountMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crossBorderReducer, "");
        this.getHighSpeedVideoSizes = getFxQuoteUseCase;
        this.Camera2StreamConfigurationMap = updateAmountAndIntentUseCase;
        this.getHighSpeedVideoFpsRangesFor = amountToUiAmountMapper;
        this.getHighSpeedVideoFpsRanges = amountFormatter;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("CrossBorderViewModel.store", new com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState(null, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, 1048575, null), crossBorderReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize) {
                    com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.access$handleInitialize(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize) event, input.getEventDispatcher());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged) {
                    com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.access$handleSendAmountChanged(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged) event, input.getEventDispatcher(), input.getStates().getFirst());
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged) {
                    com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.access$handleReceiveAmountChanged(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged) event, input.getEventDispatcher(), input.getStates().getFirst());
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleUpdateAmountAndIntent$1(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent) event, input.getEventDispatcher(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputMinFrameDuration = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDuration.onEvent(event);
    }

    public final java.lang.String formatAmountWithCurrency(java.lang.String amount, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        java.lang.String formatAmountWithCurrency$default = com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter.formatAmountWithCurrency$default(this.getHighSpeedVideoFpsRanges, amount, currencyCode, null, true, 4, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(formatAmountWithCurrency$default);
        sb.append(" ");
        sb.append(currencyCode);
        return sb.toString();
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.lang.String p1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> p2) {
        kotlin.text.Regex regex;
        regex = com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModelKt.getHighSpeedVideoSizes;
        java.lang.String replaceFirst = regex.replaceFirst(p0, "");
        java.math.BigDecimal parseFormattedAmount$default = com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(this.getHighSpeedVideoFpsRangesFor, replaceFirst, null, 2, null);
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
        java.lang.String plainString = parseFormattedAmount$default.toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        p2.invoke(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted(replaceFirst, companion.fiat(p1, plainString)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: Exception -> 0x0043, CancellationException -> 0x0148, TryCatch #1 {CancellationException -> 0x0148, blocks: (B:12:0x003f, B:13:0x0081, B:15:0x008c, B:19:0x00dd, B:21:0x00e7, B:24:0x00f6, B:34:0x0051, B:37:0x0075), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd A[Catch: Exception -> 0x0043, CancellationException -> 0x0148, TryCatch #1 {CancellationException -> 0x0148, blocks: (B:12:0x003f, B:13:0x0081, B:15:0x008c, B:19:0x00dd, B:21:0x00e7, B:24:0x00f6, B:34:0x0051, B:37:0x0075), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput2, java.lang.String str2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$fetchFxQuote$1 crossBorderViewModel$fetchFxQuote$1;
        int i;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> function12;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> function13;
        kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.FxQuoteError, com.paypal.oslo.feature.p2p.domain.model.FxQuote>> invoke;
        com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote;
        try {
            if (continuation instanceof com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$fetchFxQuote$1) {
                crossBorderViewModel$fetchFxQuote$1 = (com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$fetchFxQuote$1) continuation;
                if ((crossBorderViewModel$fetchFxQuote$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    crossBorderViewModel$fetchFxQuote$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = crossBorderViewModel$fetchFxQuote$1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = crossBorderViewModel$fetchFxQuote$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            invoke = this.getHighSpeedVideoSizes.invoke(str, currencyInput, currencyInput2, str2);
                            crossBorderViewModel$fetchFxQuote$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            crossBorderViewModel$fetchFxQuote$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyInput);
                            crossBorderViewModel$fetchFxQuote$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyInput2);
                            crossBorderViewModel$fetchFxQuote$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            function12 = function1;
                        } catch (java.lang.Exception e) {
                            e = e;
                            function12 = function1;
                        }
                        try {
                            crossBorderViewModel$fetchFxQuote$1.getHighSpeedVideoFpsRangesFor = function12;
                            crossBorderViewModel$fetchFxQuote$1.getOutputFormats = 1;
                            obj = kotlinx.coroutines.flow.FlowKt.first(invoke, crossBorderViewModel$fetchFxQuote$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function13 = function12;
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            function13 = function12;
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                            java.lang.String message = e.getMessage();
                            com.paypal.android.logger.Logger.w$default(logger, "FX quote request threw exception", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", message != null ? message : "")), null, 4, null);
                            function13.invoke(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteFailed.INSTANCE);
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function13 = (kotlin.jvm.functions.Function1) crossBorderViewModel$fetchFxQuote$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.p2p.LoggerKt.log;
                            java.lang.String message2 = e.getMessage();
                            com.paypal.android.logger.Logger.w$default(logger2, "FX quote request threw exception", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", message2 != null ? message2 : "")), null, 4, null);
                            function13.invoke(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteFailed.INSTANCE);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    arrow.core.Ior ior = (arrow.core.Ior) obj;
                    fxQuote = (com.paypal.oslo.feature.p2p.domain.model.FxQuote) ior.getOrNull();
                    if (fxQuote == null) {
                        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
                        java.lang.String currencyCode = fxQuote.getAmountFrom().getCurrencyCode();
                        java.lang.String plainString = com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(this.getHighSpeedVideoFpsRangesFor, fxQuote.getAmountFrom().getValue(), null, 2, null).toPlainString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
                        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat = companion.fiat(currencyCode, plainString);
                        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion2 = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
                        java.lang.String currencyCode2 = fxQuote.getAmountTo().getCurrencyCode();
                        java.lang.String plainString2 = com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(this.getHighSpeedVideoFpsRangesFor, fxQuote.getAmountTo().getValue(), null, 2, null).toPlainString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString2, "");
                        function13.invoke(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded(fxQuote, fiat, companion2.fiat(currencyCode2, plainString2)));
                    } else {
                        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.p2p.LoggerKt.log;
                        com.paypal.oslo.feature.p2p.domain.error.FxQuoteError fxQuoteError = (com.paypal.oslo.feature.p2p.domain.error.FxQuoteError) ior.leftOrNull();
                        java.lang.String simpleName = fxQuoteError != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(fxQuoteError.getClass()).getSimpleName() : null;
                        if (simpleName == null) {
                            simpleName = "";
                        }
                        com.paypal.android.logger.Logger.w$default(logger3, "FX quote request failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName)), null, 4, null);
                        function13.invoke(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteFailed.INSTANCE);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            arrow.core.Ior ior2 = (arrow.core.Ior) obj;
            fxQuote = (com.paypal.oslo.feature.p2p.domain.model.FxQuote) ior2.getOrNull();
            if (fxQuote == null) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.util.concurrent.CancellationException e4) {
            throw e4;
        }
        crossBorderViewModel$fetchFxQuote$1 = new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$fetchFxQuote$1(this, continuation);
        java.lang.Object obj2 = crossBorderViewModel$fetchFxQuote$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = crossBorderViewModel$fetchFxQuote$1.getOutputFormats;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> p1) {
        kotlin.text.Regex regex;
        regex = com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModelKt.getHighSpeedVideoSizes;
        java.lang.String replaceFirst = regex.replaceFirst(p0, "");
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState value = this.uiState.getValue();
        java.math.BigDecimal parseFormattedAmount$default = com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(this.getHighSpeedVideoFpsRangesFor, replaceFirst, null, 2, null);
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
        java.lang.String sendCurrencyCode = value.getSendCurrencyCode();
        java.lang.String plainString = parseFormattedAmount$default.toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        p1.invoke(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted(replaceFirst, companion.fiat(sendCurrencyCode, plainString)));
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public static final /* synthetic */ void access$handleInitialize(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize initialize, kotlin.jvm.functions.Function1 function1) {
        java.lang.String str;
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        kotlinx.coroutines.Job launch$default3;
        boolean isValidPositiveAmount = com.paypal.oslo.feature.p2p.ui.utils.AmountValidationKt.isValidPositiveAmount(initialize.getInitialReceiveAmount());
        boolean isValidPositiveAmount2 = com.paypal.oslo.feature.p2p.ui.utils.AmountValidationKt.isValidPositiveAmount(initialize.getInitialAmount());
        if (isValidPositiveAmount2 && isValidPositiveAmount) {
            crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI(initialize.getInitialAmount(), function1);
            crossBorderViewModel.getHighSpeedVideoFpsRangesFor(initialize.getInitialReceiveAmount(), initialize.getReceiveCurrencyCode(), function1);
            launch$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(crossBorderViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$1(crossBorderViewModel, initialize, function1, null), 3, null);
            crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI = launch$default3;
            return;
        }
        if (isValidPositiveAmount) {
            crossBorderViewModel.getHighSpeedVideoFpsRangesFor(initialize.getInitialReceiveAmount(), initialize.getReceiveCurrencyCode(), function1);
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(crossBorderViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$2(crossBorderViewModel, initialize, function1, null), 3, null);
            crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI = launch$default2;
            return;
        }
        crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI(initialize.getInitialAmount(), function1);
        if (isValidPositiveAmount2) {
            str = initialize.getInitialAmount();
        } else {
            str = "1";
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(crossBorderViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$3(crossBorderViewModel, initialize, str, function1, null), 3, null);
        crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI = launch$default;
    }

    public static final /* synthetic */ void access$handleReceiveAmountChanged(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged receiveAmountChanged, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState crossBorderUiState) {
        kotlin.text.Regex regex;
        kotlinx.coroutines.Job launch$default;
        if (crossBorderUiState.isLoadingReceiveAmount()) {
            return;
        }
        java.lang.String receiveAmount = crossBorderViewModel.uiState.getValue().getReceiveAmount();
        java.lang.String receiveCurrencyCode = crossBorderViewModel.uiState.getValue().getReceiveCurrencyCode();
        java.lang.String rawAmount = receiveAmountChanged.getRawAmount();
        regex = com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModelKt.getHighSpeedVideoSizes;
        java.lang.String replaceFirst = regex.replaceFirst(rawAmount, "");
        java.math.BigDecimal parseFormattedAmount$default = com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(crossBorderViewModel.getHighSpeedVideoFpsRangesFor, replaceFirst, null, 2, null);
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
        java.lang.String plainString = parseFormattedAmount$default.toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        function1.invoke(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted(replaceFirst, companion.fiat(receiveCurrencyCode, plainString)));
        if (parseFormattedAmount$default.compareTo(com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(crossBorderViewModel.getHighSpeedVideoFpsRangesFor, receiveAmount, null, 2, null)) == 0) {
            return;
        }
        kotlinx.coroutines.Job job = crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(crossBorderViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleReceiveAmountChanged$1(receiveAmountChanged, crossBorderViewModel, function1, null), 3, null);
        crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI = launch$default;
    }

    public static final /* synthetic */ void access$handleSendAmountChanged(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged sendAmountChanged, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState crossBorderUiState) {
        kotlin.text.Regex regex;
        kotlinx.coroutines.Job launch$default;
        if (crossBorderUiState.isLoadingSendAmount()) {
            return;
        }
        java.lang.String sendAmount = crossBorderViewModel.uiState.getValue().getSendAmount();
        crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI(sendAmountChanged.getRawAmount(), function1);
        com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper = crossBorderViewModel.getHighSpeedVideoFpsRangesFor;
        java.lang.String rawAmount = sendAmountChanged.getRawAmount();
        regex = com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModelKt.getHighSpeedVideoSizes;
        if (com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(amountToUiAmountMapper, regex.replaceFirst(rawAmount, ""), null, 2, null).compareTo(com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(crossBorderViewModel.getHighSpeedVideoFpsRangesFor, sendAmount, null, 2, null)) == 0) {
            return;
        }
        kotlinx.coroutines.Job job = crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(crossBorderViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleSendAmountChanged$1(sendAmountChanged, crossBorderViewModel, function1, null), 3, null);
        crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI = launch$default;
    }
}
