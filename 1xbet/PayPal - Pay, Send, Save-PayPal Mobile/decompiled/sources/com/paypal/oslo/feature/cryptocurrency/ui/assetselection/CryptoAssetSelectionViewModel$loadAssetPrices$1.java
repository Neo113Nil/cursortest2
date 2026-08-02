package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel", f = "CryptoAssetSelectionViewModel.kt", i = {1}, l = {119, 134}, m = "loadAssetPrices", n = {"marketPrices"}, nl = {120, 136}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoAssetSelectionViewModel$loadAssetPrices$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.access$loadAssetPrices(this.getHighSpeedVideoSizes, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAssetSelectionViewModel$loadAssetPrices$1(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel cryptoAssetSelectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetPrices$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = cryptoAssetSelectionViewModel;
    }
}
