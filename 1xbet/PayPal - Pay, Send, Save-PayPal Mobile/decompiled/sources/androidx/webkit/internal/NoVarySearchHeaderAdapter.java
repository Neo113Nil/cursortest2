package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class NoVarySearchHeaderAdapter implements org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface {
    private final androidx.webkit.NoVarySearchHeader getHighResolutionOutputSizeshNQ4ISI;

    public NoVarySearchHeaderAdapter(androidx.webkit.NoVarySearchHeader noVarySearchHeader) {
        this.getHighResolutionOutputSizeshNQ4ISI = noVarySearchHeader;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getVaryOnKeyOrder() {
        return this.getHighResolutionOutputSizeshNQ4ISI.varyOnKeyOrder;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getIgnoreDifferencesInParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI.ignoreDifferencesInParameters;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public java.util.List<java.lang.String> getIgnoredQueryParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI.ignoredQueryParameters;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public java.util.List<java.lang.String> getConsideredQueryParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI.consideredQueryParameters;
    }
}
