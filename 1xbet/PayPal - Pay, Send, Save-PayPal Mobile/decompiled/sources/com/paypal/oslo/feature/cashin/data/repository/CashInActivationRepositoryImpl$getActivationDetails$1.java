package com.paypal.oslo.feature.cashin.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl", f = "CashInActivationRepositoryImpl.kt", i = {0, 0, 0}, l = {43}, m = "getActivationDetails", n = {"partnerId", "retailerId", "query"}, nl = {68}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class CashInActivationRepositoryImpl$getActivationDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getActivationDetails(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInActivationRepositoryImpl$getActivationDetails$1(com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl cashInActivationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl$getActivationDetails$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = cashInActivationRepositoryImpl;
    }
}
