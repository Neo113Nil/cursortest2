package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebResourceRequestAdapter {
    private final org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface getHighResolutionOutputSizeshNQ4ISI;

    public WebResourceRequestAdapter(org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.getHighResolutionOutputSizeshNQ4ISI = webResourceRequestBoundaryInterface;
    }

    public boolean isRedirect() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isRedirect();
    }
}
