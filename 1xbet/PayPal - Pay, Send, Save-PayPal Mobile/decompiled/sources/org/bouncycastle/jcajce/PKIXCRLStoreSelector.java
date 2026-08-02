package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKIXCRLStoreSelector<T extends java.security.cert.CRL> implements org.bouncycastle.util.Selector<T> {
    private final java.security.cert.CRLSelector Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final java.math.BigInteger getOutputMinFrameDuration;

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return this;
    }

    public static class Builder {
        private final java.security.cert.CRLSelector getHighSpeedVideoFpsRangesFor;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private boolean getHighSpeedVideoFpsRanges = false;
        private java.math.BigInteger getInputFormats = null;
        private byte[] getHighSpeedVideoSizes = null;
        private boolean Camera2StreamConfigurationMap = false;

        public void setMaxBaseCRLNumber(java.math.BigInteger bigInteger) {
            this.getInputFormats = bigInteger;
        }

        public void setIssuingDistributionPointEnabled(boolean z) {
            this.Camera2StreamConfigurationMap = z;
        }

        public void setIssuingDistributionPoint(byte[] bArr) {
            this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
        }

        public org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder setDeltaCRLIndicatorEnabled(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder setCompleteCRLEnabled(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public org.bouncycastle.jcajce.PKIXCRLStoreSelector<? extends java.security.cert.CRL> build() {
            return new org.bouncycastle.jcajce.PKIXCRLStoreSelector<>(this, (byte) 0);
        }

        public Builder(java.security.cert.CRLSelector cRLSelector) {
            this.getHighSpeedVideoFpsRangesFor = (java.security.cert.CRLSelector) cRLSelector.clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (org.bouncycastle.util.Arrays.areEqual(r0, r2) == false) goto L36;
     */
    @Override // org.bouncycastle.util.Selector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean match(java.security.cert.CRL crl) {
        if (crl instanceof java.security.cert.X509CRL) {
            java.security.cert.X509CRL x509crl = (java.security.cert.X509CRL) crl;
            try {
                byte[] extensionValue = x509crl.getExtensionValue(org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId());
                org.bouncycastle.asn1.ASN1Integer aSN1Integer = extensionValue != null ? org.bouncycastle.asn1.ASN1Integer.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()) : null;
                if (isDeltaCRLIndicatorEnabled() && aSN1Integer == null) {
                    return false;
                }
                if (isCompleteCRLEnabled() && aSN1Integer != null) {
                    return false;
                }
                if (aSN1Integer != null && this.getOutputMinFrameDuration != null && aSN1Integer.getPositiveValue().compareTo(this.getOutputMinFrameDuration) == 1) {
                    return false;
                }
                if (this.getHighSpeedVideoSizes) {
                    byte[] extensionValue2 = x509crl.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
                    byte[] bArr = this.getHighSpeedVideoFpsRanges;
                    if (bArr == null) {
                        if (extensionValue2 != null) {
                            return false;
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this.Camera2StreamConfigurationMap.match(crl);
        return false;
    }

    public boolean isIssuingDistributionPointEnabled() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isDeltaCRLIndicatorEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isCompleteCRLEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getMaxBaseCRLNumber() {
        return this.getOutputMinFrameDuration;
    }

    public byte[] getIssuingDistributionPoint() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public java.security.cert.X509Certificate getCertificateChecking() {
        java.security.cert.CRLSelector cRLSelector = this.Camera2StreamConfigurationMap;
        if (cRLSelector instanceof java.security.cert.X509CRLSelector) {
            return ((java.security.cert.X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    public static java.util.Collection<? extends java.security.cert.CRL> getCRLs(org.bouncycastle.jcajce.PKIXCRLStoreSelector pKIXCRLStoreSelector, java.security.cert.CertStore certStore) throws java.security.cert.CertStoreException {
        return certStore.getCRLs(new org.bouncycastle.jcajce.PKIXCRLStoreSelector.SelectorClone(pKIXCRLStoreSelector));
    }

    static class SelectorClone extends java.security.cert.X509CRLSelector {
        private final org.bouncycastle.jcajce.PKIXCRLStoreSelector Camera2StreamConfigurationMap;

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(java.security.cert.CRL crl) {
            org.bouncycastle.jcajce.PKIXCRLStoreSelector pKIXCRLStoreSelector = this.Camera2StreamConfigurationMap;
            return pKIXCRLStoreSelector == null ? crl != null : pKIXCRLStoreSelector.match(crl);
        }

        SelectorClone(org.bouncycastle.jcajce.PKIXCRLStoreSelector pKIXCRLStoreSelector) {
            this.Camera2StreamConfigurationMap = pKIXCRLStoreSelector;
            if (pKIXCRLStoreSelector.Camera2StreamConfigurationMap instanceof java.security.cert.X509CRLSelector) {
                java.security.cert.X509CRLSelector x509CRLSelector = (java.security.cert.X509CRLSelector) pKIXCRLStoreSelector.Camera2StreamConfigurationMap;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }
    }

    /* synthetic */ PKIXCRLStoreSelector(org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder builder, byte b) {
        this(builder);
    }

    private PKIXCRLStoreSelector(org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder builder) {
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = builder.getInputFormats;
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = builder.Camera2StreamConfigurationMap;
    }
}
