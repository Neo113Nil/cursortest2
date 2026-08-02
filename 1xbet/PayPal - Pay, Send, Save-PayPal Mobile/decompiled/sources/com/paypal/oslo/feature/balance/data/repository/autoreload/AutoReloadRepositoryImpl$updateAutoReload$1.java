package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl", f = "AutoReloadRepositoryImpl.kt", i = {0}, l = {86}, m = "updateAutoReload", n = {"request"}, nl = {87}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class AutoReloadRepositoryImpl$updateAutoReload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.updateAutoReload(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadRepositoryImpl$updateAutoReload$1(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl autoReloadRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$updateAutoReload$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = autoReloadRepositoryImpl;
    }
}
