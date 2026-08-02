package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewProviderBoundaryInterface {
    java.lang.reflect.InvocationHandler addDocumentStartJavaScript(java.lang.String str, java.lang.String[] strArr);

    void addWebMessageListener(java.lang.String str, java.lang.String[] strArr, java.lang.reflect.InvocationHandler invocationHandler);

    void addWebViewNavigationListener(java.util.concurrent.Executor executor, java.lang.reflect.InvocationHandler invocationHandler);

    java.lang.reflect.InvocationHandler[] createWebMessageChannel();

    java.lang.reflect.InvocationHandler getProfile();

    android.webkit.WebChromeClient getWebChromeClient();

    android.webkit.WebViewClient getWebViewClient();

    java.lang.reflect.InvocationHandler getWebViewNavigationClient();

    java.lang.reflect.InvocationHandler getWebViewRenderer();

    java.lang.reflect.InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long j, java.lang.reflect.InvocationHandler invocationHandler);

    boolean isAudioMuted();

    void postMessageToMainFrame(java.lang.reflect.InvocationHandler invocationHandler, android.net.Uri uri);

    void prerenderUrl(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, android.webkit.ValueCallback<java.lang.Void> valueCallback, android.webkit.ValueCallback<java.lang.Throwable> valueCallback2);

    void prerenderUrl(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, java.lang.reflect.InvocationHandler invocationHandler, android.webkit.ValueCallback<java.lang.Void> valueCallback, android.webkit.ValueCallback<java.lang.Throwable> valueCallback2);

    void removeWebMessageListener(java.lang.String str);

    void removeWebViewNavigationListener(java.lang.reflect.InvocationHandler invocationHandler);

    void saveState(android.os.Bundle bundle, int i, boolean z);

    void setAudioMuted(boolean z);

    void setProfile(java.lang.String str);

    void setWebViewNavigationClient(java.lang.reflect.InvocationHandler invocationHandler);

    void setWebViewRendererClient(java.lang.reflect.InvocationHandler invocationHandler);
}
