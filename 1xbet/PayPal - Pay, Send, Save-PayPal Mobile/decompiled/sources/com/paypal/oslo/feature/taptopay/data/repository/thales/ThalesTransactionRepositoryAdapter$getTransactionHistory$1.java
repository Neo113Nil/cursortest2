package com.paypal.oslo.feature.taptopay.data.repository.thales;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter", f = "ThalesTransactionRepositoryAdapter.kt", i = {0, 0}, l = {45}, m = "getTransactionHistory", n = {"digitizedCardId", "from"}, nl = {46}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ThalesTransactionRepositoryAdapter$getTransactionHistory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getTransactionHistory(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesTransactionRepositoryAdapter$getTransactionHistory$1(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter thalesTransactionRepositoryAdapter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$getTransactionHistory$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = thalesTransactionRepositoryAdapter;
    }
}
