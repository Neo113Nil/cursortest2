package org.bouncycastle.cms;

/* loaded from: classes17.dex */
class CMSSignedHelper {
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;
    static final org.bouncycastle.cms.CMSSignedHelper getHighSpeedVideoSizes = new org.bouncycastle.cms.CMSSignedHelper();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha384.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha512.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_224.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_256.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_384.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_512.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSA.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md5WithRSA.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_224.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_256.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_384.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_512.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512.getId(), "ECDSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1.getId(), "RSAandMGF1");
        hashMap.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256.getId(), "RSAandMGF1");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa.getId(), "DSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa.getId(), "RSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS.getId(), "RSAandMGF1");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94.getId(), "GOST3410");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001.getId(), "ECGOST3410");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.6.2").getId(), "ECGOST3410");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.1.5").getId(), "GOST3410");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256.getId(), "ECGOST3410-2012-256");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512.getId(), "ECGOST3410-2012-512");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001.getId(), "ECGOST3410");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94.getId(), "GOST3410");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256.getId(), "ECGOST3410-2012-256");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512.getId(), "ECGOST3410-2012-512");
    }

    static void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        getHighSpeedVideoFpsRangesFor.put(aSN1ObjectIdentifier.getId(), str);
    }

    static org.bouncycastle.util.Store getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new org.bouncycastle.util.CollectionStore(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(aSN1Set.size());
        java.util.Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Primitive);
                if (aSN1TaggedObject.getTagNo() == 1) {
                    org.bouncycastle.asn1.cms.OtherRevocationInfoFormat otherRevocationInfoFormat = org.bouncycastle.asn1.cms.OtherRevocationInfoFormat.getInstance(aSN1TaggedObject, false);
                    if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) otherRevocationInfoFormat.getInfoFormat())) {
                        arrayList.add(otherRevocationInfoFormat.getInfo());
                    }
                }
            }
        }
        return new org.bouncycastle.util.CollectionStore(arrayList);
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) getHighSpeedVideoFpsRangesFor.get(str);
        return str2 != null ? str2 : str;
    }

    static org.bouncycastle.util.Store Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new org.bouncycastle.util.CollectionStore(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(aSN1Set.size());
        java.util.Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                arrayList.add(new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1Primitive)));
            }
        }
        return new org.bouncycastle.util.CollectionStore(arrayList);
    }

    static org.bouncycastle.util.Store getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new org.bouncycastle.util.CollectionStore(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(aSN1Set.size());
        java.util.Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                arrayList.add(new org.bouncycastle.cert.X509CRLHolder(org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1Primitive)));
            }
        }
        return new org.bouncycastle.util.CollectionStore(arrayList);
    }

    static org.bouncycastle.util.Store getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new org.bouncycastle.util.CollectionStore(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(aSN1Set.size());
        java.util.Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                arrayList.add(new org.bouncycastle.cert.X509AttributeCertificateHolder(org.bouncycastle.asn1.x509.AttributeCertificate.getInstance(((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive).getObject())));
            }
        }
        return new org.bouncycastle.util.CollectionStore(arrayList);
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
        return (parameters == null || org.bouncycastle.asn1.DERNull.INSTANCE.equals(parameters)) ? digestAlgorithmIdentifierFinder.find(algorithmIdentifier.getAlgorithm()) : algorithmIdentifier;
    }

    CMSSignedHelper() {
    }
}
