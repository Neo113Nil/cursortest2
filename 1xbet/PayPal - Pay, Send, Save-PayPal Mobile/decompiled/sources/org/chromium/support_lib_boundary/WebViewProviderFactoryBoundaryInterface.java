package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    public static final java.lang.String MULTI_COOKIE_HEADER_NAME = "\u0000Set-Cookie-Multivalue\u0000";
    public static final java.lang.String MULTI_COOKIE_VALUE_SEPARATOR = "\u0000";

    java.lang.reflect.InvocationHandler createWebView(android.webkit.WebView webView);

    java.lang.reflect.InvocationHandler getDropDataProvider();

    java.lang.reflect.InvocationHandler getProfileStore();

    java.lang.reflect.InvocationHandler getProxyController();

    java.lang.reflect.InvocationHandler getServiceWorkerController();

    java.lang.reflect.InvocationHandler getStatics();

    java.lang.String[] getSupportedFeatures();

    java.lang.reflect.InvocationHandler getTracingController();

    java.lang.reflect.InvocationHandler getWebViewBuilder();

    java.lang.reflect.InvocationHandler getWebkitToCompatConverter();

    void startUpWebView(java.lang.reflect.InvocationHandler invocationHandler, java.lang.reflect.InvocationHandler invocationHandler2);
}
