package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509CRLStoreSelector extends java.security.cert.X509CRLSelector implements org.bouncycastle.util.Selector {
    private org.bouncycastle.x509.X509AttributeCertificate getHighSpeedVideoSizes;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private boolean getHighSpeedVideoFpsRanges = false;
    private java.math.BigInteger getInputSizeshNQ4ISI = null;
    private byte[] Camera2StreamConfigurationMap = null;
    private boolean getHighSpeedVideoFpsRangesFor = false;

    public void setMaxBaseCRLNumber(java.math.BigInteger bigInteger) {
        this.getInputSizeshNQ4ISI = bigInteger;
    }

    public void setIssuingDistributionPointEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public void setIssuingDistributionPoint(byte[] bArr) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public void setDeltaCRLIndicatorEnabled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public void setCompleteCRLEnabled(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public void setAttrCertificateChecking(org.bouncycastle.x509.X509AttributeCertificate x509AttributeCertificate) {
        this.getHighSpeedVideoSizes = x509AttributeCertificate;
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public boolean match(java.security.cert.CRL crl) {
        return match((java.lang.Object) crl);
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (!(obj instanceof java.security.cert.X509CRL)) {
            return false;
        }
        java.security.cert.X509CRL x509crl = (java.security.cert.X509CRL) obj;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId());
            org.bouncycastle.asn1.ASN1Integer aSN1Integer = extensionValue != null ? org.bouncycastle.asn1.ASN1Integer.getInstance(org.bouncycastle.x509.extension.X509ExtensionUtil.fromExtensionValue(extensionValue)) : null;
            if (isDeltaCRLIndicatorEnabled() && aSN1Integer == null) {
                return false;
            }
            if (isCompleteCRLEnabled() && aSN1Integer != null) {
                return false;
            }
            if (aSN1Integer != null && this.getInputSizeshNQ4ISI != null && aSN1Integer.getPositiveValue().compareTo(this.getInputSizeshNQ4ISI) == 1) {
                return false;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                byte[] extensionValue2 = x509crl.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
                byte[] bArr = this.Camera2StreamConfigurationMap;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!org.bouncycastle.util.Arrays.areEqual(extensionValue2, bArr)) {
                    return false;
                }
            }
            return super.match((java.security.cert.CRL) x509crl);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean isIssuingDistributionPointEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isDeltaCRLIndicatorEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isCompleteCRLEnabled() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getMaxBaseCRLNumber() {
        return this.getInputSizeshNQ4ISI;
    }

    public byte[] getIssuingDistributionPoint() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.x509.X509AttributeCertificate getAttrCertificateChecking() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector, org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector = getInstance(this);
        x509CRLStoreSelector.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        x509CRLStoreSelector.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
        x509CRLStoreSelector.getInputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
        x509CRLStoreSelector.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        x509CRLStoreSelector.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        x509CRLStoreSelector.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
        return x509CRLStoreSelector;
    }

    public static org.bouncycastle.x509.X509CRLStoreSelector getInstance(java.security.cert.X509CRLSelector x509CRLSelector) {
        if (x509CRLSelector == null) {
            throw new java.lang.IllegalArgumentException("cannot create from null selector");
        }
        org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector = new org.bouncycastle.x509.X509CRLStoreSelector();
        x509CRLStoreSelector.setCertificateChecking(x509CRLSelector.getCertificateChecking());
        x509CRLStoreSelector.setDateAndTime(x509CRLSelector.getDateAndTime());
        try {
            x509CRLStoreSelector.setIssuerNames(x509CRLSelector.getIssuerNames());
            x509CRLStoreSelector.setIssuers(x509CRLSelector.getIssuers());
            x509CRLStoreSelector.setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            x509CRLStoreSelector.setMinCRLNumber(x509CRLSelector.getMinCRL());
            return x509CRLStoreSelector;
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage());
        }
    }
}
