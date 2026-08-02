package com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class AcquisitionLandingScreenKt$AcquisitionLandingScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent acquisitionLandingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel) this.receiver).processEvent(acquisitionLandingEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent acquisitionLandingEvent) {
        getHighSpeedVideoSizes(acquisitionLandingEvent);
        return kotlin.Unit.INSTANCE;
    }

    AcquisitionLandingScreenKt$AcquisitionLandingScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;)V", 0);
    }
}
