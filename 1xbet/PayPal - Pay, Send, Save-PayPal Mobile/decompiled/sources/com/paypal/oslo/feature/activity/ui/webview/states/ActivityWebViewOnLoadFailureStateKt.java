package com.paypal.oslo.feature.activity.ui.webview.states;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "error", "", "onLoadFailed", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWebViewOnLoadFailureStateKt {
    public static final void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewError, "");
        if (secureWebViewError instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl) {
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl unauthorizedUrl = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl) secureWebViewError;
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logWebViewDebug$activity_prodRelease(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_UN_AUTH_WEBVIEW_URL_PARAM, unauthorizedUrl.getUrl()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_UN_AUTH_WEBVIEW_REASON, unauthorizedUrl.getError().getCode().name())));
            return;
        }
        if (secureWebViewError instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils activityLogUtils = com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed) secureWebViewError).getError().getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "UnknownAuthFailure";
            }
            activityLogUtils.logWebViewDebug$activity_prodRelease(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_AUTH_FAILURE_REASON, simpleName)));
            return;
        }
        if (!(secureWebViewError instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils activityLogUtils2 = com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE;
        java.lang.String[] strArr = new java.lang.String[2];
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed configFailed = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed) secureWebViewError;
        strArr[0] = configFailed.getMessage();
        java.lang.Throwable throwable = configFailed.getThrowable();
        strArr[1] = throwable != null ? throwable.getMessage() : null;
        activityLogUtils2.logWebViewDebug$activity_prodRelease(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_CONFIG_REASON, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR, null, null, 0, null, null, 62, null))));
    }
}
