package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl", f = "VirtualBankAccountRepositoryImpl.kt", i = {0}, l = {52}, m = "getVba", n = {"query"}, nl = {53}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class VirtualBankAccountRepositoryImpl$getVba$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getVba(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualBankAccountRepositoryImpl$getVba$1(com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl virtualBankAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl$getVba$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = virtualBankAccountRepositoryImpl;
    }
}
