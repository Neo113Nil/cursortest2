package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\"\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0015H\u0082@¢\u0006\u0004\b\"\u0010#J,\u0010%\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020$2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0015H\u0082@¢\u0006\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u0016\u0010\"\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010/R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u00100"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "fundingOptionsCache", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/FetchDebitCardFundingOptionsUseCase;", "fetchDebitCardFundingOptionsUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/SetDebitCardFundingOptionsUseCase;", "setDebitCardFundingOptionsUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/FetchDebitCardFundingOptionsUseCase;Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/SetDebitCardFundingOptionsUseCase;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorConfig;", "config", "", "configure", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorConfig;)V", "event", "currentState", "Lkotlin/Function1;", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "p0", "", "p1", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "p2", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;", "p3", "p4", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Saving;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Saving;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/FetchDebitCardFundingOptionsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/SetDebitCardFundingOptionsUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorConfig;", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingSourceSelectorSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public FundingSourceSelectorSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase fetchDebitCardFundingOptionsUseCase, com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase setDebitCardFundingOptionsUseCase, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptionsCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchDebitCardFundingOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitCardFundingOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRanges = debitCardFundingOptionsCache;
        this.getHighResolutionOutputSizeshNQ4ISI = fetchDebitCardFundingOptionsUseCase;
        this.Camera2StreamConfigurationMap = setDebitCardFundingOptionsUseCase;
        this.getHighSpeedVideoSizes = featureGateManager;
        this.getHighSpeedVideoFpsRangesFor = "";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent fundingSourceSelectorEvent, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState fundingSourceSelectorUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(fundingSourceSelectorEvent, fundingSourceSelectorUiState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    public final void configure(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoFpsRangesFor = config.getInstrumentId();
        this.getOutputFormats = config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent fundingSourceSelectorEvent, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState fundingSourceSelectorUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(fundingSourceSelectorEvent instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromCache)) {
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig = null;
            if (fundingSourceSelectorEvent instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote) {
                com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote fetchAvailableFundingSourcesFromRemote = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote) fundingSourceSelectorEvent;
                com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = fetchAvailableFundingSourcesFromRemote.getProductName();
                java.lang.String cardId = fetchAvailableFundingSourcesFromRemote.getCardId();
                com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant = com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.SET_FUNDING_SOURCE;
                com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig2 = this.getOutputFormats;
                if (fundingSourceSelectorConfig2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    fundingSourceSelectorConfig = fundingSourceSelectorConfig2;
                }
                java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(productName, cardId, fundingSourceSelectorVariant, fundingSourceSelectorConfig.getEntryPoint(), function1, continuation);
                return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
            }
            if (fundingSourceSelectorEvent instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnDoneClicked) {
                if (fundingSourceSelectorUiState instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving) {
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving) fundingSourceSelectorUiState, function1, continuation);
                    return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
                }
            } else {
                if (fundingSourceSelectorEvent instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent) {
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent linkedEvent = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent) fundingSourceSelectorEvent;
                    com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName2 = linkedEvent.getProductName();
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant = linkedEvent.getVariant();
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig3 = this.getOutputFormats;
                    if (fundingSourceSelectorConfig3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        fundingSourceSelectorConfig = fundingSourceSelectorConfig3;
                    }
                    java.lang.Object highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(productName2, null, variant, fundingSourceSelectorConfig.getEntryPoint(), function1, continuation);
                    return highSpeedVideoFpsRangesFor2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor2 : kotlin.Unit.INSTANCE;
                }
                if (fundingSourceSelectorEvent instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnRetryClicked) {
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig4 = this.getOutputFormats;
                    if (fundingSourceSelectorConfig4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        fundingSourceSelectorConfig4 = null;
                    }
                    int i = com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware.WhenMappings.$EnumSwitchMapping$0[fundingSourceSelectorConfig4.getVariant().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig5 = this.getOutputFormats;
                        if (fundingSourceSelectorConfig5 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            fundingSourceSelectorConfig5 = null;
                        }
                        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName3 = fundingSourceSelectorConfig5.getProductName();
                        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant2 = com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.SET_FUNDING_SOURCE;
                        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig6 = this.getOutputFormats;
                        if (fundingSourceSelectorConfig6 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            fundingSourceSelectorConfig = fundingSourceSelectorConfig6;
                        }
                        java.lang.Object highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(productName3, null, fundingSourceSelectorVariant2, fundingSourceSelectorConfig.getEntryPoint(), function1, continuation);
                        return highSpeedVideoFpsRangesFor3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor3 : kotlin.Unit.INSTANCE;
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingOptions = this.getHighSpeedVideoFpsRanges.getAvailableFundingOptions();
        java.lang.String selectedFundingSourceId = this.getHighSpeedVideoFpsRanges.getSelectedFundingSourceId();
        if (availableFundingOptions != null) {
            function1.invoke(new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched(availableFundingOptions, selectedFundingSourceId, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.SELECT_FUNDING_SOURCE, null, 8, null));
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Cache miss — funding options not available", null, null, 6, null);
            function1.invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFetchFailed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1 fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent, kotlin.Unit> function12;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1) {
            fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1 = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1) continuation;
            if ((fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getInputFormats -= 2147483648;
                java.lang.Object obj = fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest evaluateDebitCardFundingOptionsRequest = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest(debitCardProductName, str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsMode.SELECTION, com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentFundingOptionsExtensionsKt.resolveFundingSourceStatus(debitCardProductName, this.getHighSpeedVideoSizes), debitCardEvaluateFundingOptionsEntryPoint);
                    com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase fetchDebitCardFundingOptionsUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardProductName);
                    fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    fundingSourceSelectorVariant2 = fundingSourceSelectorVariant;
                    fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighSpeedVideoSizes = fundingSourceSelectorVariant2;
                    fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardEvaluateFundingOptionsEntryPoint);
                    fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateDebitCardFundingOptionsRequest);
                    fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getInputFormats = 1;
                    obj = fetchDebitCardFundingOptionsUseCase.invoke2(evaluateDebitCardFundingOptionsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions>>) fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function12 = (kotlin.jvm.functions.Function1) fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighResolutionOutputSizeshNQ4ISI;
                    fundingSourceSelectorVariant2 = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant) fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Remote fetch failed — API error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", useCaseResult)), null, 4, null);
                    function12.invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFetchFailed.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions) useCaseResult.getData();
                if (debitCardFundingOptions == null || (debitCardAvailableFundingOptions = debitCardFundingOptions.getAvailableFundingOptions()) == null) {
                    debitCardAvailableFundingOptions = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions(kotlin.collections.CollectionsKt.emptyList());
                }
                java.lang.String selectedFundingSourceId = this.getHighSpeedVideoFpsRanges.getSelectedFundingSourceId();
                com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions) useCaseResult.getData();
                function12.invoke(new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched(debitCardAvailableFundingOptions, selectedFundingSourceId, fundingSourceSelectorVariant2, debitCardFundingOptions2 != null ? debitCardFundingOptions2.getSecondaryFundingOptions() : null));
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Funding options fetched successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fundingOptions", useCaseResult)), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1(this, continuation);
        java.lang.Object obj2 = fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingSourceSelectorSideEffectsMiddleware$handleFetchFundingOptionsFromRemote$1.getInputFormats;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving saving, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1 fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1;
        int i;
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1) {
            fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1 = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1) continuation;
            if ((fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj2 = fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.util.Iterator<T> it = saving.getAvailableFundingSources().getFundingSources().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj).getId(), saving.getSelectedFundingSourceId())) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj;
                    if (debitCardFundingSource == null) {
                        function1.invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceFailed.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest setDebitCardFundingOptionsRequest = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest(debitCardFundingSource, this.getHighSpeedVideoFpsRangesFor, null, 4, null);
                    com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase setDebitCardFundingOptionsUseCase = this.Camera2StreamConfigurationMap;
                    fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighResolutionOutputSizeshNQ4ISI = saving;
                    fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoSizes = function1;
                    fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardFundingSource);
                    fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setDebitCardFundingOptionsRequest);
                    fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj2 = setDebitCardFundingOptionsUseCase.invoke2(setDebitCardFundingOptionsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult>>) fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoSizes;
                    saving = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving) fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    if (((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()).getSuccess()) {
                        function1.invoke(new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess(saving.getSelectedFundingSourceId()));
                    } else {
                        function1.invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceFailed.INSTANCE);
                    }
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function1.invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceFailed.INSTANCE);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1(this, continuation);
        java.lang.Object obj22 = fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingSourceSelectorSideEffectsMiddleware$handleSetFundingOptions$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj22;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.SELECT_FUNDING_SOURCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.SET_FUNDING_SOURCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
