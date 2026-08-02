package androidx.webkit;

/* loaded from: classes7.dex */
public class WebResourceRequestCompat {
    private WebResourceRequestCompat() {
    }

    public static boolean isRedirect(android.webkit.WebResourceRequest webResourceRequest) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.isRedirect(webResourceRequest);
        }
        if (n.isSupportedByWebView()) {
            return Camera2StreamConfigurationMap(webResourceRequest).isRedirect();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static androidx.webkit.internal.WebResourceRequestAdapter Camera2StreamConfigurationMap(android.webkit.WebResourceRequest webResourceRequest) {
        return androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebResourceRequest(webResourceRequest);
    }
}
