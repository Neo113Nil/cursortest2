package com.paypal.oslo.feature.balance.data.repository.balance;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl", f = "BalanceRepositoryImpl.kt", i = {0, 0}, l = {109}, m = "fetchTaxHoldPolicy", n = {"query", "apolloCall"}, nl = {303}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class BalanceRepositoryImpl$fetchTaxHoldPolicy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.fetchTaxHoldPolicy(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceRepositoryImpl$fetchTaxHoldPolicy$1(com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl balanceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchTaxHoldPolicy$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = balanceRepositoryImpl;
    }
}
