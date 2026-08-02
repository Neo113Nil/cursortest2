package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel", f = "CryptoAssetSelectionViewModel.kt", i = {}, l = {150}, m = "fetchPyusdRewardsRate", n = {}, nl = {151}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel cryptoAssetSelectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cryptoAssetSelectionViewModel;
    }
}
