package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class SpeculativeLoadingParametersAdapter implements org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface {
    private final androidx.webkit.SpeculativeLoadingParameters getHighResolutionOutputSizeshNQ4ISI;

    public SpeculativeLoadingParametersAdapter(androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = speculativeLoadingParameters;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public java.util.Map<java.lang.String, java.lang.String> getAdditionalHeaders() {
        androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        return speculativeLoadingParameters == null ? new java.util.HashMap() : speculativeLoadingParameters.getAdditionalHeaders();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public java.lang.reflect.InvocationHandler getNoVarySearchData() {
        androidx.webkit.NoVarySearchHeader expectedNoVarySearchData;
        androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        if (speculativeLoadingParameters == null || (expectedNoVarySearchData = speculativeLoadingParameters.getExpectedNoVarySearchData()) == null) {
            return null;
        }
        return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.NoVarySearchHeaderAdapter(expectedNoVarySearchData));
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public boolean isJavaScriptEnabled() {
        androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        if (speculativeLoadingParameters == null) {
            return false;
        }
        return speculativeLoadingParameters.isJavaScriptEnabled();
    }
}
