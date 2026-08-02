package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class VisualStateCallbackAdapter implements org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface {
    private final androidx.webkit.WebViewCompat.VisualStateCallback getHighResolutionOutputSizeshNQ4ISI;

    public VisualStateCallbackAdapter(androidx.webkit.WebViewCompat.VisualStateCallback visualStateCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = visualStateCallback;
    }

    @Override // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI.onComplete(j);
    }
}
