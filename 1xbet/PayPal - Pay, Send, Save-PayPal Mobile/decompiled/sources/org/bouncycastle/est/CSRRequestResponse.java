package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class CSRRequestResponse {
    private final org.bouncycastle.est.CSRAttributesResponse Camera2StreamConfigurationMap;
    private final org.bouncycastle.est.Source getHighResolutionOutputSizeshNQ4ISI;

    public boolean hasAttributesResponse() {
        return this.Camera2StreamConfigurationMap != null;
    }

    public org.bouncycastle.est.Source getSource() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.Object getSession() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSession();
    }

    public org.bouncycastle.est.CSRAttributesResponse getAttributesResponse() {
        org.bouncycastle.est.CSRAttributesResponse cSRAttributesResponse = this.Camera2StreamConfigurationMap;
        if (cSRAttributesResponse != null) {
            return cSRAttributesResponse;
        }
        throw new java.lang.IllegalStateException("Response has no CSRAttributesResponse.");
    }

    public CSRRequestResponse(org.bouncycastle.est.CSRAttributesResponse cSRAttributesResponse, org.bouncycastle.est.Source source) {
        this.Camera2StreamConfigurationMap = cSRAttributesResponse;
        this.getHighResolutionOutputSizeshNQ4ISI = source;
    }
}
