package com.paypal.oslo.feature.cryptocurrency.data.repository.receive;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl", f = "CryptoReceiveRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {58}, m = "evaluateCryptocurrencyTrade", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "transactionTrackingId", "raise$iv$iv$iv", "$this$evaluateCryptocurrencyTrade_u24lambda_u240", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$2"}, nl = {59}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl getOutputSizeshNQ4ISI;
    int getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.evaluateCryptocurrencyTrade(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1(com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl cryptoReceiveRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl$evaluateCryptocurrencyTrade$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = cryptoReceiveRepositoryImpl;
    }
}
