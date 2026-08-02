package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class ProvRevocationChecker extends java.security.cert.PKIXRevocationChecker implements org.bouncycastle.jcajce.PKIXCertRevocationChecker {
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.jcajce.util.JcaJceHelper Camera2StreamConfigurationMap;
    private final org.bouncycastle.jce.provider.ProvOcspRevocationChecker getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.jce.provider.ProvCrlRevocationChecker getHighSpeedVideoSizes;

    @Override // java.security.cert.PKIXCertPathChecker
    public java.util.Set<java.lang.String> getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void setParameter(java.lang.String str, java.lang.Object obj) {
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(java.security.cert.Certificate certificate, java.util.Collection<java.lang.String> collection) throws java.security.cert.CertPathValidatorException {
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
        if (!getOptions().contains(java.security.cert.PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (getOptions().contains(java.security.cert.PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.getHighSpeedVideoSizes.check(certificate);
                    return;
                } catch (org.bouncycastle.jce.provider.RecoverableCertPathValidatorException e) {
                    if (getOptions().contains(java.security.cert.PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        throw e;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.check(certificate);
                    return;
                }
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.check(certificate);
            } catch (org.bouncycastle.jce.provider.RecoverableCertPathValidatorException e2) {
                if (getOptions().contains(java.security.cert.PKIXRevocationChecker.Option.NO_FALLBACK)) {
                    throw e2;
                }
                this.getHighSpeedVideoSizes.check(certificate);
            }
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws java.security.cert.CertPathValidatorException {
        this.getHighSpeedVideoFpsRanges = null;
        org.bouncycastle.jce.provider.ProvCrlRevocationChecker provCrlRevocationChecker = this.getHighSpeedVideoSizes;
        if (z) {
            throw new java.security.cert.CertPathValidatorException("forward checking not supported");
        }
        provCrlRevocationChecker.getHighSpeedVideoFpsRangesFor = null;
        provCrlRevocationChecker.getHighSpeedVideoSizes = new java.util.Date();
        org.bouncycastle.jce.provider.ProvOcspRevocationChecker provOcspRevocationChecker = this.getHighResolutionOutputSizeshNQ4ISI;
        if (z) {
            throw new java.security.cert.CertPathValidatorException("forward checking not supported");
        }
        provOcspRevocationChecker.getHighSpeedVideoFpsRanges = null;
        provOcspRevocationChecker.Camera2StreamConfigurationMap = org.bouncycastle.util.Properties.isOverrideSet("ocsp.enable");
        provOcspRevocationChecker.getHighSpeedVideoSizes = org.bouncycastle.util.Properties.getPropertyValue("ocsp.responderURL");
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void initialize(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) {
        this.getHighSpeedVideoFpsRanges = pKIXCertRevocationCheckerParameters;
        this.getHighSpeedVideoSizes.initialize(pKIXCertRevocationCheckerParameters);
        this.getHighResolutionOutputSizeshNQ4ISI.initialize(pKIXCertRevocationCheckerParameters);
    }

    @Override // java.security.cert.PKIXRevocationChecker
    public java.util.List<java.security.cert.CertPathValidatorException> getSoftFailExceptions() {
        return org.bouncycastle.jce.provider.ProvOcspRevocationChecker.getHighSpeedVideoFpsRanges();
    }

    public ProvRevocationChecker(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.Camera2StreamConfigurationMap = jcaJceHelper;
        this.getHighSpeedVideoSizes = new org.bouncycastle.jce.provider.ProvCrlRevocationChecker(jcaJceHelper);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jce.provider.ProvOcspRevocationChecker(this, jcaJceHelper);
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss, "XMSS");
        hashMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt, "XMSSMT");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
    }
}
