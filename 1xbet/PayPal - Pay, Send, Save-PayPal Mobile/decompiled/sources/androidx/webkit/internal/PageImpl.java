package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class PageImpl implements androidx.webkit.Page {
    private final org.chromium.support_lib_boundary.WebViewPageBoundaryInterface mPageBoundaryInterface;

    public static androidx.webkit.Page forInvocationHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        final org.chromium.support_lib_boundary.WebViewPageBoundaryInterface webViewPageBoundaryInterface = (org.chromium.support_lib_boundary.WebViewPageBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface.class, invocationHandler);
        return (androidx.webkit.Page) java.util.Objects.requireNonNull(webViewPageBoundaryInterface.getOrCreatePeer(new java.util.concurrent.Callable() { // from class: androidx.webkit.internal.PageImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.webkit.internal.PageImpl.getHighResolutionOutputSizeshNQ4ISI(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface.this);
            }
        }));
    }

    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws java.lang.Exception {
        return new androidx.webkit.internal.PageImpl(webViewPageBoundaryInterface);
    }

    private PageImpl(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface webViewPageBoundaryInterface) {
        this.mPageBoundaryInterface = webViewPageBoundaryInterface;
    }
}
