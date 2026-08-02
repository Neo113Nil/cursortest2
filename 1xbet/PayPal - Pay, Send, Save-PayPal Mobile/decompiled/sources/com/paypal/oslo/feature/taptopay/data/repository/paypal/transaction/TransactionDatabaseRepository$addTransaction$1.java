package com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository", f = "TransactionDatabaseRepository.kt", i = {0, 0, 0}, l = {38}, m = "addTransaction", n = {"transaction", "$this$addTransaction_u24lambda_u240", "$i$a$-runCatching-TransactionDatabaseRepository$addTransaction$2"}, nl = {39}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class TransactionDatabaseRepository$addTransaction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.addTransaction(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionDatabaseRepository$addTransaction$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository transactionDatabaseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$addTransaction$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = transactionDatabaseRepository;
    }
}
