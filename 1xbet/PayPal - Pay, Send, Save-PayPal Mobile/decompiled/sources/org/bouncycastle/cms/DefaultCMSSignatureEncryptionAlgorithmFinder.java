package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class DefaultCMSSignatureEncryptionAlgorithmFinder implements org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder {
    protected static final java.util.Map GOST_ENC;
    protected static final java.util.Set RSA_PKCS1d5;

    @Override // org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier findEncryptionAlgorithm(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        if (RSA_PKCS1d5.contains(algorithmIdentifier.getAlgorithm())) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        java.util.Map map = GOST_ENC;
        return map.containsKey(algorithmIdentifier.getAlgorithm()) ? (org.bouncycastle.asn1.x509.AlgorithmIdentifier) map.get(algorithmIdentifier.getAlgorithm()) : algorithmIdentifier;
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        RSA_PKCS1d5 = hashSet;
        java.util.HashMap hashMap = new java.util.HashMap();
        GOST_ENC = hashMap;
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2WithRSAEncryption);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4WithRSAEncryption);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5WithRSAEncryption);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption);
        hashSet.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSAEncryption);
        hashSet.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md4WithRSA);
        hashSet.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.md5WithRSA);
        hashSet.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA);
        hashSet.add(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        hashSet.add(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        hashSet.add(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, org.bouncycastle.asn1.DERNull.INSTANCE));
    }
}
