package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase$invoke$1", f = "PollQuoteUseCase.kt", i = {0, 1, 2, 3, 4}, l = {66, 65, 80, 84, 83}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, nl = {65, 78, 83, 83, 94}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PollQuoteUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d1, code lost:
    
        if (r8.emit(r3, r18) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r3.getReviewQuotePollingIntervalMs(), r18) != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r9.emit(r3, r18) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00d1 -> B:14:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository cryptoQuoteRepository;
        java.lang.Object generateQuote;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository cryptoQuoteRepository2;
        java.lang.Object generateQuote2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager;
        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoSizes) {
                cryptoQuoteRepository = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
                this.getOutputSizes = flowCollector3;
                this.getInputSizeshNQ4ISI = flowCollector3;
                this.getHighSpeedVideoSizesFor = 1;
                generateQuote = cryptoQuoteRepository.generateQuote(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats, this);
                if (generateQuote != coroutine_suspended) {
                    flowCollector = flowCollector3;
                    this.getOutputSizes = flowCollector3;
                    this.getInputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoSizesFor = 2;
                }
                return coroutine_suspended;
            }
            if (!kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
            }
        } else if (i == 1) {
            kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector4;
            generateQuote = obj;
            this.getOutputSizes = flowCollector3;
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizesFor = 2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    cryptoQuoteRepository2 = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
                    this.getOutputSizes = flowCollector3;
                    this.getInputSizeshNQ4ISI = flowCollector3;
                    this.getHighSpeedVideoSizesFor = 4;
                    generateQuote2 = cryptoQuoteRepository2.generateQuote(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats, this);
                    if (generateQuote2 != coroutine_suspended) {
                        flowCollector2 = flowCollector3;
                    }
                    return coroutine_suspended;
                }
                if (i == 4) {
                    kotlinx.coroutines.flow.FlowCollector flowCollector5 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector2 = flowCollector5;
                    generateQuote2 = obj;
                } else if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
                dynamicConfigurationManager = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = flowCollector3;
                this.getHighSpeedVideoSizesFor = 3;
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
        this.getOutputSizes = flowCollector3;
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizesFor = 5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase$invoke$1 pollQuoteUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase$invoke$1(this.getHighSpeedVideoSizes, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats, continuation);
        pollQuoteUseCase$invoke$1.getOutputSizes = obj;
        return pollQuoteUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollQuoteUseCase$invoke$1(boolean z, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getInputFormats = pollQuoteUseCase;
        this.Camera2StreamConfigurationMap = cryptoTradeAction;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.getOutputMinFrameDuration = str4;
        this.getOutputFormats = str5;
    }
}
