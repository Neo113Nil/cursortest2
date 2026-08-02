package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class BugReportScreenKt$BugReportScreen$4$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel) this.receiver).updateStepsToReproduce(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI(str);
        return kotlin.Unit.INSTANCE;
    }

    BugReportScreenKt$BugReportScreen$4$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel.class, "updateStepsToReproduce", "updateStepsToReproduce(Ljava/lang/String;)V", 0);
    }
}
