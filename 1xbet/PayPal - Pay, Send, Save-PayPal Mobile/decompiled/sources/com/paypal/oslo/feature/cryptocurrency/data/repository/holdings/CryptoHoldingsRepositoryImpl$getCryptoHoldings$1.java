package com.paypal.oslo.feature.cryptocurrency.data.repository.holdings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl", f = "CryptoHoldingsRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {61}, m = "getCryptoHoldings", n = {"currencyCode", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "raise$iv$iv$iv", "$this$getCryptoHoldings_u24lambda_u240", "apolloCall", "query", "forceNetwork", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoHoldingsRepositoryImpl$getCryptoHoldings$2"}, nl = {62}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoHoldingsRepositoryImpl$getCryptoHoldings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    boolean getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.getCryptoHoldings(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHoldingsRepositoryImpl$getCryptoHoldings$1(com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl cryptoHoldingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl$getCryptoHoldings$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = cryptoHoldingsRepositoryImpl;
    }
}
