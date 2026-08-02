package com.paypal.oslo.feature.balance.data.repository.balance;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl", f = "BalanceRepositoryImpl.kt", i = {}, l = {82}, m = "fetchBalanceId", n = {}, nl = {303}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class BalanceRepositoryImpl$fetchBalanceId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchBalanceId(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceRepositoryImpl$fetchBalanceId$1(com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl balanceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalanceId$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = balanceRepositoryImpl;
    }
}
