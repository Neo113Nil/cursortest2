package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges() {
        ((com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel) this.receiver).startAnnotating();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$1$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.class, "startAnnotating", "startAnnotating()V", 0);
    }
}
