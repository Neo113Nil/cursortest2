package com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class LivenessReviewScreenKt$LivenessReviewScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent livenessReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(livenessReviewEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel) this.receiver).processEvent(livenessReviewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent livenessReviewEvent) {
        getHighSpeedVideoFpsRangesFor(livenessReviewEvent);
        return kotlin.Unit.INSTANCE;
    }

    LivenessReviewScreenKt$LivenessReviewScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;)V", 0);
    }
}
