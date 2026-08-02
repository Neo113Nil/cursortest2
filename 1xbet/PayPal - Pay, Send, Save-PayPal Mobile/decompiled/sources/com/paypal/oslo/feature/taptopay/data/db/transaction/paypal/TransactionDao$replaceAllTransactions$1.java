package com.paypal.oslo.feature.taptopay.data.db.transaction.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao", f = "TransactionDao.kt", i = {0, 0, 1, 1}, l = {41, 42}, m = "replaceAllTransactions$suspendImpl", n = {"$this", "transactionEntities", "$this", "transactionEntities"}, nl = {42, 43}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class TransactionDao$replaceAllTransactions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao.replaceAllTransactions$suspendImpl(this.getHighSpeedVideoFpsRanges, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionDao$replaceAllTransactions$1(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao$replaceAllTransactions$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = transactionDao;
    }
}
