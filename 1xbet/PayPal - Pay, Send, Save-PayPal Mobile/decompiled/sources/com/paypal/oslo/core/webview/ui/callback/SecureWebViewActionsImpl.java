package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActionsImpl;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActions;", "Landroid/webkit/WebView;", "webView", "", "source", "<init>", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "jobName", "", "print", "(Landroid/content/Context;Ljava/lang/String;)Z", "", "dispose$webview_release", "()V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/ref/WeakReference;", "Camera2StreamConfigurationMap", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewActionsImpl implements com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions {

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_PRINT_JOB_NAME = "WebView Print";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<android.webkit.WebView> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl.Companion Companion = new com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl.Companion(null);
    public static final int $stable = 8;

    public SecureWebViewActionsImpl(android.webkit.WebView webView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(webView);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions
    public final boolean print(android.content.Context context, java.lang.String jobName) {
        java.lang.String str;
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRangesFor.get();
        if (webView == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] print failed - WebView unavailable", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighResolutionOutputSizeshNQ4ISI)), null, null, 12, null);
            return false;
        }
        android.print.PrintManager printManager = (android.print.PrintManager) context.getSystemService(android.print.PrintManager.class);
        if (printManager == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] print failed - PrintManager unavailable", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighResolutionOutputSizeshNQ4ISI)), null, null, 12, null);
            return false;
        }
        if (jobName == null) {
            str = webView.getUrl();
            if (str == null) {
                str = DEFAULT_PRINT_JOB_NAME;
            }
        } else {
            str = jobName;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] print requested", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("job_name", str)), null, 4, null);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl secureWebViewActionsImpl = this;
            printManager.print(str, webView.createPrintDocumentAdapter(str), null);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] print failed - exception", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("job_name", str)), null, m23439exceptionOrNullimpl, 4, null);
            m23436constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) m23436constructorimpl).booleanValue();
    }

    public final void dispose$webview_release() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActionsImpl$Companion;", "", "<init>", "()V", "", "DEFAULT_PRINT_JOB_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
