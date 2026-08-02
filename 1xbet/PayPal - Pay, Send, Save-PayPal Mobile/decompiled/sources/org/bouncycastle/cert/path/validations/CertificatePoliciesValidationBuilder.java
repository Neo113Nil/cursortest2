package org.bouncycastle.cert.path.validations;

/* loaded from: classes17.dex */
public class CertificatePoliciesValidationBuilder {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public void setPolicyMappingInhibited(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public void setExplicitPolicyRequired(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public void setAnyPolicyInhibited(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public org.bouncycastle.cert.path.validations.CertificatePoliciesValidation build(org.bouncycastle.cert.path.CertPath certPath) {
        return build(certPath.length());
    }

    public org.bouncycastle.cert.path.validations.CertificatePoliciesValidation build(int i) {
        return new org.bouncycastle.cert.path.validations.CertificatePoliciesValidation(i, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }
}
