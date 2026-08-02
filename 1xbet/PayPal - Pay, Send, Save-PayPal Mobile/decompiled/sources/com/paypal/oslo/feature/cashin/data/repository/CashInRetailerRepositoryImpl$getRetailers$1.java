package com.paypal.oslo.feature.cashin.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl", f = "CashInRetailerRepositoryImpl.kt", i = {0}, l = {37}, m = "getRetailers", n = {"query"}, nl = {61}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class CashInRetailerRepositoryImpl$getRetailers$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getRetailers(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInRetailerRepositoryImpl$getRetailers$1(com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl cashInRetailerRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl$getRetailers$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cashInRetailerRepositoryImpl;
    }
}
