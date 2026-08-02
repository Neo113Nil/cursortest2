package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$8$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(int i) {
        ((com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel) this.receiver).selectColor(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
        getHighSpeedVideoFpsRanges(num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    ScreenshotAnnotationScreenKt$ScreenshotAnnotationScreen$state$8$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.class, "selectColor", "selectColor(I)V", 0);
    }
}
