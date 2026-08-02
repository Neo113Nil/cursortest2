package com.paypal.oslo.feature.cryptocurrency.data.repository.prices;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl", f = "CryptoMarketPricesRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "getAssetPriceHistory", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "currencyCode", "priceTimeRange", "raise$iv$iv$iv", "$this$getAssetPriceHistory_u24lambda_u240", "query", "timeRange", "apolloCall", "forceNetwork", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl isOutputSupportedFor;
    /* synthetic */ java.lang.Object toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.toString = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.getAssetPriceHistory(null, null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1(com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl cryptoMarketPricesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl$getAssetPriceHistory$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = cryptoMarketPricesRepositoryImpl;
    }
}
