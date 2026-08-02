package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509V3CertificateGenerator {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;
    private java.lang.String getOutputMinFrameDuration;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    private final org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory();
    private org.bouncycastle.asn1.x509.V3TBSCertificateGenerator getOutputFormats = new org.bouncycastle.asn1.x509.V3TBSCertificateGenerator();
    private org.bouncycastle.asn1.x509.X509ExtensionsGenerator Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.X509ExtensionsGenerator();

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey, java.lang.String str, java.security.SecureRandom secureRandom) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            this.getOutputFormats.setExtensions(this.Camera2StreamConfigurationMap.generate());
        }
        org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate = this.getOutputFormats.generateTBSCertificate();
        try {
            try {
                return getHighSpeedVideoSizes(generateTBSCertificate, org.bouncycastle.x509.X509Util.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, str, privateKey, secureRandom, generateTBSCertificate));
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.x509.ExtCertificateEncodingException("exception producing certificate object", e);
            }
        } catch (java.io.IOException e2) {
            throw new org.bouncycastle.x509.ExtCertificateEncodingException("exception encoding TBS cert", e2);
        }
    }

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            this.getOutputFormats.setExtensions(this.Camera2StreamConfigurationMap.generate());
        }
        org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate = this.getOutputFormats.generateTBSCertificate();
        try {
            try {
                return getHighSpeedVideoSizes(generateTBSCertificate, org.bouncycastle.x509.X509Util.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, privateKey, secureRandom, generateTBSCertificate));
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.x509.ExtCertificateEncodingException("exception producing certificate object", e);
            }
        } catch (java.io.IOException e2) {
            throw new org.bouncycastle.x509.ExtCertificateEncodingException("exception encoding TBS cert", e2);
        }
    }

    public void setSubjectUniqueID(boolean[] zArr) {
        this.getOutputFormats.setSubjectUniqueID(Camera2StreamConfigurationMap(zArr));
    }

    public void setSubjectDN(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getOutputFormats.setSubject(x509Name);
    }

    public void setSubjectDN(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            this.getOutputFormats.setSubject(new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded()));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("can't process principal: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public void setSignatureAlgorithm(java.lang.String str) {
        this.getOutputMinFrameDuration = str;
        try {
            org.bouncycastle.asn1.ASN1ObjectIdentifier highSpeedVideoFpsRangesFor = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor(str);
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor;
            org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoFpsRangesFor2 = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, str);
            this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor2;
            this.getOutputFormats.setSignature(highSpeedVideoFpsRangesFor2);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalArgumentException("Unknown signature type requested: ".concat(java.lang.String.valueOf(str)));
        }
    }

    public void setSerialNumber(java.math.BigInteger bigInteger) {
        if (bigInteger.compareTo(java.math.BigInteger.ZERO) <= 0) {
            throw new java.lang.IllegalArgumentException("serial number must be a positive integer");
        }
        this.getOutputFormats.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }

    public void setPublicKey(java.security.PublicKey publicKey) throws java.lang.IllegalArgumentException {
        try {
            this.getOutputFormats.setSubjectPublicKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(publicKey.getEncoded()).readObject()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process key - ");
            sb.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public void setNotBefore(java.util.Date date) {
        this.getOutputFormats.setStartDate(new org.bouncycastle.asn1.x509.Time(date));
    }

    public void setNotAfter(java.util.Date date) {
        this.getOutputFormats.setEndDate(new org.bouncycastle.asn1.x509.Time(date));
    }

    public void setIssuerUniqueID(boolean[] zArr) {
        this.getOutputFormats.setIssuerUniqueID(Camera2StreamConfigurationMap(zArr));
    }

    public void setIssuerDN(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getOutputFormats.setIssuer(x509Name);
    }

    public void setIssuerDN(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            this.getOutputFormats.setIssuer(new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded()));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("can't process principal: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public void reset() {
        this.getOutputFormats = new org.bouncycastle.asn1.x509.V3TBSCertificateGenerator();
        this.Camera2StreamConfigurationMap.reset();
    }

    public java.util.Iterator getSignatureAlgNames() {
        return org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor();
    }

    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        try {
            return generateX509Certificate(privateKey, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (java.security.NoSuchProviderException unused) {
            throw new java.lang.SecurityException("BC provider not installed!");
        }
    }

    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey privateKey, java.lang.String str, java.security.SecureRandom secureRandom) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        try {
            return generate(privateKey, str, secureRandom);
        } catch (java.security.InvalidKeyException e) {
            throw e;
        } catch (java.security.NoSuchProviderException e2) {
            throw e2;
        } catch (java.security.SignatureException e3) {
            throw e3;
        } catch (java.security.GeneralSecurityException e4) {
            throw new java.lang.SecurityException("exception: ".concat(java.lang.String.valueOf(e4)));
        }
    }

    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey privateKey, java.lang.String str) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        return generateX509Certificate(privateKey, str, null);
    }

    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey privateKey) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        try {
            return generateX509Certificate(privateKey, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (java.security.NoSuchProviderException unused) {
            throw new java.lang.SecurityException("BC provider not installed!");
        }
    }

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey, java.lang.String str) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        return generate(privateKey, str, null);
    }

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        return generate(privateKey, (java.security.SecureRandom) null);
    }

    public void copyAndAddExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        copyAndAddExtension(aSN1ObjectIdentifier.getId(), z, x509Certificate);
    }

    public void copyAndAddExtension(java.lang.String str, boolean z, java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        byte[] extensionValue = x509Certificate.getExtensionValue(str);
        if (extensionValue != null) {
            try {
                addExtension(str, z, org.bouncycastle.x509.extension.X509ExtensionUtil.fromExtensionValue(extensionValue));
            } catch (java.io.IOException e) {
                throw new java.security.cert.CertificateParsingException(e.toString());
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("extension ");
            sb.append(str);
            sb.append(" not present");
            throw new java.security.cert.CertificateParsingException(sb.toString());
        }
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        this.Camera2StreamConfigurationMap.addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z, bArr);
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap.addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z, aSN1Encodable);
    }

    public void addExtension(java.lang.String str, boolean z, byte[] bArr) {
        addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), z, bArr);
    }

    public void addExtension(java.lang.String str, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), z, aSN1Encodable);
    }

    private java.security.cert.X509Certificate getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.TBSCertificate tBSCertificate, byte[] bArr) throws java.lang.Exception {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(bArr));
        return (java.security.cert.X509Certificate) this.getHighSpeedVideoFpsRangesFor.engineGenerateCertificate(new java.io.ByteArrayInputStream(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
    }

    private static org.bouncycastle.asn1.DERBitString Camera2StreamConfigurationMap(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i = 0; i != zArr.length; i++) {
            int i2 = i / 8;
            bArr[i2] = (byte) (bArr[i2] | (zArr[i] ? 1 << (7 - (i % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new org.bouncycastle.asn1.DERBitString(bArr) : new org.bouncycastle.asn1.DERBitString(bArr, 8 - length);
    }
}
