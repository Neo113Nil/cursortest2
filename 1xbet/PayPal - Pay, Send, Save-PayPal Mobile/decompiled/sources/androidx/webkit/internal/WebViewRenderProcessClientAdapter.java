package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewRenderProcessClientAdapter implements org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface {
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};
    private final androidx.webkit.WebViewRenderProcessClient Camera2StreamConfigurationMap;
    private final java.util.concurrent.Executor getHighSpeedVideoSizes;

    public WebViewRenderProcessClientAdapter(java.util.concurrent.Executor executor, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.getHighSpeedVideoSizes = executor;
        this.Camera2StreamConfigurationMap = webViewRenderProcessClient;
    }

    public androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final java.lang.String[] getSupportedFeatures() {
        return getHighSpeedVideoFpsRanges;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(final android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler) {
        final androidx.webkit.internal.WebViewRenderProcessImpl forInvocationHandler = androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(invocationHandler);
        final androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient = this.Camera2StreamConfigurationMap;
        java.util.concurrent.Executor executor = this.getHighSpeedVideoSizes;
        if (executor == null) {
            webViewRenderProcessClient.onRenderProcessUnresponsive(webView, forInvocationHandler);
        } else {
            executor.execute(new java.lang.Runnable() { // from class: androidx.webkit.internal.WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.webkit.WebViewRenderProcessClient.this.onRenderProcessUnresponsive(webView, forInvocationHandler);
                }
            });
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(final android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler) {
        final androidx.webkit.internal.WebViewRenderProcessImpl forInvocationHandler = androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(invocationHandler);
        final androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient = this.Camera2StreamConfigurationMap;
        java.util.concurrent.Executor executor = this.getHighSpeedVideoSizes;
        if (executor == null) {
            webViewRenderProcessClient.onRenderProcessResponsive(webView, forInvocationHandler);
        } else {
            executor.execute(new java.lang.Runnable() { // from class: androidx.webkit.internal.WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.webkit.WebViewRenderProcessClient.this.onRenderProcessResponsive(webView, forInvocationHandler);
                }
            });
        }
    }
}
