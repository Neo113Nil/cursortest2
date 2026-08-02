package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ManualUploadScreenKt$ManualUploadScreen$13$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent manualUploadEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manualUploadEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel) this.receiver).handleEvent(manualUploadEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent manualUploadEvent) {
        Camera2StreamConfigurationMap(manualUploadEvent);
        return kotlin.Unit.INSTANCE;
    }

    ManualUploadScreenKt$ManualUploadScreen$13$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel.class, "handleEvent", "handleEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;)V", 0);
    }
}
