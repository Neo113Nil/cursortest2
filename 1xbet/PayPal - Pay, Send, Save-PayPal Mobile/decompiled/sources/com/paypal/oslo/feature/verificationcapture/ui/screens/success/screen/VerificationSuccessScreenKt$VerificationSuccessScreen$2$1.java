package com.paypal.oslo.feature.verificationcapture.ui.screens.success.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class VerificationSuccessScreenKt$VerificationSuccessScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessEvent verificationSuccessEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationSuccessEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel) this.receiver).processEvent(verificationSuccessEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessEvent verificationSuccessEvent) {
        getHighSpeedVideoFpsRangesFor(verificationSuccessEvent);
        return kotlin.Unit.INSTANCE;
    }

    VerificationSuccessScreenKt$VerificationSuccessScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessEvent;)V", 0);
    }
}
