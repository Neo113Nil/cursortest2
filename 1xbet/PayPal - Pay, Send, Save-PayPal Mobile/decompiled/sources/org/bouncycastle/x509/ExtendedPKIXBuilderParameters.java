package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class ExtendedPKIXBuilderParameters extends org.bouncycastle.x509.ExtendedPKIXParameters {
    private java.util.Set getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.x509.ExtendedPKIXParameters
    protected void setParams(java.security.cert.PKIXParameters pKIXParameters) {
        super.setParams(pKIXParameters);
        if (pKIXParameters instanceof org.bouncycastle.x509.ExtendedPKIXBuilderParameters) {
            org.bouncycastle.x509.ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (org.bouncycastle.x509.ExtendedPKIXBuilderParameters) pKIXParameters;
            this.getHighSpeedVideoSizes = extendedPKIXBuilderParameters.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = new java.util.HashSet(extendedPKIXBuilderParameters.getHighSpeedVideoFpsRanges);
        }
        if (pKIXParameters instanceof java.security.cert.PKIXBuilderParameters) {
            this.getHighSpeedVideoSizes = ((java.security.cert.PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    public void setMaxPathLength(int i) {
        if (i < -1) {
            throw new java.security.InvalidParameterException("The maximum path length parameter can not be less than -1.");
        }
        this.getHighSpeedVideoSizes = i;
    }

    public void setExcludedCerts(java.util.Set set) {
        if (set == null) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet(set);
    }

    public int getMaxPathLength() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.Set getExcludedCerts() {
        return java.util.Collections.unmodifiableSet(this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public java.lang.Object clone() {
        try {
            org.bouncycastle.x509.ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = new org.bouncycastle.x509.ExtendedPKIXBuilderParameters(getTrustAnchors(), getTargetConstraints());
            extendedPKIXBuilderParameters.setParams(this);
            return extendedPKIXBuilderParameters;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    public static org.bouncycastle.x509.ExtendedPKIXParameters getInstance(java.security.cert.PKIXParameters pKIXParameters) {
        try {
            org.bouncycastle.x509.ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = new org.bouncycastle.x509.ExtendedPKIXBuilderParameters(pKIXParameters.getTrustAnchors(), org.bouncycastle.x509.X509CertStoreSelector.getInstance((java.security.cert.X509CertSelector) pKIXParameters.getTargetCertConstraints()));
            extendedPKIXBuilderParameters.setParams(pKIXParameters);
            return extendedPKIXBuilderParameters;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    public ExtendedPKIXBuilderParameters(java.util.Set set, org.bouncycastle.util.Selector selector) throws java.security.InvalidAlgorithmParameterException {
        super(set);
        this.getHighSpeedVideoSizes = 5;
        this.getHighSpeedVideoFpsRanges = java.util.Collections.EMPTY_SET;
        setTargetConstraints(selector);
    }
}
