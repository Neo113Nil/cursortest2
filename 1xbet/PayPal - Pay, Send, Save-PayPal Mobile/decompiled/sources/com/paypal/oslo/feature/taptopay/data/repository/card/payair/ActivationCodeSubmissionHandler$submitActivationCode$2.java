package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/payair/model/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$submitActivationCode$2", f = "ActivationCodeSubmissionHandler.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class ActivationCodeSubmissionHandler$submitActivationCode$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.payair.model.Response>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.TokenManager tokenManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        tokenManager = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object sendActivationCode = tokenManager.sendActivationCode(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
        return sendActivationCode == coroutine_suspended ? coroutine_suspended : sendActivationCode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$submitActivationCode$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$submitActivationCode$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivationCodeSubmissionHandler$submitActivationCode$2(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$submitActivationCode$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activationCodeSubmissionHandler;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
    }
}
