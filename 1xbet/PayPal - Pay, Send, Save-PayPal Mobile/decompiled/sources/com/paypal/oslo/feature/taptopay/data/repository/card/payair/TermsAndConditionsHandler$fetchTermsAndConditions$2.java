package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/payair/model/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$fetchTermsAndConditions$2", f = "TermsAndConditionsHandler.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class TermsAndConditionsHandler$fetchTermsAndConditions$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.payair.model.Response>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.ConfigurationManager configurationManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        configurationManager = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object fetchTAC = configurationManager.fetchTAC(this.getHighSpeedVideoFpsRangesFor, this);
        return fetchTAC == coroutine_suspended ? coroutine_suspended : fetchTAC;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$fetchTermsAndConditions$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$fetchTermsAndConditions$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TermsAndConditionsHandler$fetchTermsAndConditions$2(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler termsAndConditionsHandler, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$fetchTermsAndConditions$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = termsAndConditionsHandler;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
