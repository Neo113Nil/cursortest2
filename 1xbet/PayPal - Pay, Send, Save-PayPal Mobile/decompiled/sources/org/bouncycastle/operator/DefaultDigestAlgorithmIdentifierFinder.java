package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public class DefaultDigestAlgorithmIdentifierFinder implements org.bouncycastle.operator.DigestAlgorithmIdentifierFinder {
    private static java.util.Map getHighSpeedVideoSizes = new java.util.HashMap();
    private static java.util.Map getHighSpeedVideoFpsRanges = new java.util.HashMap();
    private static java.util.Map getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();

    @Override // org.bouncycastle.operator.DigestAlgorithmIdentifierFinder
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier find(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448)) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256_len, new org.bouncycastle.asn1.ASN1Integer(512L));
        }
        return find(algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS) ? org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(algorithmIdentifier.getParameters()).getHashAlgorithm().getAlgorithm() : algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519) ? org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512 : (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoSizes.get(algorithmIdentifier.getAlgorithm()));
    }

    @Override // org.bouncycastle.operator.DigestAlgorithmIdentifierFinder
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier find(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.NullPointerException("digest OID is null");
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = (org.bouncycastle.asn1.x509.AlgorithmIdentifier) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        return algorithmIdentifier == null ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier) : algorithmIdentifier;
    }

    @Override // org.bouncycastle.operator.DigestAlgorithmIdentifierFinder
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier find(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoFpsRanges.get(str);
        if (aSN1ObjectIdentifier != null) {
            return find(aSN1ObjectIdentifier);
        }
        try {
            return find(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z) {
        getHighResolutionOutputSizeshNQ4ISI.put(aSN1ObjectIdentifier, z ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, org.bouncycastle.asn1.DERNull.INSTANCE) : new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier));
    }

    static {
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSAEncryption, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSA, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512_224WithRSAEncryption, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512_256WithRSAEncryption, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2WithRSAEncryption, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4WithRSAEncryption, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5WithRSAEncryption, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA1, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_384, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bc.BCObjectIdentifiers.sphincs256_with_SHA3_512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.bc.BCObjectIdentifiers.sphincs256_with_SHA512, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2sign_with_sha256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2sign_with_sm3, org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_ecdsa_with_shake128, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_ecdsa_with_shake256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
        getHighSpeedVideoFpsRanges.put("SHA-1", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoFpsRanges.put("SHA-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoFpsRanges.put("SHA-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoFpsRanges.put("SHA-384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoFpsRanges.put("SHA-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoFpsRanges.put("SHA-512-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
        getHighSpeedVideoFpsRanges.put("SHA-512-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
        getHighSpeedVideoFpsRanges.put("SHA1", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoFpsRanges.put("SHA224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoFpsRanges.put("SHA256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoFpsRanges.put("SHA384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoFpsRanges.put("SHA512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoFpsRanges.put("SHA512-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec.SHA512_256, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
        getHighSpeedVideoFpsRanges.put("SHA3-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        getHighSpeedVideoFpsRanges.put("SHA3-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        getHighSpeedVideoFpsRanges.put("SHA3-384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        getHighSpeedVideoFpsRanges.put("SHA3-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoFpsRanges.put("SHAKE128", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighSpeedVideoFpsRanges.put("SHAKE256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
        getHighSpeedVideoFpsRanges.put("SHAKE-128", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighSpeedVideoFpsRanges.put("SHAKE-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
        getHighSpeedVideoFpsRanges.put("GOST3411", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411);
        getHighSpeedVideoFpsRanges.put("GOST3411-2012-256", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
        getHighSpeedVideoFpsRanges.put("GOST3411-2012-512", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512);
        getHighSpeedVideoFpsRanges.put("MD2", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2);
        getHighSpeedVideoFpsRanges.put("MD4", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4);
        getHighSpeedVideoFpsRanges.put("MD5", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5);
        getHighSpeedVideoFpsRanges.put("RIPEMD128", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128);
        getHighSpeedVideoFpsRanges.put("RIPEMD160", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160);
        getHighSpeedVideoFpsRanges.put("RIPEMD256", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256);
        getHighSpeedVideoFpsRanges.put("SM3", org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, true);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411, true);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, false);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2, true);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4, true);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5, true);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128, true);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160, true);
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256, true);
    }
}
