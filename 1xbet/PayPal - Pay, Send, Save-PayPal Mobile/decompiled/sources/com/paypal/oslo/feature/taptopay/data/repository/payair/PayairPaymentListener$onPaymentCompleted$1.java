package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$onPaymentCompleted$1", f = "PayairPaymentListener.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, nl = {94}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PayairPaymentListener$onPaymentCompleted$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.payair.listener.model.TransactionEventData getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.payair.listener.model.TransactionEventData transactionEventData = this.getHighSpeedVideoSizes;
            if (transactionEventData != null && transactionEventData.getTransactionAccepted()) {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.access$mapTransactionContext(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure access$mapTransactionStatus = com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.access$mapTransactionStatus(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Mapped transaction failure state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", access$mapTransactionStatus)), null, 4, null);
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(access$mapTransactionStatus);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionContext transactionContext = (com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionContext) obj;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Mapped transaction context", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transactionContext", transactionContext)), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted(transactionContext));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$onPaymentCompleted$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$onPaymentCompleted$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairPaymentListener$onPaymentCompleted$1(com.payair.listener.model.TransactionEventData transactionEventData, com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$onPaymentCompleted$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = transactionEventData;
        this.getHighSpeedVideoFpsRangesFor = payairPaymentListener;
        this.Camera2StreamConfigurationMap = str;
    }
}
