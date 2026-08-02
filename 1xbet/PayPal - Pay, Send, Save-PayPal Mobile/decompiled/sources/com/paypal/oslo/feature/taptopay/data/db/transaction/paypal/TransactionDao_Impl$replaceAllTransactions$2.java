package com.paypal.oslo.feature.taptopay.data.db.transaction.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$replaceAllTransactions$2", f = "TransactionDao_Impl.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, nl = {129}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TransactionDao_Impl$replaceAllTransactions$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object replaceAllTransactions;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            replaceAllTransactions = super/*com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao*/.replaceAllTransactions(this.getHighSpeedVideoFpsRanges, this);
            if (replaceAllTransactions == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$replaceAllTransactions$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$replaceAllTransactions$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionDao_Impl$replaceAllTransactions$2(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl transactionDao_Impl, java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$replaceAllTransactions$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = transactionDao_Impl;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
