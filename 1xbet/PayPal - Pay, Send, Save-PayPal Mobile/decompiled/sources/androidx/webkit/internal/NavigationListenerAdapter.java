package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class NavigationListenerAdapter implements org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface {
    private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {org.chromium.support_lib_boundary.util.Features.WEB_VIEW_NAVIGATION_LISTENER_V1};
    private final androidx.webkit.NavigationListener getHighSpeedVideoFpsRangesFor;

    public NavigationListenerAdapter(androidx.webkit.NavigationListener navigationListener) {
        this.getHighSpeedVideoFpsRangesFor = navigationListener;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onNavigationStarted(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onNavigationStarted(androidx.webkit.internal.NavigationImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onNavigationRedirected(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onNavigationRedirected(androidx.webkit.internal.NavigationImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onNavigationCompleted(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onNavigationCompleted(androidx.webkit.internal.NavigationImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onPageDeleted(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onPageDeleted(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onPageLoadEventFired(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onPageLoadEvent(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onPageDOMContentLoadedEventFired(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRangesFor.onPageDomContentLoadedEvent(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onFirstContentfulPaint(java.lang.reflect.InvocationHandler invocationHandler, long j) {
        this.getHighSpeedVideoFpsRangesFor.onFirstContentfulPaint(androidx.webkit.internal.PageImpl.forInvocationHandler(invocationHandler), j);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof androidx.webkit.internal.NavigationListenerAdapter)) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((androidx.webkit.internal.NavigationListenerAdapter) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }
}
