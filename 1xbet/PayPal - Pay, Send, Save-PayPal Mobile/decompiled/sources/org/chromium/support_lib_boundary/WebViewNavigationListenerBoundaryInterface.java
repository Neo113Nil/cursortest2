package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewNavigationListenerBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onFirstContentfulPaint(java.lang.reflect.InvocationHandler invocationHandler, long j);

    void onNavigationCompleted(java.lang.reflect.InvocationHandler invocationHandler);

    void onNavigationRedirected(java.lang.reflect.InvocationHandler invocationHandler);

    void onNavigationStarted(java.lang.reflect.InvocationHandler invocationHandler);

    void onPageDOMContentLoadedEventFired(java.lang.reflect.InvocationHandler invocationHandler);

    void onPageDeleted(java.lang.reflect.InvocationHandler invocationHandler);

    void onPageLoadEventFired(java.lang.reflect.InvocationHandler invocationHandler);
}
