package com.paypal.oslo.feature.cryptocurrency.data.repository.quote;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl", f = "CryptoQuoteRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {75}, m = "generateQuote", n = {"action", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "fiatCurrencyCode", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteFiatAmount", "quoteQuantity", "raise$iv$iv$iv", "$this$generateQuote_u24lambda_u240", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoQuoteRepositoryImpl$generateQuote$2"}, nl = {76}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoQuoteRepositoryImpl$generateQuote$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl isOutputSupportedFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getValidOutputFormatsForInputhNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.generateQuote(null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuoteRepositoryImpl$generateQuote$1(com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl cryptoQuoteRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl$generateQuote$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = cryptoQuoteRepositoryImpl;
    }
}
