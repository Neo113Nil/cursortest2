package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public class DefaultSignatureNameFinder implements org.bouncycastle.operator.AlgorithmNameFinder {
    private static final java.util.Map Camera2StreamConfigurationMap;
    private static final java.util.Map getHighSpeedVideoSizes;

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public java.lang.String getAlgorithmName(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters == null || org.bouncycastle.asn1.DERNull.INSTANCE.equals(parameters) || !algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            java.util.Map map = getHighSpeedVideoSizes;
            boolean containsKey = map.containsKey(algorithmIdentifier.getAlgorithm());
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
            return containsKey ? (java.lang.String) map.get(algorithm) : algorithm.getId();
        }
        org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams = org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(parameters);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier maskGenAlgorithm = rSASSAPSSparams.getMaskGenAlgorithm();
        if (!maskGenAlgorithm.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm2 = rSASSAPSSparams.getHashAlgorithm().getAlgorithm();
            java.lang.String str = (java.lang.String) Camera2StreamConfigurationMap.get(algorithm2);
            if (str == null) {
                str = algorithm2.getId();
            }
            sb.append(str);
            sb.append("WITHRSAAND");
            sb.append(maskGenAlgorithm.getAlgorithm().getId());
            return sb.toString();
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier hashAlgorithm = rSASSAPSSparams.getHashAlgorithm();
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm3 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(maskGenAlgorithm.getParameters()).getAlgorithm();
        if (algorithm3.equals((org.bouncycastle.asn1.ASN1Primitive) hashAlgorithm.getAlgorithm())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm4 = hashAlgorithm.getAlgorithm();
            java.lang.String str2 = (java.lang.String) Camera2StreamConfigurationMap.get(algorithm4);
            if (str2 == null) {
                str2 = algorithm4.getId();
            }
            sb2.append(str2);
            sb2.append("WITHRSAANDMGF1");
            return sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm5 = hashAlgorithm.getAlgorithm();
        java.util.Map map2 = Camera2StreamConfigurationMap;
        java.lang.String str3 = (java.lang.String) map2.get(algorithm5);
        if (str3 == null) {
            str3 = algorithm5.getId();
        }
        sb3.append(str3);
        sb3.append("WITHRSAANDMGF1USING");
        java.lang.String str4 = (java.lang.String) map2.get(algorithm3);
        if (str4 == null) {
            str4 = algorithm3.getId();
        }
        sb3.append(str4);
        return sb3.toString();
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public boolean hasAlgorithmName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoSizes.containsKey(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public java.lang.String getAlgorithmName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String str = (java.lang.String) getHighSpeedVideoSizes.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap2;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS, org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS);
        hashMap.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519, "ED25519");
        hashMap.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448, "ED448");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        hashMap.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128, "SHAKE128WITHRSAPSS");
        hashMap.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256, "SHAKE256WITHRSAPSS");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_224, "SHA3-224WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_256, "SHA3-256WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_384, "SHA3-384WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_512, "SHA3-512WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss, "XMSS");
        hashMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt, "XMSSMT");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, "RIPEMD128WITHRSA");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, "RIPEMD160WITHRSA");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, "RIPEMD256WITHRSA");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_ecdsa_with_shake128, "SHAKE128WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_ecdsa_with_shake256, "SHAKE256WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
        hashMap2.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, "SHA1");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, "SHA224");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, "SHA256");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, "SHA384");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, "SHA512");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256, "SHA3-256");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
    }
}
