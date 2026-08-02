package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl", f = "AutoReloadRepositoryImpl.kt", i = {0}, l = {51}, m = "fetchAutoReloadConfig", n = {"force"}, nl = {52}, s = {"Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class AutoReloadRepositoryImpl$fetchAutoReloadConfig$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl Camera2StreamConfigurationMap;
    boolean getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchAutoReloadConfig(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadRepositoryImpl$fetchAutoReloadConfig$1(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl autoReloadRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchAutoReloadConfig$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = autoReloadRepositoryImpl;
    }
}
