package androidx.webkit.internal;

/* loaded from: classes7.dex */
public interface WebViewProviderFactory {
    org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView);

    org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider();

    org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore();

    org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController();

    org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics();

    org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController();

    org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface getWebViewBuilder();

    java.lang.String[] getWebViewFeatures();

    org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();

    void startUpWebView(androidx.webkit.WebViewStartUpConfig webViewStartUpConfig, androidx.webkit.WebViewCompat.WebViewStartUpCallback webViewStartUpCallback);
}
