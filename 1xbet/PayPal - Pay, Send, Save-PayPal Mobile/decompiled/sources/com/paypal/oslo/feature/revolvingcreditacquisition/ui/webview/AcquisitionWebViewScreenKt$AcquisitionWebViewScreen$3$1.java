package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class AcquisitionWebViewScreenKt$AcquisitionWebViewScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent acquisitionWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionWebViewEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel) this.receiver).processEvent(acquisitionWebViewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent acquisitionWebViewEvent) {
        Camera2StreamConfigurationMap(acquisitionWebViewEvent);
        return kotlin.Unit.INSTANCE;
    }

    AcquisitionWebViewScreenKt$AcquisitionWebViewScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;)V", 0);
    }
}
