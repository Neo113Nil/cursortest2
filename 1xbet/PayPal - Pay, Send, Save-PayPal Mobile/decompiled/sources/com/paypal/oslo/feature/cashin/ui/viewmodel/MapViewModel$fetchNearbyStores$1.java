package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel", f = "MapViewModel.kt", i = {0, 0}, l = {108}, m = "fetchNearbyStores", n = {"latitude", "longitude"}, nl = {109}, s = {"D$0", "D$1"}, v = 2)
/* loaded from: classes11.dex */
final class MapViewModel$fetchNearbyStores$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel getHighSpeedVideoFpsRanges;
    double getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(0.0d, 0.0d, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapViewModel$fetchNearbyStores$1(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$fetchNearbyStores$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mapViewModel;
    }
}
