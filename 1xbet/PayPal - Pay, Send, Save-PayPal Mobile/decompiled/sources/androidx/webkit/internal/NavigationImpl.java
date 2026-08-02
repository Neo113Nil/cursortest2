package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class NavigationImpl implements androidx.webkit.Navigation {
    org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface getHighResolutionOutputSizeshNQ4ISI;
    androidx.webkit.Page getHighSpeedVideoFpsRangesFor;

    public static androidx.webkit.Navigation forInvocationHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        final org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface.class, invocationHandler);
        return (androidx.webkit.Navigation) java.util.Objects.requireNonNull(webViewNavigationBoundaryInterface.getOrCreatePeer(new java.util.concurrent.Callable() { // from class: androidx.webkit.internal.NavigationImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.webkit.internal.NavigationImpl.getHighSpeedVideoFpsRanges(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface.this);
            }
        }));
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) throws java.lang.Exception {
        return new androidx.webkit.internal.NavigationImpl(webViewNavigationBoundaryInterface);
    }

    private NavigationImpl(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) {
        this.getHighResolutionOutputSizeshNQ4ISI = webViewNavigationBoundaryInterface;
    }

    @Override // androidx.webkit.Navigation
    public androidx.webkit.Page getPage() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getPage() == null) {
            return null;
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.PageImpl.forInvocationHandler(this.getHighResolutionOutputSizeshNQ4ISI.getPage());
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.webkit.Navigation
    public java.lang.String getUrl() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getUrl();
    }

    @Override // androidx.webkit.Navigation
    public boolean wasInitiatedByPage() {
        return this.getHighResolutionOutputSizeshNQ4ISI.wasInitiatedByPage();
    }

    @Override // androidx.webkit.Navigation
    public boolean isSameDocument() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isSameDocument();
    }

    @Override // androidx.webkit.Navigation
    public boolean isReload() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isReload();
    }

    @Override // androidx.webkit.Navigation
    public boolean isHistory() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isHistory();
    }

    @Override // androidx.webkit.Navigation
    public boolean isRestore() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isRestore();
    }

    @Override // androidx.webkit.Navigation
    public boolean isBack() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isBack();
    }

    @Override // androidx.webkit.Navigation
    public boolean isForward() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isForward();
    }

    @Override // androidx.webkit.Navigation
    public boolean didCommit() {
        return this.getHighResolutionOutputSizeshNQ4ISI.didCommit();
    }

    @Override // androidx.webkit.Navigation
    public boolean didCommitErrorPage() {
        return this.getHighResolutionOutputSizeshNQ4ISI.didCommitErrorPage();
    }

    @Override // androidx.webkit.Navigation
    public int getStatusCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getStatusCode();
    }
}
