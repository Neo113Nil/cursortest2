package com.paypal.oslo.feature.wallet.banks.connectsdk.handler;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler", f = "MastercardConnectEventHandler.kt", i = {0}, l = {100}, m = "awaitSessionId", n = {"timeoutMs"}, nl = {103}, s = {"J$0"}, v = 2)
/* loaded from: classes15.dex */
final class MastercardConnectEventHandler$awaitSessionId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.awaitSessionId(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MastercardConnectEventHandler$awaitSessionId$1(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mastercardConnectEventHandler;
    }
}
