package com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent verificationCaptureTutorialEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureTutorialEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel) this.receiver).processEvent(verificationCaptureTutorialEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent verificationCaptureTutorialEvent) {
        getHighSpeedVideoFpsRanges(verificationCaptureTutorialEvent);
        return kotlin.Unit.INSTANCE;
    }

    VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;)V", 0);
    }
}
