package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool annotationTool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationTool, "");
        ((com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel) this.receiver).selectTool(annotationTool);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool annotationTool) {
        getHighSpeedVideoSizes(annotationTool);
        return kotlin.Unit.INSTANCE;
    }

    ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.class, "selectTool", "selectTool(Lcom/paypal/oslo/feature/shaketoreport/ui/AnnotationTool;)V", 0);
    }
}
