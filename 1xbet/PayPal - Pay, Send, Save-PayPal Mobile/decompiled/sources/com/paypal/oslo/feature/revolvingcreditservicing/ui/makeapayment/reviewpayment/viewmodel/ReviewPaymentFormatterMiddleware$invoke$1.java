package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware$invoke$1", f = "ReviewPaymentFormatterMiddleware.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ReviewPaymentFormatterMiddleware$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState second = this.Camera2StreamConfigurationMap.getStates().getSecond();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent event = this.Camera2StreamConfigurationMap.getEvent();
        if ((second instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready) && (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected)) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware.access$format(this.getHighSpeedVideoSizes, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready) second, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected) event, this.Camera2StreamConfigurationMap.getEventDispatcher());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPaymentFormatterMiddleware$invoke$1(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> input, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware reviewPaymentFormatterMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = input;
        this.getHighSpeedVideoSizes = reviewPaymentFormatterMiddleware;
    }
}
