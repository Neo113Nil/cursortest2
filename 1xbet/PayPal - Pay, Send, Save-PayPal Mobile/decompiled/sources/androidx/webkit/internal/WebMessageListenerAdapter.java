package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebMessageListenerAdapter implements org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface {
    private final androidx.webkit.WebViewCompat.WebMessageListener Camera2StreamConfigurationMap;

    public WebMessageListenerAdapter(androidx.webkit.WebViewCompat.WebMessageListener webMessageListener) {
        this.Camera2StreamConfigurationMap = webMessageListener;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler, android.net.Uri uri, boolean z, java.lang.reflect.InvocationHandler invocationHandler2) {
        androidx.webkit.WebMessageCompat webMessageCompatFromBoundaryInterface = androidx.webkit.internal.WebMessageAdapter.webMessageCompatFromBoundaryInterface((org.chromium.support_lib_boundary.WebMessageBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class, invocationHandler));
        if (webMessageCompatFromBoundaryInterface != null) {
            this.Camera2StreamConfigurationMap.onPostMessage(webView, webMessageCompatFromBoundaryInterface, uri, z, androidx.webkit.internal.JavaScriptReplyProxyImpl.forInvocationHandler(invocationHandler2));
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }
}
