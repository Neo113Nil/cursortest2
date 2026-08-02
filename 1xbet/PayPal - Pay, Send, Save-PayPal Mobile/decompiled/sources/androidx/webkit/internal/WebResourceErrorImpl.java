package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebResourceErrorImpl extends androidx.webkit.WebResourceErrorCompat {
    private org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface getHighResolutionOutputSizeshNQ4ISI;
    private android.webkit.WebResourceError getHighSpeedVideoSizes;

    public WebResourceErrorImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    public WebResourceErrorImpl(android.webkit.WebResourceError webResourceError) {
        this.getHighSpeedVideoSizes = webResourceError;
    }

    private android.webkit.WebResourceError getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(java.lang.reflect.Proxy.getInvocationHandler(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
        return getHighSpeedVideoFpsRangesFor().getErrorCode();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public java.lang.CharSequence getDescription() {
        return getHighSpeedVideoFpsRangesFor().getDescription();
    }
}
