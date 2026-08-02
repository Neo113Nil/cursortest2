package org.bouncycastle.eac.operator.jcajce;

/* loaded from: classes17.dex */
abstract class EACHelper {
    private static final java.util.Hashtable getHighSpeedVideoFpsRangesFor;

    protected abstract java.security.Signature Camera2StreamConfigurationMap(java.lang.String str) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException;

    public final java.security.Signature getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException {
        return Camera2StreamConfigurationMap((java.lang.String) getHighSpeedVideoFpsRangesFor.get(aSN1ObjectIdentifier));
    }

    EACHelper() {
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRangesFor = hashtable;
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, "SHA1withRSA");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, "SHA256withRSA");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1, "SHA1withRSAandMGF1");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, "SHA256withRSAandMGF1");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_512, "SHA512withRSA");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512, "SHA512withRSAandMGF1");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1withECDSA");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224withECDSA");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256withECDSA");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384withECDSA");
        hashtable.put(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512withECDSA");
    }
}
