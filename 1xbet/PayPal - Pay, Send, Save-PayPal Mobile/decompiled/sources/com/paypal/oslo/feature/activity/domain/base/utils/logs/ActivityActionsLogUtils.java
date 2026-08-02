package com.paypal.oslo.feature.activity.domain.base.utils.logs;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\tJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/logs/ActivityActionsLogUtils;", "", "<init>", "()V", "", "operationName", "message", "", "logPackageTrackingLinkStatus$activity_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "logActivityDeepLinkActionInfo$activity_prodRelease", "logActivityActionInfo$activity_prodRelease", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "logActivityActionException$activity_prodRelease", "(Ljava/lang/String;Ljava/lang/Exception;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionsLogUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils();

    private ActivityActionsLogUtils() {
    }

    public final void logPackageTrackingLinkStatus$activity_prodRelease(java.lang.String operationName, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        if (message == null) {
            message = "";
        }
        pairArr[1] = kotlin.TuplesKt.to("error_message", message);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_PACKAGE_TRACKING_EXECUTION, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final void logActivityDeepLinkActionInfo$activity_prodRelease(java.lang.String operationName, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        if (message == null) {
            message = "";
        }
        pairArr[1] = kotlin.TuplesKt.to("error_message", message);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_ACTIONS_DEEPLINK_EXECUTION, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final void logActivityActionInfo$activity_prodRelease(java.lang.String operationName, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        if (message == null) {
            message = "";
        }
        pairArr[1] = kotlin.TuplesKt.to("error_message", message);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_ACTIONS_EXECUTION, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final void logActivityActionException$activity_prodRelease(java.lang.String operationName, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        java.lang.String message = exception.getMessage();
        pairArr[1] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(exception));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_ACTIONS_EXECUTION, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }
}
