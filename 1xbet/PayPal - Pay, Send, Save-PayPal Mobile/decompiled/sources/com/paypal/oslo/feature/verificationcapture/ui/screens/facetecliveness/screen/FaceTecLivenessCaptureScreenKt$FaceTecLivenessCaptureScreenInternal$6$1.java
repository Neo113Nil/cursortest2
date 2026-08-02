package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent faceTecLivenessCaptureEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceTecLivenessCaptureEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel) this.receiver).processEvent(faceTecLivenessCaptureEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent faceTecLivenessCaptureEvent) {
        getHighSpeedVideoSizes(faceTecLivenessCaptureEvent);
        return kotlin.Unit.INSTANCE;
    }

    FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureEvent;)V", 0);
    }
}
