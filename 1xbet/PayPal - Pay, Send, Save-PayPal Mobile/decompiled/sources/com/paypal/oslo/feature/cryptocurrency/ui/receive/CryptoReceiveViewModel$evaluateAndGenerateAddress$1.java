package com.paypal.oslo.feature.cryptocurrency.ui.receive;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel", f = "CryptoReceiveViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {339, 367}, m = "evaluateAndGenerateAddress", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "blockchain", "onSuccess", "clientTrackingId", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "blockchain", "onSuccess", "clientTrackingId", "evaluationResult", "this_$iv", "evaluation", "$i$f$fold", "$i$a$-fold-CryptoReceiveViewModel$evaluateAndGenerateAddress$3"}, nl = {my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, 374}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoReceiveViewModel$evaluateAndGenerateAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.access$evaluateAndGenerateAddress(this.getOutputStallDuration, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoReceiveViewModel$evaluateAndGenerateAddress$1(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$evaluateAndGenerateAddress$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = cryptoReceiveViewModel;
    }
}
