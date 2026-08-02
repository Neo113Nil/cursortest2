package com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase", f = "GetAssetHoldingUseCase.kt", i = {0, 0, 0}, l = {47}, m = "invoke", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "currencyCode", "resolvedCurrencyCode"}, nl = {50}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class GetAssetHoldingUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAssetHoldingUseCase$invoke$1(com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = getAssetHoldingUseCase;
    }
}
