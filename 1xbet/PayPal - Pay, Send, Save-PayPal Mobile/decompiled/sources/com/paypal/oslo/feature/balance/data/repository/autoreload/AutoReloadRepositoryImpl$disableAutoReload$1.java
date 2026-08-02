package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl", f = "AutoReloadRepositoryImpl.kt", i = {0}, l = {72}, m = "disableAutoReload", n = {"scheduleType"}, nl = {73}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class AutoReloadRepositoryImpl$disableAutoReload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.disableAutoReload(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadRepositoryImpl$disableAutoReload$1(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl autoReloadRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$disableAutoReload$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = autoReloadRepositoryImpl;
    }
}
