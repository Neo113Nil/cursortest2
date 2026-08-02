package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
class JceUtils {
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.util.Map map = getHighSpeedVideoFpsRangesFor;
        if (map.containsKey(aSN1ObjectIdentifier)) {
            return (java.lang.String) map.get(aSN1ObjectIdentifier);
        }
        throw new java.lang.IllegalStateException("no prf for algorithm: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    JceUtils() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, "PBKDF2withHMACSHA1");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, "PBKDF2withHMACSHA256");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, "PBKDF2withHMACSHA512");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, "PBKDF2withHMACSHA224");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, "PBKDF2withHMACSHA384");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224, "PBKDF2withHMACSHA3-224");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, "PBKDF2withHMACSHA3-256");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384, "PBKDF2withHMACSHA3-384");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, "PBKDF2withHMACSHA3-512");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411Hmac, "PBKDF2withHMACGOST3411");
    }
}
