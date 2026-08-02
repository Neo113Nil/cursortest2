package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository", f = "MockCryptoFundingRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "evaluateEligibleFundingOptions", n = {"action", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "amount", "currencyCode", "quoteQuantity"}, nl = {53}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes12.dex */
final class MockCryptoFundingRepository$evaluateEligibleFundingOptions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.evaluateEligibleFundingOptions(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCryptoFundingRepository$evaluateEligibleFundingOptions$1(com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository mockCryptoFundingRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository$evaluateEligibleFundingOptions$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = mockCryptoFundingRepository;
    }
}
