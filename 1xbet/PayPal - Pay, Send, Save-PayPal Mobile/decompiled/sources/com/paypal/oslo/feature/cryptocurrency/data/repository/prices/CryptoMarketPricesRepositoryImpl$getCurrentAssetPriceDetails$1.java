package com.paypal.oslo.feature.cryptocurrency.data.repository.prices;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl", f = "CryptoMarketPricesRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {89}, m = "getCurrentAssetPriceDetails", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "currencyCode", "raise$iv$iv$iv", "$this$getCurrentAssetPriceDetails_u24lambda_u240", "query", "apolloCall", "forceNetwork", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$2"}, nl = {90}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizes.getCurrentAssetPriceDetails(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1(com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl cryptoMarketPricesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getCurrentAssetPriceDetails$1> continuation) {
        super(continuation);
        this.getOutputSizes = cryptoMarketPricesRepositoryImpl;
    }
}
