package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebNavigationClientAdapter implements org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface {
    androidx.webkit.WebNavigationClient getHighSpeedVideoFpsRangesFor;

    public WebNavigationClientAdapter(androidx.webkit.WebNavigationClient webNavigationClient) {
        this.getHighSpeedVideoFpsRangesFor = webNavigationClient;
    }

    public androidx.webkit.WebNavigationClient getWebNavigationClient() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationStarted(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onNavigationStarted(androidx.webkit.internal.NavigationImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationRedirected(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onNavigationRedirected(androidx.webkit.internal.NavigationImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationCompleted(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onNavigationCompleted(androidx.webkit.internal.NavigationImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDeleted(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onPageDeleted(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageLoadEventFired(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onPageLoadEventFired(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDOMContentLoadedEventFired(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onPageDomContentLoadedEventFired(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onFirstContentfulPaint(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onFirstContentfulPaint(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"};
    }
}
