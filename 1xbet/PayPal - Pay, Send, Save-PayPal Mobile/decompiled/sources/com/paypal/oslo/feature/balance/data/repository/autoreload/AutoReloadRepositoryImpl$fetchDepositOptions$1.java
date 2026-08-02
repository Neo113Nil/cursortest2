package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl", f = "AutoReloadRepositoryImpl.kt", i = {0}, l = {57}, m = "fetchDepositOptions", n = {"amount"}, nl = {61}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class AutoReloadRepositoryImpl$fetchDepositOptions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.fetchDepositOptions(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadRepositoryImpl$fetchDepositOptions$1(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl autoReloadRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchDepositOptions$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = autoReloadRepositoryImpl;
    }
}
