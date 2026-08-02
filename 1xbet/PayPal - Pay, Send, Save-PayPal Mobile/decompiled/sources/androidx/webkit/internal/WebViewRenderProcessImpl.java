package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewRenderProcessImpl extends androidx.webkit.WebViewRenderProcess {
    private static final java.util.WeakHashMap<android.webkit.WebViewRenderProcess, androidx.webkit.internal.WebViewRenderProcessImpl> getHighSpeedVideoFpsRangesFor = new java.util.WeakHashMap<>();
    private org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.ref.WeakReference<android.webkit.WebViewRenderProcess> getHighSpeedVideoSizes;

    public WebViewRenderProcessImpl(org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.getHighResolutionOutputSizeshNQ4ISI = webViewRendererBoundaryInterface;
    }

    public WebViewRenderProcessImpl(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(webViewRenderProcess);
    }

    public static androidx.webkit.internal.WebViewRenderProcessImpl forInvocationHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        final org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface.class, invocationHandler);
        return (androidx.webkit.internal.WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new java.util.concurrent.Callable() { // from class: androidx.webkit.internal.WebViewRenderProcessImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.webkit.internal.WebViewRenderProcessImpl.getHighSpeedVideoFpsRanges(org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface.this);
            }
        });
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) throws java.lang.Exception {
        return new androidx.webkit.internal.WebViewRenderProcessImpl(webViewRendererBoundaryInterface);
    }

    public static androidx.webkit.internal.WebViewRenderProcessImpl forFrameworkObject(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        java.util.WeakHashMap<android.webkit.WebViewRenderProcess, androidx.webkit.internal.WebViewRenderProcessImpl> weakHashMap = getHighSpeedVideoFpsRangesFor;
        androidx.webkit.internal.WebViewRenderProcessImpl webViewRenderProcessImpl = weakHashMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        androidx.webkit.internal.WebViewRenderProcessImpl webViewRenderProcessImpl2 = new androidx.webkit.internal.WebViewRenderProcessImpl(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }

    @Override // androidx.webkit.WebViewRenderProcess
    public boolean terminate() {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_TERMINATE;
        if (q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcess = this.getHighSpeedVideoSizes.get();
            return webViewRenderProcess != null && androidx.webkit.internal.ApiHelperForQ.terminate(webViewRenderProcess);
        }
        if (q.isSupportedByWebView()) {
            return this.getHighResolutionOutputSizeshNQ4ISI.terminate();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
