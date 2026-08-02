package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
class X509CertificateObject extends org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl implements org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private volatile boolean getInputFormats;
    private final java.lang.Object getInputSizeshNQ4ISI;
    private volatile int getOutputFormats;
    private org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier getOutputMinFrameDuration;
    private javax.security.auth.x500.X500Principal getOutputMinFrameDurationlomOqCM;
    private javax.security.auth.x500.X500Principal getOutputSizes;
    private long[] getOutputSizeshNQ4ISI;
    private org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateInternal getOutputStallDuration;
    private java.security.PublicKey getOutputStallDurationlomOqCM;

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getOutputMinFrameDuration.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (!this.getInputFormats) {
            this.getOutputFormats = getHighSpeedVideoSizes().hashCode();
            this.getInputFormats = true;
        }
        return this.getOutputFormats;
    }

    private long[] getHighResolutionOutputSizeshNQ4ISI() {
        long[] jArr;
        long[] jArr2;
        synchronized (this.getInputSizeshNQ4ISI) {
            jArr = this.getOutputSizeshNQ4ISI;
        }
        if (jArr != null) {
            return jArr;
        }
        long[] jArr3 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getOutputSizeshNQ4ISI == null) {
                this.getOutputSizeshNQ4ISI = jArr3;
            }
            jArr2 = this.getOutputSizeshNQ4ISI;
        }
        return jArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() {
        javax.security.auth.x500.X500Principal x500Principal;
        javax.security.auth.x500.X500Principal x500Principal2;
        synchronized (this.getInputSizeshNQ4ISI) {
            x500Principal = this.getOutputSizes;
        }
        if (x500Principal != null) {
            return x500Principal;
        }
        javax.security.auth.x500.X500Principal subjectX500Principal = super.getSubjectX500Principal();
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getOutputSizes == null) {
                this.getOutputSizes = subjectX500Principal;
            }
            x500Principal2 = this.getOutputSizes;
        }
        return x500Principal2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
        java.security.PublicKey publicKey;
        java.security.PublicKey publicKey2;
        synchronized (this.getInputSizeshNQ4ISI) {
            publicKey = this.getOutputStallDurationlomOqCM;
        }
        if (publicKey != null) {
            return publicKey;
        }
        java.security.PublicKey publicKey3 = super.getPublicKey();
        if (publicKey3 == null) {
            return null;
        }
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getOutputStallDurationlomOqCM == null) {
                this.getOutputStallDurationlomOqCM = publicKey3;
            }
            publicKey2 = this.getOutputStallDurationlomOqCM;
        }
        return publicKey2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() {
        javax.security.auth.x500.X500Principal x500Principal;
        javax.security.auth.x500.X500Principal x500Principal2;
        synchronized (this.getInputSizeshNQ4ISI) {
            x500Principal = this.getOutputMinFrameDurationlomOqCM;
        }
        if (x500Principal != null) {
            return x500Principal;
        }
        javax.security.auth.x500.X500Principal issuerX500Principal = super.getIssuerX500Principal();
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                this.getOutputMinFrameDurationlomOqCM = issuerX500Principal;
            }
            x500Principal2 = this.getOutputMinFrameDurationlomOqCM;
        }
        return x500Principal2;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        return org.bouncycastle.util.Arrays.clone(getHighSpeedVideoSizes().getEncoded());
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getOutputMinFrameDuration.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getOutputMinFrameDuration.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.cert.Certificate
    public boolean equals(java.lang.Object obj) {
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateInternal highSpeedVideoSizes;
        org.bouncycastle.asn1.ASN1BitString signature;
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateObject) {
            org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateObject x509CertificateObject = (org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateObject) obj;
            if (this.getInputFormats && x509CertificateObject.getInputFormats) {
                if (this.getOutputFormats != x509CertificateObject.getOutputFormats) {
                    return false;
                }
            } else if ((this.getOutputStallDuration == null || x509CertificateObject.getOutputStallDuration == null) && (signature = this.Camera2StreamConfigurationMap.getSignature()) != null && !signature.equals((org.bouncycastle.asn1.ASN1Primitive) x509CertificateObject.Camera2StreamConfigurationMap.getSignature())) {
                return false;
            }
            highSpeedVideoSizes = getHighSpeedVideoSizes();
            obj = x509CertificateObject.getHighSpeedVideoSizes();
        } else {
            highSpeedVideoSizes = getHighSpeedVideoSizes();
        }
        return highSpeedVideoSizes.equals(obj);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public void checkValidity(java.util.Date date) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
        long time = date.getTime();
        long[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (time > highResolutionOutputSizeshNQ4ISI[1]) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("certificate expired on ");
            sb.append(this.Camera2StreamConfigurationMap.getEndDate().getTime());
            throw new java.security.cert.CertificateExpiredException(sb.toString());
        }
        if (time >= highResolutionOutputSizeshNQ4ISI[0]) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("certificate not valid till ");
        sb2.append(this.Camera2StreamConfigurationMap.getStartDate().getTime());
        throw new java.security.cert.CertificateNotYetValidException(sb2.toString());
    }

    private org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateInternal getHighSpeedVideoSizes() {
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateInternal x509CertificateInternal;
        byte[] bArr;
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateObject.X509CertificateEncodingException x509CertificateEncodingException;
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateInternal x509CertificateInternal2;
        synchronized (this.getInputSizeshNQ4ISI) {
            x509CertificateInternal = this.getOutputStallDuration;
        }
        if (x509CertificateInternal != null) {
            return x509CertificateInternal;
        }
        try {
            x509CertificateEncodingException = null;
            bArr = this.Camera2StreamConfigurationMap.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            bArr = null;
            x509CertificateEncodingException = new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateObject.X509CertificateEncodingException(e);
        }
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateInternal x509CertificateInternal3 = new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateInternal(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, bArr, x509CertificateEncodingException);
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getOutputStallDuration == null) {
                this.getOutputStallDuration = x509CertificateInternal3;
            }
            x509CertificateInternal2 = this.getOutputStallDuration;
        }
        return x509CertificateInternal2;
    }

    private static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.Certificate certificate) throws java.security.cert.CertificateParsingException {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = certificate.getSignatureAlgorithm().getParameters();
            if (parameters == null) {
                return null;
            }
            return parameters.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertificateParsingException("cannot construct SigAlgParams: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.Certificate certificate) throws java.security.cert.CertificateParsingException {
        try {
            return org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.Camera2StreamConfigurationMap(certificate.getSignatureAlgorithm());
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertificateParsingException("cannot construct SigAlgName: ".concat(java.lang.String.valueOf(e)));
        }
    }

    static class X509CertificateEncodingException extends java.security.cert.CertificateEncodingException {
        private final java.lang.Throwable getHighSpeedVideoSizes;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoSizes;
        }

        X509CertificateEncodingException(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
        }
    }

    private static boolean[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.Certificate certificate) throws java.security.cert.CertificateParsingException {
        try {
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(certificate, "2.5.29.15");
            if (Camera2StreamConfigurationMap == null) {
                return null;
            }
            org.bouncycastle.asn1.DERBitString dERBitString = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(Camera2StreamConfigurationMap));
            byte[] bytes = dERBitString.getBytes();
            int length = (bytes.length * 8) - dERBitString.getPadBits();
            boolean[] zArr = new boolean[length >= 9 ? length : 9];
            for (int i = 0; i != length; i++) {
                zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
            }
            return zArr;
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertificateParsingException("cannot construct KeyUsage: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static org.bouncycastle.asn1.x509.BasicConstraints getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.Certificate certificate) throws java.security.cert.CertificateParsingException {
        try {
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(certificate, "2.5.29.19");
            if (Camera2StreamConfigurationMap == null) {
                return null;
            }
            return org.bouncycastle.asn1.x509.BasicConstraints.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(Camera2StreamConfigurationMap));
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertificateParsingException("cannot construct BasicConstraints: ".concat(java.lang.String.valueOf(e)));
        }
    }

    X509CertificateObject(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, org.bouncycastle.asn1.x509.Certificate certificate) throws java.security.cert.CertificateParsingException {
        super(jcaJceHelper, certificate, getHighSpeedVideoFpsRanges(certificate), getHighSpeedVideoFpsRangesFor(certificate), getHighSpeedVideoSizes(certificate), Camera2StreamConfigurationMap(certificate));
        this.getInputSizeshNQ4ISI = new java.lang.Object();
        this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }
}
