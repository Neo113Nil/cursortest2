package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase$invoke$1", f = "PollCryptoHoldingsUseCase.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {58, 57, 67, 71, 70}, m = "invokeSuspend", n = {"$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode"}, nl = {57, 65, 70, 70, 76}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class PollCryptoHoldingsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r8.getHubHoldingsPollingIntervalMs(), r17) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r10.emit(r9, r17) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00f0 -> B:15:0x009d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository;
        java.lang.Object cryptoHoldings$default;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.String str2;
        com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository2;
        java.lang.Object cryptoHoldings$default2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager;
        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = this.getHighSpeedVideoFpsRanges;
            if (str == null) {
                currencyProvider = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                str = currencyProvider.getCurrencyCode();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                cryptoHoldingsRepository = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = flowCollector3;
                this.Camera2StreamConfigurationMap = str;
                this.getHighSpeedVideoFpsRangesFor = flowCollector3;
                this.getHighSpeedVideoSizes = 1;
                cryptoHoldings$default = com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository.getCryptoHoldings$default(cryptoHoldingsRepository, str, null, false, this, 6, null);
                if (cryptoHoldings$default != coroutine_suspended) {
                    flowCollector = flowCollector3;
                    this.getOutputMinFrameDuration = flowCollector3;
                    this.Camera2StreamConfigurationMap = str;
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighSpeedVideoSizes = 2;
                }
                return coroutine_suspended;
            }
            if (kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
            }
        } else if (i == 1) {
            kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str3 = (java.lang.String) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector4;
            str = str3;
            cryptoHoldings$default = obj;
            this.getOutputMinFrameDuration = flowCollector3;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoSizes = 2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    str = (java.lang.String) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str;
                    cryptoHoldingsRepository2 = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
                    this.getOutputMinFrameDuration = flowCollector3;
                    this.Camera2StreamConfigurationMap = str2;
                    this.getHighSpeedVideoFpsRangesFor = flowCollector3;
                    this.getHighSpeedVideoSizes = 4;
                    cryptoHoldings$default2 = com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository.getCryptoHoldings$default(cryptoHoldingsRepository2, str2, null, false, this, 6, null);
                    if (cryptoHoldings$default2 != coroutine_suspended) {
                        flowCollector2 = flowCollector3;
                    }
                    return coroutine_suspended;
                }
                if (i == 4) {
                    kotlinx.coroutines.flow.FlowCollector flowCollector5 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                    str2 = (java.lang.String) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector2 = flowCollector5;
                    cryptoHoldings$default2 = obj;
                } else if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            str = (java.lang.String) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
                dynamicConfigurationManager = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputMinFrameDuration = flowCollector3;
                this.Camera2StreamConfigurationMap = str;
                this.getHighSpeedVideoSizes = 3;
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
        this.getOutputMinFrameDuration = flowCollector3;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = 5;
        if (flowCollector2.emit(cryptoHoldings$default2, this) != coroutine_suspended) {
            str = str2;
            if (kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase$invoke$1 pollCryptoHoldingsUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase$invoke$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        pollCryptoHoldingsUseCase$invoke$1.getOutputMinFrameDuration = obj;
        return pollCryptoHoldingsUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollCryptoHoldingsUseCase$invoke$1(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase pollCryptoHoldingsUseCase, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizesFor = pollCryptoHoldingsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}
