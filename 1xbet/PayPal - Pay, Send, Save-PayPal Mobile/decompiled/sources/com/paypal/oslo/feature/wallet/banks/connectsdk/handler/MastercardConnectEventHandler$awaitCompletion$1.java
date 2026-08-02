package com.paypal.oslo.feature.wallet.banks.connectsdk.handler;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler", f = "MastercardConnectEventHandler.kt", i = {0}, l = {82}, m = "awaitCompletion", n = {"timeoutMs"}, nl = {85}, s = {"J$0"}, v = 2)
/* loaded from: classes15.dex */
final class MastercardConnectEventHandler$awaitCompletion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.awaitCompletion(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MastercardConnectEventHandler$awaitCompletion$1(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitCompletion$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mastercardConnectEventHandler;
    }
}
