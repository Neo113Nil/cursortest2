package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel", f = "CryptoSellReviewViewModel.kt", i = {0}, l = {com.visa.cbp.getCertUsage.getAucAID}, m = "generateInitialQuote$cryptocurrency_prodRelease", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION}, nl = {338}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSellReviewViewModel$generateInitialQuote$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.generateInitialQuote$cryptocurrency_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSellReviewViewModel$generateInitialQuote$1(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$generateInitialQuote$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = cryptoSellReviewViewModel;
    }
}
