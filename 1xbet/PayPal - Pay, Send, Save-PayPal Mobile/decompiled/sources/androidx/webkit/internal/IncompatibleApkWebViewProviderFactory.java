package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class IncompatibleApkWebViewProviderFactory implements androidx.webkit.internal.WebViewProviderFactory {
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = new java.lang.String[0];

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface getWebViewBuilder() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView) {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
        return getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public void startUpWebView(androidx.webkit.WebViewStartUpConfig webViewStartUpConfig, androidx.webkit.WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
