package com.paypal.oslo.core.webview.ui.logging;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/logging/SecureWebViewCallbackLogger;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;", "", "source", "<init>", "(Ljava/lang/String;)V", "url", "", "onLoadingStarted", "onLoadingFinished", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "error", "onLoadFailed", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;)V", "Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;", "actionBundle", "onActionsReady", "(Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;)V", "userAgent", "contentDisposition", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "contentLength", "onDownloadRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewCallbackLogger implements com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public SecureWebViewCallbackLogger(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onLoadingStarted(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRangesFor));
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url));
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onLoadingFinished(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRangesFor));
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url));
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (!(error instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl)) {
            if (!(error instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed)) {
                if (!(error instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed configFailed = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed) error;
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] configuration failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("error_message", configFailed.getMessage())), null, configFailed.getThrowable(), 4, null);
                return;
            }
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed authFailed = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed) error;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRangesFor);
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authFailed.getError().getClass()).getSimpleName();
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName != null ? simpleName : "");
            com.paypal.android.logger.Logger.e$default(logger, "[Webview] authentication failed", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", authFailed.getUrl())), null, 8, null);
            return;
        }
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl unauthorizedUrl = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl) error;
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] blocked unauthorized URL access", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, unauthorizedUrl.getError().getCode().name()), kotlin.TuplesKt.to("error_message", unauthorizedUrl.getError().getMessage()), kotlin.TuplesKt.to("validation_extras", kotlin.collections.CollectionsKt.joinToString$default(unauthorizedUrl.getError().getExtras().entrySet(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.logging.SecureWebViewCallbackLogger$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.webview.ui.logging.SecureWebViewCallbackLogger.$r8$lambda$fHdn3683cdolXDwcSw4_Gj_JWV4((java.util.Map.Entry) obj);
            }
        }, 31, null))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", unauthorizedUrl.getUrl())), null, 8, null);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle actionBundle) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRangesFor);
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, java.lang.String.valueOf(actionBundle != null));
        com.paypal.android.logger.Logger.d$default(logger, "[Webview] actions state changed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onDownloadRequest(java.lang.String url, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimeType, long contentLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRangesFor);
        if (mimeType == null) {
            mimeType = "unknown";
        }
        pairArr[1] = kotlin.TuplesKt.to("mime_type", mimeType);
        pairArr[2] = kotlin.TuplesKt.to("content_length", java.lang.String.valueOf(contentLength));
        kotlin.collections.MapsKt.mapOf(pairArr);
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url));
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$fHdn3683cdolXDwcSw4_Gj_JWV4(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(key);
        sb.append("=");
        sb.append(value);
        return sb.toString();
    }
}
