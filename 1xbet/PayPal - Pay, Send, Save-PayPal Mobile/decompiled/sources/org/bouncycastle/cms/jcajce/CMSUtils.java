package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
class CMSUtils {
    private static final java.util.Set Camera2StreamConfigurationMap;
    private static final java.util.Set getHighSpeedVideoFpsRanges;
    private static final java.util.Set getHighSpeedVideoSizes;

    static void getHighSpeedVideoFpsRanges(java.security.AlgorithmParameters algorithmParameters, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cms.CMSException {
        try {
            org.bouncycastle.jcajce.util.AlgorithmParametersUtils.loadParameters(algorithmParameters, aSN1Encodable);
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("error encoding algorithm parameters.", e);
        }
    }

    static boolean getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_ESDH) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_SSDH);
    }

    static boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoSizes.contains(aSN1ObjectIdentifier);
    }

    static boolean getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoFpsRanges.contains(aSN1ObjectIdentifier);
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return Camera2StreamConfigurationMap.contains(aSN1ObjectIdentifier);
    }

    static byte[] getHighSpeedVideoFpsRanges(java.security.cert.X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.subjectKeyIdentifier.getId());
        if (extensionValue != null) {
            return org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()).getOctets();
        }
        return null;
    }

    static org.bouncycastle.asn1.cms.IssuerAndSerialNumber getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException {
        return new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(org.bouncycastle.asn1.x509.Certificate.getInstance(x509Certificate.getEncoded()).getIssuer(), x509Certificate.getSerialNumber());
    }

    static org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI(java.security.AlgorithmParameters algorithmParameters) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.jcajce.util.AlgorithmParametersUtils.extractParameters(algorithmParameters);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot extract parameters: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    static org.bouncycastle.cms.jcajce.EnvelopedDataHelper getHighSpeedVideoFpsRanges(java.security.Provider provider) {
        return provider != null ? new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider)) : new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
    }

    static org.bouncycastle.cms.jcajce.EnvelopedDataHelper getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        return str != null ? new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str)) : new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
    }

    static java.security.PrivateKey getHighResolutionOutputSizeshNQ4ISI(java.security.PrivateKey privateKey) {
        return privateKey instanceof org.bouncycastle.jcajce.util.AnnotatedPrivateKey ? getHighResolutionOutputSizeshNQ4ISI(((org.bouncycastle.jcajce.util.AnnotatedPrivateKey) privateKey).getKey()) : privateKey;
    }

    CMSUtils() {
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighSpeedVideoSizes = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        Camera2StreamConfigurationMap = hashSet2;
        java.util.HashSet hashSet3 = new java.util.HashSet();
        getHighSpeedVideoFpsRanges = hashSet3;
        hashSet.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        hashSet.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
        hashSet.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
        hashSet.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
        hashSet.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
        hashSet3.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001);
        hashSet3.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
        hashSet3.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
        hashSet3.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
        hashSet3.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
    }
}
