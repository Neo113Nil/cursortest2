package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509CertPairStoreSelector implements org.bouncycastle.util.Selector {
    private org.bouncycastle.x509.X509CertStoreSelector Camera2StreamConfigurationMap;
    private org.bouncycastle.x509.X509CertificatePair getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.x509.X509CertStoreSelector getHighSpeedVideoFpsRangesFor;

    public void setReverseSelector(org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector) {
        this.Camera2StreamConfigurationMap = x509CertStoreSelector;
    }

    public void setForwardSelector(org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector) {
        this.getHighSpeedVideoFpsRangesFor = x509CertStoreSelector;
    }

    public void setCertPair(org.bouncycastle.x509.X509CertificatePair x509CertificatePair) {
        this.getHighResolutionOutputSizeshNQ4ISI = x509CertificatePair;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.x509.X509CertificatePair)) {
            return false;
        }
        try {
            org.bouncycastle.x509.X509CertificatePair x509CertificatePair = (org.bouncycastle.x509.X509CertificatePair) obj;
            org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector = this.getHighSpeedVideoFpsRangesFor;
            if (x509CertStoreSelector != null && !x509CertStoreSelector.match((java.lang.Object) x509CertificatePair.getForward())) {
                return false;
            }
            org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector2 = this.Camera2StreamConfigurationMap;
            if (x509CertStoreSelector2 != null && !x509CertStoreSelector2.match((java.lang.Object) x509CertificatePair.getReverse())) {
                return false;
            }
            org.bouncycastle.x509.X509CertificatePair x509CertificatePair2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (x509CertificatePair2 != null) {
                return x509CertificatePair2.equals(obj);
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public org.bouncycastle.x509.X509CertStoreSelector getReverseSelector() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.x509.X509CertStoreSelector getForwardSelector() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.x509.X509CertificatePair getCertPair() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        org.bouncycastle.x509.X509CertPairStoreSelector x509CertPairStoreSelector = new org.bouncycastle.x509.X509CertPairStoreSelector();
        x509CertPairStoreSelector.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector = this.getHighSpeedVideoFpsRangesFor;
        if (x509CertStoreSelector != null) {
            x509CertPairStoreSelector.setForwardSelector((org.bouncycastle.x509.X509CertStoreSelector) x509CertStoreSelector.clone());
        }
        org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector2 = this.Camera2StreamConfigurationMap;
        if (x509CertStoreSelector2 != null) {
            x509CertPairStoreSelector.setReverseSelector((org.bouncycastle.x509.X509CertStoreSelector) x509CertStoreSelector2.clone());
        }
        return x509CertPairStoreSelector;
    }
}
