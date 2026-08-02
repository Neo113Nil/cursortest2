package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl", f = "AutoReloadRepositoryImpl.kt", i = {}, l = {66}, m = "fetchSavingsAccounts", n = {}, nl = {67}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AutoReloadRepositoryImpl$fetchSavingsAccounts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchSavingsAccounts(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadRepositoryImpl$fetchSavingsAccounts$1(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl autoReloadRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchSavingsAccounts$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = autoReloadRepositoryImpl;
    }
}
