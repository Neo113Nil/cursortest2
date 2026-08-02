package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel", f = "FaceTecLivenessCaptureViewModel.kt", i = {0, 0, 0}, l = {192}, m = "initializeSdk", n = {"deviceKeyIdentifier", "productionKey", "licenseExpirationDate"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class FaceTecLivenessCaptureViewModel$initializeSdk$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.access$initializeSdk(this.getHighSpeedVideoSizesFor, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceTecLivenessCaptureViewModel$initializeSdk$1(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel faceTecLivenessCaptureViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$initializeSdk$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = faceTecLivenessCaptureViewModel;
    }
}
