package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
class PKCSUtils {
    private static final java.util.Map getHighSpeedVideoSizes;

    PKCSUtils() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.util.Integers.valueOf(20));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, org.bouncycastle.util.Integers.valueOf(28));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, org.bouncycastle.util.Integers.valueOf(48));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224, org.bouncycastle.util.Integers.valueOf(28));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, org.bouncycastle.util.Integers.valueOf(32));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384, org.bouncycastle.util.Integers.valueOf(48));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411Hmac, org.bouncycastle.util.Integers.valueOf(32));
    }
}
