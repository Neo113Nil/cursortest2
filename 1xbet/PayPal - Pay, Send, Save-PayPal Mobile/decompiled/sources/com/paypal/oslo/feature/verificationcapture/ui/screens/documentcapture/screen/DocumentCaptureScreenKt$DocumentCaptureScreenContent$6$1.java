package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class DocumentCaptureScreenKt$DocumentCaptureScreenContent$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent documentCaptureEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCaptureEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel) this.receiver).processEvent(documentCaptureEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent documentCaptureEvent) {
        getHighSpeedVideoFpsRanges(documentCaptureEvent);
        return kotlin.Unit.INSTANCE;
    }

    DocumentCaptureScreenKt$DocumentCaptureScreenContent$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureEvent;)V", 0);
    }
}
