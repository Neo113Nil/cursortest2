package org.bouncycastle.jcajce.util;

/* loaded from: classes17.dex */
public class MessageDigestUtils {
    private static java.util.Map<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    public static java.lang.String getDigestName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2, "MD2");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4, "MD4");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5, "MD5");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, "SHA-1");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, "SHA-224");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, "SHA-256");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, "SHA-384");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, "SHA-512");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224, "SHA-512(224)");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, "SHA-512(256)");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD-128");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD-160");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD-128");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers.ripemd128, "RIPEMD-128");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers.ripemd160, "RIPEMD-160");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411, "GOST3411");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Tiger_192, "Tiger");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers.whirlpool, "Whirlpool");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256, "SHA3-256");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128, "SHAKE128");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256, "SHAKE256");
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3, "SM3");
    }
}
