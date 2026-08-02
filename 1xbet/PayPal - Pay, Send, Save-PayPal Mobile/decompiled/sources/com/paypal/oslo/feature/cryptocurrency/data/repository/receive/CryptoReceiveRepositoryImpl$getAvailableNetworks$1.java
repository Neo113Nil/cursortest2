package com.paypal.oslo.feature.cryptocurrency.data.repository.receive;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl", f = "CryptoReceiveRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {111}, m = "getAvailableNetworks", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "raise$iv$iv$iv", "$this$getAvailableNetworks_u24lambda_u240", "query", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoReceiveRepositoryImpl$getAvailableNetworks$2"}, nl = {112}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoReceiveRepositoryImpl$getAvailableNetworks$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.getAvailableNetworks(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoReceiveRepositoryImpl$getAvailableNetworks$1(com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl cryptoReceiveRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$getAvailableNetworks$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = cryptoReceiveRepositoryImpl;
    }
}
