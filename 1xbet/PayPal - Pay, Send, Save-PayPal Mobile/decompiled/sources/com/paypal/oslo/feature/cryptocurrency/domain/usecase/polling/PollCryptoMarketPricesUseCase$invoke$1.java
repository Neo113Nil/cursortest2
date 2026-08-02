package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase$invoke$1", f = "PollCryptoMarketPricesUseCase.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {58, 57, 67, 71, 70}, m = "invokeSuspend", n = {"$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode"}, nl = {57, 65, 70, 70, 76}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class PollCryptoMarketPricesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bc, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r8.getHubPricesPollingIntervalMs(), r16) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r10.emit(r9, r16) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00ed -> B:15:0x009b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository;
        java.lang.Object currentMarketPrices$default;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.String str2;
        com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository2;
        java.lang.Object currentMarketPrices$default2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager;
        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = this.Camera2StreamConfigurationMap;
            if (str == null) {
                currencyProvider = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                str = currencyProvider.getCurrencyCode();
            }
            if (this.getHighSpeedVideoSizes) {
                cryptoMarketPricesRepository = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getInputFormats = flowCollector3;
                this.getHighSpeedVideoFpsRanges = str;
                this.getHighResolutionOutputSizeshNQ4ISI = flowCollector3;
                this.getHighSpeedVideoFpsRangesFor = 1;
                currentMarketPrices$default = com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository.getCurrentMarketPrices$default(cryptoMarketPricesRepository, str, false, this, 2, null);
                if (currentMarketPrices$default != coroutine_suspended) {
                    flowCollector = flowCollector3;
                    this.getInputFormats = flowCollector3;
                    this.getHighSpeedVideoFpsRanges = str;
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                }
                return coroutine_suspended;
            }
            if (kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
            }
        } else if (i == 1) {
            kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str3 = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector4;
            str = str3;
            currentMarketPrices$default = obj;
            this.getInputFormats = flowCollector3;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = 2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str;
                    cryptoMarketPricesRepository2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                    this.getInputFormats = flowCollector3;
                    this.getHighSpeedVideoFpsRanges = str2;
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector3;
                    this.getHighSpeedVideoFpsRangesFor = 4;
                    currentMarketPrices$default2 = com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository.getCurrentMarketPrices$default(cryptoMarketPricesRepository2, str2, false, this, 2, null);
                    if (currentMarketPrices$default2 != coroutine_suspended) {
                        flowCollector2 = flowCollector3;
                    }
                    return coroutine_suspended;
                }
                if (i == 4) {
                    kotlinx.coroutines.flow.FlowCollector flowCollector5 = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
                    str2 = (java.lang.String) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector2 = flowCollector5;
                    currentMarketPrices$default2 = obj;
                } else if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
                dynamicConfigurationManager = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                this.getInputFormats = flowCollector3;
                this.getHighSpeedVideoFpsRanges = str;
                this.getHighSpeedVideoFpsRangesFor = 3;
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
        this.getInputFormats = flowCollector3;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = 5;
        if (flowCollector2.emit(currentMarketPrices$default2, this) != coroutine_suspended) {
            str = str2;
            if (kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase$invoke$1 pollCryptoMarketPricesUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase$invoke$1(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        pollCryptoMarketPricesUseCase$invoke$1.getInputFormats = obj;
        return pollCryptoMarketPricesUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollCryptoMarketPricesUseCase$invoke$1(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase pollCryptoMarketPricesUseCase, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getInputSizeshNQ4ISI = pollCryptoMarketPricesUseCase;
        this.getHighSpeedVideoSizes = z;
    }
}
