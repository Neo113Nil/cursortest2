package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel", f = "FaceTecLivenessCaptureViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "performLivenessCheck", n = {"context"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class FaceTecLivenessCaptureViewModel$performLivenessCheck$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.access$performLivenessCheck(this.getHighResolutionOutputSizeshNQ4ISI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceTecLivenessCaptureViewModel$performLivenessCheck$1(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel faceTecLivenessCaptureViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$performLivenessCheck$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = faceTecLivenessCaptureViewModel;
    }
}
