package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0094@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/FetchDebitCardFundingOptionsUseCase;", "fetchDebitCardFundingOptionsUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "fundingOptionsCache", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/FetchDebitCardFundingOptionsUseCase;Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/FetchDebitCardFundingOptionsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingOptionsComponentSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FundingOptionsComponentSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase fetchDebitCardFundingOptionsUseCase, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchDebitCardFundingOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptionsCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fetchDebitCardFundingOptionsUseCase;
        this.Camera2StreamConfigurationMap = debitCardFundingOptionsCache;
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent fundingOptionsComponentEvent, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState fundingOptionsComponentUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(fundingOptionsComponentEvent, fundingOptionsComponentUiState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent fundingOptionsComponentEvent, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState fundingOptionsComponentUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware$handleEvent$1 fundingOptionsComponentSideEffectsMiddleware$handleEvent$1;
        int i;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent, kotlin.Unit> function12;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware$handleEvent$1) {
            fundingOptionsComponentSideEffectsMiddleware$handleEvent$1 = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware$handleEvent$1) continuation;
            if ((fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (fundingOptionsComponentEvent instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData) {
                        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData fetchFundingOptionsData = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData) fundingOptionsComponentEvent;
                        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest evaluateDebitCardFundingOptionsRequest = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest(fetchFundingOptionsData.getProductName(), fetchFundingOptionsData.getCardId(), null, com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentFundingOptionsExtensionsKt.resolveFundingSourceStatus(fetchFundingOptionsData.getProductName(), this.getHighSpeedVideoFpsRangesFor), fetchFundingOptionsData.getEntryPoint(), 4, null);
                        com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase fetchDebitCardFundingOptionsUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                        fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingOptionsComponentEvent);
                        fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingOptionsComponentUiState);
                        function12 = function1;
                        fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.getHighSpeedVideoSizes = function12;
                        fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateDebitCardFundingOptionsRequest);
                        fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.Camera2StreamConfigurationMap = 1;
                        obj = fetchDebitCardFundingOptionsUseCase.invoke2(evaluateDebitCardFundingOptionsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions>>) fundingOptionsComponentSideEffectsMiddleware$handleEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function12 = (kotlin.jvm.functions.Function1) fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Funding options fetch failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult).getTag())), null, null, 12, null);
                    function12.invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetchFailed.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions) useCaseResult.getData();
                if (debitCardFundingOptions != null) {
                    this.Camera2StreamConfigurationMap.putAvailableFundingOptions(debitCardFundingOptions.getAvailableFundingOptions());
                    function12.invoke(new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched(debitCardFundingOptions));
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Funding options fetched successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fundingOptions", useCaseResult)), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        fundingOptionsComponentSideEffectsMiddleware$handleEvent$1 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware$handleEvent$1(this, continuation);
        java.lang.Object obj2 = fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingOptionsComponentSideEffectsMiddleware$handleEvent$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
        }
    }
}
