package com.paypal.oslo.feature.p2p.ui.transfer.viewmodels;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010'R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020+0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020*0/8\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00105\u001a\b\u0012\u0004\u0012\u00020+048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/StartTransferAttemptUseCase;", "startTransferAttemptUseCase", "Lcom/paypal/oslo/feature/p2p/ui/transfer/mapper/StartPaymentTransferAttemptToTransferUiStateMapper;", "transferAttemptMapper", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferFlowConfigurationUseCase;", "getPaymentTransferFlowConfigurationUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;", "updateAmountAndIntentUseCase", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;", "amountToUiAmountMapper", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "p2pFeatureGateManager", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/StartTransferAttemptUseCase;Lcom/paypal/oslo/feature/p2p/ui/transfer/mapper/StartPaymentTransferAttemptToTransferUiStateMapper;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferFlowConfigurationUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferReducer;)V", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;)V", "onCleared", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/usecase/StartTransferAttemptUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/p2p/ui/transfer/mapper/StartPaymentTransferAttemptToTransferUiStateMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferFlowConfigurationUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.StartTransferAttemptUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferFlowConfigurationUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.transfer.mapper.StartPaymentTransferAttemptToTransferUiStateMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState> uiState;

    @javax.inject.Inject
    public TransferViewModel(com.paypal.oslo.feature.p2p.domain.usecase.StartTransferAttemptUseCase startTransferAttemptUseCase, com.paypal.oslo.feature.p2p.ui.transfer.mapper.StartPaymentTransferAttemptToTransferUiStateMapper startPaymentTransferAttemptToTransferUiStateMapper, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferFlowConfigurationUseCase getPaymentTransferFlowConfigurationUseCase, com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer transferReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTransferAttemptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPaymentTransferAttemptToTransferUiStateMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferFlowConfigurationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAmountAndIntentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountToUiAmountMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pFeatureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferReducer, "");
        this.getHighSpeedVideoFpsRanges = startTransferAttemptUseCase;
        this.getHighSpeedVideoFpsRangesFor = startPaymentTransferAttemptToTransferUiStateMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = getPaymentTransferFlowConfigurationUseCase;
        this.Camera2StreamConfigurationMap = updateAmountAndIntentUseCase;
        this.getHighSpeedVideoSizes = amountToUiAmountMapper;
        this.getOutputFormats = p2pFeatureGateManager;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("TransferViewModel.store", new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial(null, p2pFeatureGateManager.isCryptoPickerEnabled(), null, null, 13, null), transferReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InitializeTransferConfigurationAndStartTransferAttempt.INSTANCE)) {
                    com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.access$initializeTransferConfigAndStartTransferAttempt(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.this, input.getEventDispatcher());
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$updateAmountAndIntent$1((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent) event, input.getEventDispatcher(), com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.this, null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged) {
                    com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.access$formatAmount(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.this, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged) event).getRawAmount(), input.getEventDispatcher());
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.TRANSFER_AMOUNT_SCREEN_APPEARED, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent) {
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent updateAmountAndIntent = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent) event;
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_SELECTED_INTENT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", updateAmountAndIntent.getIntent()), kotlin.TuplesKt.to("amount", updateAmountAndIntent.getAmount()), kotlin.TuplesKt.to("currencyCode", updateAmountAndIntent.getCurrencyCode()), kotlin.TuplesKt.to("attemptId", updateAmountAndIntent.getTransferAttemptId())), null, 4, null);
        } else if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.ResetTransferState) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.TRANSFER_DATA_RESET, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAD_AMOUNT, java.lang.String.valueOf(this.uiState.getValue() instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success))), null, 4, null);
        }
        this.getInputFormats.onEvent(event);
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        if (this.uiState.getValue() instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.P2P_FLOW_COMPLETED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.NEXT_ACTION, "transfer_screen_cleared")), null, 4, null);
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$vML974vk2o796m8_8EYjnztZyJc(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        return paymentTransferIntent.name();
    }

    public static final /* synthetic */ void access$formatAmount(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat;
        java.lang.String replaceFirst = new kotlin.text.Regex("^0+(?!$|\\.)").replaceFirst(str, "");
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState value = transferViewModel.uiState.getValue();
        java.lang.String primaryCurrencyCode = value instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success ? ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success) value).getPrimaryCurrencyCode() : "USD";
        java.math.BigDecimal parseFormattedAmount$default = com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper.parseFormattedAmount$default(transferViewModel.getHighSpeedVideoSizes, replaceFirst, null, 2, null);
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BTC", "ETH"});
        java.lang.String upperCase = primaryCurrencyCode.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (listOf.contains(upperCase)) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
            java.lang.String plainString = parseFormattedAmount$default.toPlainString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
            fiat = companion.crypto(primaryCurrencyCode, plainString, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        } else {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion2 = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
            java.lang.String plainString2 = parseFormattedAmount$default.toPlainString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString2, "");
            fiat = companion2.fiat(primaryCurrencyCode, plainString2);
        }
        function1.invoke(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted(replaceFirst, fiat));
    }

    public static final /* synthetic */ void access$initializeTransferConfigAndStartTransferAttempt(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, kotlin.jvm.functions.Function1 function1) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = transferViewModel.getOutputMinFrameDuration;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(transferViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1(transferViewModel, function1, null), 3, null);
        transferViewModel.getOutputMinFrameDuration = launch$default;
    }

    public static final /* synthetic */ void access$logTransferAttemptFailed(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, java.lang.Object obj, boolean z) {
        java.lang.String simpleName = obj != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "";
        }
        java.lang.String str = simpleName;
        if (str.length() == 0) {
            str = "UnexpectedNull";
        }
        java.lang.String str2 = str;
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.TRANSFER_AMOUNT_SCREEN_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", str2), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FETCH_CONFIG, java.lang.String.valueOf(z))), null, null, 12, null);
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FAILED_TO_START_TRANSFER_ATTEMPT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", str2)), null, null, 12, null);
    }
}
