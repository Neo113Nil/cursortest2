package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ReviewPlanScreenKt$SuccessContent$1$6$1 implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed(str2));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    ReviewPlanScreenKt$SuccessContent$1$6$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = function1;
    }
}
