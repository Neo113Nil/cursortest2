package com.ingo.sdk.kotlin.common.features.submit_transaction;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl", f = "SubmitTransactionRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {29, 30}, m = "submitTransaction", n = {"transactionReferenceNumber", "promoCode", "accountIdentifier", "fundsTiming"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes9.dex */
final class SubmitTransactionRepositoryImpl$submitTransaction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.submitTransaction(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitTransactionRepositoryImpl$submitTransaction$1(com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl submitTransactionRepositoryImpl, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl$submitTransaction$1> continuation) {
        super(continuation);
        this.getOutputFormats = submitTransactionRepositoryImpl;
    }
}
