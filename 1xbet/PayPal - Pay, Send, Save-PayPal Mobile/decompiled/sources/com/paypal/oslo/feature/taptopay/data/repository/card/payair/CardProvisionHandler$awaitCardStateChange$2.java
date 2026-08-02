package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardStateChange;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$awaitCardStateChange$2", f = "CardProvisionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class CardProvisionHandler$awaitCardStateChange$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange cardStateChange = (com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cardStateChange.getType() == this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange cardStateChange, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$awaitCardStateChange$2) create(cardStateChange, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$awaitCardStateChange$2 cardProvisionHandler$awaitCardStateChange$2 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$awaitCardStateChange$2(this.getHighSpeedVideoSizes, continuation);
        cardProvisionHandler$awaitCardStateChange$2.getHighSpeedVideoFpsRangesFor = obj;
        return cardProvisionHandler$awaitCardStateChange$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardProvisionHandler$awaitCardStateChange$2(com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type type, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$awaitCardStateChange$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = type;
    }
}
