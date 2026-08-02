package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
class X509CRLObject extends org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl {
    private volatile int getHighSpeedVideoSizesFor;
    private final java.lang.Object getInputFormats;
    private org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal getInputSizeshNQ4ISI;
    private volatile boolean getOutputMinFrameDuration;

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.getOutputMinFrameDuration) {
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor().hashCode();
            this.getOutputMinFrameDuration = true;
        }
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws java.security.cert.CRLException {
        return org.bouncycastle.util.Arrays.clone(getHighSpeedVideoFpsRangesFor().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(java.lang.Object obj) {
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal highSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.ASN1BitString signature;
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject) {
            org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject x509CRLObject = (org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject) obj;
            if (this.getOutputMinFrameDuration && x509CRLObject.getOutputMinFrameDuration) {
                if (this.getHighSpeedVideoSizesFor != x509CRLObject.getHighSpeedVideoSizesFor) {
                    return false;
                }
            } else if ((this.getInputSizeshNQ4ISI == null || x509CRLObject.getInputSizeshNQ4ISI == null) && (signature = this.getHighSpeedVideoFpsRanges.getSignature()) != null && !signature.equals((org.bouncycastle.asn1.ASN1Primitive) x509CRLObject.getHighSpeedVideoFpsRanges.getSignature())) {
                return false;
            }
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            obj = x509CRLObject.getHighSpeedVideoFpsRangesFor();
        } else {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        }
        return highSpeedVideoFpsRangesFor.equals(obj);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.CertificateList certificateList) throws java.security.cert.CRLException {
        try {
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(certificateList, org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
            if (Camera2StreamConfigurationMap == null) {
                return false;
            }
            return org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(Camera2StreamConfigurationMap).isIndirectCRL();
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jcajce.provider.asymmetric.x509.ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    static class X509CRLException extends java.security.cert.CRLException {
        private final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        X509CRLException(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = th;
        }

        X509CRLException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighResolutionOutputSizeshNQ4ISI = th;
        }
    }

    private org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal getHighSpeedVideoFpsRangesFor() {
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal x509CRLInternal;
        byte[] bArr;
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject.X509CRLException x509CRLException;
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal x509CRLInternal2;
        synchronized (this.getInputFormats) {
            x509CRLInternal = this.getInputSizeshNQ4ISI;
        }
        if (x509CRLInternal != null) {
            return x509CRLInternal;
        }
        try {
            x509CRLException = null;
            bArr = this.getHighSpeedVideoFpsRanges.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            bArr = null;
            x509CRLException = new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject.X509CRLException(e);
        }
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal x509CRLInternal3 = new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, bArr, x509CRLException);
        synchronized (this.getInputFormats) {
            if (this.getInputSizeshNQ4ISI == null) {
                this.getInputSizeshNQ4ISI = x509CRLInternal3;
            }
            x509CRLInternal2 = this.getInputSizeshNQ4ISI;
        }
        return x509CRLInternal2;
    }

    private static byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.CertificateList certificateList) throws java.security.cert.CRLException {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = certificateList.getSignatureAlgorithm().getParameters();
            if (parameters == null) {
                return null;
            }
            return parameters.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CRLException("CRL contents invalid: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.CertificateList certificateList) throws java.security.cert.CRLException {
        try {
            return org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.Camera2StreamConfigurationMap(certificateList.getSignatureAlgorithm());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CRL contents invalid: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject.X509CRLException(sb.toString(), e);
        }
    }

    X509CRLObject(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, org.bouncycastle.asn1.x509.CertificateList certificateList) throws java.security.cert.CRLException {
        super(jcaJceHelper, certificateList, getHighSpeedVideoSizes(certificateList), getHighSpeedVideoFpsRanges(certificateList), getHighResolutionOutputSizeshNQ4ISI(certificateList));
        this.getInputFormats = new java.lang.Object();
    }
}
