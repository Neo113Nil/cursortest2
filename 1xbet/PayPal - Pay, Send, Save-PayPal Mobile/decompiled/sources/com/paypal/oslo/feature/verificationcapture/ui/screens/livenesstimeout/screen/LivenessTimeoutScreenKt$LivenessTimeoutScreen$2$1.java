package com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class LivenessTimeoutScreenKt$LivenessTimeoutScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract.LivenessTimeoutEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract.LivenessTimeoutEvent livenessTimeoutEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(livenessTimeoutEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel) this.receiver).processEvent(livenessTimeoutEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract.LivenessTimeoutEvent livenessTimeoutEvent) {
        getHighSpeedVideoSizes(livenessTimeoutEvent);
        return kotlin.Unit.INSTANCE;
    }

    LivenessTimeoutScreenKt$LivenessTimeoutScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenesstimeout/contract/LivenessTimeoutEvent;)V", 0);
    }
}
