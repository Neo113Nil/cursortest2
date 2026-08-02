package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class DocumentReviewScreenKt$DocumentReviewScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent documentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentReviewEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel) this.receiver).processEvent(documentReviewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent documentReviewEvent) {
        Camera2StreamConfigurationMap(documentReviewEvent);
        return kotlin.Unit.INSTANCE;
    }

    DocumentReviewScreenKt$DocumentReviewScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;)V", 0);
    }
}
