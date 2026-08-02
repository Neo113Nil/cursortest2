package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$9$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(float f) {
        ((com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel) this.receiver).changePenSize(f);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
        Camera2StreamConfigurationMap(f.floatValue());
        return kotlin.Unit.INSTANCE;
    }

    ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$9$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.class, "changePenSize", "changePenSize(F)V", 0);
    }
}
