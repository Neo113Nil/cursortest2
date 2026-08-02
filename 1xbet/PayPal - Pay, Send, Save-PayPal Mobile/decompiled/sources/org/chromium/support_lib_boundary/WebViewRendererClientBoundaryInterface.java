package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewRendererClientBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onRendererResponsive(android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler);

    void onRendererUnresponsive(android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler);
}
