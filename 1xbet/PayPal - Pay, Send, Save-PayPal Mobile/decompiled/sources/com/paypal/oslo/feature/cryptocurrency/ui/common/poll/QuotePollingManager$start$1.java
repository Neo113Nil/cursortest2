package com.paypal.oslo.feature.cryptocurrency.ui.common.poll;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager$start$1", f = "QuotePollingManager.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, nl = {52}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class QuotePollingManager$start$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase;
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pollQuoteUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            cryptoTradeAction = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            str = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            str2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            java.lang.String str5 = this.Camera2StreamConfigurationMap;
            str3 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            str4 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote>> invoke = pollQuoteUseCase.invoke(cryptoTradeAction, str, str2, str5, str3, str4, false);
            final com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager quotePollingManager = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager$start$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.jvm.functions.Function1 function1;
                    arrow.core.Either either = (arrow.core.Either) obj2;
                    function1 = com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager.this.getOutputMinFrameDuration;
                    if (either instanceof arrow.core.Either.Right) {
                        function1.invoke(((arrow.core.Either.Right) either).getValue());
                    } else {
                        if (!(either instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager$start$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager$start$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuotePollingManager$start$1(com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager quotePollingManager, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager$start$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = quotePollingManager;
        this.Camera2StreamConfigurationMap = str;
    }
}
