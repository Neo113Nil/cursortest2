package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class DefaultCMSSignatureAlgorithmNameGenerator implements org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator {
    private final java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map getHighSpeedVideoFpsRanges;

    public DefaultCMSSignatureAlgorithmNameGenerator() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.getHighResolutionOutputSizeshNQ4ISI = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = hashMap2;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224;
        hashMap2.put(aSN1ObjectIdentifier, "SHA224");
        hashMap.put(aSN1ObjectIdentifier, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256;
        hashMap2.put(aSN1ObjectIdentifier2, "SHA256");
        hashMap.put(aSN1ObjectIdentifier2, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha384;
        hashMap2.put(aSN1ObjectIdentifier3, "SHA384");
        hashMap.put(aSN1ObjectIdentifier3, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha512;
        hashMap2.put(aSN1ObjectIdentifier4, "SHA512");
        hashMap.put(aSN1ObjectIdentifier4, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_224;
        hashMap2.put(aSN1ObjectIdentifier5, "SHA3-224");
        hashMap.put(aSN1ObjectIdentifier5, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_256;
        hashMap2.put(aSN1ObjectIdentifier6, "SHA3-256");
        hashMap.put(aSN1ObjectIdentifier6, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_384;
        hashMap2.put(aSN1ObjectIdentifier7, "SHA3-384");
        hashMap.put(aSN1ObjectIdentifier7, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_512;
        hashMap2.put(aSN1ObjectIdentifier8, "SHA3-512");
        hashMap.put(aSN1ObjectIdentifier8, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224;
        hashMap2.put(aSN1ObjectIdentifier9, "SHA3-224");
        hashMap.put(aSN1ObjectIdentifier9, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256;
        hashMap2.put(aSN1ObjectIdentifier10, "SHA3-256");
        hashMap.put(aSN1ObjectIdentifier10, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384;
        hashMap2.put(aSN1ObjectIdentifier11, "SHA3-384");
        hashMap.put(aSN1ObjectIdentifier11, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512;
        hashMap2.put(aSN1ObjectIdentifier12, "SHA3-512");
        hashMap.put(aSN1ObjectIdentifier12, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier13 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_224;
        hashMap2.put(aSN1ObjectIdentifier13, "SHA3-224");
        hashMap.put(aSN1ObjectIdentifier13, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier14 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_256;
        hashMap2.put(aSN1ObjectIdentifier14, "SHA3-256");
        hashMap.put(aSN1ObjectIdentifier14, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier15 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_384;
        hashMap2.put(aSN1ObjectIdentifier15, "SHA3-384");
        hashMap.put(aSN1ObjectIdentifier15, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier16 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_512;
        hashMap2.put(aSN1ObjectIdentifier16, "SHA3-512");
        hashMap.put(aSN1ObjectIdentifier16, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier17 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1;
        hashMap2.put(aSN1ObjectIdentifier17, "SHA1");
        hashMap.put(aSN1ObjectIdentifier17, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier18 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSA;
        hashMap2.put(aSN1ObjectIdentifier18, "MD4");
        hashMap.put(aSN1ObjectIdentifier18, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier19 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier19, "MD4");
        hashMap.put(aSN1ObjectIdentifier19, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier20 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md5WithRSA;
        hashMap2.put(aSN1ObjectIdentifier20, "MD5");
        hashMap.put(aSN1ObjectIdentifier20, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier21 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA;
        hashMap2.put(aSN1ObjectIdentifier21, "SHA1");
        hashMap.put(aSN1ObjectIdentifier21, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier22 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier22, "MD2");
        hashMap.put(aSN1ObjectIdentifier22, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier23 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier23, "MD4");
        hashMap.put(aSN1ObjectIdentifier23, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier24 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier24, "MD5");
        hashMap.put(aSN1ObjectIdentifier24, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier25 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier25, "SHA1");
        hashMap.put(aSN1ObjectIdentifier25, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier26 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier26, "SHA224");
        hashMap.put(aSN1ObjectIdentifier26, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier27 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier27, "SHA256");
        hashMap.put(aSN1ObjectIdentifier27, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier28 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier28, "SHA384");
        hashMap.put(aSN1ObjectIdentifier28, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier29 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier29, "SHA512");
        hashMap.put(aSN1ObjectIdentifier29, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier30 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512_224WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier30, "SHA512(224)");
        hashMap.put(aSN1ObjectIdentifier30, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier31 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512_256WithRSAEncryption;
        hashMap2.put(aSN1ObjectIdentifier31, "SHA512(256)");
        hashMap.put(aSN1ObjectIdentifier31, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier32 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224;
        hashMap2.put(aSN1ObjectIdentifier32, "SHA3-224");
        hashMap.put(aSN1ObjectIdentifier32, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier33 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256;
        hashMap2.put(aSN1ObjectIdentifier33, "SHA3-256");
        hashMap.put(aSN1ObjectIdentifier33, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier34 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384;
        hashMap2.put(aSN1ObjectIdentifier34, "SHA3-384");
        hashMap.put(aSN1ObjectIdentifier34, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier35 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512;
        hashMap2.put(aSN1ObjectIdentifier35, "SHA3-512");
        hashMap.put(aSN1ObjectIdentifier35, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier36 = org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128;
        hashMap2.put(aSN1ObjectIdentifier36, "SHAKE128");
        hashMap.put(aSN1ObjectIdentifier36, "RSAPSS");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier37 = org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256;
        hashMap2.put(aSN1ObjectIdentifier37, "SHAKE256");
        hashMap.put(aSN1ObjectIdentifier37, "RSAPSS");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier38 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        hashMap2.put(aSN1ObjectIdentifier38, "RIPEMD128");
        hashMap.put(aSN1ObjectIdentifier38, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier39 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        hashMap2.put(aSN1ObjectIdentifier39, "RIPEMD160");
        hashMap.put(aSN1ObjectIdentifier39, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier40 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        hashMap2.put(aSN1ObjectIdentifier40, "RIPEMD256");
        hashMap.put(aSN1ObjectIdentifier40, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier41 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1;
        hashMap2.put(aSN1ObjectIdentifier41, "SHA1");
        hashMap.put(aSN1ObjectIdentifier41, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier42 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224;
        hashMap2.put(aSN1ObjectIdentifier42, "SHA224");
        hashMap.put(aSN1ObjectIdentifier42, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier43 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256;
        hashMap2.put(aSN1ObjectIdentifier43, "SHA256");
        hashMap.put(aSN1ObjectIdentifier43, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier44 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384;
        hashMap2.put(aSN1ObjectIdentifier44, "SHA384");
        hashMap.put(aSN1ObjectIdentifier44, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier45 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512;
        hashMap2.put(aSN1ObjectIdentifier45, "SHA512");
        hashMap.put(aSN1ObjectIdentifier45, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier46 = org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_ecdsa_with_shake128;
        hashMap2.put(aSN1ObjectIdentifier46, "SHAKE128");
        hashMap.put(aSN1ObjectIdentifier46, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier47 = org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_ecdsa_with_shake256;
        hashMap2.put(aSN1ObjectIdentifier47, "SHAKE256");
        hashMap.put(aSN1ObjectIdentifier47, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier48 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1;
        hashMap2.put(aSN1ObjectIdentifier48, "SHA1");
        hashMap.put(aSN1ObjectIdentifier48, "DSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier49 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1;
        hashMap2.put(aSN1ObjectIdentifier49, "SHA1");
        hashMap.put(aSN1ObjectIdentifier49, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier50 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224;
        hashMap2.put(aSN1ObjectIdentifier50, "SHA224");
        hashMap.put(aSN1ObjectIdentifier50, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier51 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256;
        hashMap2.put(aSN1ObjectIdentifier51, "SHA256");
        hashMap.put(aSN1ObjectIdentifier51, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier52 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384;
        hashMap2.put(aSN1ObjectIdentifier52, "SHA384");
        hashMap.put(aSN1ObjectIdentifier52, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier53 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512;
        hashMap2.put(aSN1ObjectIdentifier53, "SHA512");
        hashMap.put(aSN1ObjectIdentifier53, "ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier54 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1;
        hashMap2.put(aSN1ObjectIdentifier54, "SHA1");
        hashMap.put(aSN1ObjectIdentifier54, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier55 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256;
        hashMap2.put(aSN1ObjectIdentifier55, "SHA256");
        hashMap.put(aSN1ObjectIdentifier55, "RSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier56 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1;
        hashMap2.put(aSN1ObjectIdentifier56, "SHA1");
        hashMap.put(aSN1ObjectIdentifier56, "RSAandMGF1");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier57 = org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256;
        hashMap2.put(aSN1ObjectIdentifier57, "SHA256");
        hashMap.put(aSN1ObjectIdentifier57, "RSAandMGF1");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier58 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA1;
        hashMap2.put(aSN1ObjectIdentifier58, "SHA1");
        hashMap.put(aSN1ObjectIdentifier58, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier59 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA224;
        hashMap2.put(aSN1ObjectIdentifier59, "SHA224");
        hashMap.put(aSN1ObjectIdentifier59, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier60 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA256;
        hashMap2.put(aSN1ObjectIdentifier60, "SHA256");
        hashMap.put(aSN1ObjectIdentifier60, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier61 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA384;
        hashMap2.put(aSN1ObjectIdentifier61, "SHA384");
        hashMap.put(aSN1ObjectIdentifier61, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier62 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA512;
        hashMap2.put(aSN1ObjectIdentifier62, "SHA512");
        hashMap.put(aSN1ObjectIdentifier62, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier63 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_RIPEMD160;
        hashMap2.put(aSN1ObjectIdentifier63, "RIPEMD160");
        hashMap.put(aSN1ObjectIdentifier63, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier64 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_224;
        hashMap2.put(aSN1ObjectIdentifier64, "SHA3-224");
        hashMap.put(aSN1ObjectIdentifier64, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier65 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_256;
        hashMap2.put(aSN1ObjectIdentifier65, "SHA3-256");
        hashMap.put(aSN1ObjectIdentifier65, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier66 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_384;
        hashMap2.put(aSN1ObjectIdentifier66, "SHA3-384");
        hashMap.put(aSN1ObjectIdentifier66, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier67 = org.bouncycastle.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA3_512;
        hashMap2.put(aSN1ObjectIdentifier67, "SHA3-512");
        hashMap.put(aSN1ObjectIdentifier67, "PLAIN-ECDSA");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier68 = org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2sign_with_sha256;
        hashMap2.put(aSN1ObjectIdentifier68, "SHA256");
        hashMap.put(aSN1ObjectIdentifier68, "SM2");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier69 = org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2sign_with_sm3;
        hashMap2.put(aSN1ObjectIdentifier69, "SM3");
        hashMap.put(aSN1ObjectIdentifier69, "SM2");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier70 = org.bouncycastle.asn1.bc.BCObjectIdentifiers.sphincs256_with_SHA512;
        hashMap2.put(aSN1ObjectIdentifier70, "SHA512");
        hashMap.put(aSN1ObjectIdentifier70, "SPHINCS256");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier71 = org.bouncycastle.asn1.bc.BCObjectIdentifiers.sphincs256_with_SHA3_512;
        hashMap2.put(aSN1ObjectIdentifier71, "SHA3-512");
        hashMap.put(aSN1ObjectIdentifier71, "SPHINCS256");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, "DSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, "RSA");
        hashMap.put(org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa, "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS, "RSAandMGF1");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94, "GOST3410");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012-256");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012-512");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "ECGOST3410");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3410");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "ECGOST3410-2012-256");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "ECGOST3410-2012-512");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2, "MD2");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4, "MD4");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5, "MD5");
        hashMap2.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, "SHA1");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, "SHA224");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, "SHA256");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, "SHA384");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, "SHA512");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224, "SHA512(224)");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, "SHA512(256)");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128, "SHAKE128");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256, "SHAKE256");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256, "SHA3-256");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        hashMap2.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        hashMap2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411, "GOST3411");
        hashMap2.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.2.1"), "GOST3411");
        hashMap2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, "GOST3411-2012-256");
        hashMap2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, "GOST3411-2012-512");
        hashMap2.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3, "SM3");
    }

    @Override // org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator
    public java.lang.String getSignatureName(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        java.lang.StringBuilder sb;
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier2.getAlgorithm();
        if (org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm)) {
            return "Ed25519";
        }
        if (org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm)) {
            return "Ed448";
        }
        if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm)) {
            return "LMS";
        }
        java.lang.String str = (java.lang.String) this.getHighSpeedVideoFpsRanges.get(algorithm);
        if (str == null) {
            str = algorithm.getId();
        }
        if (str.equals(algorithm.getId())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm2 = algorithmIdentifier.getAlgorithm();
            java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRanges.get(algorithm2);
            if (str2 == null) {
                str2 = algorithm2.getId();
            }
            sb2.append(str2);
            sb = sb2;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(str);
        }
        sb.append("with");
        java.lang.String str3 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.get(algorithm);
        if (str3 == null) {
            str3 = algorithm.getId();
        }
        sb.append(str3);
        return sb.toString();
    }

    protected void setSigningEncryptionAlgorithmMapping(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(aSN1ObjectIdentifier, str);
    }

    protected void setSigningDigestAlgorithmMapping(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges.put(aSN1ObjectIdentifier, str);
    }
}
