package com.paypal.oslo.feature.activity.domain.base.utils.logs;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u0012J#\u0010\u001a\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0000¢\u0006\u0004\b\u001a\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/logs/ActivityLogUtils;", "", "<init>", "()V", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "logWebViewDebug$activity_prodRelease", "(Ljava/util/Map;)V", "operationName", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "logDateParsingException$activity_prodRelease", "(Ljava/lang/String;Ljava/lang/Exception;)V", "logDeepLinkParsingException$activity_prodRelease", "logUserStateError$activity_prodRelease", "(Ljava/lang/String;)V", "logUserStateException$activity_prodRelease", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "logRecentActivitiesException$activity_prodRelease", "(Ljava/lang/String;Ljava/lang/Throwable;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "logUnknownActionType$activity_prodRelease", "logActivitySearchSuggestionsException$activity_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLogUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils();

    private ActivityLogUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logWebViewDebug$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils activityLogUtils, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        activityLogUtils.logWebViewDebug$activity_prodRelease(map);
    }

    public final void logWebViewDebug$activity_prodRelease(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_ACTIVITY_COMMON_WEBVIEW, attributes, null, 4, null);
    }

    public final void logDateParsingException$activity_prodRelease(java.lang.String operationName, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        java.lang.String message = exception.getMessage();
        pairArr[1] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(exception));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_ERROR_DATE_PARSING, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final void logDeepLinkParsingException$activity_prodRelease(java.lang.String operationName, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        java.lang.String message = exception.getMessage();
        pairArr[1] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(exception));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_ERROR_DEEP_LINK_PARSING, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final void logUserStateError$activity_prodRelease(java.lang.String operationName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_LEDGER_USER_PROFILE_NOT_AVAILABLE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName)), null, 4, null);
    }

    public final void logUserStateException$activity_prodRelease(java.lang.String operationName, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        java.lang.String message = exception.getMessage();
        pairArr[1] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_LEDGER_USER_PROFILE_NOT_AVAILABLE, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final void logRecentActivitiesException$activity_prodRelease(java.lang.String operationName, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        java.lang.String message = throwable.getMessage();
        pairArr[1] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(throwable));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_EXCEPTION_FETCH_RECENT_ITEMS, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final void logUnknownActionType$activity_prodRelease(java.lang.String actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_UNKNOWN_ACTION_TYPE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ACTION_TYPE, actionType)), null, 4, null);
    }

    public final void logActivitySearchSuggestionsException$activity_prodRelease(java.lang.String operationName, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, operationName);
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, exception.getClass().getSimpleName());
        java.lang.String message = exception.getMessage();
        pairArr[2] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
        pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(exception));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_EXCEPTION_FETCH_SEARCH_SUGGESTIONS, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }
}
