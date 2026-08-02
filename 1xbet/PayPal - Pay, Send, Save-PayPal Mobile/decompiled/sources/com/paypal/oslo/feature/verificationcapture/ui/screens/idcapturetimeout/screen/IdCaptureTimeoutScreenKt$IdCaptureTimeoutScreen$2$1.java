package com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent idCaptureTimeoutEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idCaptureTimeoutEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel) this.receiver).processEvent(idCaptureTimeoutEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent idCaptureTimeoutEvent) {
        getHighSpeedVideoFpsRangesFor(idCaptureTimeoutEvent);
        return kotlin.Unit.INSTANCE;
    }

    IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent;)V", 0);
    }
}
