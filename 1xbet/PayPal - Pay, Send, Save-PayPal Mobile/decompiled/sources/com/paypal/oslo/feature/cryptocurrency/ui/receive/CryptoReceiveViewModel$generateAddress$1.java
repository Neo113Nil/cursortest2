package com.paypal.oslo.feature.cryptocurrency.ui.receive;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel", f = "CryptoReceiveViewModel.kt", i = {0, 0, 0, 0}, l = {299}, m = "generateAddress", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "blockchain", "transactionTrackingId", "onSuccess"}, nl = {306}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoReceiveViewModel$generateAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.access$generateAddress(this.getOutputMinFrameDuration, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoReceiveViewModel$generateAddress$1(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$generateAddress$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = cryptoReceiveViewModel;
    }
}
