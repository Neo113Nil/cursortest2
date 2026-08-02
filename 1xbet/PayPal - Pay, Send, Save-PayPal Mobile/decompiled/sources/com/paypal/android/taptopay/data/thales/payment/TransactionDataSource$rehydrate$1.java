package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.TransactionDataSource$rehydrate$1", f = "TransactionDataSource.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TransactionDataSource$rehydrate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.TransactionDataSource getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            if (mutableSharedFlow.emit(this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
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
        return ((com.paypal.android.taptopay.data.thales.payment.TransactionDataSource$rehydrate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.payment.TransactionDataSource$rehydrate$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionDataSource$rehydrate$1(com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource, java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction> list, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.TransactionDataSource$rehydrate$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = transactionDataSource;
        this.getHighSpeedVideoSizes = list;
    }
}
