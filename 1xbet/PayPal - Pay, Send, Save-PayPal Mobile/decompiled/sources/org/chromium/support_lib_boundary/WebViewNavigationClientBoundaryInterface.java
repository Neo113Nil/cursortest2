package org.chromium.support_lib_boundary;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public interface WebViewNavigationClientBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onFirstContentfulPaint(java.lang.reflect.InvocationHandler invocationHandler);

    void onNavigationCompleted(java.lang.reflect.InvocationHandler invocationHandler);

    void onNavigationRedirected(java.lang.reflect.InvocationHandler invocationHandler);

    void onNavigationStarted(java.lang.reflect.InvocationHandler invocationHandler);

    void onPageDOMContentLoadedEventFired(java.lang.reflect.InvocationHandler invocationHandler);

    void onPageDeleted(java.lang.reflect.InvocationHandler invocationHandler);

    void onPageLoadEventFired(java.lang.reflect.InvocationHandler invocationHandler);
}
