package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository", f = "MockCryptoQuoteRepository.kt", i = {0, 0, 0, 0, 0, 0}, l = {48}, m = "generateQuote", n = {"action", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "fiatCurrencyCode", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteFiatAmount", "quoteQuantity"}, nl = {51}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes12.dex */
final class MockCryptoQuoteRepository$generateQuote$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.generateQuote(null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCryptoQuoteRepository$generateQuote$1(com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository mockCryptoQuoteRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository$generateQuote$1> continuation) {
        super(continuation);
        this.getOutputFormats = mockCryptoQuoteRepository;
    }
}
