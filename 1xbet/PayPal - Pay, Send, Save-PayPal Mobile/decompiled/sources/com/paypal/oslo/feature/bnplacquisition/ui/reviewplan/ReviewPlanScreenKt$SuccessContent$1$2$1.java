package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ReviewPlanScreenKt$SuccessContent$1$2$1 implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, kotlin.Unit> Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        this.Camera2StreamConfigurationMap.invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    ReviewPlanScreenKt$SuccessContent$1$2$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = function1;
    }
}
