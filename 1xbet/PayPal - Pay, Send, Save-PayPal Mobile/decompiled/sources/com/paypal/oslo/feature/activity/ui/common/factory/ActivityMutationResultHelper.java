package com.paypal.oslo.feature.activity.ui.common.factory;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/common/factory/ActivityMutationResultHelper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityMutationsResult;", "result", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "", "ifLeft", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult;", "ifRight", "setActivityMutationsResult$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityMutationsResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityMutationResultHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.common.factory.ActivityMutationResultHelper INSTANCE = new com.paypal.oslo.feature.activity.ui.common.factory.ActivityMutationResultHelper();

    private ActivityMutationResultHelper() {
    }

    public final void setActivityMutationsResult$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult result, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, kotlin.Unit> ifLeft, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult, kotlin.Unit> ifRight) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifLeft, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifRight, "");
        arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> data = result.getData();
        if (data instanceof arrow.core.Ior.Left) {
            ifLeft.invoke(((arrow.core.Ior.Left) data).getValue());
            return;
        }
        if (data instanceof arrow.core.Ior.Right) {
            Camera2StreamConfigurationMap((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Ior.Right) data).getValue(), ifRight);
        } else {
            if (!(data instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) data;
            ifLeft.invoke(both.getLeftValue());
            Camera2StreamConfigurationMap((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) both.getRightValue(), ifRight);
        }
    }

    private static void Camera2StreamConfigurationMap(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult, kotlin.Unit> p1) {
        if ((p0.getData() instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult) && kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult) p0.getData()).getStatus(), "COMPLETED", true)) {
            p1.invoke(p0.getData());
        }
    }
}
