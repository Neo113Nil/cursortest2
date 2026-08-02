package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl", f = "DepositSwitchDDRepositoryImpl.kt", i = {0}, l = {51}, m = "getPublicToken", n = {"query"}, nl = {52}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DepositSwitchDDRepositoryImpl$getPublicToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getPublicToken(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DepositSwitchDDRepositoryImpl$getPublicToken$1(com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl depositSwitchDDRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$getPublicToken$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = depositSwitchDDRepositoryImpl;
    }
}
