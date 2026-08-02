package com.paypal.oslo.feature.balance.data.repository.balance;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl", f = "BalanceRepositoryImpl.kt", i = {0, 0}, l = {67}, m = "fetchBalance", n = {"query", "apolloCall"}, nl = {303}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class BalanceRepositoryImpl$fetchBalance$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.fetchBalance(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceRepositoryImpl$fetchBalance$1(com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl balanceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalance$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = balanceRepositoryImpl;
    }
}
