package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$awaitCardStateChange$2", f = "ThalesCardRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesCardRepository$awaitCardStateChange$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.card.CardStateChange, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.domain.model.card.CardStateChange.Type Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.taptopay.domain.model.card.CardStateChange cardStateChange = (com.paypal.android.taptopay.domain.model.card.CardStateChange) this.getHighResolutionOutputSizeshNQ4ISI;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cardStateChange.getType() == this.Camera2StreamConfigurationMap && ((str = this.getHighSpeedVideoFpsRangesFor) == null || kotlin.jvm.internal.Intrinsics.areEqual(str, cardStateChange.getDigitizedCard().getCardId())));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.android.taptopay.domain.model.card.CardStateChange cardStateChange, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$awaitCardStateChange$2) create(cardStateChange, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$awaitCardStateChange$2 thalesCardRepository$awaitCardStateChange$2 = new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$awaitCardStateChange$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        thalesCardRepository$awaitCardStateChange$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return thalesCardRepository$awaitCardStateChange$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$awaitCardStateChange$2(com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$awaitCardStateChange$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = type;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
