package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt$toPayPalAddCardState$1", f = "PayPalAddCardState.kt", i = {0}, l = {411}, m = "invokeSuspend", n = {"event"}, nl = {412}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalAddCardStateKt$toPayPalAddCardState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent threeDsEvent = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> on3dsAuth = ((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification) this.getHighSpeedVideoFpsRangesFor).getOn3dsAuth();
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent access$toAddCardState3dsEvent = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.access$toAddCardState3dsEvent(threeDsEvent);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(threeDsEvent);
            this.getHighSpeedVideoSizes = 1;
            if (on3dsAuth.invoke(access$toAddCardState3dsEvent, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent threeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt$toPayPalAddCardState$1) create(threeDsEvent, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt$toPayPalAddCardState$1 payPalAddCardStateKt$toPayPalAddCardState$1 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt$toPayPalAddCardState$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        payPalAddCardStateKt$toPayPalAddCardState$1.Camera2StreamConfigurationMap = obj;
        return payPalAddCardStateKt$toPayPalAddCardState$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalAddCardStateKt$toPayPalAddCardState$1(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt$toPayPalAddCardState$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addCardState;
    }
}
