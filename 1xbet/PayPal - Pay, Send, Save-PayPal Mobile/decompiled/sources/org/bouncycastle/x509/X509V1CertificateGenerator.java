package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509V1CertificateGenerator {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    private final org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory();
    private org.bouncycastle.asn1.x509.V1TBSCertificateGenerator getInputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.V1TBSCertificateGenerator();

    public void setSubjectDN(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getInputSizeshNQ4ISI.setSubject(x509Name);
    }

    public void setSubjectDN(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            this.getInputSizeshNQ4ISI.setSubject(new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded()));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("can't process principal: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public void setSignatureAlgorithm(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
        try {
            org.bouncycastle.asn1.ASN1ObjectIdentifier highSpeedVideoFpsRangesFor = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor(str);
            this.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor;
            org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoFpsRangesFor2 = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, str);
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
            this.getInputSizeshNQ4ISI.setSignature(highSpeedVideoFpsRangesFor2);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalArgumentException("Unknown signature type requested");
        }
    }

    public void setSerialNumber(java.math.BigInteger bigInteger) {
        if (bigInteger.compareTo(java.math.BigInteger.ZERO) <= 0) {
            throw new java.lang.IllegalArgumentException("serial number must be a positive integer");
        }
        this.getInputSizeshNQ4ISI.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }

    public void setPublicKey(java.security.PublicKey publicKey) {
        try {
            this.getInputSizeshNQ4ISI.setSubjectPublicKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process key - ");
            sb.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public void setNotBefore(java.util.Date date) {
        this.getInputSizeshNQ4ISI.setStartDate(new org.bouncycastle.asn1.x509.Time(date));
    }

    public void setNotAfter(java.util.Date date) {
        this.getInputSizeshNQ4ISI.setEndDate(new org.bouncycastle.asn1.x509.Time(date));
    }

    public void setIssuerDN(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getInputSizeshNQ4ISI.setIssuer(x509Name);
    }

    public void setIssuerDN(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            this.getInputSizeshNQ4ISI.setIssuer(new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded()));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("can't process principal: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public void reset() {
        this.getInputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.V1TBSCertificateGenerator();
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

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate = this.getInputSizeshNQ4ISI.generateTBSCertificate();
        try {
            return getHighSpeedVideoFpsRangesFor(generateTBSCertificate, org.bouncycastle.x509.X509Util.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, privateKey, secureRandom, generateTBSCertificate));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.x509.ExtCertificateEncodingException("exception encoding TBS cert", e);
        }
    }

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey, java.lang.String str, java.security.SecureRandom secureRandom) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate = this.getInputSizeshNQ4ISI.generateTBSCertificate();
        try {
            return getHighSpeedVideoFpsRangesFor(generateTBSCertificate, org.bouncycastle.x509.X509Util.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, str, privateKey, secureRandom, generateTBSCertificate));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.x509.ExtCertificateEncodingException("exception encoding TBS cert", e);
        }
    }

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey, java.lang.String str) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        return generate(privateKey, str, null);
    }

    public java.security.cert.X509Certificate generate(java.security.PrivateKey privateKey) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        return generate(privateKey, (java.security.SecureRandom) null);
    }

    private java.security.cert.X509Certificate getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.TBSCertificate tBSCertificate, byte[] bArr) throws java.security.cert.CertificateEncodingException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(bArr));
        try {
            return (java.security.cert.X509Certificate) this.getHighSpeedVideoFpsRanges.engineGenerateCertificate(new java.io.ByteArrayInputStream(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.x509.ExtCertificateEncodingException("exception producing certificate object", e);
        }
    }
}
