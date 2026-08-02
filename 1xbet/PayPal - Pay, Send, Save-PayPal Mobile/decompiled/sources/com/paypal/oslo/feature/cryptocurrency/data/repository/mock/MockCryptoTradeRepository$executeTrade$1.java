package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository", f = "MockCryptoTradeRepository.kt", i = {0, 0, 0, 0}, l = {47}, m = "executeTrade", n = {"action", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteId", "pyusdRewardsOptIn"}, nl = {50}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class MockCryptoTradeRepository$executeTrade$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.executeTrade(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCryptoTradeRepository$executeTrade$1(com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository mockCryptoTradeRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository$executeTrade$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = mockCryptoTradeRepository;
    }
}
