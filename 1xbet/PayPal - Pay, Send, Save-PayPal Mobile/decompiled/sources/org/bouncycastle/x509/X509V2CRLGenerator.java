package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509V2CRLGenerator {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    private org.bouncycastle.asn1.x509.V2TBSCertListGenerator getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.x509.V2TBSCertListGenerator();
    private org.bouncycastle.asn1.x509.X509ExtensionsGenerator getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.X509ExtensionsGenerator();

    public java.security.cert.X509CRL generate(java.security.PrivateKey privateKey, java.lang.String str, java.security.SecureRandom secureRandom) throws java.security.cert.CRLException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            this.getHighSpeedVideoSizesFor.setExtensions(this.getHighSpeedVideoFpsRanges.generate());
        }
        org.bouncycastle.asn1.x509.TBSCertList generateTBSCertList = this.getHighSpeedVideoSizesFor.generateTBSCertList();
        try {
            return getHighResolutionOutputSizeshNQ4ISI(generateTBSCertList, org.bouncycastle.x509.X509Util.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, str, privateKey, secureRandom, generateTBSCertList));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.x509.X509V2CRLGenerator.ExtCRLException("cannot generate CRL encoding", e);
        }
    }

    public java.security.cert.X509CRL generate(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.cert.CRLException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            this.getHighSpeedVideoSizesFor.setExtensions(this.getHighSpeedVideoFpsRanges.generate());
        }
        org.bouncycastle.asn1.x509.TBSCertList generateTBSCertList = this.getHighSpeedVideoSizesFor.generateTBSCertList();
        try {
            return getHighResolutionOutputSizeshNQ4ISI(generateTBSCertList, org.bouncycastle.x509.X509Util.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, privateKey, secureRandom, generateTBSCertList));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.x509.X509V2CRLGenerator.ExtCRLException("cannot generate CRL encoding", e);
        }
    }

    public void setThisUpdate(java.util.Date date) {
        this.getHighSpeedVideoSizesFor.setThisUpdate(new org.bouncycastle.asn1.x509.Time(date));
    }

    public void setSignatureAlgorithm(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        try {
            org.bouncycastle.asn1.ASN1ObjectIdentifier highSpeedVideoFpsRangesFor = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor(str);
            this.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor;
            org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoFpsRangesFor2 = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, str);
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor2;
            this.getHighSpeedVideoSizesFor.setSignature(highSpeedVideoFpsRangesFor2);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalArgumentException("Unknown signature type requested");
        }
    }

    public void setNextUpdate(java.util.Date date) {
        this.getHighSpeedVideoSizesFor.setNextUpdate(new org.bouncycastle.asn1.x509.Time(date));
    }

    public void setIssuerDN(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getHighSpeedVideoSizesFor.setIssuer(x509Name);
    }

    public void setIssuerDN(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            this.getHighSpeedVideoSizesFor.setIssuer(new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded()));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("can't process principal: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public void reset() {
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.x509.V2TBSCertListGenerator();
        this.getHighSpeedVideoFpsRanges.reset();
    }

    public java.util.Iterator getSignatureAlgNames() {
        return org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor();
    }

    public java.security.cert.X509CRL generateX509CRL(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        try {
            return generateX509CRL(privateKey, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (java.security.NoSuchProviderException unused) {
            throw new java.lang.SecurityException("BC provider not installed!");
        }
    }

    public java.security.cert.X509CRL generateX509CRL(java.security.PrivateKey privateKey, java.lang.String str, java.security.SecureRandom secureRandom) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
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

    public java.security.cert.X509CRL generateX509CRL(java.security.PrivateKey privateKey, java.lang.String str) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        return generateX509CRL(privateKey, str, null);
    }

    public java.security.cert.X509CRL generateX509CRL(java.security.PrivateKey privateKey) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        try {
            return generateX509CRL(privateKey, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (java.security.NoSuchProviderException unused) {
            throw new java.lang.SecurityException("BC provider not installed!");
        }
    }

    public java.security.cert.X509CRL generate(java.security.PrivateKey privateKey, java.lang.String str) throws java.security.cert.CRLException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        return generate(privateKey, str, null);
    }

    public java.security.cert.X509CRL generate(java.security.PrivateKey privateKey) throws java.security.cert.CRLException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        return generate(privateKey, (java.security.SecureRandom) null);
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges.addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z, bArr);
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges.addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z, aSN1Encodable);
    }

    public void addExtension(java.lang.String str, boolean z, byte[] bArr) {
        addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), z, bArr);
    }

    public void addExtension(java.lang.String str, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), z, aSN1Encodable);
    }

    public void addCRLEntry(java.math.BigInteger bigInteger, java.util.Date date, org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        this.getHighSpeedVideoSizesFor.addCRLEntry(new org.bouncycastle.asn1.ASN1Integer(bigInteger), new org.bouncycastle.asn1.x509.Time(date), org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions));
    }

    public void addCRLEntry(java.math.BigInteger bigInteger, java.util.Date date, int i, java.util.Date date2) {
        this.getHighSpeedVideoSizesFor.addCRLEntry(new org.bouncycastle.asn1.ASN1Integer(bigInteger), new org.bouncycastle.asn1.x509.Time(date), i, new org.bouncycastle.asn1.ASN1GeneralizedTime(date2));
    }

    public void addCRLEntry(java.math.BigInteger bigInteger, java.util.Date date, int i) {
        this.getHighSpeedVideoSizesFor.addCRLEntry(new org.bouncycastle.asn1.ASN1Integer(bigInteger), new org.bouncycastle.asn1.x509.Time(date), i);
    }

    static class ExtCRLException extends java.security.cert.CRLException {
        java.lang.Throwable getHighSpeedVideoFpsRanges;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoFpsRanges;
        }

        ExtCRLException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighSpeedVideoFpsRanges = th;
        }
    }

    public void addCRL(java.security.cert.X509CRL x509crl) throws java.security.cert.CRLException {
        java.util.Set<? extends java.security.cert.X509CRLEntry> revokedCertificates = x509crl.getRevokedCertificates();
        if (revokedCertificates != null) {
            java.util.Iterator<? extends java.security.cert.X509CRLEntry> it = revokedCertificates.iterator();
            while (it.hasNext()) {
                try {
                    this.getHighSpeedVideoSizesFor.addCRLEntry(org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.asn1.ASN1InputStream(it.next().getEncoded()).readObject()));
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("exception processing encoding of CRL: ");
                    sb.append(e.toString());
                    throw new java.security.cert.CRLException(sb.toString());
                }
            }
        }
    }

    private java.security.cert.X509CRL getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.TBSCertList tBSCertList, byte[] bArr) throws java.security.cert.CRLException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertList);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(bArr));
        return new org.bouncycastle.jce.provider.X509CRLObject(org.bouncycastle.asn1.x509.CertificateList.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)));
    }
}
