package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/payair/model/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1$result$1", f = "TokenizationCompletionHandler.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, nl = {71}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TokenizationCompletionHandler$invoke$1$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.payair.model.Response>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.payair.model.StartTokenizeData getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.TokenManager tokenManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        tokenManager = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        long tokenizationSessionId = this.getHighSpeedVideoSizes.getTokenizationSessionId();
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object completeTokenize = tokenManager.completeTokenize(java.lang.String.valueOf(tokenizationSessionId), java.lang.System.currentTimeMillis() / 1000, this);
        return completeTokenize == coroutine_suspended ? coroutine_suspended : completeTokenize;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1$result$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TokenizationCompletionHandler$invoke$1$result$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler tokenizationCompletionHandler, com.payair.model.StartTokenizeData startTokenizeData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1$result$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = tokenizationCompletionHandler;
        this.getHighSpeedVideoSizes = startTokenizeData;
    }
}
