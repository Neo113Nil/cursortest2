package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1$1", f = "CryptoHubViewModel.kt", i = {0}, l = {119}, m = "emit", n = {"pollingData"}, nl = {121}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoHubViewModel$startPolling$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1.AnonymousClass1<T> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CryptoHubViewModel$startPolling$1$1$emit$1(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1$1$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = anonymousClass1;
    }
}
