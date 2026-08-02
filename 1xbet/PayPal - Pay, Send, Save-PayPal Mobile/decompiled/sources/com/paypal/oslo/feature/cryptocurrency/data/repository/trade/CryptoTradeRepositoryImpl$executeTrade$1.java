package com.paypal.oslo.feature.cryptocurrency.data.repository.trade;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl", f = "CryptoTradeRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {64}, m = "executeTrade", n = {"action", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteId", "pyusdRewardsOptIn", "raise$iv$iv$iv", "$this$executeTrade_u24lambda_u240", "actionPreference", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoTradeRepositoryImpl$executeTrade$2"}, nl = {65}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoTradeRepositoryImpl$executeTrade$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.isOutputSupportedForhNQ4ISI.executeTrade(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTradeRepositoryImpl$executeTrade$1(com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl cryptoTradeRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl$executeTrade$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = cryptoTradeRepositoryImpl;
    }
}
