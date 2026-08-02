package com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository", f = "TransactionDatabaseRepository.kt", i = {0}, l = {30}, m = "getTransactionHistory", n = {"cardId"}, nl = {84}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class TransactionDatabaseRepository$getTransactionHistory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getTransactionHistory(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionDatabaseRepository$getTransactionHistory$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository transactionDatabaseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$getTransactionHistory$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = transactionDatabaseRepository;
    }
}
